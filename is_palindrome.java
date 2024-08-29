package Programs;

public class is_palindrome {
	int x=1232;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		is_palindrome obj = new is_palindrome();
		int sum=0,r,temp;
		temp=obj.x;
		while(obj.x>0) {
			r=obj.x%10;
			sum=sum*10+r;
			obj.x=obj.x/10;
		}
		if(temp==sum) {
			System.out.println("Given number is palindrome");
		}
		else {
			System.out.println("Given number is not palindrome");
		}
	}

}
