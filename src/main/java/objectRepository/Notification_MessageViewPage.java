package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Notification_MessageViewPage {

	//Rule-1 :- Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="(//button[.='Understood'])[1]")private WebElement UnderstoodBtn;
    
    @FindBy(xpath="(//button[@aria-label='Close'])[1]")private WebElement CloseBtn;
    
    
	//Rule-2:- Create a constructor to initilise these elements
    
	public Notification_MessageViewPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Rule-3:- Provide getters to access these variables
    
	public WebElement getUnderstoodBtn() {
		return UnderstoodBtn;
	}


	public WebElement getCloseBtn() {
		return CloseBtn;
	}
	

	// Rule-4 :- Create Business Library
	
}
