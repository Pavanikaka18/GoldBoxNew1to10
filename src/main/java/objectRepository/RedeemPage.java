package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedeemPage {
	
	//Finding WebElements Using @FindBy Annotations
	
	@FindBy(xpath ="//a[.='Redeem Gold Users']") private WebElement RedeemGoldUsersLnk;
	
	// Create a constructor to initilise these elements
	
	public RedeemPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	// Provide getters to access these variables

	public WebElement getRedeemGoldUsersLnk() {
		return RedeemGoldUsersLnk;
	} 

	//Business Libraries
	
	public void Redeem() throws InterruptedException 
	{
		
		Thread.sleep(2000);
		RedeemGoldUsersLnk.click();
		
	}
	
	
}
