package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCards_AllGiftCardsPage {
	
	// No more available in Fms
	
	//Rule-1 :- Finding WebElements Using @FindBy Annotations
	
    @FindBy(xpath="//input[@placeholder='Search...']")private WebElement SearchEdt;
    
    @FindBy(xpath="//button[.='Add Gift Card']")private WebElement AddGiftCardBtn;
    
    @FindBy(xpath="(//button[.='Buy Users'])[1]")private WebElement BuyUsersBtn;
    
    @FindBy(xpath="(//button[.='Gift Card Used Users'])[1]")private WebElement GiftCardUsedUsersBtn;
    
    @FindBy(xpath="//button[.='Add Gift Card']")private WebElement PreviousPageBtn;
    
    @FindBy(xpath="//button[.='Add Gift Card']")private WebElement NextPageBtn;
    
    
	//Rule-2:- Create a constructor to initilise these elements
    
	public GiftCards_AllGiftCardsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Rule-3:- Provide getters to access these variables
    
	public WebElement getSearchEdt() {
		return SearchEdt;
	}
	
	public WebElement getAddGiftCardBtn() {
		return AddGiftCardBtn;
	}
	
	public WebElement getBuyUsersBtn() {
		return BuyUsersBtn;
	}
	
	public WebElement getGiftCardUsedUsersBtn() {
		return GiftCardUsedUsersBtn;
	}
	
	public WebElement getPreviousPageBtn() {
		return PreviousPageBtn;
	}
	
	public WebElement getNextPageBtn() {
		return NextPageBtn;
	}
	
	
	// Rule-4 :- Create Business Library
	
	public void searchGiftCard(String SearchValue) throws Exception
	{
		Thread.sleep(2000);
		SearchEdt.sendKeys(SearchValue);
		Thread.sleep(2000);
	}
	
}
