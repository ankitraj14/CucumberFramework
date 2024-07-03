package pageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OffersPage {
	
	

		public WebDriver driver;
		public OffersPage(WebDriver driver) {
			this.driver = driver;
			 PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//input[@id='search-field']")
		WebElement search;
		
		@FindBy(xpath="//td[normalize-space()='Tomato']")
		WebElement productName;
		
		public void serachItem(String name) {
			search.sendKeys(name);
		}
		
		public String getSearchText() {
			return productName.getText();
		}
		
		
		
		// testContextsetup.driver.switchTo().window(parentId);
}
