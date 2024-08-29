package programs;

public class Base_Animal {
	public void eat() {
		System.out.println("Eating..");
	}
	public void sound() {
		System.out.println("sounding..");
	}
	public class Lion extends Animal{
		public void eat() {
			System.out.println("Eating deer...");
		}
		public void sound() {
			System.out.println("roar..");
		} 
	}
	public class Tiger extends Animal{
		public void eat() {
			System.out.println("Eating rabbit..");
		}
		public void sound() {
			System.out.println("chuffing");
		}
	}
	public class Panther extends Animal{
		public void eat() {
			System.out.println("Eating goat..");
		}
		public void sound() {
			System.out.println("growling");
		}
	}
	public static void main(String[] args) {
		Base_Animal ani = new Base_Animal();
		Base_Animal.Lion cub = ani.new Lion();
		Base_Animal.Tiger ti = ani.new Tiger();
		Base_Animal.Panther pan = ani.new Panther();
		cub.eat();
		cub.sound();
		ti.eat();
		ti.sound();
		pan.eat();
		pan.sound();
	}
}
