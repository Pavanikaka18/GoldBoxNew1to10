package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class Settings_AddFmsUserPage {
	
	//Finding WebElements by using @FindBy Annotation

	@FindBy(xpath ="//h1[.='Add User']/../button[@aria-label='Close']") private WebElement CloseBtn;
	
	@FindBy(xpath ="//h1[.='Add User']/../following-sibling::div//input[@placeholder='Enter full name']") private WebElement EnterNameEdt;
	
	@FindBy(xpath ="//h1[.='Add User']/../following-sibling::div//input[@placeholder='Enter phone number']") private WebElement MobilenUmberEdt;
	
	@FindBy(xpath ="//h1[.='Add User']/../following-sibling::div//input[@placeholder='Enter email']") private WebElement MailEdt;
	
	@FindBy(xpath ="//h1[.='Add User']/../following-sibling::div//input[@placeholder='Enter password']") private WebElement PasswordEdt;
		
	@FindBy(xpath ="//h1[.='Add User']/../following-sibling::div//select//option[.='Admin']") private WebElement OptionEdt;
	
	@FindBy(xpath ="//button[.='Add']") private WebElement AddBtn;
	
	//@FindBy(xpath ="//div[@aria-label='Invalid form Details']") private WebElement ToastMsgLnk;
	
	//Create a constructor to initilise these elements

	public Settings_AddFmsUserPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Provide getters to access these variables
	

	public WebElement getCloseBtn() {
		return CloseBtn;
	}

	public WebElement getEnterNameEdt() {
		return EnterNameEdt;
	}

	public WebElement getMobilenUmberEdt() {
		return MobilenUmberEdt;
	}

	public WebElement getMailEdt() {
		return MailEdt;
	}

	public WebElement getPasswordEdt() {
		return PasswordEdt;
	}

	public WebElement getOptionEdt() {
		return OptionEdt;
	}

	public WebElement getAddBtn() {
		return AddBtn;
	}
	
	/*
	
	public WebElement getToastMsgLnk() {
		return ToastMsgLnk;
	}

   */
	
	//Business Libraries
	
	public void Settings_AddFmsUserPage_j(WebDriver driver)throws InterruptedException
	{
		Thread.sleep(2000);
		CloseBtn.click();
		Thread.sleep(2000);
		EnterNameEdt.sendKeys(null);
		Thread.sleep(2000);
		MobilenUmberEdt.sendKeys(null);
		Thread.sleep(2000);
		MailEdt.sendKeys(null);
		Thread.sleep(2000);
		PasswordEdt.sendKeys(null);
		Thread.sleep(2000);
		OptionEdt.sendKeys(null);
		Thread.sleep(2000);
		AddBtn.click();
		Thread.sleep(2000);
		//ToastMsgLnk.sendKeys(null);
		
	}
	
	public void Select (WebDriver driver) throws InterruptedException
	{
		Thread.sleep(2000);
        WebElement Role = driver.findElement(By.xpath("(//select[@formcontrolname='role'])[1]"));

        // Create a Select object from the dropdown element
        Select RoleDrpDwn = new Select(Role);
        Thread.sleep(2000);
        // Select an option by visible text
        RoleDrpDwn.selectByIndex(2);

	}
	
}