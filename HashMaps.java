import java.util.HashMap;
import java.util.Map;

public class HashMaps {

	public static void main(String[] args) {

		HashMap<Integer,String> hashmap=new HashMap<Integer, String>();

		hashmap.put(1,"ONE");
		hashmap.put(2,"TWO");
		hashmap.put(3,"THREE");
		hashmap.put(4,"FOUR");
		hashmap.put(5,"FIVE");
		
		//String text=hashmap.get(3);
		
		//System.out.println(text);
		
		for(Map.Entry<Integer,String> entry: hashmap.entrySet()) {
			int key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+": "+value);
		}

	}

}
