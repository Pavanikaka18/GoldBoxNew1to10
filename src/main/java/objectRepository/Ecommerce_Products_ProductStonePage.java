package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ecommerce_Products_ProductStonePage {

    //Rule-1 :- Find Web-Elements using FindBy Annotations
	
    @FindBy(xpath="//h4[.='Product Stones']/../../..//input[@placeholder='Search...']")private WebElement SearchEdt;
    
    @FindBy(xpath="//h4[.='Product Stones']/../..//button[.='Add Product Stone ']")private WebElement AddProductStoneBtn;
  //h4[.='Product Stones']/../../following-sibling::div//th[.='Stone Name']/../../following-sibling::tbody//td[.='Black Pearl']/following-sibling::td/button[.=' Edit ']
    @FindBy(xpath="//td[.='Pearl White Diamond']/following-sibling::td/button[.=' Edit ']")private WebElement EditBtn;
  //h4[.='Product Stones']/../../following-sibling::div//td[.='ab']/following-sibling::td//div[@class='mdc-switch__icons']
    @FindBy(xpath="//td[.='Pearl White Diamond']/following-sibling::td//div[@class='mdc-switch__icons']")private WebElement BootstrapBtn;
  //h4[.='Product Stones']/../../following-sibling::div//td[.='ab']/following-sibling::td//button[@class='btn-sm btn-edit bg-danger']
    @FindBy(xpath="//td[.='Pearl White Diamond']/following-sibling::td//button[@class='btn-sm btn-edit bg-danger']")private WebElement DeleteBtn;
  
    @FindBy(xpath="//span[text()=' Next ']")private WebElement NextPageLnk;
    
    @FindBy(xpath="//span[text()=' Prev ']")private WebElement PreviousPageLnk;
	
  
	//Rule-3:Create a constructor to initilise these elements
    
	public Ecommerce_Products_ProductStonePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	//Rule-4 :- Provide getters to access these variables

	public WebElement getSearchEdt() {
		return SearchEdt;
	}


	public WebElement getAddProductStoneBtn() {
		return AddProductStoneBtn;
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
    
	public void clickOnParticularStonetEditButton(WebDriver driver, String StoneName)
	{
		driver.findElement(By.xpath("//h4[.='Product Stones']/../../following-sibling::div//th[.='Stone Name']/../../following-sibling::tbody//td[.='"+StoneName+"']/following-sibling::td/button[.=' Edit ']")).click();
	}
	
	public void clickOnParticularStoneBootstrapButton(WebDriver driver, String StoneName)
	{
		driver.findElement(By.xpath("//h4[.='Product Stones']/../../following-sibling::div//th[.='Stone Name']/../../following-sibling::tbody//td[.='"+StoneName+"']/following-sibling::td/following-sibling::td//div[@class='mdc-switch__icons']")).click();
	}
	
	public void clickOnParticularStoneDeleteButton(WebDriver driver, String StoneName)
	{
		driver.findElement(By.xpath("//h4[.='Product Stones']/../../following-sibling::div//th[.='Stone Name']/../../following-sibling::tbody//td[.='"+StoneName+"']/following-sibling::td/following-sibling::td/..//button[@class='btn-sm btn-edit bg-danger']")).click();
	}
	
	
}
