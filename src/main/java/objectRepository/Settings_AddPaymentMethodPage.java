package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_AddPaymentMethodPage {
	
	//Finding WebElements by using @FindBy Annotation
	
	@FindBy(xpath ="//h1[.='Add payment method ']/..//button[@aria-label='Close']") private WebElement CloseBtn;
	
	@FindBy(xpath ="//h1[.='Add payment method ']/../following-sibling::div//input[@placeholder='Enter title']") private WebElement EnterTitleEdt;
	
	@FindBy(xpath ="//h1[.='Add payment method ']/../following-sibling::div//div[@class='mdc-switch__icons']") private WebElement BootstrapBtn;
	
	@FindBy(xpath ="//button[.='Add']") private WebElement AddBtn;
	
	//Create a constructor to initilise these elements
	
	public Settings_AddPaymentMethodPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Provide getters to access these variables
	
	public WebElement getCloseBtn() {
		return CloseBtn;
	}

	public WebElement getEnterTitleEdt() {
		return EnterTitleEdt;
	}

	public WebElement getBootstrapBtn() {
		return BootstrapBtn;
	}

	public WebElement getAddBtn() {
		return AddBtn;
	}
	
	//Business Libraries
	
	public void Settings_AddPaymentMethodPage_e(WebDriver driver)throws InterruptedException
	{
		Thread.sleep(2000);
		CloseBtn.click();
		Thread.sleep(2000);
		EnterTitleEdt.sendKeys(null);
		Thread.sleep(2000);
		BootstrapBtn.click();
		Thread.sleep(2000);
		AddBtn.click();
	}

}