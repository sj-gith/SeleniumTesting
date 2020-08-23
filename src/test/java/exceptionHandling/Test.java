package exceptionHandling;
public class Test {

	public static void main(String[] args) {
		/*System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4/0);
		
		*/try {
			MyException.show(10);
		} catch (MyException ex) {
			
		}
		System.out.println(5);
	}
}
