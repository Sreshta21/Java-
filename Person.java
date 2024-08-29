package programs;
import java.util.*;
public class Person {
	Scanner sc = new Scanner(System.in);
	public void getFirstName() {
		System.out.println("Enter first name:");
		String fname=sc.nextLine();
		System.out.println("First name:"+fname);
	}
	public void getLastName() {
		System.out.println("Enter last name:");
		String lname=sc.nextLine();
		System.out.println("Last name:"+lname);
	}
	public class Employees extends Person{
		public void getEmployeeId() {
			System.out.println("Enter employee id:");
			String empid = sc.nextLine();
			System.out.println("Employee id:"+empid);
		}
		public void getLastName() {
			System.out.println("Enter job title:");
			String jt = sc.nextLine();
			System.out.println("Job title:"+jt);
		}
	}
	public static void main(String[] args) {
		Person out = new Person();
		Person.Employees in = out.new Employees();
		out.getFirstName();
		in.getEmployeeId();
		in.getLastName();
	}
}
