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

public class Ecommerce_Products_AddProductsPage {

	WebDriverUtility wUtil = new WebDriverUtility();
	
	
    //Rule-1 :- Find Web-Elements using FindBy Annotations
	
    @FindBy(xpath="//h1[.='Add Product Details']/following-sibling::button[@aria-label='Close']")private WebElement CloseBtn;
    
    @FindBy(xpath="//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']")private WebElement CategoryDrpDwn;
    
    @FindBy(xpath="//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='subcategoryname']")private WebElement SubCategoryDrpDwn;
  
    @FindBy(xpath="//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='brandname']")private WebElement BrandNameDrpDwn;
    
    @FindBy(xpath="//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='productname']")private WebElement ProductNameEdt;
    
    @FindBy(xpath="//h1[.='Add Product Details']/../following-sibling::div//input[@placeholder='Enter VA%']")private WebElement VaEdt;
    
   // @FindBy(xpath="//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='carat']")private WebElement CaratDrpDwn;
    
    @FindBy(xpath="//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='type']")private WebElement TypeDrpDwn;
    
    @FindBy(xpath="//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='price']")private WebElement PriceEdt;
    
    @FindBy(xpath="//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='isshown']")private WebElement IsShownDrpDwn;
  
    @FindBy(xpath="//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='sizes']")private WebElement SizeEdt;
    
    @FindBy(xpath="//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='weight']")private WebElement WeightEdt;
    
    @FindBy(xpath="//h1[.='Add Product Details']/../following-sibling::div//textarea[@formcontrolname='description']")private WebElement DescriptionEdt;
	
    @FindBy(xpath="//h1[.='Add Product Details']/../following-sibling::div//input[@type='file']")private WebElement ChooseFileBtn;
    
    @FindBy(xpath="//h1[.='Add Product Details']/../following-sibling::div/following-sibling::div/button[.='Add']")private WebElement AddBtn;
  
	//Rule-3:Create a constructor to initilise these elements
    
	public Ecommerce_Products_AddProductsPage(WebDriver driver)
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

//	public WebElement getCaratDrpDwn() {
//		return CaratDrpDwn;
//	}

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
	
	public WebElement getAddBtn() {
		return AddBtn;
	}
	
	//Create Business Library
    
	public void AddingProduct(WebDriver driver, String ProductName, String VaPercent, String Price, String Size, String Weight, String Description, String ImagePath) throws Exception
	{
		Thread.sleep(2000);
		wUtil.handleDropdownByVisibleText("Fingers" , CategoryDrpDwn);
		Thread.sleep(2000);
		wUtil.handleDropdownByIndex(SubCategoryDrpDwn, 1);
		Thread.sleep(2000);
		wUtil.handleDropdownByIndex(BrandNameDrpDwn, 1);
		Thread.sleep(2000);
		ProductNameEdt.sendKeys(ProductName);
		Thread.sleep(2000);
		VaEdt.sendKeys(VaPercent);
		Thread.sleep(2000);
	//	wUtil.handleDropdownByIndex(CaratDrpDwn, 1);
		Thread.sleep(2000);
		wUtil.handleDropdownByIndex(TypeDrpDwn, 1);
		Thread.sleep(2000);
		wUtil.handleDropdownByIndex(IsShownDrpDwn, 1);
		Thread.sleep(2000);
		PriceEdt.sendKeys(Price);
		Thread.sleep(2000); 
		SizeEdt.sendKeys(Size);
		Thread.sleep(2000);
		WeightEdt.sendKeys(Weight);
		Thread.sleep(2000);
		DescriptionEdt.sendKeys(Description);
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
        AddBtn.click();
        Thread.sleep(2000);
        
	}
	
	public void AddingProduct1(WebDriver driver, String EditCategory, String EditSubCategory, String EditBrand, String ProductName, String VaPercent, String Price, String Size, String Weight, String Description, String ImagePath) throws Exception
	{
		Thread.sleep(2000);
		wUtil.handleDropdownByVisibleText(EditCategory , CategoryDrpDwn);
		Thread.sleep(2000);
		wUtil.handleDropdownByVisibleText(EditSubCategory, SubCategoryDrpDwn);
		Thread.sleep(2000);
		wUtil.handleDropdownByVisibleText(EditBrand , BrandNameDrpDwn);
		Thread.sleep(2000);
		ProductNameEdt.sendKeys(ProductName);
		Thread.sleep(2000);
		VaEdt.sendKeys(VaPercent);
		Thread.sleep(2000);
//		wUtil.handleDropdownByIndex(CaratDrpDwn, 1);
		Thread.sleep(2000);
		wUtil.handleDropdownByIndex(TypeDrpDwn, 1);
		Thread.sleep(2000);
		wUtil.handleDropdownByIndex(IsShownDrpDwn, 1);
		Thread.sleep(2000);
		PriceEdt.sendKeys(Price);
		Thread.sleep(2000); 
		SizeEdt.sendKeys(Size);
		Thread.sleep(2000);
		WeightEdt.sendKeys(Weight);
		Thread.sleep(2000);
		DescriptionEdt.sendKeys(Description);
		Thread.sleep(2000);
		wUtil.clickOnChooseFileOption(driver, ChooseFileBtn, ImagePath);
        Thread.sleep(2000);
        AddBtn.click();
        Thread.sleep(2000);
        
	}
	
}
