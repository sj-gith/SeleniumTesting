package polymorphism;

public class TestCase {

	public static void main(String[] args) {
		String browserName = "Chrome";
		
		WebDriver driver = TestCase.getBrowserObject(browserName);

	}

	public static WebDriver getBrowserObject(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			return new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			return new FireFoxDriver();
		}
		else
		{
			return new ChromeDriver();
		}
	}
}