class Animal_overriding{
    public void display(){
        System.out.println("It is a dog.");
    }
    class Dog extends Animal_overriding{
        public void display(){
            System.out.println("It is a golden dog..");
        }
    }
    public static void main(String[] args){
        Animal_overriding a1 = new Animal_overriding();
        Animal_overriding.Dog d1= a1.new Dog();
        d1.display();
    }
}
