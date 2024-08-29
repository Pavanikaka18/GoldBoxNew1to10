package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Users_UserList_AllUsers_ParticularUserInfo_TransactionsPage {

	    //Finding WebElements Using @FindBy Annotations
        
	    @FindBy(xpath="//a[@class='btn btn-filter']")private WebElement FilterBtn;
	
		@FindBy(xpath="//input[@placeholder='Search...']")private WebElement SearchEdt;
		
	    @FindBy(xpath="(//button[.='Export to Excel'])[1]")private WebElement ExportToExcelBtn;
	    
	    @FindBy(xpath="(//div[@class='mdc-checkbox'])[1]")private WebElement ShowAllCheckBox;
	    
	    
		//Rule-3:Create a constructor to initilise these elements
	    
		public Users_UserList_AllUsers_ParticularUserInfo_TransactionsPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}


		//Rule-4:Provide getters to access these variables

		public WebElement getFilterBtn() {
			return FilterBtn;
		}


		public WebElement getSearchEdt() {
			return SearchEdt;
		}


		public WebElement getExportToExcelBtn() {
			return ExportToExcelBtn;
		}


		public WebElement getShowAllCheckBox() {
			return ShowAllCheckBox;
		}
		
		//Business Libraries
	
}
