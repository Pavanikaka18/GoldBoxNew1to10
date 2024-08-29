package objectRepository;

import static org.testng.Assert.assertEquals;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import genericUtility.WebDriverUtility;

public class Ecommerce_Brands_AddBrandPage {

    //Rule-1 :- Find Web-Elements using FindBy Annotations
	
    @FindBy(xpath="//h1[.='Add Brand']/following-sibling::button[@aria-label='Close']")private WebElement CloseBtn;
    
    @FindBy(xpath="//h1[.='Add Brand']/../following-sibling::div//input[@placeholder='Enter Brand Name']")private WebElement BrandNameEdt;
    
    @FindBy(xpath="//h1[.='Add Brand']/../following-sibling::div//input[@placeholder='No File Chosen']")private WebElement ChooseFileBtn;
    
    @FindBy (xpath = "//option[.='Brand']") private WebElement BrandDropDown;
    
    @FindBy(xpath="//h1[.='Add Brand']/../following-sibling::div/following-sibling::div/button[.='Add']")private WebElement AddBtn;
    
    @FindBy(xpath="//div[@aria-label='Brand Craeted Successfully']")private WebElement SuccessMsg;
    
    @FindBy(xpath="//span[text()=' Next ']")private WebElement NextPageLnk;
    
    @FindBy(xpath="//span[text()=' Prev ']")private WebElement PreviousPageLnk;
	
	//Rule-3:Create a constructor to initilise these elements
    
	public Ecommerce_Brands_AddBrandPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

		
	
	//Rule-4 :- Provide getters to access these variables

	public WebElement getCloseBtn() {
		return CloseBtn;
	}

	public WebElement getBrandNameEdt() {
		return BrandNameEdt;
	}

	public WebElement getChooseFileBtn() {
		return ChooseFileBtn;
	}

	public WebElement getAddBtn() {
		return AddBtn;
	}
		
	public WebElement getBrandDropDown() {
		return BrandDropDown;
	}



	public WebElement getSuccessMsg() {
		return SuccessMsg;
	}

	public WebElement getNextPageLnk() {
		return NextPageLnk;
	}

	public WebElement getPreviousPageLnk() {
		return PreviousPageLnk;
	}


	
	// Create Business Library
    
	public void addingBrand(WebDriver driver, String BrandName, String ImagePath) throws Exception
	{
		Robot r = new Robot();
		
		Thread.sleep(2000);
		BrandNameEdt.sendKeys(BrandName);
		Thread.sleep(2000);
		WebDriverUtility wUtil = new WebDriverUtility();
        wUtil.clickOnChooseFileOption(driver, ChooseFileBtn, ImagePath);
        Thread.sleep(2000);
        BrandDropDown.click();
        Thread.sleep(2000);
        AddBtn.click();
        Thread.sleep(2000);
        if(SuccessMsg.isDisplayed())
        {
			System.out.println("Brand Added Successfully");
		}
        else 
        {
        	System.out.println("Brand Not Added");
		}
        
	}
	
}
