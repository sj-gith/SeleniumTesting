package selectStatements;

public class SwitchCase {

	public static void main(String[] args) {
		int day = 3;
		
		switch(day)
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		}

		//default
int day1 = 8;
		
switch(day1)
{
case 1:
	System.out.println("Monday");
	break;
case 2:
	System.out.println("Tuesday");
	break;
case 3:
	System.out.println("Wednesday");
	break;
case 4:
	System.out.println("Thursday");
	break;
case 5:
	System.out.println("Friday");
	break;
case 6:
	System.out.println("Saturday");
	break;
case 7:
	System.out.println("Sunday");
	break;
default:
		System.out.println("None of the cases are matched");
		break;
		}
//String

String day3 = "monday";

switch(day3)
{
case "monday":
	System.out.println(1);
	break;
case "tuesday":
	System.out.println(2);
	break;
case "wednesday":
	System.out.println(3);
	break;
case "thurday":
	System.out.println(4);
	break;
case "friday":
	System.out.println(5);
	break;
case "saturday":
	System.out.println(6);
	break;
case "sunday":
	System.out.println(7);
	break;
default:
		System.out.println("None of the cases are matched");
		break;
		}
	}

}
