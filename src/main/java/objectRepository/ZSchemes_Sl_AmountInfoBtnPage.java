package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZSchemes_Sl_AmountInfoBtnPage 
{

	//Finding WebElements Using @FindBy Annotations
	
	@FindBy(xpath ="//h1[.='Manage Tenure Amount']/..//button[@class='btn-close']") private WebElement CloseBtn;
	@FindBy(xpath ="//input[@placeholder='Enter Amount']") private WebElement EnterAmountEdt;
	@FindBy(xpath ="//h1[.='Manage Tenure Amount']/../following-sibling::div//button[.='Add']") private WebElement AddBtn;

	// Create a constructor to initilise these elements

	public ZSchemes_Sl_AmountInfoBtnPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	// Provide getters to access these variables

	public WebElement getCloseBtn() {
		return CloseBtn;
	}

	public WebElement getEnterAmountEdt() {
		return EnterAmountEdt;
	}

	public WebElement getAddBtn() {
		return AddBtn;
	}

	//Business Libraries
	
	public void ZSchemes_Sl_AmountInfoBtnPage() throws InterruptedException
	{

	     Thread.sleep(2000);
	     CloseBtn.click();
	     Thread.sleep(2000);
	     EnterAmountEdt.sendKeys(null);
	     Thread.sleep(2000);
	     AddBtn.click();
	     Thread.sleep(2000);
	     

	}
}