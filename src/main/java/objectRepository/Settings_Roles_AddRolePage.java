package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_Roles_AddRolePage {

	//Finding WebElements Using @FindBy Annotations
	
    @FindBy(xpath="//h1[.='Add Role']/following-sibling::button[@aria-label='Close']")private WebElement CloseBtn;
    
    @FindBy(xpath="//h1[.='Add Role']/../following-sibling::div//input[@placeholder='Enter role title']")private WebElement TitleEdt;
    
    @FindBy(xpath="//h1[.='Add Role']/../following-sibling::div/button[.='Add']")private WebElement AddBtn;
    
    
	//Rule-3:Create a constructor to initilise these elements
    
	public Settings_Roles_AddRolePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	//Rule-4:Provide getters to access these variables

	public WebElement getCloseBtn() {
		return CloseBtn;
	}


	public WebElement getTitleEdt() {
		return TitleEdt;
	}


	public WebElement getAddBtn() {
		return AddBtn;
	}
	
	//Business Libraries
	
}
