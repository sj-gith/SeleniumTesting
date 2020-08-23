package selectStatements;

public class BreakAndcontinue {

	public static void main(String[] args) {

		//if we want to print numbers only upto 5
		for (int i = 1; i <= 10; i++) {

			/*if (i <= 5) {
				System.out.println(i);
			} else {
				break;
			}8*/
			
			// not to print number 5
			
			/*if(i!=5) {
				System.out.println(i);
			}*/
			
			//using continue to not print number 5
			
			if(i==5) {
				continue;
			}
				else {
					System.out.println(i);
				}
			
			//to print math tables
			int y =3;
		
			for (int z=1; z<=10; z++) {
				System.out.println(z*y);
			}
			}
			}
}

	
