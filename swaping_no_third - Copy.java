package Programs;

public class swaping_no_third {
	int a=15,b=10;
	public static void main(String[] args) {
		swaping_no_third obj = new swaping_no_third();
		obj.a = obj.a-obj.b;
		obj.b = obj.a+obj.b;
		obj.a = obj.b-obj.a;
		System.out.println(obj.a+","+obj.b);
	}
}
