package ecommerce.PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecommerce.Utility.EcommerceBase;

public class EcommerceHomePageLocator extends EcommerceBase {
	
	public EcommerceHomePageLocator() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText  = "Log in")
	public WebElement AccountLink;
	
	@FindBy(linkText  = "Laptops")
	public WebElement VerifySignUp;
	
	@FindBy(id  = "signin2")
	public WebElement SignUpButton;
	
	
	
}


