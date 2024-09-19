class method_overloading{
    int n=9;
    public int sum(int x){
        x=n;
        return x;
    }
    public int sum(int x,int y){
        return x+y;
    }
    public int sum( String s,int x){
        System.out.println("String:"+s);
        return x;
    }
    public static void main(String[] args ){
        method_overloading obj = new method_overloading();
        System.out.println(obj.sum(10));
        System.out.println(obj.sum(5,10));
        System.out.println(obj.sum("Hello",16));
    }
}
