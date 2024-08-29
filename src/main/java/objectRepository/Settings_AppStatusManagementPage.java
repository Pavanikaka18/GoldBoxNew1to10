package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_AppStatusManagementPage {

	//Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="(//div[@class='mdc-switch__icons'])[1]")private WebElement SearchEdt;
    
    @FindBy(xpath="//span[text()=' Next ']")private WebElement NextPageBtn;
    
    @FindBy(xpath="//span[text()=' Prev ']")private WebElement PreviousPageBtn;
    
    
	//Rule-3:Create a constructor to initilise these elements
    
	public Settings_AppStatusManagementPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	//Rule-4:Provide getters to access these variables

	public WebElement getSearchEdt() {
		return SearchEdt;
	}


	public WebElement getNextPageBtn() {
		return NextPageBtn;
	}


	public WebElement getPreviousPageBtn() {
		return PreviousPageBtn;
	}
    
	
	//Business Libraries
	
}
