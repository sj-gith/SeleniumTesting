package p3;

public class Testing {

	public static void main(String[] args) {
		Testing.print();
		
		Testing test = new Testing();
		test.sum();

	}

	public static void print() {
		System.out.println("print() of Testing class");
	}
	
	public void sum() {
		System.out.println("sum() of Tesing class");
	}
}
