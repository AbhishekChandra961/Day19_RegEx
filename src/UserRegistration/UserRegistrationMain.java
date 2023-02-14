package UserRegistration;

import java.util.Scanner;

public class UserRegistrationMain {

	public static void main(String[] args) {
		
		InterfaceRegistration obj = new ImplementationRegistration();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Name : ");
		String firstName = sc.next();
		while(!obj.firstName(firstName)) {
			System.err.println("First name most start with Cap and have atleast 3 characters");
			firstName = sc.next();
		}
		
		System.out.println("Enter the Last Name : ");
		String lastname = sc.next();
		while(!obj.lastName(lastname)) {
			System.err.println("Last name most start with Cap and have atleast 3 characters");
			lastname = sc.next();
		}
		
		System.out.println("Enter the Email Address : ");
		String email = sc.next();
		while(!obj.email(email)) {
			System.err.println("Email Inavlid : ");
			email = sc.next();
		}
		
		System.out.println("Enter the Mobile Number : ");
		String mobileNumber = sc.next();
		while(!obj.mobileNumber(mobileNumber)) {
			System.err.println("Invaild Number....Enter +CountryCode XXXXXXXXXX ");
			mobileNumber = sc.next();
		}
		
		System.out.println("Enter the Password : ");
		String password = sc.next();
		while(!obj.password(password)) {
			System.err.println("Invalid Password....");
			System.err.println("Minimum 8 Characters");
			System.err.println("Atleast 1 UpperCase");
			System.err.println("Atleast 1 Numeric Number");
			System.err.println("Has exactly 1 Special Character");
			password = sc.next();
		}
		
	}
}
