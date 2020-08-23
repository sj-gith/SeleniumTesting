package collectionExamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class UniqueValuesArrayList {

	public static void main(String[] args) {
		
		//Printing unique values from the arraylist
		/*
		 * Pick each value from the array
		 * insert those individual values into existing hasSet
		 * when we print hasset will only print unique values.
		 */
		/*ArrayList<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("Ramana");
		list.add("Savitha");
		list.add("Java");
		list.add("Ramana");
		list.add("Rishi");
		list.add("Shishir");
		
		System.out.println(list.size());
		System.out.println(list.get(0));
		}*/
		
	HashSet set = new HashSet();
	
	set.add("Java");
	set.add("Ramana");
	set.add("Savitha");
	set.add("Java");
	set.add("Ramana");
	set.add("Rishi");
	set.add("Shishir");
	
	System.out.println(set);

	}
	
	}


