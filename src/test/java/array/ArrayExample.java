package array;

public class ArrayExample {

	public static void main(String[] args) {
		int array[] = new int[5];
		//insert values in array
		
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		//Fetching the value from array
		/*	System.out.println(array[2]);
		
		String[] array1 = new String[5];
		//String array1[] = new String[5]; we can place the square bracket either with the data type or with a array variable.
*/
		//assign the values to array at run time
		
		int array2[] = new int[5];
		for (int i=0; i<=4; i++) {
			
			array2[i] = (int)(Math.random()*100);
			System.out.println(array2[i]);
			
			
			for(int x=1000; x<=9999; x++) {
				int x1 = (int)(Math.random()*10000);
				System.out.println(x1);
			}
				
		
			
			
		}
	}

	

}
