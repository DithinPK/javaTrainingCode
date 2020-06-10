package DigitalWallet;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LogIn extends DigitalWalletMenu {

	public void logedin(SignUp signup, Scanner input) {

		DigitalWalletMenu dgm = new DigitalWalletMenu();
		System.out.println("\n-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~");
		System.out.println("Welcome to Attra Digital Wallet");
		System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~");

		System.out.println("\nChoose Your Option From Below Menu");
		System.out.println("------------------------------------");
		System.out.println("\n1. Add Money To The Wallet");
		System.out.println("2. P2P/P2M Fund Transfer");
		System.out.println("3. View Details");
		System.out.println("4. Logout");

		String opt = input.nextLine();

		switch (opt) {

		case "1":
			addmoney(signup);
			logedin(signup, input);
			break;

		case "2":
			fundTransfer(signup);
			logedin(signup, input);
			break;

		case "3":
			viewDetails(dgm, signup);
			logedin(signup, input);
			break;

		case "4":
			String[] args = null;
			DigitalWalletMenu.main(args);
			break;

		default:
			System.out.println("\nPlease Choose Valid Option");
			logedin(signup, input);
			break;
		}
	}

	public void addmoney(SignUp signup) {

		System.out.println("\nEnter The Amount You Wish to Add (Upto 20000) ");

		double amount = 0.00;
		Scanner input = new Scanner(System.in);

		try {
			amount = input.nextDouble();
		} catch (InputMismatchException ime) {
			System.out.println("You Entered invalid amount: " + ime.getMessage() + " Try Again");
			addmoney(signup);
		}

		while (!limitValidation(amount)) {

			System.out.println("\nEnter Amount Less Than 20000 ");

			try {
				amount = input.nextDouble();
			} catch (InputMismatchException ime) {
				System.out.println("You Entered invalid amount: " + ime.getMessage() + " Try Again");
				addmoney(signup);
			}

		}

		signup.balance = (signup.balance + amount);

		String[] data = DigitalWalletMenu.userDetails.get(signup.mob_no).toString().split("\\|");
		DigitalWalletMenu.userDetails.replace(signup.mob_no,
				data[0] + "|" + data[1] + "|" + data[2] + "|" + signup.balance);

		System.out.println("\nYour Account is Added with Rs." + (amount));

		System.out.println("\nAvailable Balance In Your Wallet Is: Rs." + signup.balance);
	}

	public boolean limitValidation(double balance) {

		boolean valid = false;

		if (balance <= 20000)
			valid = true;

		return valid;
	}

	public void fundTransfer(SignUp signup) {

		Scanner input = new Scanner(System.in);
		if (signup.balance <= 0.00) {

			System.out.println("\nPlease Add Money To You Waller Before Fund Transfer");
			logedin(signup, input);
		}

		System.out.println("\nPlease Enter The Amount");
		double amount = input.nextDouble();
		System.out.println("Please Enter Merchant's/Consumer Phone No");
		String beneficiary_no = input.next();

		if (amount > signup.balance) {

			System.out.println("\n!...Insufficient Balance In Your Wallet...!");
			logedin(signup, input);
		}

		if (DigitalWalletMenu.loginDetails.containsKey(beneficiary_no)) {

			while (!signup.mobileValidation(beneficiary_no)) {
				
				System.out.println("Merchant's/Consumer Phone Number you entered is not valid");
				System.out.println("Enter Merchant's/Consumer Phone No(10 Digit)");
				beneficiary_no = input.next();
			}
		}
		
		else {
			
			System.out.println("Mobile Number You Enterred Is Not Registered...Kindly Register...!");
			logedin(signup, input);
		}

		signup.balance = signup.balance - amount;

		String[] dataR = DigitalWalletMenu.userDetails.get(signup.mob_no).toString().split("\\|");
		DigitalWalletMenu.userDetails.replace(signup.mob_no,
				dataR[0] + "|" + dataR[1] + "|" + dataR[2] + "|" + signup.balance);

		String[] dataB = DigitalWalletMenu.userDetails.get(beneficiary_no).toString().split("\\|");

		double benAmt = Double.parseDouble(dataB[3]) + amount;
		DigitalWalletMenu.userDetails.replace(beneficiary_no,
				dataB[0] + "|" + dataB[1] + "|" + dataB[2] + "|" + benAmt);

		System.out.println("\nFund Transfer Tranasction Completed.\nAvailable Balance: " + signup.balance);

		System.out.println("\nThank You...! ");

	}

	public void viewDetails(DigitalWalletMenu dgm, SignUp signup) {

		System.out.println("\n-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~");
		System.out.println("\tUser Details");
		System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~");
		System.out.println("-----------------------------------------------------");
		String[] data = DigitalWalletMenu.userDetails.get(signup.mob_no).toString().split("\\|");
		System.out.println("Name: " + data[0]);
		System.out.println("Account Details: " + data[1]);
		System.out.println("Govt ID: " + data[2]);
		System.out.println("Mobile No: " + signup.mob_no);
		System.out.println("Balance: " + data[3]);
		System.out.println("-----------------------------------------------------");

	}

}
