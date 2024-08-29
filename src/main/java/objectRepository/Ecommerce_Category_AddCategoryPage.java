package objectRepository;

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

public class Ecommerce_Category_AddCategoryPage {

    @FindBy(xpath="//h1[.='Add Category']/following-sibling::button[@aria-label='Close']")private WebElement CloseBtn;
    
    @FindBy(xpath="//h1[.='Add Category']/../following-sibling::div//input[@placeholder='Enter Category Name']")private WebElement EnterNameEdt;
    
    @FindBy(xpath="//h1[.='Add Category']/../following-sibling::div//input[@formcontrolname='image']")private WebElement ChooseFileBtn;
    
    @FindBy(xpath="//h1[.='Add Category']/../following-sibling::div/following-sibling::div/button[.='Add']")private WebElement AddBtn;
    
    @FindBy(xpath="(//div[.=' Category Added Successfully '])[2]")private WebElement SuccessEle;
    
//    @FindBy(xpath="//h1[.='Add Category']/../following-sibling::div/following-sibling::div/button[.='Add']")private WebElement AddBtn;
    
    
	//Rule-3:Create a constructor to initilise these elements
    
	public Ecommerce_Category_AddCategoryPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	//Rule-4:Provide getters to access these variables

	
	public WebElement getCloseBtn() {
		return CloseBtn;
	}


	public WebElement getEnterNameEdt() {
		return EnterNameEdt;
	}


	public WebElement getChooseFileBtn() {
		return ChooseFileBtn;
	}


	public WebElement getAddBtn() {
		return AddBtn;
	}
	
	public WebElement getSuccessEle() {
		return SuccessEle;
	}
	
	//Business Libraries


	public void addCategory(WebDriver driver, String CategoryName, String ImagePath) throws Exception
	{
		Robot r = new Robot();
		
		Thread.sleep(2000);
		EnterNameEdt.sendKeys(CategoryName);
		Thread.sleep(2000);
		
		WebDriverUtility wUtil = new WebDriverUtility();
        wUtil.clickOnChooseFileOption(driver, ChooseFileBtn, ImagePath);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        
        
        Thread.sleep(1000);
        if(SuccessEle.isDisplayed())
        {
        	System.out.println("Catogery Added Successfully");
        }
        else
        {
    		System.out.println("Category Not Added");
    		Assert.fail();
    	}
        
        Thread.sleep(1000);
	}
    
	
	
}
