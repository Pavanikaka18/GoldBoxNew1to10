package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_PaymentManagementPage {

	//Rule-1 :- Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//button[.='Add payment method']")private WebElement AddPaymentMethodBtn;
    
    @FindBy(xpath="(//div[@class='mdc-form-field'])[3]")private WebElement PaymentStatusBootStrapBtn;
	
    @FindBy(xpath="//span[text()=' Prev ']")private WebElement PreviousPageBtn;
    
    @FindBy(xpath="//span[text()=' Next ']")private WebElement NextPageBtn;
    
    
	//Rule-2:- Create a constructor to initilise these elements
    
	public Settings_PaymentManagementPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Rule-3:- Provide getters to access these variables
    
	public WebElement getAddPaymentMethodBtn() {
		return AddPaymentMethodBtn;
	}


	public WebElement getPaymentStatusBootStrapBtn() {
		return PaymentStatusBootStrapBtn;
	}


	public WebElement getPreviousPageBtn() {
		return PreviousPageBtn;
	}


	public WebElement getNextPageBtn() {
		return NextPageBtn;
	}
	
	

	// Rule-4 :- Create Business Library
	
}
