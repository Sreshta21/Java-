package programs;

public class Dog {
	String name,colour;
	public Dog(String consName,String consColour) {
		name=consName;
		colour = consColour;
	}
	public static void main(String[] args) {
		Dog obj = new Dog("Sreshta","Cyan");
		System.out.println("NAME:"+obj.name+","+"COLOUR:"+obj.colour);
	}
	
}
