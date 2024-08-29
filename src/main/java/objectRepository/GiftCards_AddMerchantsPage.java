package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCards_AddMerchantsPage 
{

	//Finding WebElements by using @FindBy Annotation
	
	@FindBy(xpath="(//input[@formcontrolname='merchant_name'])[1]")private WebElement MerchantNameEdt;
	
	@FindBy(xpath ="(//input[@formcontrolname='joinedon'])[1]") private WebElement MerchantJoinedDateEdt;
	
	@FindBy(xpath="(//input[@formcontrolname='email'])[1]")private WebElement MerchantEmailEdt;
	
	@FindBy(xpath ="(//input[@formcontrolname='address'])[1]") private WebElement MerchantAddressEdt;

	@FindBy(xpath="(//input[@formcontrolname='gc_expiry_time'])[1]")private WebElement MerchantsGcExpiryTimeEdt;
	
	@FindBy(xpath="(//input[@formcontrolname='phonenumber'])[1]")private WebElement MerchantsPhoneNumberEdt;
	
	@FindBy(xpath ="//button[.='Add']") private WebElement MerchantsAddBtn;
	
	@FindBy(xpath="(//button[@class='btn-close'])[1]")private WebElement MerchantsCloseBtn;
	
	//Create a constructor to initilise these elements
	
	public GiftCards_AddMerchantsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	//Provide getters to access these variables

	public WebElement getMerchantNameEdt() {
		return MerchantNameEdt;
	}

	public WebElement getMerchantJoinedDateEdt() {
		return MerchantJoinedDateEdt;
	}

	public WebElement getMerchantEmailEdt() {
		return MerchantEmailEdt;
	}

	public WebElement getMerchantAddressEdt() {
		return MerchantAddressEdt;
	}

	public WebElement getMerchantsGcExpiryTimeEdt() {
		return MerchantsGcExpiryTimeEdt;
	}

	public WebElement getMerchantsPhoneNumberEdt() {
		return MerchantsPhoneNumberEdt;
	}

	public WebElement getMerchantsAddBtn() {
		return MerchantsAddBtn;
	}

	public WebElement getMerchantsCloseBtn() {
		return MerchantsCloseBtn;
	}

	//Business Libraries

	public void GiftCards_AddMerchantsPage(WebDriver driver) throws InterruptedException
	{

		Thread.sleep(2000);
		MerchantNameEdt.sendKeys(null);
		Thread.sleep(2000);
		MerchantJoinedDateEdt.sendKeys(null);
		Thread.sleep(2000);
		MerchantEmailEdt.sendKeys(null);
		Thread.sleep(2000);
		MerchantAddressEdt.sendKeys(null);
		Thread.sleep(2000);
		MerchantsGcExpiryTimeEdt.sendKeys(null);
		Thread.sleep(2000);
		MerchantsPhoneNumberEdt.sendKeys(null);
		Thread.sleep(2000);
		MerchantsAddBtn.click();
		Thread.sleep(2000);
		MerchantsCloseBtn.click();
		
	}
	
	
}