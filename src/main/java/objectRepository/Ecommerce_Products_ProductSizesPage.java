package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ecommerce_Products_ProductSizesPage {

    //Rule-1 :- Find Web-Elements using FindBy Annotations
	
    @FindBy(xpath="//h4[.='Product Sizes']/../../..//input[@placeholder='Search...']")private WebElement SearchEdt;
    
    @FindBy(xpath="//h4[.='Product Sizes']/../../..//button[.='Add Product Sizes']")private WebElement AddProductSizesBtn;
    
    @FindBy(xpath="//h4[.='Product Sizes']/../../following-sibling::div/following-sibling::div//td[.='Bangles001']/following-sibling::td[.='5']/following-sibling::td[.='15']/following-sibling::td/button[.=' Edit ']")private WebElement EditBtn;
    
    @FindBy(xpath="//h4[.='Product Sizes']/../../following-sibling::div/following-sibling::div//td[.='NeckPiece']/following-sibling::td[.='1412']/following-sibling::td[.='1412']/following-sibling::td//div[@class='mdc-switch__icons']")private WebElement BootstrapBtn;
    
    @FindBy(xpath="//h4[.='Product Sizes']/../../following-sibling::div/following-sibling::div//td[.='NeckPiece']/following-sibling::td[.='1412']/following-sibling::td[.='1412']/following-sibling::td//button[@class='btn-sm btn-edit bg-danger']")private WebElement DeleteBtn;
    
    @FindBy(xpath="//span[text()=' Next ']")private WebElement NextPageLnk;
    
    @FindBy(xpath="//span[text()=' Prev ']")private WebElement PreviousPageLnk;
	
  
	//Rule-3:Create a constructor to initilise these elements
    
	public Ecommerce_Products_ProductSizesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	//Rule-4 :- Provide getters to access these variables

	public WebElement getSearchEdt() {
		return SearchEdt;
	}


	public WebElement getAddProductSizesBtn() {
		return AddProductSizesBtn;
	}


	public WebElement getEditBtn() {
		return EditBtn;
	}


	public WebElement getBootstrapBtn() {
		return BootstrapBtn;
	}


	public WebElement getDeleteBtn() {
		return DeleteBtn;
	}


	public WebElement getNextPageLnk() {
		return NextPageLnk;
	}


	public WebElement getPreviousPageLnk() {
		return PreviousPageLnk;
	}
    
	
	//Create Business Library
    public void clickOnFrstProductBootstrapBtnInProductSizePage(WebDriver driver)
    {
    	driver.findElement(By.xpath("(//div[@class='mdc-switch__icons'])[1]")).click();
    }
	
	public void clickOnParticularProductEditBtn(WebDriver driver, String AddProductName, String AddProductSize, String AddProductWeight)
	{
		driver.findElement(By.xpath("//h4[.='Product Sizes']/../../following-sibling::div/following-sibling::div//td[.='"+AddProductName+"']/following-sibling::td[.='"+AddProductSize+"']/following-sibling::td[.='"+AddProductWeight+"']/following-sibling::td/button[.=' Edit ']")).click();
	}
	
	public void clickOnParticularProductBootstrapBtn(WebDriver driver, String EditProductName, String EditSize, String EditWeight) throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h4[.='Product Sizes']/../../following-sibling::div/following-sibling::div//td[.='"+EditProductName+"']/following-sibling::td[.='"+EditSize+"']/following-sibling::td[.='"+EditWeight+"']/following-sibling::td//div[@class='mdc-switch__icons']")).click();
	}
	
	public void clickOnFrstProductDeleteBtnInProductSizePage(WebDriver driver)
    {
		driver.findElement(By.xpath("(//button[@class='btn-sm btn-edit bg-danger'])[1]")).click();
    }
	
	
	public void clickOnParticularProductDeleteBtn(WebDriver driver, String EditProductName, String EditSize, String EditWeight) throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h4[.='Product Sizes']/../../following-sibling::div/following-sibling::div//td[.='"+EditProductName+"']/following-sibling::td[.='"+EditSize+"']/following-sibling::td[.='"+EditWeight+"']/following-sibling::td//button[@class='btn-sm btn-edit bg-danger']")).click();
	}
	
}
