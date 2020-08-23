package constructor;

public class ConstructorChaining {

	public static void main(String[] args) {
		ConstructorChaining obj = new ConstructorChaining();
	}
	
	public ConstructorChaining() {
		//if we want to call constructor with int parameter
		this(10); //constructor calling
	}
	public ConstructorChaining(int i) {
		//if we want to call constructor with string parameter
		this("Java"); 
		System.out.println(i);
	}	
	
	public ConstructorChaining(String s) {
		System.out.println(s);
	}
}

