package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZSchemes_SL_EditSchemePage 
{

	//Finding WebElements Using @FindBy Annotations
	
    @FindBy(xpath="//h1[.='Edit Scheme']/following-sibling::button[@aria-label='Close']")private WebElement CloseBtn;   
    @FindBy(xpath="//h1[.='Edit Scheme']/../following-sibling::div//input[@formcontrolname='title']")private WebElement EditSchemeNameEdt;    
    @FindBy(xpath="//h1[.='Edit Scheme']/../following-sibling::div//select[@formcontrolname='country']")private WebElement EditCountryDrpDwn;   
    @FindBy(xpath="//h1[.='Edit Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']")private WebElement EditCalculationDrpDwn;    
    @FindBy(xpath="//h1[.='Edit Scheme']/../following-sibling::div//input[@formcontrolname='description']")private WebElement EditDescriptionEdt;   
    @FindBy(xpath="//h1[.='Edit Scheme']/../following-sibling::div//button[.='Update']")private WebElement UpdateBtn;    

	// Create a constructor to initilise these elements
    
	public ZSchemes_SL_EditSchemePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	// Provide getters to access these variables

	public WebElement getCloseBtn() {
		return CloseBtn;
	}

	public WebElement getEditSchemeNameEdt() {
		return EditSchemeNameEdt;
	}

	public WebElement getEditCountryDrpDwn() {
		return EditCountryDrpDwn;
	}

	public WebElement getEditCalculationDrpDwn() {
		return EditCalculationDrpDwn;
	}

	public WebElement getEditDescriptionEdt() {
		return EditDescriptionEdt;
	}

	public WebElement getUpdateBtn() {
		return UpdateBtn;
	}

	public void ZSchemes_SL_AddSchemePage() throws InterruptedException
	{

        Thread.sleep(2000);
        CloseBtn.click();
        Thread.sleep(2000);
        EditSchemeNameEdt.click();
        Thread.sleep(2000);
        EditCountryDrpDwn.click();
        Thread.sleep(2000);
        EditCalculationDrpDwn.click();
        Thread.sleep(2000);
        EditDescriptionEdt.click();
        Thread.sleep(2000);
        UpdateBtn.click();
        Thread.sleep(2000);
        
	}
	
}