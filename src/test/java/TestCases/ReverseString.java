package TestCases;

public class ReverseString {

	public static void main(String[] args) {
	String s = "Selenium";
	
	int len = s.length();
	String rev = "";
	
	for (int i=len-1; i>=0; i--) {
		
		rev = rev+s.charAt(i);
		
	}
System.out.println(rev);

String x = "Hello World";

StringBuffer sf = new StringBuffer(x);

System.out.println(sf.reverse());

long num1 = 123424;

System.out.println(new StringBuffer(String.valueOf(num1)).reverse());


	}

}
