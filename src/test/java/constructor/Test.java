package constructor;
public class Test {
	public static void main(String[] args) {
		Test t = new Test();
		t.p1();
	}
	public void p1() {
		Test t = new Test();
		t.p2();
		this.p2(); //we can call non-static method inside another non-static method using this keyword also.
	}
	public void p2() {
		
		this.p3();
		}
	public static void p3() {
	
	}
}
