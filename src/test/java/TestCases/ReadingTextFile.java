package TestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingTextFile {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		
		//FileInputStream fis = new FileInputStream("C:\\Users\\sajes\\eclipse-workspace\\SeleniumTesting\\src\\test\\resources\\properties\\object.properties");
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\object.properties");
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("name"));
		
		System.out.println(System.getProperty("user.dir"));
		
	}

	
}

