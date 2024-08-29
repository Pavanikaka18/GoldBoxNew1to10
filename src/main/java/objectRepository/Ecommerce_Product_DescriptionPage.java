package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ecommerce_Product_DescriptionPage {

//Rule-1 :- Find Web-Elements using FindBy Annotations
	
    @FindBy(xpath="(//h1[@class='modal-title fs-5']/following-sibling::button[@aria-label='Close'])[1]")private WebElement CloseBtn;
    
    @FindBy(xpath="(//h1[@class='modal-title fs-5'])[1]/../following-sibling::div/button[.='Understood']")private WebElement UnderstandBtn;
    
    
	//Rule-3:Create a constructor to initilise these elements
    
	public Ecommerce_Product_DescriptionPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	//Rule-4 :- Provide getters to access these variables

	public WebElement getCloseBtn() {
		return CloseBtn;
	}

	
	public WebElement getUnderstandBtn() {
		return UnderstandBtn;
	}


	//Create Business Library

	
}
