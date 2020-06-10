package DigitalWallet;

import java.util.Hashtable;
import java.util.Scanner;

public class DigitalWalletMenu extends SignUp {

	private static String customer_name;
	private static double balance = 0.00;
	protected static Hashtable<String, String> userDetails=new Hashtable<String, String>();
	protected static Hashtable<String, String> loginDetails=new Hashtable<String, String>();
	static SignUp signUp=new SignUp();

	public static void main(String[] args) {

		System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~");
		System.out.println("\tATTRA DIGITAL WALLET");
		System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~");

		System.out.println("\nChoose Your Option From Below Menu");
		System.out.println("------------------------------------");
		System.out.println("\n1. Sign Up/Create A Wallet ");
		System.out.println("2. Login for Existing User");
		System.out.println("3. Quit");

		Scanner input = new Scanner(System.in);
		String option = input.nextLine();		 
				
		
		switch (option) {

		case "1":
			
			signUp.getUserDetails(input);
			customer_name = signUp.customer_name;
			userDetails.put(signUp.mob_no,
					signUp.customer_name + "|" + signUp.ac_no + "|" + signUp.govt_id + "|" + balance);
			loginDetails.put(signUp.mob_no, signUp.password);						
			main(args);
			break;

		case "2":
			login(signUp, input);
			break;

		case "3":
			System.out.println("\n!.......Thank You.......!");
			System.exit(0);
			break;

		default:
			System.out.println("Please choose Valid Option");
			main(args);
			break;
		}
       input.close();
	}

	public static void login(SignUp signup, Scanner input) {

		
		System.out.println("\nEnter Mobile Number");
		String mob_no = input.nextLine();
		System.out.println("\nEnter Password");
		String pswrd = input.nextLine();
		String[] args = null;		
		
		
		
		if (!loginDetails.containsKey(mob_no)) {
			System.out.println("\nMobile Number Not Registered....Try Again");
			main(args);
		}
		if (pswrd.equals(loginDetails.get(mob_no).toString())) {
			LogIn login = new LogIn();
			signup.mob_no=mob_no;
			login.logedin(signup, input);
			userDetails.replace(mob_no,
					signup.customer_name + "|" + signup.ac_no + "|" + signup.govt_id + "|" + signup.balance);			
			
		} else {
			System.out.println("Incorrect Password.... Try Again");
			main(args);
		}

	}

	public String getCustomerName() {
		return customer_name;
	}

	public double getBalance() {
		return balance;
	}

}
