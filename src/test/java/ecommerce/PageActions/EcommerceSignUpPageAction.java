package ecommerce.PageActions;

import ecommerce.PageLocators.EcommerceSignUpPageLocator;
import ecommerce.Utility.EcommerceBase;

public class EcommerceSignUpPageAction extends EcommerceBase {
	
	
	EcommerceSignUpPageLocator ecommerceSignUpPageLocator = new EcommerceSignUpPageLocator();
	public void EcommerceSignUpCard(String U, String P) throws Exception {
		Thread.sleep(5000);
		ecommerceSignUpPageLocator.SignUpUserName.sendKeys(U);
		ecommerceSignUpPageLocator.SignUpUpPassword.sendKeys(P);
		ecommerceSignUpPageLocator.SignUpButton.click();
		Thread.sleep(3000);
	}
	public void allertt() {
		
		driver.switchTo().alert().accept();
	}
	
}
