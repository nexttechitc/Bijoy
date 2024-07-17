package ecommerceStepdefinition;

import cucumber.api.java.en.Then;
import ecommerce.PageActions.EcommerceHomePageActions;
import ecommerce.PageActions.EcommerceSignUpPageAction;
import ecommerce.Utility.EcommerceBase;
import ecommerce.Utility.EcommerceTestData;

public class UserRegistration extends EcommerceBase{
	EcommerceSignUpPageAction ecommerceSignUpPageAction = new EcommerceSignUpPageAction();
	EcommerceHomePageActions ecommerceHomePageActions = new EcommerceHomePageActions();
	
	@Then("^click Signup link$")
	public void click_Signup_link() throws Throwable {
		ecommerceHomePageActions.click_Signup_link();
	}
	
	@Then("^Enter user namd and email and password and click Signup$")
	public void enter_user_namd_and_email_and_password() throws Throwable {
		ecommerceSignUpPageAction.EcommerceSignUpCard(EcommerceTestData.SihnUpUser1, EcommerceTestData.SihnUpPassowrd1);
		ecommerceSignUpPageAction.allertt();
	}

	

	@Then("^Verify user register successgully$")
	public void verify_user_register_successgully() throws Throwable {
		ecommerceHomePageActions.Verify_user_register_successgully();
	}


}
