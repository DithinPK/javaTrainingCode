import java.util.ArrayList;

public class UsingGenerics {

	public static void main(String[] args) {

		ArrayList<String> strings = new ArrayList<String>();

		strings.add("Apple");
		strings.add("Mango");
		strings.add("Banana");

		String fruit = strings.get(1);

		System.out.println(fruit);

	}

}
