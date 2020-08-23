package collectionExamples;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExamples {

	public static void main(String[] args) {
		//creating an array
		//int[] array = new int[2];
//Creating an arraylist.
		ArrayList list = new ArrayList();
		
		//How to insert values in arraylist
		
		list.add(10);
		list.add(10.5);
		list.add("Java");
		list.add(true);
		list.add('a');
		list.add(null);//null value
		list.add(10);//duplicate value
		
		System.out.println(list);
		
		//how to get the size of an arraylist
		System.out.println(list.size());
		list.add(20);
		//how to fetch values from the arraylist
		
		System.out.println(list.get(0));
		System.out.println(list.get(3));
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		
		//Restricted arraylist
		
		ArrayList<Integer> List = new ArrayList<Integer>();
		
		List.add(10);
		List.add(null);
		
	}

}
