
package javaClasses;

public class ConditionalOperators {

	public static void main(String[] args) {
	/*  &&, || operators we can only use with the boolean conditions
	 * &&(And operator)--> it gives you true if, both operands are true.
    if any of the operand is false, the && operator will give you false
	true && true --> true
	true && false --> false
	false && false --> false
	
	||(OR operator) --> it returns you true if any of the operand is true
	
	true || true --> true
	true || false --> true
	
	false || false --> false */
	
		int i = 10;
		int j = 20;
		//System.out.println(i && j);//and condition will not work  with integer values, it only works with boolean values
				
		System.out.println((i<j) && (j>i)); // this will work
		System.out.println((i<j) && (j==i));
		System.out.println((i>j) && (j>i));
		
		System.out.println((i<j) || (j>i)); 
		System.out.println((i<j) || (j==i));
		System.out.println((i==j) || (j<i));
		
		String s1 = "Rahul";
		String s2;
		s2 = s1;
		String s3 = new String("Rahul");
		
		System.out.println("Comparing==values");
		System.out.println(s1==s3);//false
		System.out.println((s1==s2) && (s1==s3));//address will be compared with '==' equal to  method
		System.out.println(s1.equals(s2) && s1.equals(s3));//content will be compared here with equals method
		
	}

}
