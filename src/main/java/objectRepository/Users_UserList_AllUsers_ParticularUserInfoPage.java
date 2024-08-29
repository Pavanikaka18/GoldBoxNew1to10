package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Users_UserList_AllUsers_ParticularUserInfoPage {

	//Finding WebElements Using @FindBy Annotations

	@FindBy(xpath="//button[.='PROFILE']")private WebElement ProfileBtn;
	
    @FindBy(xpath="//button[.='TRANSACTIONS']")private WebElement TransactionsBtn;
    
    @FindBy(xpath="//button[.='LOGIN LOGS']")private WebElement LoginLogsBtn;
    
    @FindBy(xpath="//button[.='ADD GOLD']")private WebElement AddGoldBtn;
    
    
    
	//Rule-3:Create a constructor to initilise these elements
    
	public Users_UserList_AllUsers_ParticularUserInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Rule-4:Provide getters to access these variables

	public WebElement getProfileBtn() {
		return ProfileBtn;
	}



	public WebElement getTransactionsBtn() {
		return TransactionsBtn;
	}



	public WebElement getLoginLogsBtn() {
		return LoginLogsBtn;
	}



	public WebElement getAddGoldBtn() {
		return AddGoldBtn;
	}
	
	//Business Libraries
	
	
}
