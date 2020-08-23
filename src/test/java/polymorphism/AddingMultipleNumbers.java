package polymorphism;

public class AddingMultipleNumbers {

	public static void main(String[] args) {
		
		AddingMultipleNumbers adding = new AddingMultipleNumbers();
		
		adding.add(1,4,3,5,6,7);
		adding.add(6,7,8,9,10,49,76,49);
		adding.add(64,74,58,96,170,479,786,409);

	}
//using var argument we can pass 'n' number of same type variables. 
	public void add(int... var) {
		int sum =0;
		for(int i=0; i<var.length; i++) {
		
		sum = sum+var[i];
	}
	System.out.println(sum);

	}
	
	}
