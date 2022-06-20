package application;

import java.util.Scanner;


import com.greatlearning.emailproblem.pojo.Employee;
import service.CredentialService;


public class DriverClass {
	public static void main(String args[]) {
	Employee emp = new Employee ("Vikash", "Kumar");
	CredentialService cs = new CredentialService();
	String empEmail;
	char[] empPass;


	System.out.println("Please enter the department from the following");
	System.out.println("1. Technical");
	System.out.println("2. Admin");
	System.out.println("3. Human Resources");
	System.out.println("4. Legal");


	int dept = 0;	
	Scanner sc = new Scanner(System.in);
		
	if(sc.hasNextInt()) {
	dept = sc.nextInt();
	} else {
	System.out.println("Please enter the index for the department you want to select.");
	System.exit(0);
		}
	switch(dept) {
	case 1:
			empEmail = cs.generateEmailAddress(emp, "tech");
			empPass = cs.generatePassword();
			cs.showCredentials(emp, empPass, empEmail);
			break;
		case 2:
			empEmail = cs.generateEmailAddress(emp, "admin");
			empPass = cs.generatePassword();
			cs.showCredentials(emp, empPass, empEmail);
			break;
		case 3:
			empEmail = cs.generateEmailAddress(emp, "hr");
			empPass = cs.generatePassword();
			cs.showCredentials(emp, empPass, empEmail);
			break;
		case 4:
			empEmail = cs.generateEmailAddress(emp, "lg");
			empPass = cs.generatePassword();
			cs.showCredentials(emp, empPass, empEmail);
			break;
		default:
			System.out.println("Invalid Input !!!");
		}
		sc.close();
	}
}
