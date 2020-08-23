package variables;

public class LocalVariable {

	int a = 100;//Instance variable
	static int b = 20;//static variable
		
	public static void main(String[] args) {
		int x = 100;//local variable
		int a =50;//local variable
		
		System.out.println(a);//local variable should be called directly.
		
		LocalVariable obj = new LocalVariable();
		
		System.out.println(obj.a);//when you are calling a variable with an object of the class, it is calling instance variable
		
		//instance variable are object specific variables
		
		int var = 100;
		int xyz = 0;
		if (var ==100) {
			xyz = 500;//local variable
			
		}
		System.out.println(xyz);
				
		
		
	}

	/*Local variable: 
	 * 
	 * Declaration: Lo-var are created inside the method
	 * 
	 * Memory allocation: after the method is called
	 * 
	 * Default value: local variables never get default values
	 * 
	 * Scope: Within the method (Within the curly{} braces
	 */
	
	
}
