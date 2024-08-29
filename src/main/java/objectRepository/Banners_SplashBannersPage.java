package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Banners_SplashBannersPage {

	// Rule-1 :-Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//input[@placeholder='Search...']")private WebElement SearchEdt;
    
    @FindBy(xpath="//button[.='Add Splash Banners']")private WebElement AddSplashBannersBtn;
    
    @FindBy(xpath="(//h4[.='Splash Banners']/ancestor::div[@class='card-header']//th[.='Banner Image']/ancestor::table[@class='table datanew']//button[.='View'])[1]")private WebElement BannerImgViewBtn;
	
    @FindBy(xpath="(//h4[.='Splash Banners']/ancestor::div[@class='card-header']//th[.='Status']/ancestor::table[@class='table datanew']//button[.=' Edit '])[1]")private WebElement StatusEditBtn;
    
    @FindBy(xpath="(//h4[.='Splash Banners']/ancestor::div[@class='card-header']//th[.='Status']/ancestor::table[@class='table datanew']//button[.=' Edit ']/..//div/descendant::div[@class='mdc-switch__icons'])[1]")private WebElement StatusEnableDisableBootstrapBtn;
    
    @FindBy(xpath="//a[text()=' Next ']")private WebElement NextPageLnk;
    
    @FindBy(xpath="//span[text()=' Prev ']")private WebElement PreviousPageLnk;

  
	//Rule-2:Create a constructor to initilise these elements
    
	public Banners_SplashBannersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	//Rule-3:Provide getters to access these variables
    
	public WebElement getSearchEdt() {
		return SearchEdt;
	}


	public WebElement getAddSplashBannersBtn() {
		return AddSplashBannersBtn;
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
    
	
    //Rule-4 :- Create Business Library                                   Pending from splash banners
	
	
	
	
	//We have to make date dynamic 
	
//    @FindBy(xpath="//td[contains(.,'Jan 2')]/following-sibling::td[contains(.,'Feb 3')]/..//button[.='View']")private WebElement BannerImgViewBtn;
	
//    @FindBy(xpath="//td[contains(.,'Jan 2')]/following-sibling::td[contains(.,'Feb 3')]/..//button[.=' Edit ']")private WebElement StatusEditBtn;
    
 //   @FindBy(xpath="//td[contains(.,'Jan 2')]/following-sibling::td[contains(.,'Feb 3')]/..//button[.=' Edit ']/..//div[@class='mdc-switch__ripple']")private WebElement StatusEnableDisableBootstrapBtn;

	
}
