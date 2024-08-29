package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Users_UserList_AllUsers_ParticularUserInfo_Transactions_FilterPage {

	//Finding WebElements Using @FindBy Annotations
    
    @FindBy(xpath="//input[@placeholder='Start date']")private WebElement StartDateEdt;

	@FindBy(xpath="//input[@placeholder='End date']")private WebElement EndDateEdt;
	
    @FindBy(xpath="//input[@placeholder='Transaction ID']")private WebElement TransactionIdEdt;
    
    @FindBy(xpath="//input[@placeholder='Mobile number']")private WebElement MobileNumberEdt;
    
    @FindBy(xpath="(//div[@class='mdc-checkbox'])[1]")private WebElement ShowAllCheckBox;
    
    @FindBy(xpath="//button[@type='reset']/../preceding-sibling::div/button[@type='submit']")private WebElement SearchBtn;
    
    @FindBy(xpath="//button[@type='reset']")private WebElement ResetBtn;
    
    @FindBy(xpath="(//span[text()=' Prev '])[1]")private WebElement PreviousPageBtn;
    
    @FindBy(xpath="(//span[text()=' Next '])[1]")private WebElement NextPageBtn;
    
    
	//Rule-3:Create a constructor to initilise these elements
    
	public Users_UserList_AllUsers_ParticularUserInfo_Transactions_FilterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

    
	//Rule-4:Provide getters to access these variables

	
	public WebElement getStartDateEdt() {
		return StartDateEdt;
	}


	public WebElement getEndDateEdt() {
		return EndDateEdt;
	}


	public WebElement getTransactionIdEdt() {
		return TransactionIdEdt;
	}


	public WebElement getMobileNumberEdt() {
		return MobileNumberEdt;
	}


	public WebElement getShowAllCheckBox() {
		return ShowAllCheckBox;
	}


	public WebElement getSearchBtn() {
		return SearchBtn;
	}


	public WebElement getResetBtn() {
		return ResetBtn;
	}
    
	
	//Business Libraries
	
}
