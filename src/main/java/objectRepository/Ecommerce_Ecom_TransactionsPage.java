package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ecommerce_Ecom_TransactionsPage {

	@FindBy(xpath= "//h4[.='Ecommerce Transactions']/../following-sibling::div/input[@placeholder='Search']")private WebElement SearchEdt;
	  
	//Rule-2:Create a constructor to initilise these elements
    
	public Ecommerce_Ecom_TransactionsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Rule-3 :- Provide getters to access these variables
    
	public WebElement getSearchEdt() {
		return SearchEdt;
	}
	
    
	//Rule-4 :- Create Business Library
    
	public void searchTransactionAccordingToName(WebDriver driver, String Name) throws Exception
	{
		Thread.sleep(2000);
		SearchEdt.sendKeys(Name);
	}
	
}
