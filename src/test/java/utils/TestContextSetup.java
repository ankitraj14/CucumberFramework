package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetup {
	public WebDriver driver;
	public String productName;
	
	public PageObjectManager pg;
	public TestBase testBase;
	public GenericUtils utils;
	
	public TestContextSetup() throws IOException {
		testBase = new TestBase();
		utils = new GenericUtils(testBase.WebDriverManager());
		 pg = new PageObjectManager(testBase.WebDriverManager());
	}
	
	

}
