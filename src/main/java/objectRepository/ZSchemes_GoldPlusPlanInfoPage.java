package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZSchemes_GoldPlusPlanInfoPage 
{

	//Finding WebElements Using @FindBy Annotations
	
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement GPPIPSearchEdt;
	@FindBy(xpath ="(//button[.=' View more '])[1]") private WebElement GPPIPViewMoreBtn;
	@FindBy(xpath ="(//button[.=' Reciept'])[1]") private WebElement GPPIPReceiptBtn;
	@FindBy(xpath ="(//button[.=' Pay '])[1]") private WebElement GPPIPPayBtn;
	@FindBy(xpath ="//a[text()=' Next ']") private WebElement GPPIPNextPageBtn;
	@FindBy(xpath ="//a[text()=' Prev ']") private WebElement GPPIPPrevPageBtn;
	
	// Create a constructor to initilise these elements
    
	public ZSchemes_GoldPlusPlanInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    
	// Provide getters to access these variables

	public WebElement getGPPIPSearchEdt() {
		return GPPIPSearchEdt;
	}

	public WebElement getGPPIPViewMoreBtn() {
		return GPPIPViewMoreBtn;
	}

	public WebElement getGPPIPReceiptBtn() {
		return GPPIPReceiptBtn;
	}

	public WebElement getGPPIPPayBtn() {
		return GPPIPPayBtn;
	}

	public WebElement getGPPIPNextPageBtn() {
		return GPPIPNextPageBtn;
	}

	public WebElement getGPPIPPrevPageBtn() {
		return GPPIPPrevPageBtn;
	}

	//Business Libraries
	
	public void ZSchemes_GoldPlusPlanInfoPage() throws InterruptedException
	{

		Thread.sleep(2000);	
		GPPIPSearchEdt.sendKeys(null);
		Thread.sleep(2000);
		GPPIPViewMoreBtn.click();
		Thread.sleep(2000);	
		GPPIPReceiptBtn.click();
		Thread.sleep(2000);	
		GPPIPPayBtn.click();
		Thread.sleep(2000);	
		GPPIPNextPageBtn.click();
		Thread.sleep(2000);	
		GPPIPPrevPageBtn.click();
		Thread.sleep(2000);	
	
	
	}	
}