package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.WebDriverUtility;

public class Scheme_SchemeList_EditSchemePage {

//Rule-1: Finding WebElements Using @FindBy Annotations
    
    @FindBy(xpath="//h1[.='Edit Scheme']/following-sibling::button[@aria-label='Close']")private WebElement CloseBtn;
			
    @FindBy(xpath="//h1[.='Edit Scheme']/../following-sibling::div//input[@formcontrolname='title']")private WebElement EnterSchemeNameEdt;
		    
    @FindBy(xpath="//h1[.='Edit Scheme']/../following-sibling::div//select[@formcontrolname='country']")private WebElement CountryDrpDwn ;
		    
    @FindBy(xpath="//h1[.='Edit Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']")private WebElement CalculationDrpDwn;
    
    @FindBy(xpath="//h1[.='Edit Scheme']/../following-sibling::div//input[@formcontrolname='description']")private WebElement DescriptionEdt;
    
    @FindBy(xpath="//h1[.='Edit Scheme']/../following-sibling::div//button[.='Update']")private WebElement UpdateBtn;
		    
    //Rule-2:Create a constructor to initilise these elements   description
		    
	public Scheme_SchemeList_EditSchemePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		    
			
	//Rule-3:Provide getters to access these variables
		    
	public WebElement getCloseBtn() {
		return CloseBtn;
	}


	public WebElement getEnterSchemeNameEdt() {
		return EnterSchemeNameEdt;
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


	public WebElement getUpdateBtn() {
		return UpdateBtn;
	}

    
	//Rule-4: Business Libraries
	
	public void editScheme(WebDriver driver, String SchemeName, String Description) throws Exception
	{
		WebDriverUtility wUtil = new WebDriverUtility();
		
		Thread.sleep(2000);
		EnterSchemeNameEdt.sendKeys(SchemeName);
		Thread.sleep(2000);
		wUtil.handleDropdownByIndex(CountryDrpDwn, 6);
		Thread.sleep(2000);
		wUtil.handleDropdownByIndex(CalculationDrpDwn, 1);
		Thread.sleep(2000);
		DescriptionEdt.sendKeys(Description);
		Thread.sleep(2000);
		UpdateBtn.click();
		
	}
	
	public void clearingAllSchemeDetailsWhileEditingScheme(WebDriver driver) throws Exception
	{
		WebDriverUtility wUtil = new WebDriverUtility();
		
		Thread.sleep(2000);
		EnterSchemeNameEdt.clear();
		Thread.sleep(2000);
		wUtil.handleDropdownByIndex(CountryDrpDwn, 0);
		Thread.sleep(2000);
		wUtil.handleDropdownByIndex(CalculationDrpDwn, 0);
		Thread.sleep(2000);
		DescriptionEdt.clear();
		Thread.sleep(2000);
		UpdateBtn.click();
		
	}

	
}
