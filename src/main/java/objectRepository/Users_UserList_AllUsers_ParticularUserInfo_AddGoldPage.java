package objectRepository;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Users_UserList_AllUsers_ParticularUserInfo_AddGoldPage {
	
    //Finding WebElements Using @FindBy Annotations
    
    @FindBy(xpath="//input[@formcontrolname='amount']")private WebElement AmountEdt;

	@FindBy(xpath="//button[.='ADD']")private WebElement AddBtn;
	
	@FindBy(xpath="//iframe[@class='razorpay-checkout-frame']")private WebElement Frame;

	@FindBy(xpath="//input[@name='contact']")private WebElement PhoneNumberEdt;
	
////	(//button[.='Continue'])[2]
//	@FindBy(xpath="//button[@name='button']")private WebElement ContinueBtn;
	
	@FindBy(xpath="//button[@name='button']")private WebElement ProceedBtn;

	@FindBy(xpath="//span[.='Netbanking']")private WebElement NetBankingLnk;
	
	@FindBy(xpath="(//span[.='ICICI Bank'])[1]")private WebElement IciciBankLnk;

	@FindBy(xpath="//button[.='Pay Now']")private WebElement PayNowBtn;
	
	@FindBy(xpath="//button[.='Success']")private WebElement SuccessBtn;

	// After Success clicking wait for 6 sec and switch to alert Popup
	
    
	//Rule-3:Create a constructor to initilise these elements 
    
	public Users_UserList_AllUsers_ParticularUserInfo_AddGoldPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	//Rule-4:Provide getters to access these variables

	public WebElement getAmountEdt() {
		return AmountEdt;
	}


	public WebElement getAddBtn() {
		return AddBtn;
	}
	
	
	public WebElement getFrame() {
		return Frame;
	}


	public WebElement getPhoneNumberEdt() {
		return PhoneNumberEdt;
	}

	public WebElement getProceedBtn() {
		return ProceedBtn;
	}


	public WebElement getNetBankingLnk() {
		return NetBankingLnk;
	}


	public WebElement getIciciBankLnk() {
		return IciciBankLnk;
	}


	public WebElement getPayNowBtn() {
		return PayNowBtn;
	}


	public WebElement getSuccessBtn() {
		return SuccessBtn;
	}
	
	
	
	//Business Libraries
	
	public void addingGold(WebDriver driver, String Amount, String MobileNumber) throws Exception
	{
		AmountEdt.sendKeys(Amount);
		Thread.sleep(2000);
		AddBtn.click();
		Thread.sleep(2000);
		driver.switchTo().frame(Frame);
		Thread.sleep(2000);
		PhoneNumberEdt.sendKeys(MobileNumber);
		Thread.sleep(2000);	
		ProceedBtn.click();
		Thread.sleep(2000);
		NetBankingLnk.click();
		Thread.sleep(2000);
		IciciBankLnk.click();
		Thread.sleep(2000);
		String Parent = driver.getWindowHandle();
		//PayNowBtn.click();
		Thread.sleep(1000);
		Set<String> Childs = driver.getWindowHandles();
		for(String ChildId : Childs)
		{
			if(!ChildId.equals(Parent))
			{
				driver.switchTo().window(ChildId);
			}
		}
		Thread.sleep(2000);
		SuccessBtn.click();
		Thread.sleep(5000);
		driver.switchTo().window(Parent);
		Thread.sleep(5000);
//		driver.switchTo().alert().accept();
//		Thread.sleep(1000);
		
	}
}
