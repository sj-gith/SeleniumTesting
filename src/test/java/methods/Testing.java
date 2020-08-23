package methods;

public class Testing {

	public static void main(String[] args) {
		
		Testing obj = returnObject();
		obj.add();
		
	}

//Return the object of the testing class from another method	
	public static Testing returnObject() {
		
		Testing t = new Testing();
		
		return t;
	}
	
	public void add() {
		
		int sum = 20+30;	
		System.out.println(sum);
	}
}
