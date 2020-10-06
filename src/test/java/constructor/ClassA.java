package constructor;

public class ClassA {

	int i = 20;
	public static void main(String[] args) {
		ClassA a = new ClassA(); 

	}

	public ClassA() {
		System.out.println("Parent cons");
		
	}	
		public ClassA(int i) {
			
		}
}
