package ecommerce.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class EcommerceBase {
	public static WebDriver driver;
	public static Properties EcommerceProp;
	// Constructor
	public EcommerceBase() {
		try {
			FileInputStream EcommerceFile = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\ecommerce\\config\\EcommerceConfigaretion.properties");
			EcommerceProp = new Properties();
			EcommerceProp.load(EcommerceFile);
		} catch (FileNotFoundException e) {
			System.out.println("Please fixed your constructor");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	// BrowserSetup
	public void EcommerceBrowserSetup() {
		String EcommerceAllBrowser = EcommerceProp.getProperty("EcommerceBrowser1");
		
		if(EcommerceAllBrowser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\ecommerceDriver\\chromedriver.exe");
			
			ChromeOptions	opp = new ChromeOptions();
			opp.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(EcommerceUtility.implicitlyWait));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(EcommerceUtility.pageLoadTimeout));
			driver.manage().deleteAllCookies();
			
			
		}
		else if(EcommerceAllBrowser.equals("IE"))
		{
			
			
		}
		
	}
	//LunchURLSetup
	public static void EcommerceURLSetup(String URL) {
		
		driver.get(EcommerceProp.getProperty("EcommerceURL"));
		
	}

}
