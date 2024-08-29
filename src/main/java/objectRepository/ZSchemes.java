package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZSchemes {

	//Finding WebElements Using @FindBy Annotations
	
	@FindBy(xpath ="//a[.='Scheme List']") private WebElement SchemeListLnk;
	@FindBy(xpath ="//a[.='Gold Plus Plan Users']") private WebElement GoldPlusPlanUsersLnk;
	@FindBy(xpath ="//a[.='My Gold Plan Users']") private WebElement MyGoldPlanUsersLnk;
	@FindBy(xpath ="//a[.='Physical Gold Users']") private WebElement PhysicalGoldUsersLnk;
	
	// Create a constructor to initilise these elements
    
	public ZSchemes(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    
	// Provide getters to access these variables

	public WebElement getSchemeListLnk() {
		return SchemeListLnk;
	}

	public WebElement getGoldPlusPlanUsersLnk() {
		return GoldPlusPlanUsersLnk;
	}

	public WebElement getMyGoldPlanUsersLnk() {
		return MyGoldPlanUsersLnk;
	}

	public WebElement getPhysicalGoldUsersLnk() {
		return PhysicalGoldUsersLnk;
	}

	//Business Libraries
	
	public void ZSchemes() throws InterruptedException
	{

	Thread.sleep(2000);	
	SchemeListLnk.click();
	Thread.sleep(2000);	
	GoldPlusPlanUsersLnk.click();
	Thread.sleep(2000);	
	MyGoldPlanUsersLnk.click();
	Thread.sleep(2000);	
	PhysicalGoldUsersLnk.click();
	Thread.sleep(2000);	
			
	}
}