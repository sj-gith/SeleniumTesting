package polymorphism;

public class SampleWebSite {

	public static void main(String[] args) {

		String bankName = "Chase";
		String loanType = "homeloan";

		SampleWebSite obj = new SampleWebSite();

		System.out.println(obj.getROI(bankName, loanType));

	}

	public double getROI(String bankName, String loanType) {
		if (loanType.equalsIgnoreCase("homeloan")) {
			return SampleWebSite.getBankObject(bankName).getHomeLoanROI();

		} 
		else if (loanType.equalsIgnoreCase("carloan"))

		{
			return SampleWebSite.getBankObject(bankName).getCarLoanROI();

		} 
		else if (loanType.equalsIgnoreCase("educationloan")) {
			return SampleWebSite.getBankObject(bankName).getEducationLoanROI();
		} 
		else
		{
			return SampleWebSite.getBankObject(bankName).getEducationLoanROI();
		}
	}
	
	/*if (bankName.equalsIgnoreCase("Chase")) {
	Chase chase = new Chase();

	if (loanType.equalsIgnoreCase("homeloan")) {

		return chase.getHomeLoanROI();
	} else if (loanType.equalsIgnoreCase("carloan")) {
		return chase.getCarLoanROI();

	} else if (loanType.equalsIgnoreCase("educationloan")) {
		return chase.getEducationLoanROI();
	}
} else if (bankName.equalsIgnoreCase("Citi")) {
	Citi citi = new Citi();

	if (loanType.equalsIgnoreCase("homeloan")) {
		return citi.getHomeLoanROI();

	} else if (loanType.equalsIgnoreCase("carloan")) {
		return citi.getCarLoanROI();

	} else if (loanType.equalsIgnoreCase("educationloan")) {
		return citi.getEducationLoanROI();
	}

} else if (bankName.equalsIgnoreCase("Texas")) {

	Texas texas = new Texas();

	if (loanType.equalsIgnoreCase("homeloan")) {
		return texas.getHomeLoanROI();

	} else if (loanType.equalsIgnoreCase("carloan")) {
		return texas.getCarLoanROI();

	} else if (loanType.equalsIgnoreCase("educationloan")) {
		return texas.getEducationLoanROI();
	}

}
}*/
//creating an object of the each and every bank

	public static BOA getBankObject(String bankName) {

		if (bankName.equalsIgnoreCase("chase")) 
		{
			return new Chase();
		}
		else if (bankName.equalsIgnoreCase("citi")) 
		{
			return new Citi();
		} 
		else if (bankName.equalsIgnoreCase("texas"))
		{
			return new Texas();
		} 
		else 
		{
			return new BOA();
		}
	}
}
