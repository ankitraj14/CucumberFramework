package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	
	public WebDriver driver;

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = ".product-name")
	WebElement productName;
	
	@FindBy(css = ".promoBtn")
	WebElement promo;
	
	@FindBy(xpath = "//button[text()='Place Order']")
	WebElement placeOrder;
	
	public String getProductName() {
		return productName.getText().split("-")[0].trim();
	}
	
	public boolean isPromobtnDisplayed() {
		return promo.isDisplayed();
	}
	
	public boolean isPlaceOrderbtnDisplayed() {
		return placeOrder.isDisplayed();
	}

}
