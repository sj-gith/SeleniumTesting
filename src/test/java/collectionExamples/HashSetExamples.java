package collectionExamples;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExamples {

	public static void main(String[] args) {

		HashSet set = new HashSet();

		set.add(10);
		set.add(10.5);
		set.add("java");
		set.add(null);
		set.add(true);
		set.add(10);
		set.add('a');
		System.out.println(set);
		System.out.println(set.size());
		
		//to fetch all the values 
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
