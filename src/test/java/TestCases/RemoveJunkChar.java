package TestCases;

public class RemoveJunkChar {

	public static void main(String[] args) {
		
		//Use Regular expressions to remove junk char
		String s = "@#234$%&fdfkdf*";
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
				

	}

}
