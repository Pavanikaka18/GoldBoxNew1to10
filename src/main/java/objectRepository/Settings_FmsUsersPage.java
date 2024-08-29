package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_FmsUsersPage {
	
	//Finding WebElements by using @FindBy Annotation
	
	@FindBy(xpath ="//button[.='Add FMS User']") private WebElement AddFmsUsersBtn;
	
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement SearchEdt;
	
	@FindBy(xpath ="(//button[.=' Edit '])[1]") private WebElement EditBtn;
	
	@FindBy(xpath ="(//button[@class='mr-2 btn-danger'])[1]") private WebElement DeleteBtn;
	
	@FindBy(xpath ="//button[.='Yes, Delete!']") private WebElement YesDeleteBtn;
	
	@FindBy(xpath ="//span[text()=' Next ']") private WebElement NextLnk;
	
	@FindBy(xpath ="//span[text()=' Prev ']") private WebElement PrevLnk;
	
	//Create a constructor to initilise these elements
	
	public Settings_FmsUsersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Provide getters to access these variables
	
	public WebElement getAddFmsUsersBtn() {
		return AddFmsUsersBtn;
	}

	public WebElement getSearchEdt() {
		return SearchEdt;
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

	public WebElement getNextLnk() {
		return NextLnk;
	}

	public WebElement getPrevLnk() {
		return PrevLnk;
	}
	
	//Business Libraries
	
	public void Settings_FmsUsersPage_h(WebDriver driver)throws InterruptedException
	{
		Thread.sleep(2000);
		AddFmsUsersBtn.click();
		Thread.sleep(2000);
		SearchEdt.sendKeys(null);
		Thread.sleep(2000);
		EditBtn.click();
		Thread.sleep(2000);
		DeleteBtn.click();
		Thread.sleep(2000);
		YesDeleteBtn.click();
		Thread.sleep(2000);
		NextLnk.click();
		Thread.sleep(2000);
		PrevLnk.click();
	}
	
}