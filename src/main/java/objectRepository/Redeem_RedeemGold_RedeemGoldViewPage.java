package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Redeem_RedeemGold_RedeemGoldViewPage {
	
	//Finding WebElements Using @FindBy Annotations
	
	  @FindBy(xpath ="//button[.='View']") private WebElement ViewBtn;
	  
	//Create a constructor to initilise these elements
	    
		public Redeem_RedeemGold_RedeemGoldViewPage(WebDriver driver)
				{
					PageFactory.initElements(driver, this);
				}
	
	//Provide getters to access these variables
		
		public WebElement getViewBtn() {
			return ViewBtn;
		}
		
   //Business Libraries
		
	    public void Users_RedeemGoldUsersPage_m(WebDriver driver)throws InterruptedException
			{
				Thread.sleep(2000);
				ViewBtn.click();

			}
}