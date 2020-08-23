package exceptionHandling;

public class HandlingException {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try{
			MyException.show(10);
			System.out.println(10/0);
			
		}catch(MyException ex) {
			ex.printStackTrace();
		}
		
		System.out.println(4);
		System.out.println(5);
	}
}
