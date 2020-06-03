import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortingLists {

	public static void main(String[] args) {

		List<String> list=new ArrayList<String>();
		
		list.add("DOG");
		list.add("CAT");
		list.add("BULL");
		list.add("TIGER");
		list.add("LION");
		
		Collections.sort(list);
		
		for(String value:list) {
			System.out.println(value);
		}
	}

}
