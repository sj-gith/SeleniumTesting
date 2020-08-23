package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//nth of type
		driver.findElement(By.cssSelector("td:nth-of-type(1) input.inputtext")).sendKeys("sajessu@gmail.com");
		driver.findElement(By.cssSelector("td:nth-of-type(2) input.inputtext")).sendKeys("asdf");
		
		//nth of child
		driver.findElement(By.cssSelector("tr>td:nth-child(1) input.inputext")).sendKeys("sajessu@gmail.com");
		driver.findElement(By.cssSelector("tr>td:nth-child(2) input.inputtext")).sendKeys("asdfff");

	}

}
