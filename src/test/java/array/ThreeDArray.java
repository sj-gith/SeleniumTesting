package array;

public class ThreeDArray {

	public static void main(String[] args) {
		int array[][][]= new int[2][3][4];
		
		for(int i=0; i<array.length; i++) {
			
			for (int j=0; j<array[i].length; j++) {
				
				//need to use first second level array to get to 3rd level.
				for(int k=0; k<array[i][j].length; k++) {
					
					array[i][j][k] = (int)(Math.random()*100);
					System.out.println(array[i][j][k]);
				}
			}
				
		}
		//create object of a class and assign it to 0 index of ThreeDArray
		ThreeDArray[] arr = new ThreeDArray[5];
		
		ThreeDArray obj = new ThreeDArray();
		
		
		arr[0] = obj;
		
		
		
	}

}
