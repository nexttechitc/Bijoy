package ecommerce.TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import ecommerce.Utility.EcommerceBase;

@CucumberOptions(features = {"src/test/resources/ecommerceAllFeatures"},
plugin = {"json:target/cucumber.json"},// HTML report/test result 
glue = "ecommerceStepdefinition")//tags = {""})

public class EcommerceTe3stRunner extends AbstractTestNGCucumberTests {
	
	@BeforeTest
	public void EcommerceStartURL() {
		EcommerceBase EStart= new EcommerceBase();
		EStart.EcommerceBrowserSetup();
		
		
	}
	@AfterTest
	public void EcommerceCloseBrowser() {
		EcommerceBase EStart= new EcommerceBase();
		EStart.driver.quit();
		
		
	}

}
