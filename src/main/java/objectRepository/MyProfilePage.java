package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage {

	//Rule-1 :- Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//a[.=' My Profile']/following-sibling::a[.='Settings']")private WebElement ProfileSettingsLnk;
    
    @FindBy(xpath="//a[.='Logout ']")private WebElement LogoutLnk;
	
    @FindBy(xpath="//button[.='Yes, Logout!']")private WebElement YesLogoutLnk;
    
    @FindBy(xpath="//button[.='Cancel']")private WebElement CancelLnk;
    
  //a[.='Logout ']
    
	//Rule-2:- Create a constructor to initilise these elements
    
	public MyProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Rule-3:- Provide getters to access these variables
    
	public WebElement getProfileSettingsLnk() {
		return ProfileSettingsLnk;
	}


	public WebElement getLogoutLnk() {
		return LogoutLnk;
	}

	// Rule-4 :- Create Business Library
	
	public void logoutOfApplication() throws Exception
	{
		Thread.sleep(2000);
		LogoutLnk.click();
		Thread.sleep(2000);
		YesLogoutLnk.click();
		Thread.sleep(2000);
	}
	
	
}
