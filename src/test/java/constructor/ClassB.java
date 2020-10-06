package constructor;

public class ClassB extends ClassA{

	public static void main(String[] args) {
		ClassB b = new ClassB();

	}

	public ClassB() {
		System.out.println("child cons");
	}
	public ClassB(int i, int j) {
		
	}
}
