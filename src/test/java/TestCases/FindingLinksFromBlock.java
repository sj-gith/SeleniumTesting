package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingLinksFromBlock {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sajes\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.dallasnews.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement block = driver.findElement(By.xpath("//*[@id=\"fusion-app\"]/footer/div[1]/nav"));

		List<WebElement> Links = block.findElements(By.tagName("a"));
		System.out.println(Links.size());

		for (WebElement Link : Links) {
			System.out.println(Link.getText() + " : URL is : " + Link.getAttribute("href"));

		}

	}
}
