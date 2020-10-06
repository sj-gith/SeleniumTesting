package constructor;

public class Child extends Parent {

	int i = 50;
	public static void main(String[] args) {
		Child c = new Child();
		c.add();
		//Parent p = new Parent();
		//p.add();
	}
	//creating a child class constructor
	public Child() {
		System.out.println("calling a child class cons");
	}
	/*public void add() {
		System.out.println("add() of a child class");

		super.add();
		// calling instance variable of child class by using this keyword
		System.out.println(this.i);

		// calling instance variable of a parent class by using super keyword
		System.out.println(super.i);
	}*/
}
