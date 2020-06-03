import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMap {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap =new HashMap<Integer, String>();
		LinkedHashMap<Integer,String> linkedHashMap=new LinkedHashMap<Integer, String>();
		TreeMap<Integer,String> treeMap=new TreeMap<Integer, String>();
		
		testMap(treeMap);

	}
	public static void testMap(Map<Integer, String> map) {
		
		map.put(8,"CAT");
		map.put(3,"DOG");
		map.put(0,"BULL");
		map.put(9,"TIGER");
		map.put(4,"LION");
		
		for(Integer key:map.keySet()) {
			String value=map.get(key);
			
			System.out.println(key+": "+value);
		}
		
	}

}
