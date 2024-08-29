package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZSchemes_MGPInfoPage
{

	//Finding WebElements Using @FindBy Annotations
	
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement InfoSearchEdt;
	@FindBy(xpath ="(//button[.=' Pay '])[1]") private WebElement InfoPayBtn;
	@FindBy(xpath ="(//button[.=' View more '])[1]") private WebElement InfoViewMoreBtn;
	@FindBy(xpath ="//button[@class='btn-close']") private WebElement ViewMoreCloseBtn;

	// Create a constructor to initilise these elements
    
	public ZSchemes_MGPInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	// Provide getters to access these variables

	public WebElement getInfoSearchEdt() {
		return InfoSearchEdt;
	}

	public WebElement getViewMoreCloseBtn() {
		return ViewMoreCloseBtn;
	}

	public WebElement getInfoPayBtn() {
		return InfoPayBtn;
	}

	public WebElement getInfoViewMoreBtn() {
		return InfoViewMoreBtn;
	}
  
	//Business Libraries
	
	public void ZSchemes() throws InterruptedException
	{

	Thread.sleep(2000);	
	InfoSearchEdt.sendKeys(null);
	Thread.sleep(2000);
	InfoPayBtn.click();
	Thread.sleep(2000);	
	InfoViewMoreBtn.click();
	Thread.sleep(2000);	
	ViewMoreCloseBtn.click();
	
	}
	
	
}