import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int value = 0;

		do {

			System.out.println("Please enter value 5");
			value = input.nextInt();

		} while (value != 5);

		input.close();
	}

}
