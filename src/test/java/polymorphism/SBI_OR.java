package polymorphism;

public class SBI_OR extends RBI_OR {

	public static void main(String[] args) {
		SBI_OR obj = new SBI_OR();
		obj.getHomeLoanROI();
		System.out.println(obj.getHomeLoanROI());
		
		RBI_OR obj1 = new RBI_OR();
		obj.getHomeLoanROI();
		System.out.println(obj1.getHomeLoanROI());
		
		RBI_OR obj2 = new SBI_OR();// polymorphic reference
		obj.getHomeLoanROI();
		System.out.println(obj2.getHomeLoanROI());
	
	}

	public double getHomeLoanROI() {

		return 8.5;
	}
	
	//return type is an Integer class, since return type is a class name, we are returning an object of Integer class.
				public Integer getEducationLoanROI() {
				return 12;
			}

}
