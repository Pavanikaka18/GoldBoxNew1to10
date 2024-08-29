package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Notification_AddNotificationPage {

	//Rule-1 :- Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//h1[.='Add Notification']/following-sibling::button[@aria-label='Close']")private WebElement CloseBtn;
    
    @FindBy(xpath="//h1[.='Add Notification']/../following-sibling::div//input[@placeholder='Enter Title']")private WebElement TitleEdt;
    
    @FindBy(xpath="//h1[.='Add Notification']/../following-sibling::div//input[@placeholder='Enter Message']")private WebElement MessageEdt;
    
    @FindBy(xpath="//h1[.='Add Notification']/../following-sibling::div//input[@placeholder='Enter Type']")private WebElement TypeEdt;
    
    @FindBy(xpath="//h1[.='Add Notification']/../following-sibling::div/button[.='Add']")private WebElement AddBtn;
    
    
	//Rule-2:- Create a constructor to initilise these elements
    
	public Notification_AddNotificationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Rule-3:- Provide getters to access these variables
    
	public WebElement getCloseBtn() {
		return CloseBtn;
	}


	public WebElement getTitleEdt() {
		return TitleEdt;
	}


	public WebElement getMessageEdt() {
		return MessageEdt;
	}


	public WebElement getTypeEdt() {
		return TypeEdt;
	}


	public WebElement getAddBtn() {
		return AddBtn;
	}
	

	// Rule-4 :- Create Business Library
	
}
