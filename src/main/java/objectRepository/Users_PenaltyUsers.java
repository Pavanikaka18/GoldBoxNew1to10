package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Users_PenaltyUsers 
{
	
	//Finding WebElements Using @FindBy Annotations
	
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement PenaltyUsersSearchEdt;
	@FindBy(xpath ="//a[@class='btn btn-filter']") private WebElement PenaltyUsersFilterBtn;
//	@FindBy(xpath ="//div[@class='mat-mdc-select-value ng-tns-c13-5']") private WebElement TxnTypeLnk;
	@FindBy(xpath ="//span[.='Select Scheme']") private WebElement SelectSchemeLnk;
	@FindBy(xpath ="//button[@class='btn btn-filters ms-auto']") private WebElement filterSearchBtn;
	@FindBy(xpath ="//button[@class='btn btn-filters ms-auto bg-gold']") private WebElement FiltersRefreshBtn;
	@FindBy(xpath ="//a[@class='btn btn-filter setclose']") private WebElement FilterCloseBtn;;
	@FindBy(xpath ="(//button[.=' Info '])[1]") private WebElement PenaltyUsersInfoBtn;

	// Create a constructor to initilise these elements
	
	public Users_PenaltyUsers(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	// Provide getters to access these variables
	
	public WebElement getPenaltyUsersSearchEdt() {
		return PenaltyUsersSearchEdt;
	}

	public WebElement getPenaltyUsersFilterBtn() {
		return PenaltyUsersFilterBtn;
	}

	public WebElement getSelectSchemeLnk() {
		return SelectSchemeLnk;
	}

	public WebElement getFilterSearchBtn() {
		return filterSearchBtn;
	}

	public WebElement getFiltersRefreshBtn() {
		return FiltersRefreshBtn;
	}
	
	public WebElement getFilterCloseBtn() {
		return FilterCloseBtn;
	}

	public WebElement getPenaltyUsersInfoBtn() {
		return PenaltyUsersInfoBtn;
	}

	// Business Libraries
	
	public void PenaltyUsers(WebDriver driver) throws InterruptedException
	{
		
		Thread.sleep(2000);
		PenaltyUsersSearchEdt.sendKeys(null);
		Thread.sleep(2000);
		PenaltyUsersFilterBtn.click();
		Thread.sleep(2000);
		SelectSchemeLnk.click();
        driver.findElement(By.xpath("//span[.='Gold Plus']")).click();
		Thread.sleep(2000);
		filterSearchBtn.click();
		Thread.sleep(2000);
		FiltersRefreshBtn.click();
		Thread.sleep(2000);
		PenaltyUsersInfoBtn.click();
		Thread.sleep(2000);
		
	}

	
}