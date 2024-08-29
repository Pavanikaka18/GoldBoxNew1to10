package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.FMS_BaseClass;
import genericUtility.WebDriverUtility;

public class Notification_UpdateNotificationPage extends FMS_BaseClass{

	//Rule-1 :- Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//h1[.='Update Notification']/following-sibling::button[@aria-label='Close']")private WebElement CloseBtn;
    
    @FindBy(xpath="//h1[.='Update Notification']/../following-sibling::div//input[@placeholder='Enter Title']")private WebElement TitleEdt;
    
    @FindBy(xpath="//h1[.='Update Notification']/../following-sibling::div//input[@placeholder='Enter Message']")private WebElement MessageEdt;
    
    @FindBy(xpath="//h1[.='Update Notification']/../following-sibling::div//input[@placeholder='Enter Type']")private WebElement TypeEdt;
    
    @FindBy(xpath="//h1[.='Update Notification']/../following-sibling::div/button[.='Update']")private WebElement UpdateBtn;
    
    @FindBy(xpath="(//div[.='  Notification Updated Successfully '])[2]")private WebElement UpdateSuccessMsg;
    
    
    
	//Rule-2:- Create a constructor to initilise these elements
    
	public Notification_UpdateNotificationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Rule-3:- Provide getters to access these variables
    
	public WebElement getCloseBtn() {
		return CloseBtn;
	}


	public WebElement getTitleEdt() {
		return TitleEdt;
	}


	public WebElement getMessageEdt() {
		return MessageEdt;
	}


	
	public WebElement getTypeEdt() {
		return TypeEdt;
	}

	
	

	public WebElement getUpdateSuccessMsg() {
		return UpdateSuccessMsg;
	}


	public WebElement getUpdateBtn() {
		return UpdateBtn;
	}
	
	
	// Rule-4 :- Create Business Library
	
	public void updateNotification(String UpdateTitle, String UpdateMessage, String UpdateType) throws Exception
	{
		WebDriverUtility wUtil = new WebDriverUtility();
		
		Thread.sleep(1000);
		TitleEdt.clear();
		Thread.sleep(1000);
		TitleEdt.sendKeys(UpdateTitle);
		Thread.sleep(1000);
		MessageEdt.clear();
		Thread.sleep(1000);
		MessageEdt.sendKeys(UpdateMessage);
		Thread.sleep(2000);
		UpdateBtn.click();
		Thread.sleep(1000);
		if(UpdateSuccessMsg.isDisplayed())
		{
			wUtil.takeScreenShot(sDriver, "g_Notification Updated Successfully");
		}
		else
		{
			System.out.println("Notification Not Updated");
		}
	}
	
}
