package Programs;

public class Implement_standard_methods {
	public static void square_root(int x) {
		double squarert;
		squarert = Math.sqrt(x);
		System.out.println(squarert);
	}
	public static void upper_case() {
		String a="java program";
		System.out.println(a.toUpperCase());
	}
	public static void lower_case() {
		String b="JAVA PROGRAM";
		System.out.println(b.toLowerCase());
	}
	public static void length() {
		String c="length";
		System.out.println(c.length());
	}
	public static void main(String[] args) {
		square_root(16);
		upper_case();
		lower_case();
		length();
	}
}
