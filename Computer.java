package programs;

public class Computer {
	private class Processor{
		String brand;
		double speed;
		public void displayDetails() {
			brand = "intel";
			speed = 2.4;
			System.out.println("brand:"+brand+","+"speed:"+speed);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer out = new Computer();
		Computer.Processor in = out.new Processor();
		in.displayDetails();
	}

}
