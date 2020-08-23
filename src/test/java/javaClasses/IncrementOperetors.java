package javaClasses;

public class IncrementOperetors {

	public static void main(String[] args) {
		// Increment Operator: (++) Pre increment and post increment these are called unary operators
		// Pre increment: (++operand) First 'i' will increase the value then next operation will be performed.
		//Post increment: (operend++) First rest of the operation(s) will be performed then 'i' value will be
		//increased.
		
		
		
		int i = 10;
		
		System.out.println(++i); //increment(i value become 11) --> print (11 will be printed)
		System.out.println(++i); //increment(i value become 12) --> print (12 will be printed)
		System.out.println(i++); //print(i value is 12) --> increment (will be incremented to 13,
		//since print happen first it will print only 12))
		System.out.println(i); //only  print (13 will be printed)
		System.out.println(i++); //print(i value is 13) --> increment (will be incremented to 14,
		//since print happen first it will print only 13)
		System.out.println(i);// will print 14
			
//Decrement operator: (--): Pre decrement and post decrement these are called unary operators
		// Pre decrement: (--operand) First 'i' will decrease the value then next operation will be performed.
		//Post decrement: (operend--) First rest of the operation(s) will be performed then 'i' value will be
		//decreasde.
		
		System.out.println(--i); // pre decrement will print 13
		
		System.out.println(i--);// post decrement will print 13 and decrement will change the  i value to 12
		System.out.println(++i); // pre increment will print 13
		System.out.println(--i); // pre decrement will print 12
		System.out.println(i);// will print 12
		
		
		int x = 100;
		++x; //OR i++ //Pre/post increment will do the same thing(increase the value) if you are performing
		//only one operations (Here we are only increasing the value, we are not printing along with it
		//so the i value will be increased by one. then in next line if we print it will be 101.
		System.out.println(x); 
		
		int y = 10;
		y = y++; //Assignment, increment 2 operations are involved here.because of post increment y value which is 10 will be assigned
		//to 'y' variable then it will increase the value to 11
		//so it will print 10 only.
				
		System.out.println(y);
		
		// Note: We can't use boolean value with increment or decrement operators
		
		
		//! (logical compliment operator)--> it will convert true in false and vice versa
		
		System.out.println(!true);
		System.out.println(!false);
	}

}
