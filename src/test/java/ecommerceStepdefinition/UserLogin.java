package ecommerceStepdefinition;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import ecommerce.PageActions.EcommerceAccountPageActions;
import ecommerce.PageActions.EcommerceHomePageActions;
import ecommerce.PageActions.EcommerceProfilePageActions;
import ecommerce.Utility.EcommerceBase;

public class UserLogin extends EcommerceBase{
	EcommerceAccountPageActions ecommerceAccountPageActions = new EcommerceAccountPageActions();
	EcommerceHomePageActions ecommerceHomePageActions = new EcommerceHomePageActions();
	EcommerceProfilePageActions ecommerceProfilePageActions = new EcommerceProfilePageActions();
	
	@Given("^Open ecommerce \"([^\"]*)\" application$")
	public void open_ecommerce_application(String URL) throws Throwable {
		EcommerceURLSetup(URL);
	}

	@Then("^click account link$")
	public void click_account_link() throws Throwable {
		ecommerceHomePageActions.clic_kaccount_link();
	}

	@Then("^Enter user namd and password and click login$")
	public void enter_user_namd_and_password_and_click_login() throws Throwable {
		ecommerceAccountPageActions.EcommerceCard( EcommerceProp.getProperty("EcommerceUserName1"),EcommerceProp.getProperty("EcommercePassword1") );
	}

	@Then("^Verify user login sussecc$")
	public void verify_user_login_sussecc() throws Throwable {
		ecommerceProfilePageActions.Verify_user_login_sussecc();
	}
	
	// outline
	@Then("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_and(String u, String p) throws Throwable {
		ecommerceAccountPageActions.EcommerceCard(u, p);
	}



	@Then("^click loginout$")
	public void click_loginout() throws Throwable {
	    driver.findElement(By.xpath("//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--customer-logout']//a[1]"))
	    .click();
	}



}
