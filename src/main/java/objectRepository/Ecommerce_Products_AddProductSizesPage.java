package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ecommerce_Products_AddProductSizesPage {

    //Rule-1 :- Find Web-Elements using FindBy Annotations
	
    @FindBy(xpath="//h1[.='Add Product Size']/following-sibling::button[@aria-label='Close']")private WebElement CloseBtn;
    
    @FindBy(xpath="//h1[.='Add Product Size']/../following-sibling::div//input[@placeholder='Enter Product Size']")private WebElement ProductSizeEdt;
    
    @FindBy(xpath="//h1[.='Add Product Size']/../following-sibling::div//input[@placeholder=' Enter Product Weight']")private WebElement ProductWeightEdt;
  
    @FindBy(xpath="//h1[.='Add Product Size']/../following-sibling::div//button[.='Add']")private WebElement AddBtn;
    
    @FindBy(xpath="(//div[.=' Size & Grams is Already Existed With This Product '])[2]")private WebElement SizeExistingError;
    
	//Rule-3:Create a constructor to initilise these elements
    
	public Ecommerce_Products_AddProductSizesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	//Rule-4 :- Provide getters to access these variables

	public WebElement getCloseBtn() {
		return CloseBtn;
	}

	
	public WebElement getProductSizeEdt() {
		return ProductSizeEdt;
	}


	public WebElement getProductWeightEdt() {
		return ProductWeightEdt;
	}
	
	
	public WebElement getAddBtn() {
		return AddBtn;
	}
	
	public WebElement getSizeExistingError() {
		return SizeExistingError;
	}
	
	
	//Create Business Library
    

	public void addProductSize(String Size, String Weight) throws Exception
	{
		Thread.sleep(2000);
		ProductSizeEdt.sendKeys(Size);
		Thread.sleep(2000);
		ProductWeightEdt.sendKeys(Weight);
		Thread.sleep(2000);
		AddBtn.click();
		Thread.sleep(1000);
		try 
		{
			if(SizeExistingError.isDisplayed())
			{
				CloseBtn.click();
			}
		}
		catch (Exception e) 
		{
			Thread.sleep(1000);
		}
	}
	
}
