package javaClasses;

public class BinaryOperators {

	public static void main(String[] args) {
		String s1 = "way";
		String s2 = "2";
		String s3 = "Automation";
		
			System.out.println(s1+","+s2+s3);
			System.out.println(10+5+s1+s2+s3);//two integer values got added  first then string is concatenated so it works fine
			System.out.println(10+s1+5+s2+s3);
			System.out.println(s1+s2+s3+10*5);
			
		//	System.out.println(s1+s2+s3+10-5);// this is throwing a compilation error because string values got concatenated first
//Data types: Byte->Short/Char->int->long->float->double->
			
			//BinaryOperators
			int a =13;
			double b =2;
			System.out.println(a/b);
			
			int x =13;
			int y =2;
			System.out.println(x/y);
			
		//	Byte c = 100; will not work
			int c= 100; // will work
			  c = c+10; //max(int, Byte, int)--int will take the priority so we can't save the output in 'Byte'
			System.out.println(c);

	}

}
