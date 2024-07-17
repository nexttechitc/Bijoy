package ecommerce.PageActions;

import org.testng.Assert;

import ecommerce.PageLocators.EcommerceProfilePageLocator;
import ecommerce.Utility.EcommerceBase;
import ecommerce.Utility.EcommerceUtility;

public class EcommerceProfilePageActions extends EcommerceBase{
	
	EcommerceProfilePageLocator ecommerceProfilePageLocator = new EcommerceProfilePageLocator();
	
	public void Verify_user_login_sussecc() {
		boolean ProfileVerification =  ecommerceProfilePageLocator.MyProfile.isDisplayed();
		Assert.assertTrue(ProfileVerification);
		
		EcommerceUtility.takeMyScreenshot(driver, "Profile Page");
		
		
	}

}
