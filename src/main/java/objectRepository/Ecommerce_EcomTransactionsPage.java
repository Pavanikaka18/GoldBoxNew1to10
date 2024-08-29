package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ecommerce_EcomTransactionsPage {

    //Rule-1 :- Find Web-Elements using FindBy Annotations
	
    @FindBy(xpath="//h4[.='Ecommerce Transactions']/../following-sibling::div/input[@type='search']")private WebElement SearchEdt;
    
    
	//Rule-2:Create a constructor to initilise these elements
    
	public Ecommerce_EcomTransactionsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

    
	//Rule-3 :- Provide getters to access these variables

	public WebElement getSearchEdt() {
		return SearchEdt;
	}
	
	
	//Rule-4 :- Create Business Library
	
	public void searchTransactionWithName(WebDriver driver, String Name)
	{
		SearchEdt.sendKeys(Name);
	}
	
	
	
}
