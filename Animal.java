package programs;

class Animal {
	public void move() {
		System.out.println("This is move method from Animal class.");
	}
	public class Cheetah extends Animal{
		public void move() {
			System.out.println("This is move method from Cheetah class.");
		}
	}
	public static void main(String[] args) {
		Animal myobj = new Animal();
		Animal.Cheetah obj = myobj.new Cheetah();
		obj.move();
	}

}

