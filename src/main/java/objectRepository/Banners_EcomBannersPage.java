package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Banners_EcomBannersPage {

	// Rule-1 :-Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//input[@placeholder='Search...']")private WebElement SearchEdt;
    
    @FindBy(xpath="//button[.='Add Ecom Banners']")private WebElement AddEcomBannersBtn;
    
    @FindBy(xpath="(//h4[.='Ecom Banners']/ancestor::div[@class='card']//button[.='View'])[1]")private WebElement BannerImgViewBtn;
    
    @FindBy(xpath="//td[contains(.,'Feb 25, 2024')]/following-sibling::td[contains(.,'Dec 31, 2024')]/..//button[.=' Edit ']")private WebElement StatusEditBtn;
    
    @FindBy(xpath="(//h4[.='Ecom Banners']/ancestor::div[@class='card-header']//th[.='Status']/ancestor::table//div[@class='mdc-switch__handle'])[1]")private WebElement StatusEnableDisableBootstrapBtn;
    
    @FindBy(xpath="//a[text()=' Next ']")private WebElement NextPageLnk;
    
    @FindBy(xpath="//span[text()=' Prev ']")private WebElement PreviousPageLnk;
    
    
	//Rule-2:Create a constructor to initilise these elements
    
	public Banners_EcomBannersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Rule-3:Provide getters to access these variables
    
	
	public WebElement getSearchEdt() {
		return SearchEdt;
	}


	public WebElement getAddEcomBannersBtn() {
		return AddEcomBannersBtn;
	}


	public WebElement getBannerImgViewBtn() {
		return BannerImgViewBtn;
	}


	public WebElement getStatusEditBtn() {
		return StatusEditBtn;
	}


	public WebElement getStatusEnableDisableBootstrapBtn() {
		return StatusEnableDisableBootstrapBtn;
	}


	public WebElement getNextPageLnk() {
		return NextPageLnk;
	}


	public WebElement getPreviousPageLnk() {
		return PreviousPageLnk;
	}
	
	
	//Rule-4 :- Create Business Library
	
	public void searching_A_Banner(String IssuedDate)
	{
		SearchEdt.sendKeys(IssuedDate);
	}
	
	
	public void clickOnFirstBannerStatusEditBtn(WebDriver driver)
	{
		driver.findElement(By.xpath("(//h4[.='Ecom Banners']/ancestor::div[@class='card']//th[.='Status']/ancestor::table[@class='table datanew']//button[.=' Edit '])[1]")).click();
	}
	
	
	public void clickOnFirstBannerStatusEnableOrDisableButton(WebDriver driver)
	{
		driver.findElement(By.xpath("(//h4[.='Ecom Banners']/ancestor::div[@class='card-header']//th[.='Status']/ancestor::table//div[@class='mdc-switch__handle'])[1]")).click();
	}
	
}
