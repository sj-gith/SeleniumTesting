package TestCases;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingDropDowns {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://wikipedia.org");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.name("country")).sendKeys("Germany");
		
		WebElement dropdown =driver.findElement(By.id("searchLanguage"));
				
		
		Select select = new Select(dropdown);
		
		
		//select.selectByIndex(0);
		select.selectByValue("ast");
		
		List<WebElement> values = driver.findElements(By.tagName("option"));
		
		System.out.println("Total number of values are  "+ values.size());
		
		System.out.println(values.get(1).getText());
		
		for (int i=0; i<values.size(); i++) {
			System.out.println(values.get(i).getAttribute("lang"));
			System.out.println(values.get(i).getText());
		}
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for (WebElement link: links) {
			System.out.println(link.getText() + "  url is ----" + link.getAttribute("href"));
			
			WebElement block = driver.findElement(By.xpath("//*[@id='www-wikipedia-org']/div[6]/div[3]"));
			
			List<WebElement> lin = block.findElements(By.tagName("a"));
			System.out.println(lin.size());
			
			
			
		}
		
	}

}

