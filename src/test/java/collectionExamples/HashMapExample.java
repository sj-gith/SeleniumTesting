package collectionExamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap map =new HashMap();
		map.put("first", 100);
		map.put("second", 200);
		map.put("third", 500.5);
		map.put(null, null);
		map.put("first", 400);
		map.put(100, "Java");
		map.put("sele", "Java");
		System.out.println(map);
		
		//Fetch the values
		System.out.println(map.get("first"));
		System.out.println(map.get(100));
		System.out.println(map.get("jfhfdfdk"));
		
		//to fetch all the values from available keys
		Set s = map.keySet();
		
		Iterator it = s.iterator();
		
		while(it.hasNext()) {
			
		Object key = it.next();//this will fetch all the keys from the code
		System.out.println("key is: " + key + " value is: " +map.get(key));
		}
		
	}

}
