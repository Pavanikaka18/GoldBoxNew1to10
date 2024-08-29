package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Users_UserList_AllUsers_ParticularUserInfo_LoginLogsPage {

	//Finding WebElements Using @FindBy Annotations
    
    @FindBy(xpath="//h4[.='User Logs']/../following-sibling::div/button[.='Export to Excel']")private WebElement ExportToExcelBtn;

	@FindBy(xpath="//h4[.='User Logs']/ancestor::div[@class='card-header']//span[text()=' Prev ']")private WebElement PrevLnk;
	
    @FindBy(xpath="//h4[.='User Logs']/ancestor::div[@class='card-header']//span[text()=' Next ']")private WebElement NextLnk;
    
    @FindBy(xpath="//h4[.='User Logs']/ancestor::div[@class='card-header']//input[@type='checkbox']")private WebElement ShowAllCheckBox;
    
    
	//Rule-3:Create a constructor to initilise these elements
    
	public Users_UserList_AllUsers_ParticularUserInfo_LoginLogsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	//Rule-4:Provide getters to access these variables

	public WebElement getExportToExcelBtn() {
		return ExportToExcelBtn;
	}

	
	public WebElement getPrevLnk() {
		return PrevLnk;
	}


	public WebElement getNextLnk() {
		return NextLnk;
	}


	public WebElement getShowAllCheckBox() {
		return ShowAllCheckBox;
	}
	
	//Business Libraries
	
}
