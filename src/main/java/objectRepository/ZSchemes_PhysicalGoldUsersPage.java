package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZSchemes_PhysicalGoldUsersPage 
{

	//Finding WebElements Using @FindBy Annotations
	
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement PhysicalGoldUsersSearchEdt;
	@FindBy(xpath ="//span[text()=' Next ']") private WebElement NextPageLnk;
	@FindBy(xpath ="//span[text()=' Prev ']") private WebElement PrevPageLnk;

	// Create a constructor to initilise these elements
    
	public ZSchemes_PhysicalGoldUsersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    
	// Provide getters to access these variables

	public WebElement getPhysicalGoldUsersSearchEdt() {
		return PhysicalGoldUsersSearchEdt;
	}

	public WebElement getNextPageLnk() {
		return NextPageLnk;
	}

	public WebElement getPrevPageLnk() {
		return PrevPageLnk;
	}

	//Business Libraries
	
	public void ZSchemes() throws InterruptedException
	{

	Thread.sleep(2000);	
	PhysicalGoldUsersSearchEdt.sendKeys(null);
	Thread.sleep(2000);	
	NextPageLnk.click();
	Thread.sleep(2000);	
	PrevPageLnk.click();
	Thread.sleep(2000);	
	
	}
	
	
}