import java.util.ArrayList;

public class GenericsAndWildcards {

	public static void main(String[] args) {

		ArrayList<String> value=new ArrayList<String>();
		
		value.add("One");
		value.add("Two");
		value.add("Three");
		showValues(value);
		
	}
	public static void showValues(ArrayList<String> value) {
		for (Object item:value) {
			System.out.println(item);
		}
	}

}
