package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZSchemes_MGPPaymentPage 
{

	@FindBy(xpath = "//iframe[@class='razorpay-checkout-frame']")
    public WebElement iframe;

	//Finding WebElements Using @FindBy Annotations
	
	@FindBy(xpath ="//h3[.='Contact details']/..//div//input[@placeholder='Mobile number']") private WebElement PhoneNumberEdt;
	@FindBy(xpath ="//button[.='Continue']") private WebElement ContinueBtn;

	@FindBy(xpath ="//span[.='UPI']") private WebElement UpiLnk;
	@FindBy(xpath ="//h3[.='UPI ID / Number']/..//input[@placeholder='example@okhdfcbank']") private WebElement UpiNameEdt;
	@FindBy(xpath ="//button[.='Verify and Pay']") private WebElement VerifyAndPayBtn;
	
	// Create a constructor to initilise these elements
    
	public ZSchemes_MGPPaymentPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	// Provide getters to access these variables

	public WebElement getIframe() {
		return iframe;
	}

	public WebElement getPhoneNumberEdt() {
		return PhoneNumberEdt;
	}

	public WebElement getContinueBtn() {
		return ContinueBtn;
	}

	public WebElement getUpiLnk() {
		return UpiLnk;
	}

	public WebElement getUpiNameEdt() {
		return UpiNameEdt;
	}

	public WebElement getVerifyAndPayBtn() {
		return VerifyAndPayBtn;
	}
    
	//Business Libraries
	
	public void ZSchemes_GoldPlusPlanInfoPage(WebDriver driver) throws InterruptedException {
	Thread.sleep(2000);

	driver.switchTo().frame(iframe); // Switch to iframe
	Thread.sleep(2000);

	Thread.sleep(2000);
	PhoneNumberEdt.sendKeys("6309631698");
	Thread.sleep(2000);
	ContinueBtn.click();
	Thread.sleep(2000);
	UpiLnk.click();
	Thread.sleep(2000);
	UpiNameEdt.sendKeys("6309631698@ybl");
	Thread.sleep(2000);
	VerifyAndPayBtn.click();
	Thread.sleep(2000);
	
	}
	
	
}