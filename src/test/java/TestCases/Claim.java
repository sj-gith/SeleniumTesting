package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Claim {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sajes\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://kccsecure.com/tjtunasettlement/Claimant/UnknownClaimForm");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.id("FirstName")).sendKeys("Savitha");

		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\'LastName\']")).sendKeys("Jessu");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='Addr1']")).sendKeys("1600 Faringdon Drive");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\'City\']")).sendKeys("Plano");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\'St\']")).sendKeys("Texas");
		
		Thread.sleep(1000);
		driver.findElement(By.id("Zip")).sendKeys("75075");
		
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("saviramana8@yahoo.com");

		for (int i = 1; i <= 6; i++) {

			driver.findElement(By.xpath("//fieldset[2]/div/div/div[" + i + "]/label")).click();

		}

		driver.findElement(By.id("IAgree")).click();
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
