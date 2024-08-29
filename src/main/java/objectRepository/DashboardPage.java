package objectRepository;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import genericUtility.WebDriverUtility;

public class DashboardPage {
	
	//Finding WebElements Using @FindBy Annotations
	
    @FindBy(xpath="//span[@class='user-name']")private WebElement UserNameDrpDwn;
    
    @FindBy(xpath="//a[@id='toggle_btn']")private WebElement CloseAllElementsBtn;
    
    @FindBy(xpath="//a[@id='toggle_btn']")private WebElement OpenAllElementsBtn;
	
    @FindBy(xpath="//span[@class='user-name']")private WebElement MyProfileLnk;
    
    @FindBy(xpath="//span[@class='mat-mdc-button-touch-target']")private WebElement TransactionsReportCalendarBtn;
    
    @FindBy(xpath="//button[@aria-label='Next month']")private WebElement CalendarNextMonthBtn;
    
    @FindBy(xpath="//button[@aria-label='Previous month']")private WebElement PreviousMonthBtn;
    
    @FindBy(xpath="(//span[@class='mdc-button__label'])[1]")private WebElement YearDrpDwn;
    
    @FindBy(xpath="//input[@placeholder='End date']")private WebElement EndDateEdt;
    
    @FindBy(xpath="//input[@placeholder='Start date']")private WebElement StartDateEdt;
    
    @FindBy(xpath ="//span[.='Gold Prices']") private WebElement GoldPricesLnk;
    
	@FindBy(xpath="//span[.='Users']")private WebElement UsersDrpDwn;
    
    @FindBy(xpath ="//span[.='Redeem']") private WebElement RedeemDrpDwn;

	@FindBy(xpath="//span[.='Schemes']")private WebElement SchemesDrpDwn;
    
    @FindBy(xpath="//span[.='Ecommerce']")private WebElement EcommerceDrpDwn;
    
    @FindBy(xpath="//span[.='Banners']")private WebElement BannersDrpDwn;
    
    @FindBy(xpath="//span[.='Coupons']")private WebElement CouponsDrpDwn;
    
    @FindBy(xpath="//span[.='Gift Cards']")private WebElement GiftCardsDrpDwn;
    
    @FindBy(xpath="//span[.='Notifications']")private WebElement NotificationLnk;
    
    @FindBy(xpath="//span[.='Transactions']")private WebElement TransactionsLnk;
  
    @FindBy(xpath="//span[.='Trading']")private WebElement TradingLnk;
    
    @FindBy(xpath="//span[.='Events']")private WebElement EventsLnk;
    
    @FindBy(xpath="//span[.='Ledger reports']")private WebElement LedgerReportLnk;
    
    @FindBy(xpath="//span[.='Settings']")private WebElement SettingsDrpDwn;
     
  
    
	// Create a constructor to initilise these elements
    
	public DashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	} 

	// Provide getters to access these variables

	public WebElement getUserNameDrpDwn() {
		return UserNameDrpDwn;
	}

	public WebElement getCloseAllElementsBtn() {
		return CloseAllElementsBtn;
	}

	public WebElement getOpenAllElementsBtn() {
		return OpenAllElementsBtn;
	}

	public WebElement getMyProfileLnk() {
		return MyProfileLnk;
	}
    
	public WebElement getTransactionsReportCalendarBtn() {
		return TransactionsReportCalendarBtn;
	}

	public WebElement getCalendarNextMonthBtn() {
		return CalendarNextMonthBtn;
	}

	public WebElement getPreviousMonthBtn() {
		return PreviousMonthBtn;
	}

	public WebElement getYearDrpDwn() {
		return YearDrpDwn;
	}

	
	public WebElement getEndDateEdt() {
		return EndDateEdt;
	}
	
	public WebElement getStartDateEdt() {
		return StartDateEdt;
	}
	
    public WebElement getGoldPricesLnk() {
		return GoldPricesLnk;
	}

	public WebElement getUsersDrpDwn() {
		return UsersDrpDwn;
	}
	
    public WebElement getRedeemDrpDwn() {
		return RedeemDrpDwn;
	}

	public WebElement getSchemesDrpDwn() {
		return SchemesDrpDwn;
	}

	public WebElement getEcommerceDrpDwn() {
		return EcommerceDrpDwn;
	}

	public WebElement getBannersDrpDwn() {
		return BannersDrpDwn;
	}

	public WebElement getCouponsDrpDwn() {
		return CouponsDrpDwn;
	}

	public WebElement getGiftCardsDrpDwn() {
		return GiftCardsDrpDwn;
	}

	public WebElement getNotificationLnk() {
		return NotificationLnk;
	}
	
	public WebElement getTransactionsLnk() {
		return TransactionsLnk;
	}
	
	public WebElement getTradingLnk() {
		return TradingLnk;
	}

	public WebElement getEventsLnk() {
		return EventsLnk;
	}

	public WebElement getLedgerReportLnk() {
		return LedgerReportLnk;
	}

	public WebElement getSettingsDrpDwn() {
		return SettingsDrpDwn;
	}
	
	//Business Libraries
	
	public void clickOnMyProfileLink(WebDriver driver, String ImagePath) throws Exception
	{
		WebDriverUtility wUtil = new WebDriverUtility();
		Thread.sleep(3000);
		wUtil.clickOnChooseFileOption(driver, MyProfileLnk, ImagePath);
//		MyProfileLnk.click();
	}
	
	public void clickOnBannersLnk() throws InterruptedException
	{
		Thread.sleep(2000);
		BannersDrpDwn.click();
	}
	
	
	public void checkingTransactionReport(WebDriver driver, String StartYear, String StartDate, String StartMonth,  String EndDate) throws Exception
	{
		WebDriverUtility wUtil = new WebDriverUtility();
		
		Thread.sleep(2000);
		TransactionsReportCalendarBtn.click();
		Thread.sleep(2000);
		YearDrpDwn.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@aria-label,'"+StartYear+"')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@aria-label,'"+StartMonth+"')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@aria-label,'"+StartDate+"')]")).click();
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		EndDateEdt.click();
		Thread.sleep(2000);
		EndDateEdt.sendKeys(EndDate);
		Thread.sleep(2000);
		wUtil.scrollPageDown(1000);
		Thread.sleep(2000);
		wUtil.takeScreenShot(driver, "a_Searching Invalid Transaction Report");
		
		
		
//		TransactionsReportCalendarBtn.click();
//		Thread.sleep(2000);
//		YearDrpDwn.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(@aria-label,'"+EndYear+"')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(@aria-label,'"+EndMonth+"')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(@aria-label,'"+EndDate+"')]")).click();
		
	}
	
	

	
	
}
