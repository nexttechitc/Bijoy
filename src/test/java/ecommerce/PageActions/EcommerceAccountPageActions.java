package ecommerce.PageActions;

import ecommerce.PageLocators.EcommerceAccountPageLocator;
import ecommerce.PageLocators.EcommerceHomePageLocator;
import ecommerce.Utility.EcommerceBase;

public class EcommerceAccountPageActions extends EcommerceBase{
	
	
	
	EcommerceAccountPageLocator ecommerceAccountPageLocator = new EcommerceAccountPageLocator();
	public void EcommerceCard(String U, String P) throws Exception {
		Thread.sleep(5000);
		ecommerceAccountPageLocator.UserID.sendKeys(U);
		ecommerceAccountPageLocator.UserPassword.sendKeys(P);
		ecommerceAccountPageLocator.LoginButton.click();
		Thread.sleep(5000);
	}
	
	

}
