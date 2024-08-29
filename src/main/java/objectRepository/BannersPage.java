package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BannersPage {

	//Rule-1 :- Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//a[.='Main Banners']")private WebElement MainBannersLnk;
    
    @FindBy(xpath="//a[.='Splash Banners']")private WebElement SplashBannersLnk;
    
    @FindBy(xpath="//a[.='Ecom Banners']")private WebElement EcomBannersLnk;
	
  
	//Rule-2:- Create a constructor to initilise these elements
    
	public BannersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Rule-3:- Provide getters to access these variables
    
	public WebElement getMainBannersLnk() {
		return MainBannersLnk;
	}


	public WebElement getSplashBannersLnk() {
		return SplashBannersLnk;
	}


	public WebElement getEcomBannersLnk() {
		return EcomBannersLnk;
	}

	// Rule-4 :- Create Business Library
	
	public void clicKOnEcomBannersLnk() throws InterruptedException
	{
		Thread.sleep(2000);
		EcomBannersLnk.click();
	}
	
	
}
