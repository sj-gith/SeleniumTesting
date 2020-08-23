package array;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		int array[][] = new int[2][3];

		/*
		 * System.out.println(array.length); System.out.println(array[0].length);
		 * System.out.println(array[1].length);
		 */
		int num = 100;
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {

				array[i][j] = (int)(Math.random() * 100);
				
				System.out.println(array[i][j]);

				/*Manually entering the numbers into array
				  array[i][j] = num;
				
				  num = num+100;
				  
				  System.out.println(array[i][j]);
				 */
			}
		}
		array[0][0] = 100;
		array[0][1] = 200;
		array[0][2] = 300;
		array[1][0] = 400;
		array[1][1] = 500;
		array[1][2] = 600;

	}

}
