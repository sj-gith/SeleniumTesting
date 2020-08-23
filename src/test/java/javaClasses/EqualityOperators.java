package javaClasses;

public class EqualityOperators {

	public static void main(String[] args) {
		int i=10;
		int j=20;
		
		System.out.println(i==j);
		
		String s1 = "abc";//when you create an object without a new keyword it will be created in 'SCP'
		String s2 = "abc"; //when you create an object without a new keyword it will be created in 'SCP'
		String s3 = new String("abc");
		
		System.out.println(s1==s2); //True: s1 and s2 references are point to object which is in 'SCP' so it shows true
		System.out.println(s1==s3);//False because when you create a new object using a 'new' key word 2 objects
		// will be created 1 in 'Heap' and 1 in 'String constant pool' known as 'SCP'. In this case object 
		//Reference s3 will point to an object which is in 'Heap'
		//

		
		//if we want to compare the value of the string we use String class equals method
		//it is comparing the value which is 'abc'
		//if you are required to compare the address of the string then we use equal to equal to '==' operator
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		 int x= 0;
	        int y= 0;
	        for (int z = 0; z < 5; z++) 
	        {
	        	 System.out.println(x + " " + y);
	            if (( ++x > 2 ) && (++y > 2)) 
	            {
	            	 System.out.println(x + " " + y);
	                x++;
	                System.out.println(x + " " + y);
	            }
	        }
	        System.out.println(x + " " + y);
	    }
	}


