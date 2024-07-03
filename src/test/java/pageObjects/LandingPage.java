package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='search']")
	WebElement search;

	By search1 = By.xpath("//input[@type='search']");

	@FindBy(xpath = "//h4[normalize-space()='Tomato - 1 Kg']")
	WebElement productName;

	@FindBy(xpath = "//a[normalize-space()='Top Deals']")
	WebElement topDeals;

	@FindBy(css = ".increment")
	WebElement increment;
	
	@FindBy(xpath = "//img[@alt='Cart']")
	WebElement cart;

	@FindBy(xpath = "//button[normalize-space()='ADD TO CART']")
	WebElement addTocart;
	
	@FindBy(xpath = "//button[normalize-space()='PROCEED TO CHECKOUT']")
	WebElement proceedTocheckout;

	public void serachItem(String name) {
		search.sendKeys(name);
	}

	public String getSearchText() {
		return productName.getText();
	}

	public void clickTopDeals() {
		topDeals.click();
	}

	public void increment() {
		increment.click();
		increment.click();
	}
	
	public void clickAddToCart() {
		addTocart.click();
	}

	public void clickCart() {
		cart.click();
	}
	
	public void proceedTocheckout() throws InterruptedException {
		proceedTocheckout.click();
		Thread.sleep(4000);
	}

}
