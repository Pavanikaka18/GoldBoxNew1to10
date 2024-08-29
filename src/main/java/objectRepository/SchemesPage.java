package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SchemesPage {

	//Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//a[text()='Scheme List']")private WebElement SchemesListLnk;
    
    @FindBy(xpath="//a[text()='Scheme Users']")private WebElement SchemeUsersLnk;
    
    @FindBy(xpath="//a[.='Buy Gold']")private WebElement BuyGoldLnk;
  
  
	//Rule-3:Create a constructor to initilise these elements
    
	public SchemesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    

	//Rule-4:Provide getters to access these variables

	public WebElement getSchemesListLnk() {
		return SchemesListLnk;
	}
	
	public WebElement getSchemeUsersLnk() {
		return SchemeUsersLnk;
	}
	
	public WebElement getBuyGoldLnk() {
		return BuyGoldLnk;
	}
	
	
	//Create Business Libraries
	
	
}
