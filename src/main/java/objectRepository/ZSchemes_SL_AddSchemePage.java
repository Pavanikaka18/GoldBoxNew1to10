package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZSchemes_SL_AddSchemePage
{

	//Finding WebElements Using @FindBy Annotations
	
    @FindBy(xpath="//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Scheme Name']")private WebElement SchemeNameEdt;   
    @FindBy(xpath="//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']")private WebElement CountryDrpDwn;    
    @FindBy(xpath="//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']")private WebElement CalculationDrpDwn;    
    @FindBy(xpath="//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")private WebElement DescriptionEdt;
    @FindBy(xpath="//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")private WebElement AddBtn;
    @FindBy(xpath="//h1[.='Add Scheme']/..//button[@class='btn-close']")private WebElement CloseBtn;   

    
	// Create a constructor to initilise these elements
    
	public ZSchemes_SL_AddSchemePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	// Provide getters to access these variables

	public WebElement getCloseBtn() {
		return CloseBtn;
	}

	public WebElement getSchemeNameEdt() {
		return SchemeNameEdt;
	}

	public WebElement getCountryDrpDwn() {
		return CountryDrpDwn;
	}

	public WebElement getCalculationDrpDwn() {
		return CalculationDrpDwn;
	}

	public WebElement getDescriptionEdt() {
		return DescriptionEdt;
	}

	public WebElement getAddBtn() {
		return AddBtn;
	}

	//Business Libraries
	
	public void ZSchemes_SL_AddSchemePage() throws InterruptedException
	{

	    Thread.sleep(2000);
	    SchemeNameEdt.click();
	    Thread.sleep(2000);
	    CountryDrpDwn.click();
	    Thread.sleep(2000);
	    CalculationDrpDwn.click();
	    Thread.sleep(2000);
	    DescriptionEdt.click();
	    Thread.sleep(2000);
	    AddBtn.click();
	    Thread.sleep(2000);
	    CloseBtn.click();
	
	}
	
	
	
}