
package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sajes\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://way2automation.com/");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div[2]/div/div[2]/div/a[1]")).click();

		Set<String> windowids = driver.getWindowHandles();
		 Iterator<String> it = windowids.iterator();
				 
		String FirstWindow = it.next();
		System.out.println(FirstWindow);
		String SecondWindow = it.next();
		System.out.println(SecondWindow);

		driver.switchTo().window(SecondWindow);

		driver.findElement(By.id("user_email")).sendKeys("abc@yahoo.com");
		
		driver.switchTo().defaultContent();

		//driver.quit();

		
	}

}
