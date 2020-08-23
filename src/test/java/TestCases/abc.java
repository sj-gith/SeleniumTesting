package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class abc {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://wikipedia.org");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement dropdown = driver.findElement(By.id("searchLanguage"));

		Select select = new Select(dropdown);
		select.selectByIndex(0);
		select.selectByValue("DA");
		select.selectByVisibleText("English");

		List<WebElement> values = driver.findElements(By.tagName("option"));

		System.out.println(values.size());
		System.out.println(values.get(8).getText());
		
		for (int i=0; i<=values.size(); i++) {
			
			System.out.println(values.get(i).getText());
			
			
			WebElement Block = driver.findElement(By.id("aba"));
			
			List<WebElement> links = Block.findElements(By.tagName("a"));
			System.out.println(links.size());
			for(WebElement link:links) {
				System.out.println(link.getText()+ "  url is --: "+ link.getAttribute("href"));
			}
		}

	}

}
