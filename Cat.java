package programs;

public class Cat {
	int age;
	String name;
	public Cat(){
		name="Unknown";
		age=0;
	}
	public static void main(String[] args) {
		Cat myobj = new Cat();
		System.out.println("Age:"+myobj.age+","+"Name:"+myobj.name);
	}
}
