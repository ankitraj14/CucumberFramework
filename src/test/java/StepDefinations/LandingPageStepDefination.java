package StepDefinations;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class LandingPageStepDefination {
	public WebDriver driver;
	public String productName;
	public String pd;
	public TestContextSetup testContextsetup;
	
	public LandingPageStepDefination(TestContextSetup testContextsetup) {
		this.testContextsetup = testContextsetup;
	}
	
	@Given("User is on Greenkart landing page")
	public void user_is_on_greenkart_landing_page() {
//		testContextsetup.driver = new ChromeDriver();
//		testContextsetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}
	
	
	@When("^user searched with shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortName) {
		LandingPage landingPage = testContextsetup.pg.getLandingPage();
		landingPage.serachItem(shortName);
		testContextsetup.productName = landingPage.getSearchText().split("-")[0].trim();
	   System.out.println(testContextsetup.productName + " is extracted from home page"); 
		
	}

	
	
}
