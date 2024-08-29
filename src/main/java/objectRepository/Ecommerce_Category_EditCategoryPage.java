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

public class Ecommerce_Category_EditCategoryPage {

    @FindBy(xpath="//h1[.='Update Category']/following-sibling::button[@aria-label='Close']")private WebElement CloseBtn;
    
    @FindBy(xpath="//h1[.='Update Category']/../following-sibling::div//input[@placeholder='Enter Category Name']")private WebElement EnterNameEdt;
    
    @FindBy(xpath="//h1[.='Update Category']/../following-sibling::div//input[@formcontrolname='image']")private WebElement ChooseFileBtn;
    
    @FindBy(xpath="//h1[.='Update Category']/../following-sibling::div/following-sibling::div/button[.='Update']")private WebElement UpdateBtn;
    
    @FindBy(xpath="(//div[.=' Category Updated Successfully '])[2]")private WebElement SuccessEle;
    
//    @FindBy(xpath="//h1[.='Add Category']/../following-sibling::div/following-sibling::div/button[.='Add']")private WebElement AddBtn;
    
    
	//Rule-3:Create a constructor to initilise these elements
    
	public Ecommerce_Category_EditCategoryPage(WebDriver driver)
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

	public WebElement getUpdateBtn() {
		return UpdateBtn;
	}

	public WebElement getSuccessEle() {
		return SuccessEle;
	}
	
	
	//Business Libraries
	
	public void editCategory(WebDriver driver, String EditCategoryName, String ImagePath) throws Exception
	{
		Robot r = new Robot();
		
		Thread.sleep(2000);
		EnterNameEdt.clear();
		Thread.sleep(2000);
		EnterNameEdt.sendKeys(EditCategoryName);
		Thread.sleep(2000);
		WebDriverUtility wUtil = new WebDriverUtility();
        wUtil.clickOnChooseFileOption(driver, ChooseFileBtn, ImagePath);
        Thread.sleep(2000);
        UpdateBtn.click();
        Thread.sleep(2000);
        if(SuccessEle.isDisplayed())
        {
        	System.out.println("Catogery Updated Successfully");
        }
        else
        {
    		System.out.println("Category Not Updated");
    	}
	}
}
