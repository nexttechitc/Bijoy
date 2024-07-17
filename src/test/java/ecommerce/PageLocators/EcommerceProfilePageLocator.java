package ecommerce.PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecommerce.Utility.EcommerceBase;

public class EcommerceProfilePageLocator extends EcommerceBase{
	
	public EcommerceProfilePageLocator() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "nameofuser")
	public WebElement MyProfile;

}
	
	


