package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.WebDriverUtility;

public class Ecommerce_EcommerceOrders_OrderedProductsPage {

	WebDriverUtility wUtil = new WebDriverUtility();
	
	@FindBy(xpath="//h1[.='Ordered Products']/..//button[@class='btn-close']")private WebElement CloseBtn;
	
	@FindBy(xpath="//th[.='S.No']/../../following-sibling::tbody//td[.='1']")private WebElement FirstSerialNo;
	
	  
	//Rule-3:Create a constructor to initilise these elements
    
	public Ecommerce_EcommerceOrders_OrderedProductsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	//Rule-4:Provide getters to access these variables

	public WebElement getCloseBtn() {
		return CloseBtn;
	}
	
	
	public WebElement getFirstSerialNo() {
		return FirstSerialNo;
	}
	
	
	//Business Libraries
    
	public void scrollOrderedProductsPageDownAndCloseThePage() throws Exception
	{
		Thread.sleep(2000);
		wUtil.mouseHoverAction(null, FirstSerialNo);
		Thread.sleep(1000);
		wUtil.scrollPageDown(1);
		Thread.sleep(1000);
		wUtil.scrollPageUp(1);
		CloseBtn.click();
		Thread.sleep(1000);
	}
	
	public void clickOnCloseOrderedPageButton() throws Exception
	{
		Thread.sleep(2000);
		CloseBtn.click();
		Thread.sleep(1000);
	}
	
	
}
