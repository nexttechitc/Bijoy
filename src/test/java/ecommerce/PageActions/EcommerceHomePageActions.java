package ecommerce.PageActions;

import org.testng.Assert;

import ecommerce.PageLocators.EcommerceAccountPageLocator;
import ecommerce.PageLocators.EcommerceHomePageLocator;
import ecommerce.Utility.EcommerceBase;
import ecommerce.Utility.EcommerceUtility;

public class EcommerceHomePageActions extends EcommerceBase {
	
	EcommerceHomePageLocator ecommerceHomePageLocator = new EcommerceHomePageLocator();
	public void clic_kaccount_link() {
		ecommerceHomePageLocator.AccountLink.click();
		
	}
	public void Verify_user_register_successgully() {
		
		boolean verifySignUp = ecommerceHomePageLocator.VerifySignUp.isDisplayed();	
		Assert.assertTrue(verifySignUp);
		EcommerceUtility.takeMyScreenshot(driver, "Home Page");
		
	}
	public void click_Signup_link() {
		ecommerceHomePageLocator.SignUpButton.click();
		
	}

}
