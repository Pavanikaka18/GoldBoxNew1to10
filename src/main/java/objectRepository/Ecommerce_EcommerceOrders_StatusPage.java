package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ecommerce_EcommerceOrders_StatusPage {

	
	@FindBy(xpath="(//h1[contains(text(),'status')]/following-sibling::button[@aria-label='Close'])[1]")private WebElement CloseBtn;
	
	
	//Rule-3:Create a constructor to initilise these elements
    
	public Ecommerce_EcommerceOrders_StatusPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	//Rule-4:Provide getters to access these variables

	public WebElement getCloseBtn() {
		return CloseBtn;
	}
	
	
	//Business Libraries
    
	public void clickOnStatusPageCloseBtn() throws InterruptedException
	{
		Thread.sleep(1000);
		CloseBtn.click();
		Thread.sleep(1000);
	}
	
}
