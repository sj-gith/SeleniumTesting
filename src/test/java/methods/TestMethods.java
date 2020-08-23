package methods;

import java.util.Scanner;

public class TestMethods {

	int i = 10;
	// System.out.println(i); it will throw a compilation error, because any
	// function in order to work it
	// needs to be inside the method
	/*
	 * Method represents a particular functionality Functionalities can be different
	 * If functionality is different then method should be different too
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {
	TestMethods obj = new TestMethods();
		// using scanner class and 'nextInt' method we can pass values through console during runtime.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter first integer value and then press enter!");
		int a = scan.nextInt();
		
		System.out.println("Please enter second integer value and then press enter!");
		int b = scan.nextInt();
		
		int res = obj.addTwoValues(a, b);
		obj.subtractTwoValues(500, 250);
		obj.multiTwoValues(200, 500);
		obj.divideTwoValues(1000, 200);
		obj.printTheResults(res);

	}

	/*
	 * Write a method to add 2 integer values and print the final output
	 * functionality--> addition pre-requisites--> need 2 int values 
	 * step1--> add the 2 int values 
	 * step2--> store the output into a variable 
	 * step3--> print the final value
	 * Recommended method name should be verb + noun
	 */

	public int addTwoValues(int var1, int var2) {

		int sum = var1 + var2;
		
		return  sum;
		

		//System.out.println(sum);

	}

	public void subtractTwoValues(int var1, int var2) {

		int dif = var1 - var2;

		System.out.println(dif);
	}

	public void multiTwoValues(int var1, int var2) {

		
		int total = var1 * var2;
		System.out.println(total);
	}

	public void divideTwoValues(int var1, int var2) {
		
		int result = var1 / var2;
		System.out.println(result);
	}

	// printing results from the other method
	public void printTheResults(int res) throws InterruptedException {
		
		Thread.sleep(2000);
		System.out.println(res);
		
		
	}
	
}
