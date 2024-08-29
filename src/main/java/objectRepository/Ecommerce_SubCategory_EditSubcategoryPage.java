package objectRepository;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import genericUtility.WebDriverUtility;

public class Ecommerce_SubCategory_EditSubcategoryPage {

    @FindBy(xpath="//h1[.='Update SubCategory']/following-sibling::button[@aria-label='Close']")private WebElement CloseBtn;
    
    @FindBy(xpath="//h1[.='Update SubCategory']/../following-sibling::div//select[@formcontrolname='cid']")private WebElement CategoryNameDrpDwn;
    
    @FindBy(xpath="//h1[.='Update SubCategory']/../following-sibling::div//div//input[@placeholder='Enter SubCategory Name']")private WebElement SubCategoryNameEdt;
    
    @FindBy(xpath = "(//option[.='Gold'])[1]") private WebElement GoldType;
    
    @FindBy(xpath="//h1[.='Update SubCategory']/../following-sibling::div//select[@formcontrolname='type']")private WebElement SelectTypeDrpDwn;
    
    @FindBy(xpath="//h1[.='Update SubCategory']/../following-sibling::div//div//input[@formcontrolname='image']")private WebElement ChooseFileBtn;
    
    @FindBy(xpath="//h1[.='Update SubCategory']/../following-sibling::div/following-sibling::div/button[.='Update']")private WebElement UpdateBtn;
	
    @FindBy(xpath="(//div[.=' Sub Category Updated Successfully '])[2]")private WebElement SuccessEle;
    
	//Rule-3:Create a constructor to initilise these elements
    
	public Ecommerce_SubCategory_EditSubcategoryPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Rule-4:Provide getters to access these variables
	
	public WebElement getCloseBtn() {
		return CloseBtn;
	}

	public WebElement getCategoryNameDrpDwn() {
		return CategoryNameDrpDwn;
	}

	public WebElement getSubCategoryNameEdt() {
		return SubCategoryNameEdt;
	}
	
	public WebElement getGoldType() {
		return GoldType;
	}

	public WebElement getSelectTypeDrpDwn() {
		return SelectTypeDrpDwn;
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
	
	
	//Create Business Library
	
	public void editingSubCategory(WebDriver driver, String CategoryName, String SubCategoryName, String ImagePath) throws Exception
	{
		Robot r = new Robot();
		WebDriverUtility wUtil = new WebDriverUtility();
		Thread.sleep(2000);
		wUtil.handleDropdownByVisibleText(CategoryName, CategoryNameDrpDwn);
		Thread.sleep(2000);
		SubCategoryNameEdt.clear();
		Thread.sleep(2000);
		SubCategoryNameEdt.sendKeys(SubCategoryName);
		Thread.sleep(2000);
		
	//	GoldType.click();
		
		wUtil.handleDropdownByIndex(SelectTypeDrpDwn, 1);
		Thread.sleep(2000);
        wUtil.clickOnChooseFileOption(driver, ChooseFileBtn, ImagePath);
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.delay(2000);
//        StringSelection ss = new StringSelection("C:\\Users\\vikra\\OneDrive\\Desktop\\One Drive Folder\\OneDrive\\Pictures\\Saved Pictures\\download.jpg");
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.keyPress(KeyEvent.VK_V);
//        r.keyRelease(KeyEvent.VK_CONTROL);
//        r.keyRelease(KeyEvent.VK_V);
//        r.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        UpdateBtn.click();
        Thread.sleep(2000);
        if(SuccessEle.isDisplayed())
        {
        	System.out.println("Sub Category Updated Successfully");
        }
        else
        {
			System.out.println("Sub Category Not Updated");
			Assert.fail();
		}
        

		
		
	}
	
}
