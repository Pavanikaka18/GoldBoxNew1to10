package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scheme_SchemeList_DescriptionPage {

	//Rule-1: Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="(//button[.='Understood'])[1]")private WebElement UnderstandBtn;
    
    @FindBy(xpath="(//button[@aria-label='Close'])[1]")private WebElement CloseBtn;
    
    
	//Rule-2:Create a constructor to initilise these elements
    
	public Scheme_SchemeList_DescriptionPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Rule-3:Provide getters to access these variables
    
	public WebElement getUnderstandBtn() {
		return UnderstandBtn;
	}

	public WebElement getCloseBtn() {
		return CloseBtn;
	}
	
	//Rule-4: Business Libraries
	
	public void clickOnUnderstandBtn() throws InterruptedException
	{
		Thread.sleep(2000);
		UnderstandBtn.click();
	}

	
	
}
