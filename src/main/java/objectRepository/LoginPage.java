package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//input[@placeholder='Enter your email address']")private WebElement MobileNumberEdt;
    
    @FindBy(xpath="//input[@placeholder='Enter your password']")private WebElement PasswordEdt;
    
    @FindBy(xpath="//button[.=' Sign In ']")private WebElement SignInBtn;
	
  
	//Rule-3:Create a constructor to initilise these elements
    
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Rule-4:Provide getters to access these variables

	public WebElement getMobileNumberEdt() {
		return MobileNumberEdt;
	}


	public WebElement getPasswordEdt() {
		return PasswordEdt;
	}


	public WebElement getSignInBtn() {
		return SignInBtn;
	}
	
	//Business Libraries
	public void loginToApplication(String USERNAME , String PASSWORD) throws InterruptedException
	{
		Thread.sleep(2000);
		MobileNumberEdt.sendKeys(USERNAME);
		Thread.sleep(2000);
		PasswordEdt.sendKeys(PASSWORD);
		Thread.sleep(2000);
		SignInBtn.click();
		Thread.sleep(2000);
	}
	
}
