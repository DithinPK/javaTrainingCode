package DigitalWallet;

import java.util.Scanner;

public class SignUp {

	public String customer_name;
	protected String ac_no;
	protected String mob_no;
	protected String govt_id;
	protected String password;
	protected double balance = 0.00;
	private String namePattern = "[a-zA-Z_. ]{3,20}$";// "^[\\\\p{L} .'-]+$";
	private String accountPattern = "[0-9]{10,20}$";
	public String mobilePattern = "[0-9]{10}$";
	private String govtIDPattern = "[a-zA-Z0-9]{10,16}$";
	private String passwordPattern = "[a-zA-Z0-9_.]{8,20}$";
	private String otp;
	private String otpPattern = "[0-9]{6}$";

	public void getUserDetails(Scanner input) {

		System.out.println("\nEnter Your Name");
		customer_name = input.nextLine();

		while (!nameValidation(customer_name)) {
			System.out.println("\nName you entered is not valid");
			System.out.println("Enter Your Name");
			customer_name = input.nextLine();
		}

		System.out.println("\nEnter Your Account number (10 length Min): ");
		ac_no = input.nextLine();

		while (!accountValidation(ac_no)) {
			System.out.println("\nAcccount Number you entered is not valid");
			System.out.println("Enter Your Account number");
			ac_no = input.nextLine();
		}

		System.out.println("\nEnter Your Mobile number");
		mob_no = input.nextLine();

		while (!mobileValidation(mob_no)) {
			System.out.println("\nMobile Number you entered is not valid");
			System.out.println("Enter Your Mobile number");
			mob_no = input.nextLine();
		}

		System.out.println("\nEnter Your Govt ID number (10 length Min)");
		govt_id = input.nextLine();

		while (!govtIdValidation(govt_id)) {
			System.out.println("\nGovt Id Number you entered is not valid");
			System.out.println("Enter Your Govt ID number");
			govt_id = input.nextLine();
		}

		System.out.println("\nPlease Enter The OTP(6-digit)");
		otp = input.nextLine();

		while (!otpValidation(otp)) {
			System.out.println("\nOTP you entered is not valid");
			System.out.println("Enter Your Correct OTP : ");
			otp = input.nextLine();

		}

		System.out.println("\nEnter The Password To Create The Wallet");
		password = input.nextLine();
		System.out.println("\nRe-enter The Password To Confirm");
		String newPswrd = input.nextLine();

		while (!password.equals(newPswrd)) {
			System.out.println("\nPassword Doesnt Match. Try Again...!");
			System.out.println("\nEnter The Password To Create The Wallet");
			password = input.nextLine();
			System.out.println("\nRe-enter The Password To Confirm");
			newPswrd = input.nextLine();
		}
		
		while (!passwordValidation(password)) {
			System.out.println("\nSet A Valid Password. Try Again...!");
			System.out.println("\nEnter The Password To Create The Wallet");
			password = input.nextLine();
			System.out.println("\nRe-enter The Password To Confirm");
			newPswrd = input.nextLine();
			
			while (!password.equals(newPswrd)) {
				System.out.println("\nPassword Doesnt Match. Try Again...!");
				System.out.println("\nEnter The Password To Create The Wallet");
				password = input.nextLine();
				System.out.println("\nRe-enter The Password To Confirm");
				newPswrd = input.nextLine();				
			}
		}

		System.out.println("\n!...You have Succesfully SignedUp To The Wallet....!");

	}

	public boolean nameValidation(String customer_name) {

		boolean valid = false;
		if (customer_name.matches(namePattern)) {
			valid = true;
		}
		return valid;
	}

	public boolean accountValidation(String ac_no) {

		boolean valid = false;
		if (ac_no.matches(accountPattern)) {
			valid = true;
		}
		return valid;
	}

	public boolean mobileValidation(String mob_no) {

		boolean valid = false;
		if (mob_no.matches(mobilePattern)) {
			valid = true;
		}
		return valid;
	}

	public boolean govtIdValidation(String govt_id) {

		boolean valid = false;
		if (govt_id.matches(govtIDPattern)) {
			
			if(govt_id.matches(".*\\d.*")) {
				valid = true;	
			}
			
		}
		return valid;
	}

	public boolean otpValidation(String otp) {

		boolean valid = false;
		if (otp.matches(otpPattern)) {
			valid = true;
		}
		return valid;
	}

	public boolean passwordValidation(String password) {

		boolean valid = false;
		if (password.matches(passwordPattern)) {
			valid = true;
		}
		return valid;
	}

}
