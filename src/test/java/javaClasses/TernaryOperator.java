package javaClasses;

public class TernaryOperator {

	public static void main(String[] args) {
		/*?: --> Ternary operators
		 * we can use ternary operators instead of if else
		
		* If condition is true '?' will be executed, If condition is false ':' will be executed
		 * 
		 */

		System.out.println(true?"this is true " :" This is false");
		System.out.println(false?"this is true " :" This is false");
		
		int a =100;
		int b = 20;
		int c = 10;
		
		System.out.println((a>b)?(a>c? "a has the largest value" : "c is the largest"):
			(b>c? "b is the largest": "c is the largest"));
	}
}
	


