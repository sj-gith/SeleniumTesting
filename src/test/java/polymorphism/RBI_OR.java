package polymorphism;

public class RBI_OR {

	public static void main(String[] args) {
		RBI_OR obj = new RBI_OR();
		obj.getHomeLoanROI();
		System.out.println(obj.getHomeLoanROI());
	}

	public double getHomeLoanROI() {

		return 7.0;
	}

	public double getCarLoanROI() {

		return 10.0;
	}
//return type is a Number class, since return type is a class name, we are returning an object
	public Number getEducationLoanROI() {

		return 10;
	}

}
