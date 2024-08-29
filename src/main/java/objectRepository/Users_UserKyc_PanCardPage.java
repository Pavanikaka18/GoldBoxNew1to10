package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Users_UserKyc_PanCardPage {

	//Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//h1[.='Pan Card']/following-sibling::button[@aria-label='Close']")private WebElement CloseBtn;
    
	//Rule-3:Create a constructor to initilise these elements
    
	public Users_UserKyc_PanCardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Rule-4:Provide getters to access these variables

	public WebElement getCloseBtn() {
		return CloseBtn;
	}
    
	//Business Libraries
	
}
