import java.util.Scanner;

class Employee{
	String firstName;
	String lastName;
	String department;
	String email;
	String password;
	
	public Employee(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}
}



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Age: ");
		int age = sc.nextInt();
		System.out.println("His age is: " + age);

	}

}
