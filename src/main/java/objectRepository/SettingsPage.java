package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage {

	//Rule-1 :- Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//a[.='OTP List']")private WebElement OtpListLnk;
    
    @FindBy(xpath="//a[text()='App management']")private WebElement AppManagementLnk;
    
    @FindBy(xpath="//a[.='Payment management']")private WebElement PaymentManagementLnk;
    
    @FindBy(xpath="//a[.='Roles']")private WebElement RolesLnk;
    
    @FindBy(xpath="//a[.='FMS Users']")private WebElement FmsUsersLnk;
  
  
	//Rule-2:- Create a constructor to initilise these elements
    
	public SettingsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Rule-3:- Provide getters to access these variables


	public WebElement getOtpListLnk() {
		return OtpListLnk;
	}


	public WebElement getAppManagementLnk() {
		return AppManagementLnk;
	}


	public WebElement getPaymentManagementLnk() {
		return PaymentManagementLnk;
	}


	public WebElement getRolesLnk() {
		return RolesLnk;
	}


	public WebElement getFmsUsersLnk() {
		return FmsUsersLnk;
	}
	
	
	
	// Rule-4 :- Create Business Library
	
	
	
}
