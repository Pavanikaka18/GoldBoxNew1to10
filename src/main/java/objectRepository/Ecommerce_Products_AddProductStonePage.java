package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ecommerce_Products_AddProductStonePage {

    //Rule-1 :- Find Web-Elements using FindBy Annotations
	
    @FindBy(xpath="//h1[.='Add Product Stone']/following-sibling::button[@aria-label='Close']")private WebElement CloseBtn;
    
    @FindBy(xpath="//h1[.='Add Product Stone']/../following-sibling::div//input[@placeholder='Enter Stone Name']")private WebElement StoneNameEdt;
    
    @FindBy(xpath="//h1[.='Add Product Stone']/../following-sibling::div//input[@placeholder='Enter Stone Colour']")private WebElement StoneColourEdt;
  
    @FindBy(xpath="//h1[.='Add Product Stone']/../following-sibling::div//input[@placeholder=' Enter Stone Price']")private WebElement StonePriceEdt;
    
    @FindBy(xpath="//h1[.='Add Product Stone']/../following-sibling::div//input[@placeholder=' Enter Number Of Stones']")private WebElement NoOfStonesEdt;
    
    @FindBy(xpath="//h1[.='Add Product Stone']/../following-sibling::div/following-sibling::div/button[.='Add']")private WebElement AddBtn;
    
    
	//Rule-3:Create a constructor to initilise these elements
    
	public Ecommerce_Products_AddProductStonePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	//Rule-4 :- Provide getters to access these variables

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


	public WebElement getAddBtn() {
		return AddBtn;
	}
	
	
	//Create Business Library
    
	public void addingProductStone(String StoneName, String StoneColour, String StonePrice, String NoOfStones) throws Exception
	{
		Thread.sleep(2000);
		StoneNameEdt.sendKeys(StoneName);
		Thread.sleep(2000);
		StoneColourEdt.sendKeys(StoneColour);
		Thread.sleep(2000);
		StonePriceEdt.sendKeys(StonePrice);
		Thread.sleep(2000);
		NoOfStonesEdt.sendKeys(NoOfStones);
		Thread.sleep(2000);
		AddBtn.click();
		Thread.sleep(2000);
	}
	
}
