package Programs;

public class constructor_with_parameters {
	String a="HELLO";
	public constructor_with_parameters(String b) {
		a=b;
	}
	public static void main(String[] args) {
		constructor_with_parameters obj = new constructor_with_parameters("HOLA");
		System.out.println(obj.a);
	}
}
