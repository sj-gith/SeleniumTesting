package array;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		int[] array = {1,2,3,2,2,3,4};
		
		for(int i=0; i<array.length; i++) {
			
				for(int j=i+1; j<array.length; j++) {
								
				if (array[i]== array[j]) {
					System.out.println("True" + array[i]);
				}
				
			}
			
		}
		

	}

}
