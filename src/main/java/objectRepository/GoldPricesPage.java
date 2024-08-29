package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldPricesPage 
{

	//Finding WebElements Using @FindBy Annotations

	@FindBy(xpath ="(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[1]") private WebElement GoldPricesSearchEdt;
	@FindBy(xpath ="//a[@class='btn btn-filter']") private WebElement GoldPricesFilterBtn;
	@FindBy(xpath ="//input[@placeholder='Select date']") private WebElement GPEnterDateEdt;
	@FindBy(xpath ="//input[@placeholder='Select Start Time']") private WebElement GPStartTimeEdt;
	@FindBy(xpath ="//input[@placeholder='Select End Time']") private WebElement GPEndTimeEdt;
	@FindBy(xpath ="//button[@class='btn btn-filters ms-auto']") private WebElement GPSearchBtn;
	@FindBy(xpath ="//button[@class='btn btn-filters ms-auto bg-gold']") private WebElement GPRefreshBtn;
	@FindBy(xpath ="//input[@class='mdc-checkbox__native-control']") private WebElement GPShowAllCheckBoxBtn;
	@FindBy(xpath ="//a[text()=' Next ']") private WebElement GPNextBtn;
	@FindBy(xpath ="//a[text()=' Prev ']") private WebElement GPPrevBtn;
	@FindBy(xpath ="//button[.='Add Gold Prices']") private WebElement GPAddGoldPricesBtn;

	// Create a constructor to initilise these elements
	
	public GoldPricesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	// Provide getters to access these variables
	
	public WebElement getGoldPricesSearchEdt() {
		return GoldPricesSearchEdt;
	}

	public WebElement getGoldPricesFilterBtn() {
		return GoldPricesFilterBtn;
	}

	public WebElement getGPEnterDateEdt() {
		return GPEnterDateEdt;
	}

	public WebElement getGPStartTimeEdt() {
		return GPStartTimeEdt;
	}

	public WebElement getGPEndTimeEdt() {
		return GPEndTimeEdt;
	}

	public WebElement getGPSearchBtn() {
		return GPSearchBtn;
	}

	public WebElement getGPRefreshBtn() {
		return GPRefreshBtn;
	}

	public WebElement getGPShowAllCheckBoxBtn() {
		return GPShowAllCheckBoxBtn;
	}

	public WebElement getGPNextBtn() {
		return GPNextBtn;
	}

	public WebElement getGPPrevBtn() {
		return GPPrevBtn;
	}

	public WebElement getGPAddGoldPricesBtn() {
		return GPAddGoldPricesBtn;
	}

	// Business Libraries
	
	public void GoldPricesPage() throws InterruptedException
	{
		
		Thread.sleep(2000);
		GoldPricesSearchEdt.sendKeys(null);
		Thread.sleep(2000);
		GoldPricesFilterBtn.click();
		Thread.sleep(2000);
		GPEnterDateEdt.sendKeys(null);
		Thread.sleep(2000);	
		GPEndTimeEdt.sendKeys(null);
		Thread.sleep(2000);
		GPSearchBtn.click();
		Thread.sleep(2000);
		GPRefreshBtn.click();
		Thread.sleep(2000);
		GPShowAllCheckBoxBtn.click();
		Thread.sleep(2000);
		GPNextBtn.click();
		Thread.sleep(2000);
		GPPrevBtn.click();
		Thread.sleep(2000);
		GPAddGoldPricesBtn.click();
			
		
	}
	
	
}