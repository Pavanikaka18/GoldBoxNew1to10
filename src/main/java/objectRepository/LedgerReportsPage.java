package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LedgerReportsPage {
	
	//Finding WebElements by using @FindBy Annotation
	
	@FindBy(xpath ="//a[.='Transaction report']") private WebElement TransactionReportLnk;
	
	//Create a constructor to initilise these elements
	
	public LedgerReportsPage(WebDriver driver)
    {
  	  PageFactory.initElements(driver, this);
    }

	//Provide getters to access these variables
	
	public WebElement getTransactionReportLnk() {
		return TransactionReportLnk;
	}

	//Business Libraries
	
	public void LedgerReportsPage_a(WebDriver driver)throws InterruptedException
	{
		Thread.sleep(2000);
		TransactionReportLnk.click();
	}
	
}