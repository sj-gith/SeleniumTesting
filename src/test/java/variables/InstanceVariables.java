package variables;

public class InstanceVariables {

	int x = 100;// instance variable
	int y = 20;// instance variable
	int  a;
	double d;
	String s;
	char c;
	boolean b;
		

	public static void main(String[] args) {

		InstanceVariables t1 = new InstanceVariables();
		InstanceVariables t2 = new InstanceVariables();
		
		System.out.println(t1.x);
		System.out.println(t2.y);
		
		t2.a = 400;
		System.out.println(t1.x);
		System.out.println(t2.y);
		
		System.out.println(t1.a);//0
		System.out.println(t1.d);//0.0
		System.out.println(t1.s);//null
		System.out.println(t1.c);//single space
		System.out.println(t1.b);//false
	}

	/*
	 * Instance variable : are private private property of each and every object(Instance variables are object specific
	 * variables. if one object changes the instance variable that will not effect the instance variable of other object. 
	 * 
	 * Declaration: Inside the class body, but outside a method
	 * 
	 * Memory allocation: Happens after creating an object of class,only instance variables get the memory location 
	 * inside the heap.
	 * 
	 * Default value: if user doesn't assign the value to the in-vari, JVM will assign a default value.
	 * 
	 * Scope: within the class
	 * 
	 */

}
