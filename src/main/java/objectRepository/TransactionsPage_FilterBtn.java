package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransactionsPage_FilterBtn {
	
	//Finding WebElements by using @FindBy Annotation
	
	@FindBy(xpath ="//a[@class='btn btn-filter setclose']") private WebElement CloseBtn;
	
	@FindBy(xpath ="//input[@placeholder='Start date']") private WebElement FromDateEdt;
	
	@FindBy(xpath ="//input[@placeholder='End date']") private WebElement ExpireDtaeEdt;
	
	@FindBy(xpath ="//mat-select[@placeholder='Select TXN type']") private WebElement SelectTxnTypeDrpDwn;
	
	@FindBy(xpath ="//mat-select[@placeholder='Select type']") private WebElement SelectTypeDrpDwn;
	
	@FindBy(xpath ="//input[@placeholder='Mobile number']") private WebElement MobileNumberEdt;
	
	@FindBy(xpath ="//input[@placeholder='Transaction ID']") private WebElement TransactionIdEdt;
	
	@FindBy(xpath ="//button[@class='btn btn-filters ms-auto']") private WebElement SearchBtn;
	
	@FindBy(xpath ="//button[@class='btn btn-filters ms-auto bg-gold']") private WebElement RefreshBtn;
	
	//Create a constructor to initilise these elements
	
		public TransactionsPage_FilterBtn(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
	//Provide getters to access these variables
		
		public WebElement getCloseBtn() {
			return CloseBtn;
		}

		public WebElement getFromDateEdt() {
			return FromDateEdt;
		}

		public WebElement getExpireDtaeEdt() {
			return ExpireDtaeEdt;
		}

		public WebElement getSelectTxnTypeDrpDwn() {
			return SelectTxnTypeDrpDwn;
		}

		public WebElement getSelectTypeDrpDwn() {
			return SelectTypeDrpDwn;
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

		public WebElement getRefreshBtn() {
			return RefreshBtn;
		}
	
	//Business Libraries
		
		public void TransactionPage_a(WebDriver driver)throws InterruptedException
		{
			Thread.sleep(2000);
			CloseBtn.click();
			Thread.sleep(2000);
			FromDateEdt.sendKeys(null);
			Thread.sleep(2000);
			ExpireDtaeEdt.sendKeys(null);
			Thread.sleep(2000);
			SelectTxnTypeDrpDwn.click();
			Thread.sleep(2000);
			SelectTypeDrpDwn.click();
			Thread.sleep(2000);
			MobileNumberEdt.sendKeys(null);
			Thread.sleep(2000);
			TransactionIdEdt.sendKeys(null);
			Thread.sleep(2000);
			SearchBtn.click();
			Thread.sleep(2000);
			RefreshBtn.click();
				
		}	

}
