import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {

		//Set<String> set1=new HashSet<String>();		
		//Set<String> set1=new LinkedHashSet<String>();
		Set<String> set1=new TreeSet<String>();
		
		set1.add("DOG");
		set1.add("CAT");
		set1.add("SNAKE");
		set1.add("BULL");

		//set1.add("BULL");
		
		//System.out.println(set1);

		for(String element: set1) {
			System.out.println(element);
		}
		
	}

}
