package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCards_UsedUsersPage {

	// Not available in Fms
	
	//Finding WebElements by using @FindBy Annotation
	
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement SearchEdt;
	
	@FindBy(xpath ="//span[text()=' Next ']") private WebElement NextLnk;
	
	@FindBy(xpath ="//span[text()=' Prev ']") private WebElement PrevLnk;
	
	//Create a constructor to initilise these elements
	
	public GiftCards_UsedUsersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Provide getters to access these variables
	
	public WebElement getSearchEdt() {
		return SearchEdt;
	}

	public WebElement getNextLnk() {
		return NextLnk;
	}

	public WebElement getPrevLnk() {
		return PrevLnk;
	}
	
	//Business Libraries
	
	public void searchingGiftCard(String SearchValue) throws Exception
	{
		Thread.sleep(2000);
		SearchEdt.sendKeys(SearchValue);
		Thread.sleep(2000);
		PrevLnk.click();
		Thread.sleep(2000);
		NextLnk.click();
	}
	
}