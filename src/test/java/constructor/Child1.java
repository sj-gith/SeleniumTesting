package constructor;

public class Child1 extends Parent1{

	public static void main(String[] args) {
		Child1 c = new Child1();
		
	}
	
	public Child1() {
		super(10);
		System.out.println("child cons");
		
	}

}
