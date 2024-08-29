package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.WebDriverUtility;

public class Users_UserKyc_StatusDrpDwnPage {

	//Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//span[.='Initiated']")private WebElement InitiatedLnk;
    
    @FindBy(xpath="//span[.='Approved']")private WebElement ApprovedLnk;
    
    @FindBy(xpath="(//span[.='Rejected'])[5]")private WebElement RejectedLnk;
    
    @FindBy(xpath="(//span[.='Inactive'])[5]")private WebElement InactiveLnk;
    
	//Rule-3:Create a constructor to initilise these elements
    
	public Users_UserKyc_StatusDrpDwnPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Rule-4:Provide getters to access these variables
	
	public WebElement getInitiatedLnk() {
		return InitiatedLnk;
	}

	public WebElement getApprovedLnk() {
		return ApprovedLnk;
	}

	public WebElement getRejectedLnk() {
		return RejectedLnk;
	}

	public WebElement getInactiveLnk() {
		return InactiveLnk;
	}
	
	//Business Libraries
	
	public void eventStatusUpdate(WebDriver driver) throws Exception
	{
		WebDriverUtility wUtil = new WebDriverUtility();
		
		wUtil.scrollPageDown(4);
		
		wUtil.waitForElementToBeClickable(driver, RejectedLnk);
		RejectedLnk.click();
	}
	
}
