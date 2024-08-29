package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldPrices_AddGoldPricesPage 
{
	
	//Finding WebElements Using @FindBy Annotations
	
      @FindBy(xpath ="//h5[.='Gold Prices (22 Carat)']/..//input[@placeholder='Enter Sell Price']") private WebElement TTCSellPriceEdt;
      @FindBy(xpath ="//h5[.='Gold Prices (22 Carat)']/..//input[@placeholder='Enter Buy Price']") private WebElement TTCBuyPriceEdt;
      @FindBy(xpath ="//h5[.='Gold Prices (24 Carat)']/..//input[@placeholder='Enter Sell Price']") private WebElement TFCSellPriceEdt;
      @FindBy(xpath ="//h5[.='Gold Prices (24 Carat)']/..//input[@placeholder='Enter Buy Price']") private WebElement TFCBuyPriceEdt; 
      @FindBy(xpath ="//h5[.='Silver Prices']/..//input[@placeholder='Enter Sell Price']") private WebElement SSellPriceEdt;
      @FindBy(xpath ="//h5[.='Silver Prices']/..//input[@placeholder='Enter Buy Price']") private WebElement SBuyPriceEdt;
      @FindBy(xpath ="//button[.='Add']") private WebElement GPAGPAddBtn;
      @FindBy(xpath ="//button[@class='btn-close']") private WebElement GPAGPCloseBtn;	
	
   // Create a constructor to initilise these elements
      
  	public GoldPrices_AddGoldPricesPage(WebDriver driver)
  	{
  		PageFactory.initElements(driver, this);
  	}

   // Provide getters to access these variables
      
	public WebElement getTTCSellPriceEdt() {
		return TTCSellPriceEdt;
	}

	public WebElement getTTCBuyPriceEdt() {
		return TTCBuyPriceEdt;
	}

	public WebElement getTFCSellPriceEdt() {
		return TFCSellPriceEdt;
	}

	public WebElement getTFCBuyPriceEdt() {
		return TFCBuyPriceEdt;
	}

	public WebElement getSSellPriceEdt() {
		return SSellPriceEdt;
	}

	public WebElement getSBuyPriceEdt() {
		return SBuyPriceEdt;
	}

	public WebElement getGPAGPAddBtn() {
		return GPAGPAddBtn;
	}

	public WebElement getGPAGPCloseBtn() {
		return GPAGPCloseBtn;
	}

	// Business Libraries
				
	public void GoldPricesPage() throws InterruptedException
	{
		
		Thread.sleep(2000);
		TTCSellPriceEdt.sendKeys(null);
		Thread.sleep(2000);
		TTCBuyPriceEdt.sendKeys(null);
		Thread.sleep(2000);
		TFCSellPriceEdt.sendKeys(null);
		Thread.sleep(2000);
		TFCBuyPriceEdt.sendKeys(null);
		Thread.sleep(2000);
		SSellPriceEdt.sendKeys(null);
		Thread.sleep(2000);
		SBuyPriceEdt.sendKeys(null);
		Thread.sleep(2000);
		GPAGPAddBtn.sendKeys(null);
		Thread.sleep(2000);
		GPAGPCloseBtn.sendKeys(null);
		  
      
	}
      
          
}