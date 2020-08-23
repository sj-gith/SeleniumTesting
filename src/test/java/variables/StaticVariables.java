package variables;

public class StaticVariables {
	static int a = 10;
	static int b = 20;

	public static void main(String[] args) {
		StaticVariables obj1 = new StaticVariables();

		System.out.println(obj1.a);

		StaticVariables obj2 = new StaticVariables();
		obj2. a = 500;
		System.out.println(obj1.a);//500

	}

	/*
	 * static variable: static properties are shared properties static variables are not object specific variables. if one
	 * object changes the static variable that will effect the static variable of  other object.
	 * Common variable should be created as a static variable.
	 * 
	 * Declaration:Inside the class body, but outside a method with a 'static'
	 * keyword. memory allocation: After class loading default value: Happens after
	 * creating an object of class,only instance variables get the memory location
	 * inside the heap. scope
	 * 
	 * local variable: Declaration/memory allocation/default value/scope
	 */
}
