import java.util.Scanner;

class implement_scanner{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan.nextLine();
        System.out.println("Hi,"+name+"!");
    }    
}
