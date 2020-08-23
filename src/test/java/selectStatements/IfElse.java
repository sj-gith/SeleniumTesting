package selectStatements;

public class IfElse {

	public static void main(String[] args) {

		int i = 11;
		if (i < 10) {
			System.out.println("i is less than 10");
			// nothing will get printed here, because the condition we have given is false,
			// so if statement will not get executed.
		}

		int j = 9;
		if (j <= 10) {
			System.out.println("j is less than 10");
			// since the condition is true it will get printed.
		}
		int l = 10;
		if (l % 2 == 0) {
			System.out.println("l is an even number");
		} else {
			System.out.println("l is an odd number");

		}

		int k = 10;
		if (k <= 10) {
			System.out.println("k is less than 10");
		} else
			System.out.println("k is not less than 10");
		// condition is false so else statement will get executed int k = 10;

		if (k == 10) {
			System.out.println("k values is 10");
		} else
			System.out.println("k values is not 10");
		// condition is false so else statement will get executed

		boolean b = false;
		
		
		if (b == true) {
			System.out.println("Okay");
		} else
			System.out.println("wrong");
		// condition is false so else statement will get executed
		
		if (b = true) {
			System.out.println("Yes");
		} else
			System.out.println("No");
		// condition is true so if statement will get executed


	}

}
