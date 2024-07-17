package ecommerce.PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecommerce.Utility.EcommerceBase;

public class EcommerceSignUpPageLocator extends EcommerceBase {
	
	public EcommerceSignUpPageLocator() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "sign-username")
	public WebElement SignUpUserName;
	
	@FindBy(id = "sign-password")
	public WebElement SignUpUpPassword;
	
	@FindBy(xpath  = "//button[text()='Sign up']")
	public WebElement SignUpButton;

}


