package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCard_BuyUsersPage {

//Rule-1 :- Finding WebElements Using @FindBy Annotations
	
    @FindBy(xpath="//input[@type='search']")private WebElement SearchEdt;
    
    
	//Rule-2:- Create a constructor to initilise these elements
    
	public GiftCard_BuyUsersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Rule-3:- Provide getters to access these variables
    
	public WebElement getSearchEdt() {
		return SearchEdt;
	}
	
		
	
	// Rule-4 :- Create Business Library
    
	public void searchingGiftCard(String SearchValue) throws Exception
	{
		Thread.sleep(2000);
		SearchEdt.sendKeys(SearchValue);
	}
	
}
