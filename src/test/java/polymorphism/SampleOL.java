package polymorphism;

public class SampleOL {

	public static void main(String[] args) {
		SampleOL obj = new SampleOL();
		//obj.add(10, 20);//change one of the value to double in order to call either first method or the second
		obj.add(10.0, 20); 
		obj.add(10, 20.0); 
		
	}
	
	public void add(int a, double b) {
		
	}
	public void add(double a, int b) {
		
	}
	public void add(double a, double b) {
		
	}

}
