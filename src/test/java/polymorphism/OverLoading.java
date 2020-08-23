package polymorphism;

public class OverLoading {

	public static void main(String[] args) {
		OverLoading obj = new OverLoading();
		obj.add(10, 20, 30);// based on the requirement application will run the needed method.
		obj.add(10, 20);
	}

	public void add(int a, int b) {
		int sum = a + b;
		System.out.println("sum is: " + sum);
	}

	public void add(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println("sum is: " + sum);
	}
	
	public void add(int var1, double var2) {
		double sum =var1+var2;
		System.out.println(sum);
	}
	
	public double add(double var1, int var2) {
		double sum = var1+var2;
		System.out.println(sum);
		return sum;
	}
	
	
	}

