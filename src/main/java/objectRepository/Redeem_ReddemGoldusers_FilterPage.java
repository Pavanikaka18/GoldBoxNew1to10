package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Redeem_ReddemGoldusers_FilterPage {
	
	//Finding WebElements Using @FindBy Annotations
	
	  @FindBy(xpath ="//a[@class='btn btn-filter setclose']") private WebElement CloseBtn;
	
	  @FindBy(xpath ="//input[@placeholder='Start date']") private WebElement FromDateEdt;
	  
	  @FindBy(xpath ="//input[@placeholder='End date']") private WebElement EndDateEdt;
	  
	  @FindBy(xpath ="//span[.='Select type']") private WebElement SelectTypeDrpDwn;
	  
	  @FindBy(xpath ="//input[@placeholder='Mobile number']") private WebElement MobileNumberEdt;
	  
	  @FindBy(xpath ="//input[@placeholder='Transaction ID']") private WebElement TransactionIdEdt;
	  
	  @FindBy(xpath ="//span[.='Select TXN type']") private WebElement TxnTypeDrpdwn;
	  
	  @FindBy(xpath ="//span[.='Redeemed']") private WebElement RedeemedLnk;
	  
	  @FindBy(xpath ="(//button[.='Redeem Gold'])[1]") private WebElement RedeemGoldBtn;
	  
	  @FindBy(xpath ="(//button[.='View'])[1]") private WebElement ViewBtn;
	  
	  @FindBy(xpath ="//button[@class='btn btn-filters ms-auto']") private WebElement SearchEdt;
	  
	  @FindBy(xpath ="//button[@class='btn btn-filters ms-auto bg-gold']") private WebElement RefreshBtn;
	
	  //Create a constructor to initilise these elements
	    
		public Redeem_ReddemGoldusers_FilterPage(WebDriver driver)
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
		
		public WebElement getSelectTypeDrpDwn() {
			return SelectTypeDrpDwn;
		}

		public WebElement getMobileNumberEdt() {
			return MobileNumberEdt;
		}

		public WebElement getTransactionIdEdt() {
			return TransactionIdEdt;
		}
		
		public WebElement getTxnTypeDrpdwn() {
				return TxnTypeDrpdwn;
	    }
		
		public WebElement getRedeemedLnk() {
				return RedeemedLnk;
	    }
		
	    public WebElement getRedeemGoldBtn() {
				return RedeemGoldBtn;
		}

		public WebElement getViewBtn() {
				return ViewBtn;
		}

		public WebElement getSearchEdt() {
			return SearchEdt;
		}

		public WebElement getEndDateEdt() {
			return EndDateEdt;
		}

		public WebElement getRefreshBtn() {
			return RefreshBtn;
		}

	 //Business Libraries
		
		public void Users_RedeemGoldUsersPage_m(WebDriver driver)throws InterruptedException
		{
			Thread.sleep(2000);
			CloseBtn.click();
			Thread.sleep(2000);
			FromDateEdt.click();
			Thread.sleep(2000);
			EndDateEdt.click();
			Thread.sleep(2000);
			SelectTypeDrpDwn.click();
			Thread.sleep(2000);
			MobileNumberEdt.click();
			Thread.sleep(2000);
			TransactionIdEdt.click();
			Thread.sleep(2000);
			TxnTypeDrpdwn.click();
			Thread.sleep(2000);
			RedeemedLnk.click();
			Thread.sleep(2000);
			SearchEdt.click();
			Thread.sleep(2000);
			RedeemGoldBtn.click();
			Thread.sleep(2000);
			ViewBtn.click();
			Thread.sleep(2000);
			RefreshBtn.click();
		
		}
}