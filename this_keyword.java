import java.util.Scanner;

class this_keyword{
    void display(){
        this.name();
        this.age();
    }
    void name(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan.nextLine(); 
        System.out.println("Name:"+name);
    }
    void age(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scan.nextInt(); 
        System.out.println("Age:"+age);
    }
    public static void main(String[] args){
        this_keyword obj = new this_keyword();
        obj.display();
    }
}
