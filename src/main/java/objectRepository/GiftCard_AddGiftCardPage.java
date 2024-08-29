package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.WebDriverUtility;

public class GiftCard_AddGiftCardPage {
    
    //Rule-1 :- Finding WebElements Using @FindBy Annotations
	
    @FindBy(xpath="//button[@class='btn-close']")private WebElement CloseBtn;
    
    @FindBy(xpath="//select[@formcontrolname='merchant_id']")private WebElement MerchantDrpDwn;
    
    @FindBy(xpath="//input[@placeholder='Please enter amount']")private WebElement AmountEdt;
    
    @FindBy(xpath="//input[@placeholder='Please enter secret key']")private WebElement SecretKeyEdt;
    
    @FindBy(xpath="//input[@placeholder='Please enter quantity']")private WebElement QuantityEdt;
    
    @FindBy(xpath="//button[.='Add']")private WebElement AddBtn;
    
    
	//Rule-2:- Create a constructor to initilise these elements
    
	public GiftCard_AddGiftCardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Rule-3:- Provide getters to access these variables
    
	
	public WebElement getCloseBtn() {
		return CloseBtn;
	}


	public WebElement getMerchantDrpDwn() {
		return MerchantDrpDwn;
	}


	public WebElement getAmountEdt() {
		return AmountEdt;
	}


	public WebElement getSecretKeyEdt() {
		return SecretKeyEdt;
	}


	public WebElement getQuantityEdt() {
		return QuantityEdt;
	}


	public WebElement getAddBtn() {
		return AddBtn;
	}
	
	
	// Rule-4 :- Create Business Library
    
	public void addingGiftcard(String Amount, String SecretKey, String Quantity) throws Exception 
	{
		WebDriverUtility wUtil = new WebDriverUtility();
		Thread.sleep(2000);
		wUtil.handleDropdownByVisibleText("matrika", MerchantDrpDwn);
		Thread.sleep(2000);
		AmountEdt.sendKeys(Amount);
		Thread.sleep(2000);
		SecretKeyEdt.sendKeys(SecretKey);
		Thread.sleep(2000);
		QuantityEdt.sendKeys(Quantity);
		Thread.sleep(2000);
		AddBtn.click();
		
	}
	
}
