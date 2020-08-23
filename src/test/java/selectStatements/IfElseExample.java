package selectStatements;

public class IfElseExample {

	public static void main(String[] args) {
		int a =1;
		int b = 2;
		int c= 4;
		
		if(a>b) {
			
			if(a>c) {
				
				System.out.println("a is greater than c");
			}else {
				System.out.println("c is greater than a");
			}
		}
		
		else
		{
			
				if(b>c) {
					System.out.println("b is greater than c");
				}else {
					System.out.println("c is greater than b");
				}
			}
			
	}
}


