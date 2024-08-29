package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCards_EditGiftCardsMerchantsPage 
{

	//Finding WebElements by using @FindBy Annotation
	
	@FindBy(xpath="(//input[@placeholder='Enter Merchant Name'])[1]")private WebElement MerchantsEditMerchantsNameEdt;
	
	@FindBy(xpath ="(//input[@formcontrolname='joinedon'])[1]") private WebElement MerchantEditJoinedDateEdt;
	
	@FindBy(xpath="(//input[@formcontrolname='email'])[1]")private WebElement MerchantEditEmailEdt;
	
	@FindBy(xpath ="(//input[@formcontrolname='address'])[1]") private WebElement MerchantEditAddressEdt;

	@FindBy(xpath="(//input[@formcontrolname='gc_expiry_time'])[1]")private WebElement MerchantEditGcExpiryTimeEdt;
	
	@FindBy(xpath="(//input[@formcontrolname='phonenumber'])[1]")private WebElement MerchantEditPhoneNumberEdt;
	
	@FindBy(xpath ="//button[.='Update']") private WebElement MerchantEditUpdateBtn;
	
	@FindBy(xpath="(//button[@class='btn-close'])[1]")private WebElement MerchantEditCloseBtn;
	
	//Create a constructor to initilise these elements
	
	public GiftCards_EditGiftCardsMerchantsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Provide getters to access these variables

	public WebElement getMerchantsEditMerchantsNameEdt() {
		return MerchantsEditMerchantsNameEdt;
	}

	public WebElement getMerchantEditJoinedDateEdt() {
		return MerchantEditJoinedDateEdt;
	}

	public WebElement getMerchantEditEdt() {
		return MerchantEditEmailEdt;
	}

	public WebElement getMerchantEditAddressEdt() {
		return MerchantEditAddressEdt;
	}

	public WebElement getMerchantEditGcExpiryTimeEdt() {
		return MerchantEditGcExpiryTimeEdt;
	}

	public WebElement getMerchantEditPhoneNumberEdt() {
		return MerchantEditPhoneNumberEdt;
	}

	public WebElement getMerchantEditUpdateBtn() {
		return MerchantEditUpdateBtn;
	}

	public WebElement getMerchantEditCloseBtn() {
		return MerchantEditCloseBtn;
	}

	//Business Libraries

	public void GiftCards_EditGiftCardsMerchantsPage(WebDriver driver) throws InterruptedException
	{

		Thread.sleep(2000);
		MerchantsEditMerchantsNameEdt.sendKeys(null);
		Thread.sleep(2000);
		MerchantEditJoinedDateEdt.sendKeys(null);
		Thread.sleep(2000);
		MerchantEditEmailEdt.sendKeys(null);
		Thread.sleep(2000);
		MerchantEditAddressEdt.sendKeys(null);
		Thread.sleep(2000);
		MerchantEditGcExpiryTimeEdt.sendKeys(null);
		Thread.sleep(2000);
		MerchantEditPhoneNumberEdt.sendKeys(null);
		Thread.sleep(2000);
		MerchantEditUpdateBtn.sendKeys(null);
		Thread.sleep(2000);
		MerchantEditCloseBtn.sendKeys(null);
	
	}
	
}