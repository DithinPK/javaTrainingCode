import java.util.Iterator;
import java.util.LinkedList;

public class UsingIterators {

	public static void main(String[] args) {
		
		LinkedList<String> list =new LinkedList<String>();
		
		list.add("DOG");
		list.add("CAT");
		list.add("BULL");
		list.add("TIGER");
		
		Iterator<String > it=list.iterator();
		
		String animal=it.next();
		
		System.out.println(animal);
		
		for(String value:list) {
			System.out.println(value);
		}

	}

}
