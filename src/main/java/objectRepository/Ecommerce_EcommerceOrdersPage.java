package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.WebDriverUtility;

public class Ecommerce_EcommerceOrdersPage {

	WebDriverUtility wUtil = new WebDriverUtility();
	
    //Rule-1 :- Find Web-Elements using FindBy Annotations
    
	@FindBy(xpath="//a[@class='btn btn-filter']")private WebElement FilterBtn;
	
    @FindBy(xpath="//input[@placeholder='Search...']")private WebElement SearchEdt;
    
    @FindBy(xpath="(//button[text()=' View '])[1]")private WebElement ProductsViewBtn;
    //(//th[.='Products']/ancestor::table//button[text()=' View '])[1]
    
    @FindBy(xpath="(//th[.='Action']/ancestor::table//button[text()=' Status '])[1]")private WebElement ActionStatusBtn;
    
    @FindBy(xpath="//a[text()=' Next ']")private WebElement NextPageLnk;
    
    @FindBy(xpath="//span[text()=' Prev ']")private WebElement PreviousPageLnk;
	
  
	//Rule-2:Create a constructor to initilise these elements
    
	public Ecommerce_EcommerceOrdersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Rule-3 :- Provide getters to access these variables
    
	public WebElement getSearchEdt() {
		return SearchEdt;
	}


	public WebElement getFilterBtn() {
		return FilterBtn;
	}


	public WebElement getNextPageLnk() {
		return NextPageLnk;
	}


	public WebElement getPreviousPageLnk() {
		return PreviousPageLnk;
	}


	public WebElement getProductsViewBtn() {
		return ProductsViewBtn;
	}


	public WebElement getActionStatusBtn() {
		return ActionStatusBtn;
	}
    
	//Rule-4 :- Create Business Library
	
	public void searchCustomer(String CustomerName)
	{
		SearchEdt.sendKeys(CustomerName);
	}
	
	public void clickOnParticularProductViewBtn(WebDriver driver, long OrderId)
	{
		driver.findElement(By.xpath("(//th[.='Products']/ancestor::table//button[text()=' View '])[1]")).click();
	}   
	
	
	public void clickOnParticularProductStatusBtn(long orderId, WebDriver driver) 
	{
		driver.findElement(By.xpath("(//th[.='Action']/ancestor::table//button[text()=' Status '])[1]")).click();	
	}
	
	
	
}
