package StepDefinations;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.CheckoutPage;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class CheckoutPageStepDefination {
	public String prd;
	
	TestContextSetup testContextsetup;
	public CheckoutPageStepDefination(TestContextSetup testContextsetup) {
		this.testContextsetup = testContextsetup;
	}
	
	
	@Then("user clicked multiple times on  add to cart and then checkout")
	public void user_clicked_multiple_times_on_add_to_cart_and_then_checkout() throws InterruptedException {
		LandingPage landingPage =testContextsetup.pg.getLandingPage();
		 landingPage.increment();
		 landingPage.clickAddToCart();
		 landingPage.clickCart();
		 landingPage.proceedTocheckout();
	}

	@Then("user validate the product item on checkoutpage and apply and place order button")
	public void user_validate_the_product_item_on_checkoutpage_and_apply_and_place_order_button() {

		CheckoutPage checkoutPage =testContextsetup.pg.getCheckoutPage();
		prd = checkoutPage.getProductName();
		Assert.assertEquals( testContextsetup.productName,prd);
		Assert.assertTrue(checkoutPage.isPromobtnDisplayed());
		Assert.assertTrue(checkoutPage.isPlaceOrderbtnDisplayed());
	}


}
