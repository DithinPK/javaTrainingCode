import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {

		ArrayList<Integer> value = new ArrayList<Integer>();
		
		value.add(10);
		value.add(20);
		value.add(30);
		value.add(40);
		
		System.out.println("Iteration #1");
		for(int i=0;i<value.size();i++) {
			System.out.println(value.get(i));
		}
		
		value.remove(0);
		System.out.println("Iteration #2");
		for(Integer i:value) {
			System.out.println(i);
		}

	}

}
