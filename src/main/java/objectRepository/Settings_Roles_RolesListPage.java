package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_Roles_RolesListPage {

	//Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//input[@placeholder='Search...']")private WebElement SearchEdt;
    
    @FindBy(xpath="//button[.='Add Role']")private WebElement AddRoleBtn;
  
    @FindBy(xpath="(//button[.=' Edit '])[3]")private WebElement EditBtn;
    
    @FindBy(xpath="(//button[@class='mr-2 btn-danger'])[3]")private WebElement DeleteBtn;
    
	@FindBy(xpath ="//button[.='Yes, Delete!']") private WebElement YesDeleteBtn;
    
    @FindBy(xpath ="//button[.='Cancel']") private WebElement CancleBtn;
    
    @FindBy(xpath="//a[text()=' Next ']")private WebElement NextPageBtn;
    
    @FindBy(xpath="//a[text()=' Prev ']")private WebElement PreviousPageBtn;
    	
  
	//Rule-3:Create a constructor to initilise these elements
    
	public Settings_Roles_RolesListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Rule-4:Provide getters to access these variables

	public WebElement getSearchEdt() {
		return SearchEdt;
	}

	public WebElement getAddRoleBtn() {
		return AddRoleBtn;
	}

	public WebElement getEditBtn() {
		return EditBtn;
	}

	public WebElement getDeleteBtn() {
		return DeleteBtn;
	}
	
    public WebElement getYesDeleteBtn() {
		return YesDeleteBtn;
	}

	public WebElement getCancleBtn() {
		return CancleBtn;
	}

	public WebElement getNextPageBtn() {
		return NextPageBtn;
	}

	public WebElement getPreviousPageBtn() {
		return PreviousPageBtn;
	}
	
	//Business Libraries
	
}
