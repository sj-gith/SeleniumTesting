package constructor;

public class Student {
//instance variables
	String studentName;
	int rollNum;

	// creating a constructor with parameters. these variable will be local variables, and we want to store these
	//values in to instance variable using 'this' key word.
	public Student(String studentName, int rollNum) {

		this.studentName= studentName;
		this.rollNum = rollNum;
	}
	//we can overload the constructor
	
		public Student(){
			
		}
		
		public Student(String studentName, int rollNum, long mobile) {
			
			
		}
	

	

	public static void main(String[] args) {

		Student s1 = new Student("jacky", 100);// Student() is a constructor.it will be created when we create an object of the
									// class. it is a default constructor.

		Student s2 = new Student("Jack", 101);
		Student s3 = new Student("Jhonk", 102);
		Student s4 = new Student("Tom", 103);
		
		System.out.println(s1.studentName);
		System.err.println(s1.rollNum);
		
		System.out.println(s2.studentName);
		System.err.println(s2.rollNum);
	}

}
