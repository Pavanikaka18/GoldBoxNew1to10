package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Settings_EditFmsUsersPage {
	
	//Finding WebElements by using @FindBy Annotation
	
	@FindBy(xpath ="//h1[.='Edit User Details']/../button[@aria-label='Close']") private WebElement CloseBtn;
	
	@FindBy(xpath ="//h1[.='Edit User Details']/../following-sibling::div//input[@placeholder='Enter full name']") private WebElement EnterFullNameEdt;
	
	@FindBy(xpath ="//h1[.='Edit User Details']/../following-sibling::div//input[@placeholder='Enter phone number']") private WebElement MobileNumberEdt;
	
	@FindBy(xpath ="//h1[.='Edit User Details']/../following-sibling::div//input[@placeholder='Enter email']") private WebElement EmailEdt;
	
	@FindBy(xpath ="//h1[.='Edit User Details']/../following-sibling::div//input[@placeholder='Enter password']") private WebElement PasswordEdt;
	
	@FindBy(xpath ="//h1[.='Edit User Details']/../following-sibling::div//select//option[.='Admin']") private WebElement OptionEdt;
	
	@FindBy(xpath ="//button[.='Update']") private WebElement UpdateBtn;
	
	//Create a constructor to initilise these elements

	public Settings_EditFmsUsersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Provide getters to access these variables
	
	public WebElement getCloseBtn() {
		return CloseBtn;
	}

	public WebElement getEnterFullNameEdt() {
		return EnterFullNameEdt;
	}

	public WebElement getMobileNumberEdt() {
		return MobileNumberEdt;
	}

	public WebElement getEmailEdt() {
		return EmailEdt;
	}

	public WebElement getPasswordEdt() {
		return PasswordEdt;
	}

	public WebElement getOptionEdt() {
		return OptionEdt;
	}

	public WebElement getUpdateBtn() {
		return UpdateBtn;
	}
	
	//Business Libraries
	
    public void Settings_EditFmsUsersPage_k(WebDriver driver)throws InterruptedException
    {
    	Thread.sleep(2000);
    	CloseBtn.click();
    	Thread.sleep(2000);
    	EnterFullNameEdt.sendKeys(null);
    	Thread.sleep(2000);
    	MobileNumberEdt.sendKeys(null);
    	Thread.sleep(2000);
    	EmailEdt.sendKeys(null);
    	Thread.sleep(2000);
    	PasswordEdt.sendKeys(null);
    	Thread.sleep(2000);
    	OptionEdt.sendKeys(null);
    	Thread.sleep(2000);
    	UpdateBtn.click();
    }
    
	public void Select (WebDriver driver) throws InterruptedException
	{
		Thread.sleep(2000);
        WebElement Role = driver.findElement(By.xpath("(//select[@formcontrolname='role'])[1]"));

        // Create a Select object from the dropdown element
        Select RoleDrpDwn = new Select(Role);
        Thread.sleep(2000);
        // Select an option by visible text
        RoleDrpDwn.selectByIndex(1);

	}

	
}