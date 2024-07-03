package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class OffersPageStepDefination {
	public WebDriver driver;
	public String productName;
	public String pd;
	public PageObjectManager pg;
	
	public TestContextSetup testContextsetup;
	public OffersPageStepDefination(TestContextSetup testContextsetup) {
		this.testContextsetup = testContextsetup;
	}
	
	
		
	
	@Then("^user serached for same shortname (.+) in offers page to check if product exist$")
	public void user_serached_for_same_shortname_in_offers_page_to_check_if_product_exist(String s1) {
		//pg = new PageObjectManager(testContextsetup.driver);
		LandingPage landingPage = testContextsetup.pg.getLandingPage();
		landingPage.clickTopDeals();
		
		testContextsetup.utils.SwitchWindowtoChild();
		OffersPage offersPage = testContextsetup.pg.getOffersPage();
		offersPage.serachItem(s1);
	    pd =offersPage.getSearchText();
	    System.out.println(pd + " is extracted from offers page");
	    //testContextsetup.driver.switchTo().window(parentId);
	}
	
	@Then("user validate the searched item on both pages")
	public void user_validate_the_searched_item_on_both_pages() {
	    Assert.assertEquals(testContextsetup.productName, pd);
	}

}
