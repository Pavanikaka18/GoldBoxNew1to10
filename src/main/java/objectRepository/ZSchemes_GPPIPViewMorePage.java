package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZSchemes_GPPIPViewMorePage 
{

	//Finding WebElements Using @FindBy Annotations
	
	@FindBy(xpath ="//h1[.='Transaction Details']/..//button[@class='btn-close']") private WebElement CloseBtn;

	// Create a constructor to initilise these elements
    
	public ZSchemes_GPPIPViewMorePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	// Provide getters to access these variables

	public WebElement getCloseBtn() {
		return CloseBtn;
	}
    
	//Business Libraries
	
	public void ZSchemes_GoldPlusPlanInfoPage() throws InterruptedException
	{

		Thread.sleep(2000);	
		CloseBtn.click();
	
	}
	

}