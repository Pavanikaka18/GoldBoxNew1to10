package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Transactions_AllTransactions_FilterPage {

	// Rule-1 :-Finding WebElements Using @FindBy Annotations

	@FindBy(xpath="//a[@class='btn btn-filter setclose']")private WebElement FilterCloseBtn;
	
    @FindBy(xpath="//mat-label[.='Enter a date range']")private WebElement DateRangeEdt;
    
    @FindBy(xpath="//span[.='Select TXN type']")private WebElement TxnTypeDrpDwn;
    
    @FindBy(xpath="//span[.='Select type']")private WebElement SelectTypeEdt;
    
    @FindBy(xpath="//mat-label[.='Mobile number']")private WebElement MobileNumberEdt;
  
    @FindBy(xpath="//input[@placeholder='Transaction ID']")private WebElement TransactionIdEdt;
    
    @FindBy(xpath="//button[@type='submit']")private WebElement SearchBtn;
    
    @FindBy(xpath="//button[@type='reset']")private WebElement ResetBtn;
    
    @FindBy(xpath="(//button[@class='btn-sm btn-view'])[1]")private WebElement DownloadBtn;
    
    @FindBy(xpath="//a[text()=' Next ']")private WebElement NextPageLnk;
    
    @FindBy(xpath="//span[text()=' Prev ']")private WebElement PreviousPageLnk;
    
    
	//Rule-2:Create a constructor to initilise these elements
    
	public Transactions_AllTransactions_FilterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Rule-3:Provide getters to access these variables
	
	public WebElement getFilterCloseBtn() {
		return FilterCloseBtn;
	}
	
	
	public WebElement getNextPageLnk() {
		return NextPageLnk;
	}


	public WebElement getDateRangeEdt() {
		return DateRangeEdt;
	}


	public WebElement getTxnTypeDrpDwn() {
		return TxnTypeDrpDwn;
	}


	public WebElement getSelectTypeEdt() {
		return SelectTypeEdt;
	}


	public WebElement getMobileNumberEdt() {
		return MobileNumberEdt;
	}


	public WebElement getTransactionIdEdt() {
		return TransactionIdEdt;
	}


	public WebElement getSearchBtn() {
		return SearchBtn;
	}


	public WebElement getResetBtn() {
		return ResetBtn;
	}
    
	
	public WebElement getDownloadBtn() {
		return DownloadBtn;
	}


	public WebElement getPreviousPageLnk() {
		return PreviousPageLnk;
	}
	
	
	//Rule-4 :- Create Business Library
	
}
