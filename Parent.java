class Parent{
    String s="Parent";
}
class child extends Parent{
   String n = "child";
}
class main{
    public static void main(String[] args){
        child c1 = new child();
        System.out.println(c1.n+"is a child of parent"+c1.s);
    }
}
