import java.util.Scanner;

class Simple_Interest{
    int p,t,r;
    Scanner scan = new Scanner(System.in);
    public void calculator(){
        p = scan.nextInt();
        t = scan.nextInt();
        r = scan.nextInt();
        int si = (p*t*r)/100;
        System.out.println("Simple interest is:"+si);
    }
    public static void main(String[] args){
        Simple_Interest s = new Simple_Interest();
        s.calculator();
    }
}
