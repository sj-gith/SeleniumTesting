package methods;

import java.util.Scanner;

public class StringMethod {

	public static void main(String[] args) {
		
		StringMethod obj = new StringMethod();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("first name");
				String a = scan.nextLine();
				
				System.out.println("last name");
				String b = scan.nextLine();
		
		
		String fullname = obj.concateTwoStrings(a, b);
		obj.printName(fullname);
		scan.close();

	}
	public String concateTwoStrings(String firstname, String lastname) {
		
		String finalstring = firstname+" "+lastname;
				return finalstring;
	}
	
	
	public void printName(String name) {
		System.out.println(name);
		
	}

}
