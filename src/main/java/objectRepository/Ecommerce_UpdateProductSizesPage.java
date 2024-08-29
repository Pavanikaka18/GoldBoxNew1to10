package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ecommerce_UpdateProductSizesPage {

    @FindBy(xpath="//h1[.='Update Product Sizes']/following-sibling::button[@aria-label='Close']")private WebElement CloseBtn;
    
    @FindBy(xpath="//h1[.='Update Product Sizes']/../following-sibling::div//input[@placeholder='Enter Product Size']")private WebElement ProductSizeEdt;
    
    @FindBy(xpath="//h1[.='Update Product Sizes']/../following-sibling::div//input[@placeholder='Enter Product Weight']")private WebElement ProductWeightEdt;
    
    @FindBy(xpath="//h1[.='Update Product Sizes']/../following-sibling::div/following-sibling::div/button[.='Update']")private WebElement UpdateBtn;
    
  
	//Rule-3:Create a constructor to initilise these elements
    
	public Ecommerce_UpdateProductSizesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	//Rule-4:Provide getters to access these variables
	
	public WebElement getCloseBtn() {
		return CloseBtn;
	}


	public WebElement getProductSizeEdt() {
		return ProductSizeEdt;
	}


	public WebElement getProductWeightEdt() {
		return ProductWeightEdt;
	}


	public WebElement getUpdateBtn() {
		return UpdateBtn;
	}
	
	
	//Create Business Library

	public void editProductSize(String EditSize, String EditWeight) throws Exception
	{
		Thread.sleep(2000);
		ProductSizeEdt.clear();
		Thread.sleep(2000);
		ProductSizeEdt.sendKeys(EditSize);
		Thread.sleep(2000);
		ProductWeightEdt.clear();
		Thread.sleep(2000);
		ProductWeightEdt.sendKeys(EditWeight);
		Thread.sleep(2000);
		UpdateBtn.click();
		Thread.sleep(2000);
	}
}
