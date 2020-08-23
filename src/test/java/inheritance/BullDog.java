package inheritance;

public class BullDog extends Dog {

	public static void main(String[] args) {
		BullDog obj = new BullDog();
		obj.sound();
		
		/*Multi level Inheritance - BullDog class extends Dog class, and Dog extends Animal class.
		 * we can call Animal class method from BullDog class by exteding to Dog class.
		 */

	}

}
