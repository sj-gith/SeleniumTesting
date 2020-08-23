package p2;

import p1.Home;
import p1.Test;
import p3.Testing;
import static p3.Testing.*;//static import

public class Sample {

	public static void main(String[] args) {
		Test t = new Test();
		t.add();

		Home h = new Home();
		h.display();

		p2.Test a = new p2.Test();// if we have same class name in both package we need to mention package name
									// along with the class name when we create the object of the class.
		a.add();

		// Testing.print();
		print(); // when we use static import with * we don't need to mention class name with the
					// method when we call that method. it will import all the static components from that class
		
		Testing t1 = new Testing();
		t1.sum();
	}

}
