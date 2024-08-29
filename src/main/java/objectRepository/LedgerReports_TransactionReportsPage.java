package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LedgerReports_TransactionReportsPage {

	//Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//mat-label[.='Enter a date range']")private WebElement DateRangeEdt;
    
    @FindBy(xpath="//input[@placeholder='Mobile number']")private WebElement MobileNumberEdt;
    
    @FindBy(xpath="//button[.=' Get Report']")private WebElement GetReportBtn;
	
  
	//Rule-3:Create a constructor to initilise these elements
    
	public LedgerReports_TransactionReportsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Rule-4:Provide getters to access these variables

	public WebElement getDateRangeEdt() {
		return DateRangeEdt;
	}
	
	
	public WebElement getMobileNumberEdt() {
		return MobileNumberEdt;
	}


	public WebElement getGetReportBtn() {
		return GetReportBtn;
	}
    
	
	//Business Libraries
	
}
