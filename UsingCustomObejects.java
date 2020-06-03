import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Person2{
	
	private int id;
	private String name;
	
	public Person2(int id,String name) {
		
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return id+": "+name;
	}
}

public class UsingCustomObejects {

	public static void main(String[] args) {
		
		Person2 p1=new Person2(1,"Professor");
		Person2 p2=new Person2(2,"Nairobi");
		Person2 p3=new Person2(3,"Tokyo");
		Person2 p4=new Person2(0,"Professor");
		
		Map<Person2,Integer> map=new HashMap<Person2, Integer>();
		
		map.put(p1,1);
		map.put(p2,2);
		map.put(p3,3);
		map.put(p4,1);
		
		for(Person2 key: map.keySet()) {
			System.out.println(key+": "+map.get(key));
		}

		Set<String> set=new LinkedHashSet<String>();
		
		set.add("DOG");
		set.add("CAT");
		set.add("BULL");
		
		//System.out.println(set);

		
	}

}
