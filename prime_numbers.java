package Programs;

public class prime_numbers {
	int n=20,count=0;
	public static void main(String[] args) {
		prime_numbers obj = new prime_numbers();
		for(int i=1;i<=obj.n;i++) {
			if(obj.n%i==0) {
				obj.count++;
			}
		}
		if(obj.count==2) {
			System.out.println("Given number is prime number.");
		}
		else {
			System.out.println("Given number is not prime number");
		}
	}
}
