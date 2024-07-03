package StepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class Hooks {
	TestContextSetup testContextsetup;
	public Hooks(TestContextSetup testContextsetup) {
		this.testContextsetup = testContextsetup;
		
	}
	
	@After
	public void AfterScenario() throws IOException {
		
		testContextsetup.testBase.WebDriverManager().quit();
	}
	
	@AfterStep
	public void addScreenshot(Scenario scenario) throws IOException {
		
		WebDriver driver = testContextsetup.testBase.WebDriverManager();
		if(scenario.isFailed()) {
			//screenshot code
			File sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
			scenario.attach(fileContent,"image/png" , "image");
		}
		
	}

}
