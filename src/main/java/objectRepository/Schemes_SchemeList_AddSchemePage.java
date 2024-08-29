package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import genericUtility.WebDriverUtility;

public class Schemes_SchemeList_AddSchemePage {

	//Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="(//button[@aria-label='Close'])[10]")private WebElement closeAddSchemePageBtn;
    
    @FindBy(xpath="//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Scheme Name']")private WebElement SchemeNameEdt;
    
    @FindBy(xpath="//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']")private WebElement CountryDrpDwn;
    
    @FindBy(xpath="//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']")private WebElement CalculationDrpDwn;
    
    @FindBy(xpath="//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")private WebElement DescriptionEdt;
    
    @FindBy(xpath="//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")private WebElement AddBtn;
    
    
  
	//Rule-3:Create a constructor to initilise these elements
    
	public Schemes_SchemeList_AddSchemePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    

	//Rule-4:Provide getters to access these variables

	public WebElement getCloseAddSchemePageBtn() {
		return closeAddSchemePageBtn;
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
	
	
	//Create Business Libraries
	
	public void createScheme(String SchemeName , String SchemeDescription) throws Exception
	{
		WebDriverUtility wUtil = new WebDriverUtility();
		
		Thread.sleep(3000);
		
		SchemeNameEdt.sendKeys(SchemeName);
		
		Thread.sleep(3000);
		
		wUtil.handleDropdownByIndex(CountryDrpDwn, 3);
		
		Thread.sleep(3000);
		
		wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
		
		Thread.sleep(3000);
		
		DescriptionEdt.sendKeys(SchemeDescription);
		
		Thread.sleep(3000);
		
		AddBtn.click();
		
	}
}
