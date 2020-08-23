package array;

public class MultiDArray {
	/*
	 * we can enter different values in second dimentions second dimension array of
	 * 0 will have length of 3 second dimenison array of 0 will have length of 10
	 */

	public static void main(String[] args) {
		int array[][] = new int[2][];
		array[0] = new int[3];
		array[1] = new int[10];

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {

				array[i][j] = (int) (Math.random() * 100);
				System.out.println(array[i][j]);
			}
		}

	}

}
