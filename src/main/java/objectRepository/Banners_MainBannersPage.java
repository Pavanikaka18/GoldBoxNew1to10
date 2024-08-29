package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Banners_MainBannersPage {


	// Rule-1 :-Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//input[@placeholder='Search...']")private WebElement SearchEdt;
    
    @FindBy(xpath="//button[.=' Add Main Banners ']")private WebElement AddMainBannersBtn;
    
    //td[contains(.,'Jan 2')]/following-sibling::td[contains(.,'Jan 3')]/..//button[.='View']
    @FindBy(xpath="(//h4[.='Main Banners']/ancestor::div[@class='card-header']//th[.='Banner Image']/ancestor::table[@class='table datanew']//button[.='View'])[1]")private WebElement BannerImgViewBtn;
	
    //td[contains(.,'Jan 2')]/following-sibling::td[contains(.,'Jan 3')]/..//button[.=' Edit ']
    @FindBy(xpath="(//button[.=' Edit '])[1]")private WebElement StatusEditBtn;
    
    //Have to make dynamic for this path to particular banner enable/disable
    @FindBy(xpath="(//div[@class='mdc-switch__icons'])[1]")private WebElement StatusEnableDisableBootstrapBtn;
    
    @FindBy(xpath="//a[text()=' Next ']")private WebElement NextPageLnk;
    
    @FindBy(xpath="//span[text()=' Prev ']")private WebElement PreviousPageLnk;

  
	//Rule-2:Create a constructor to initilise these elements
    
	public Banners_MainBannersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	//Rule-3:Provide getters to access these variables
    
	public WebElement getSearchEdt() {
		return SearchEdt;
	}


	public WebElement getAddMainBannersBtn() {
		return AddMainBannersBtn;
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
	
	public void enableOrDisableParticularBanner(WebDriver driver)
	{
		driver.findElement(By.xpath("(//div[@class='mdc-switch__icons'])[1]")).click();
	}
	
	
//  Here Month has to made dynamic to make particular action on specific banner	
	
//	@FindBy(xpath="//td[contains(.,'Jan 2')]/following-sibling::td[contains(.,'Jan 3')]/..//button[.='View']")private WebElement EcomBannersLnk;
	
//  @FindBy(xpath="//td[contains(.,'Jan 2')]/following-sibling::td[contains(.,'Jan 3')]/..//button[.=' Edit ']")private WebElement StatusEditBtn;
    
//  @FindBy(xpath="//td[contains(.,'Jan 2')]/following-sibling::td[contains(.,'Jan 3')]/..//button[.=' Edit ']/..//div[@class='mdc-switch__ripple']")private WebElement StatusEnableDisableBootstrapBtn;
    
	
	
}
