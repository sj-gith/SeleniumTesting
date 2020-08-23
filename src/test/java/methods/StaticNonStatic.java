package methods;

public class StaticNonStatic {

	int a  = 20;
	
	static int b = 40;
	public static void main(String[] args) {
		
		System.out.println(b);
		
		//When you are calling a static property(variable or method) always use a class name 
		System.out.println(StaticNonStatic.b);//better approach
		
		StaticNonStatic obj = new StaticNonStatic();
				obj.add();
	}
	
	//When you are calling a non-static property(variable or method) always use an object name
	public void add() {
		
		StaticNonStatic.subtract();//calling static property using a class name
		
		multiply();// we can directly call non-static method from a non static method
		
		StaticNonStatic obj = new StaticNonStatic();//best approach is to create an object and call
		obj.multiply();
		
	}
	
	public static void subtract() {

}
	public void multiply() {
		
		
	}
}
