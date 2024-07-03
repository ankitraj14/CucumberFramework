package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {

	public WebDriver driver;

	public WebDriver WebDriverManager() throws IOException {

		FileInputStream fis = new FileInputStream("./src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		// checking browser is coming from terminal or properties file using ternary operator
		String browser = System.getProperty("browser")!=null? System.getProperty("browser") : prop.getProperty("browser");

		if (driver == null) {
			if (browser.equalsIgnoreCase("chrome")) {

				driver = new ChromeDriver(); // driver gets the life
				driver.get(prop.getProperty("url"));
			}
			if (browser.equalsIgnoreCase("edge")) {

				driver = new EdgeDriver();
				driver.get(prop.getProperty("url"));
				
			}
			driver.manage().window().maximize();
		}
		return driver;
	}

}
