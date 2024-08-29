package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZScheme_SL_TenureInfoBtnPage 
{

	//Finding WebElements Using @FindBy Annotations
	
	@FindBy(xpath ="//input[@placeholder='Enter tenure in months']") private WebElement EnterMonthsEdt;
	@FindBy(xpath ="//h1[.='Manage Tenures']/../following-sibling::div//button[.='Add']") private WebElement AddBtn;
	@FindBy(xpath ="//h1[.='Manage Tenures']/..//button[@class='btn-close']") private WebElement CloseBtn;

	// Create a constructor to initilise these elements

	public ZScheme_SL_TenureInfoBtnPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	// Provide getters to access these variables


	public WebElement getEnterMonthsEdt() {
		return EnterMonthsEdt;
	}

	public WebElement getAddBtn() {
		return AddBtn;
	}
	
	public WebElement getCloseBtn() {
		return CloseBtn;
	}


	//Business Libraries
	
	public void ZScheme_SL_TenureInfoBtnPage() throws InterruptedException
	{

	     Thread.sleep(2000);
	     EnterMonthsEdt.sendKeys(null);
	     Thread.sleep(2000);
	     AddBtn.click();
	     Thread.sleep(2000);
	     CloseBtn.click();
	     Thread.sleep(2000);
	}
	
}