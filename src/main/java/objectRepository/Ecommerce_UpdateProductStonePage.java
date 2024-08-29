package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ecommerce_UpdateProductStonePage {

    @FindBy(xpath="//h1[.='Update Product Stone']/following-sibling::button[@aria-label='Close']")private WebElement CloseBtn;
    
    @FindBy(xpath="//h1[.='Update Product Stone']/../following-sibling::div//input[@placeholder='Enter Stone Name']")private WebElement StoneNameEdt;
    
    @FindBy(xpath="//h1[.='Update Product Stone']/../following-sibling::div//input[@placeholder='Enter Stone Colour']")private WebElement StoneColourEdt;
    
    @FindBy(xpath="//h1[.='Update Product Stone']/../following-sibling::div//input[@placeholder=' Enter Stone Price']")private WebElement StonePriceEdt;
    
    @FindBy(xpath="//h1[.='Update Product Stone']/../following-sibling::div//input[@placeholder=' Enter Number Of Stones']")private WebElement NoOfStonesEdt;
    
    @FindBy(xpath="//h1[.='Update Product Stone']/../following-sibling::div/following-sibling::div/button[.='Update']")private WebElement UpdateBtn;
    
  
	//Rule-3:Create a constructor to initilise these elements
    
	public Ecommerce_UpdateProductStonePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	//Rule-4:Provide getters to access these variables
	
	public WebElement getCloseBtn() {
		return CloseBtn;
	}


	public WebElement getStoneNameEdt() {
		return StoneNameEdt;
	}


	public WebElement getStoneColourEdt() {
		return StoneColourEdt;
	}


	public WebElement getStonePriceEdt() {
		return StonePriceEdt;
	}


	public WebElement getNoOfStonesEdt() {
		return NoOfStonesEdt;
	}


	public WebElement getUpdateBtn() {
		return UpdateBtn;
	}
	
	
	//Create Business Library

	public void editProductStone(String EditStoneName, String EditStoneColour, String EditPrice, String EditNoOfStones) throws Exception
	{
		Thread.sleep(2000);
		StoneNameEdt.clear();
		Thread.sleep(2000);
		StoneNameEdt.sendKeys(EditStoneName);
		Thread.sleep(2000);
		StoneColourEdt.clear();
		Thread.sleep(2000);
		StoneColourEdt.sendKeys(EditStoneColour);
		Thread.sleep(2000);
		StonePriceEdt.clear();
		Thread.sleep(2000);
		StonePriceEdt.sendKeys(EditPrice);
		Thread.sleep(2000);
		NoOfStonesEdt.clear();
		Thread.sleep(2000);
		NoOfStonesEdt.sendKeys(EditNoOfStones);
		Thread.sleep(2000);
		UpdateBtn.click();
		Thread.sleep(2000);
	}
}
