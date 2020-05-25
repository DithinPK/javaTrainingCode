import java.util.Scanner;

public class GettingUserInput {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter any text");

		String text = input.nextLine();

		System.out.println("You entered: " + text);

		System.out.println("Please enter integer");

		int intValue = input.nextInt();

		System.out.println("You entered: " + intValue);

		System.out.println("Please enter floating value");

		double doubleValue = input.nextDouble();
		
		System.out.println("You entered: " + doubleValue);
		
		input.close();
	}
}
