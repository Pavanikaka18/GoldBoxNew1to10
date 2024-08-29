package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Events_EventsRequestsPage {

	//Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//input[@type='search']")private WebElement SearchEdt;
    
    @FindBy(xpath="(//button[.='Info'])[1]")private WebElement ActionInfoBtn;
    
    @FindBy(xpath="(//span[.='Completed'])[1]")private WebElement StatusUpdateDrpDwn;
    
    @FindBy(xpath="//span[text()=' Prev ']")private WebElement PreviousPageBtn;
    
    @FindBy(xpath="//a[text()=' Next ']")private WebElement NextPageBtn;
    
  
	//Rule-3:Create a constructor to initilise these elements
    
	public Events_EventsRequestsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    

	//Rule-4:Provide getters to access these variables

	public WebElement getSearchEdt() {
		return SearchEdt;
	}


	public WebElement getActionInfoBtn() {
		return ActionInfoBtn;
	}


	public WebElement getStatusUpdateDrpDwn() {
		return StatusUpdateDrpDwn;
	}


	public WebElement getPreviousPageBtn() {
		return PreviousPageBtn;
	}


	public WebElement getNextPageBtn() {
		return NextPageBtn;
	}
	
	
		
	//Create Business Libraries
	
}
