package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZSchemes_SL_DescriptionViewBtn
{
	//Finding WebElements Using @FindBy Annotations
	
    @FindBy(xpath="(//button[@class='btn-close'])[1]")private WebElement CloseBtn;   
    @FindBy(xpath="//button[.='Understood']")private WebElement UnderstoodBtn;    

	// Create a constructor to initilise these elements
    
	public ZSchemes_SL_DescriptionViewBtn(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	// Provide getters to access these variables

	public WebElement getCloseBtn() {
		return CloseBtn;
	}

	public WebElement getUnderstoodBtn() {
		return UnderstoodBtn;
	}

	//Business Libraries
	
	public void ZSchemes_SL_AddSchemePage() throws InterruptedException
	{

        Thread.sleep(2000);
        CloseBtn.click();
        Thread.sleep(2000);
        UnderstoodBtn.click();
	
	
	}
	
}