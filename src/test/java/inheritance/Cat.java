package inheritance;

public class Cat extends Animal {

	public static void main(String[] args) {
		BullDog obj = new BullDog();//Creating an object of a specific class we can call methods from either that class or from the parent class.
		obj.sound();
		

	}

}
