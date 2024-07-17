package ecommerce.PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecommerce.Utility.EcommerceBase;

public class EcommerceAccountPageLocator extends EcommerceBase {
	
	public EcommerceAccountPageLocator() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id  = "loginusername")
	public WebElement UserID;
	
	@FindBy(id  = "loginpassword")
	public WebElement UserPassword;
	
	@FindBy( xpath = "(//button[@class='btn btn-primary'])[3]")
	public WebElement LoginButton;

}


