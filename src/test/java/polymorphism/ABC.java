package polymorphism;

public class ABC {

	public static void main(String[] args) {
		int i = 10; // value of i is type primitive

		Integer obj = new Integer(i); // we are creating object of Integer class and in the constructor of the Integer
										// class we are passing the int value i. by doing this we are converting int
										// value to an object of Integer class.
		System.out.println(obj);

	}

	
}
