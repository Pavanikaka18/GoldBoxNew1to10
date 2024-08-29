package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCards_MerchantsPage {
	
	//Finding WebElements by using @FindBy Annotation
	
	@FindBy(xpath="//input[@placeholder='Search...']")private WebElement MerchantsSearchEdt;
	
	@FindBy(xpath ="//button[.='Add Merchants']") private WebElement MerchantsAddMerchantsBtn;
	
	@FindBy(xpath="(//button[.=' Edit '])[1]")private WebElement MerchantsEditBtn;
	
	@FindBy(xpath ="//a[text()=' Next ']") private WebElement MerchantsNextPageBtn;

	@FindBy(xpath="//a[text()=' Prev ']")private WebElement MerchantsPrevPageBtn;
	
	
	//Create a constructor to initilise these elements
	
	public GiftCards_MerchantsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Provide getters to access these variables

	public WebElement getMerchantsSearchEdt() {
		return MerchantsSearchEdt;
	}


	public WebElement getMerchantsAddMerchantsBtn() {
		return MerchantsAddMerchantsBtn;
	}


	public WebElement getMerchantsEditBtn() {
		return MerchantsEditBtn;
	}


	public WebElement getMerchantsNextPageBtn() {
		return MerchantsNextPageBtn;
	}


	public WebElement getMerchantsPrevPageBtn() {
		return MerchantsPrevPageBtn;
	}

	//Business Libraries

	public void GiftCardsPage_a(WebDriver driver) throws InterruptedException
	{

		Thread.sleep(2000);
		MerchantsSearchEdt.click();
		Thread.sleep(2000);
		MerchantsAddMerchantsBtn.click();
		Thread.sleep(2000);
		MerchantsEditBtn.click();
		Thread.sleep(2000);
		MerchantsNextPageBtn.click();
		Thread.sleep(2000);
		MerchantsPrevPageBtn.click();
		
	}
	
	
}