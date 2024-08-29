package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Banners_MainBannerImagePage {

	// Rule-1 :-Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//h1[.='Main Banner Image']/following-sibling::button[@class='btn-close']")private WebElement CloseBtn;
    
    
	//Rule-2:Create a constructor to initilise these elements
    
	public Banners_MainBannerImagePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Rule-3:Provide getters to access these variables
	
	public WebElement getCloseBtn() {
		return CloseBtn;
	}
	
}
