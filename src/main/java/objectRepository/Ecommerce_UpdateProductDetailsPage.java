package objectRepository;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.WebDriverUtility;

public class Ecommerce_UpdateProductDetailsPage {

//Rule-1 :- Find Web-Elements using FindBy Annotations
	
    @FindBy(xpath="//h1[.='Update Product Details']/following-sibling::button[@aria-label='Close']")private WebElement CloseBtn;
    
    @FindBy(xpath="//h1[.='Update Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']")private WebElement CategoryDrpDwn;
    
    @FindBy(xpath="//h1[.='Update Product Details']/../following-sibling::div//select[@formcontrolname='subcategoryname']")private WebElement SubCategoryDrpDwn;
  
    @FindBy(xpath="//h1[.='Update Product Details']/../following-sibling::div//select[@formcontrolname='brandname']")private WebElement BrandNameDrpDwn;
    
    @FindBy(xpath="//h1[.='Update Product Details']/../following-sibling::div//input[@formcontrolname='productname']")private WebElement ProductNameEdt;
    
    @FindBy(xpath="//h1[.='Update Product Details']/../following-sibling::div//input[@placeholder='Enter VA%']")private WebElement VaEdt;
    
    @FindBy(xpath="//h1[.='Update Product Details']/../following-sibling::div//select[@formcontrolname='carat']")private WebElement CaratDrpDwn;
    
    @FindBy(xpath="//h1[.='Update Product Details']/../following-sibling::div//select[@formcontrolname='type']")private WebElement TypeDrpDwn;
    
    @FindBy(xpath="//h1[.='Update Product Details']/../following-sibling::div//select[@formcontrolname='isshown']")private WebElement IsShownDrpDwn;
  
    @FindBy(xpath="//h1[.='Update Product Details']/../following-sibling::div//input[@formcontrolname='price']")private WebElement PriceEdt;
    
    @FindBy(xpath="//h1[.='Update Product Details']/../following-sibling::div//input[@formcontrolname='sizes']")private WebElement SizeEdt;
    
    @FindBy(xpath="//h1[.='Update Product Details']/../following-sibling::div//input[@formcontrolname='weight']")private WebElement WeightEdt;
    
    @FindBy(xpath="//h1[.='Update Product Details']/../following-sibling::div//textarea[@formcontrolname='description']")private WebElement DescriptionEdt;
	
    @FindBy(xpath="//h1[.='Update Product Details']/../following-sibling::div//input[@type='file']")private WebElement ChooseFileBtn;
    
    @FindBy(xpath="//h1[.='Update Product Details']/../following-sibling::div/following-sibling::div/button[.='Update']")private WebElement UpdateBtn;
  
    @FindBy(xpath="(//div[.=' Invalid form details '])[2]")private WebElement InvalidFormErrorMsg;
    
    @FindBy(xpath="//h1[.='Update Product Details']/following-sibling::button[@aria-label='Close']")private WebElement UpdateProductPageCloseBtn;
  
    
    
	//Rule-3:Create a constructor to initilise these elements
    
	public Ecommerce_UpdateProductDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	//Rule-4 :- Provide getters to access these variables

	public WebElement getCloseBtn() {
		return CloseBtn;
	}

	public WebElement getCategoryDrpDwn() {
		return CategoryDrpDwn;
	}

	public WebElement getSubCategoryDrpDwn() {
		return SubCategoryDrpDwn;
	}


	public WebElement getBrandNameDrpDwn() {
		return BrandNameDrpDwn;
	}

	public WebElement getProductNameEdt() {
		return ProductNameEdt;
	}

	public WebElement getVaEdt() {
		return VaEdt;
	}

	public WebElement getCaratDrpDwn() {
		return CaratDrpDwn;
	}

	public WebElement getTypeDrpDwn() {
		return TypeDrpDwn;
	}
	
	public WebElement getIsShownDrpDwn() {
		return IsShownDrpDwn;
	}
	
	public WebElement getPriceEdt() {
		return PriceEdt;
	}

	public WebElement getSizeEdt() {
		return SizeEdt;
	}

	public WebElement getWeightEdt() {
		return WeightEdt;
	}

	public WebElement getDescriptionEdt() {
		return DescriptionEdt;
	}

	public WebElement getChooseFileBtn() {
		return ChooseFileBtn;
	}
	
	public WebElement getUpdateBtn() {
		return UpdateBtn;
	}
	
	public WebElement getInvalidFormErrorMsg() {
		return InvalidFormErrorMsg;
	}
	
	public WebElement getUpdateProductPageCloseBtn() {
		return UpdateProductPageCloseBtn;
	}
	
	
	//Create Business Library
	
	
	public void editProductDetails(WebDriver driver,  String EditProductName, String EditVaPercent, String EditPrice, String EditSize, String EditWeight, String EditDescription, String ImagePath) throws Exception
	{
		WebDriverUtility wUtil = new WebDriverUtility();
        Robot r = new Robot();
		
		Thread.sleep(2000);
		wUtil.handleDropdownByIndex(CategoryDrpDwn, 1);
		Thread.sleep(2000);
		wUtil.handleDropdownByIndex(SubCategoryDrpDwn, 1);
		Thread.sleep(2000);
		wUtil.handleDropdownByIndex(BrandNameDrpDwn, 1);
		Thread.sleep(2000);
		ProductNameEdt.clear();
		Thread.sleep(2000);
		ProductNameEdt.sendKeys(EditProductName);
		Thread.sleep(2000);
		VaEdt.clear();
		Thread.sleep(2000);
		VaEdt.sendKeys(EditVaPercent);
		Thread.sleep(2000);
	//	wUtil.handleDropdownByIndex(CaratDrpDwn, 2);
	//	Thread.sleep(2000);
		wUtil.handleDropdownByIndex(TypeDrpDwn, 2);
		Thread.sleep(2000);
		PriceEdt.clear();
		Thread.sleep(2000);
		PriceEdt.sendKeys(EditPrice);
		Thread.sleep(2000);
//		SizeEdt.clear();
//		Thread.sleep(2000);
//		SizeEdt.sendKeys(EditSize);
//		Thread.sleep(2000);
//		WeightEdt.clear();
//		Thread.sleep(2000);
//		WeightEdt.sendKeys(EditWeight);
		Thread.sleep(2000);
		DescriptionEdt.clear();
		Thread.sleep(2000);
		DescriptionEdt.sendKeys(EditDescription);
		Thread.sleep(2000);
		wUtil.clickOnChooseFileOption(driver, ChooseFileBtn, ImagePath);
		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_CONTROL);
//        r.delay(2000);
//        StringSelection ss = new StringSelection("C:\\Users\\vikra\\OneDrive\\Desktop\\One Drive Folder\\OneDrive\\Pictures\\Saved Pictures\\Necklace.jpg");
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.keyPress(KeyEvent.VK_V);
//        r.keyRelease(KeyEvent.VK_CONTROL);
//        r.keyRelease(KeyEvent.VK_V);
//        r.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        UpdateBtn.click();
        Thread.sleep(2000);
	}
	
	public void editProductDetailsSprint7(WebDriver driver, String EditCategoryName, String EditEditSubCategory, String EditBrandName,  String EditProductName, String EditVaPercent, String EditPrice, String EditSize, String EditWeight, String EditDescription, String ImagePath) throws Exception
	{
		WebDriverUtility wUtil = new WebDriverUtility();
        Robot r = new Robot();
		
		Thread.sleep(2000);
		wUtil.handleDropdownByVisibleText(EditCategoryName,CategoryDrpDwn);
		Thread.sleep(2000);
		wUtil.handleDropdownByVisibleText(EditEditSubCategory, SubCategoryDrpDwn);
		Thread.sleep(2000);
		wUtil.handleDropdownByVisibleText(EditBrandName, BrandNameDrpDwn);
		Thread.sleep(2000);
		ProductNameEdt.clear();
		Thread.sleep(2000);
		ProductNameEdt.sendKeys(EditProductName);
		Thread.sleep(2000);
		VaEdt.clear();
		Thread.sleep(2000);
		VaEdt.sendKeys(EditVaPercent);
		Thread.sleep(2000);
		//wUtil.handleDropdownByIndex(CaratDrpDwn, 2);
		Thread.sleep(2000);
		wUtil.handleDropdownByIndex(TypeDrpDwn, 1);
		Thread.sleep(2000);
		PriceEdt.clear();
		Thread.sleep(2000);
		PriceEdt.sendKeys(EditPrice);
		Thread.sleep(2000);
		DescriptionEdt.clear();
		Thread.sleep(2000);
		DescriptionEdt.sendKeys(EditDescription);
		Thread.sleep(2000);
		wUtil.clickOnChooseFileOption(driver, ChooseFileBtn, ImagePath);
        Thread.sleep(2000);
        UpdateBtn.click();
        Thread.sleep(2000);
        try 
        {
			if(InvalidFormErrorMsg.isDisplayed())
			{
				UpdateProductPageCloseBtn.click();
			}
		}
        catch (Exception e) 
        {
			Thread.sleep(2000);
		}
	}
	
}
