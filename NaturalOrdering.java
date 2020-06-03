import java.util.ArrayList;
import java.util.Collection;
//import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Person3 implements Comparable<Person3>{
	private String name;
	
	public Person3(String name) {
		
		this.name=name;
	}
	
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Person3 Person3) {
		// TODO Auto-generated method stub
		return name.compareTo(Person3.name);
	}
}
public class NaturalOrdering {

	public static void main(String[] args) {

		List<Person3> list=new ArrayList<Person3>();
		
		SortedSet<Person3> set=new TreeSet<Person3>();
		
		addElements(list);
		addElements(set);
		
		//Collections.sort(list);
		System.out.println();
		showElements(list);

	}
	
	private static void addElements(Collection<Person3> col) {
		col.add(new Person3("Professor"));
		col.add(new Person3("Nairobi"));
		col.add(new Person3("Tokyo"));
		col.add(new Person3("Rio"));
		col.add(new Person3("Denver"));
		col.add(new Person3("Berlin"));
	}
	private static void showElements(Collection<Person3> col) {
		for(Person3 element:col) {
			System.out.println(element);
		}
	}

}
