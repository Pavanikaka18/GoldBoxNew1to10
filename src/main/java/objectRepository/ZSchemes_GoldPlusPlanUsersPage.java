package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZSchemes_GoldPlusPlanUsersPage
{

	//Finding WebElements Using @FindBy Annotations
	
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement GPPUSearchEdt;
	@FindBy(xpath ="(//button[.=' Info '])[1]") private WebElement GPPUInfoBtn;
	@FindBy(xpath ="(//button[.=' Redeem Gold '])[1]") private WebElement GPPURedeemGoldBtn;
	@FindBy(xpath ="//a[text()=' Next ']") private WebElement NextPageLnk;
	@FindBy(xpath ="//a[text()=' Prev ']") private WebElement PrevPageLnk;
	
	// Create a constructor to initilise these elements
    
	public ZSchemes_GoldPlusPlanUsersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    
	// Provide getters to access these variables

	public WebElement getGPPUSearchEdt() {
		return GPPUSearchEdt;
	}

	public WebElement getGPPUInfoBtn() {
		return GPPUInfoBtn;
	}

	public WebElement getGPPURedeemGoldBtn() {
		return GPPURedeemGoldBtn;
	}

	public WebElement getNextPageLnk() {
		return NextPageLnk;
	}

	public WebElement getPrevPageLnk() {
		return PrevPageLnk;
	}

	//Business Libraries
	
	public void ZSchemes_GoldPlusPlanUsersPage() throws InterruptedException
	{

		Thread.sleep(2000);	
		GPPUSearchEdt.sendKeys(null);
		Thread.sleep(2000);	
		GPPUInfoBtn.click();
		Thread.sleep(2000);
		GPPURedeemGoldBtn.click();
		Thread.sleep(2000);
		NextPageLnk.click();
		Thread.sleep(2000);	
		PrevPageLnk.click();
		Thread.sleep(2000);	
		
			
	}
}