package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Content_Page 
{

	//Finding WebElements Using @FindBy Annotations

	@FindBy(xpath ="//a[.='Gold Plus Plan Content']") private WebElement GoldPlusPlanContentLnk;
	@FindBy(xpath ="//a[.='My Gold Plan Content']") private WebElement MyGoldPlanContentLnk;
	@FindBy(xpath ="//a[.='Buy Gold Content']") private WebElement BuyGoldPlanContentLnk;
	 
    // Create a constructor to initilise these elements
    
	 public Content_Page(WebDriver driver)
	 {
	  	PageFactory.initElements(driver, this);
	 }


    // Provide getters to access these variables

		public WebElement getGoldPlusPlanContentLnk() {
			return GoldPlusPlanContentLnk;
		}

		public WebElement getMyGoldPlanContentLnk() {
			return MyGoldPlanContentLnk;
		}

		public WebElement getBuyGoldPlanContentLnk() {
			return BuyGoldPlanContentLnk;
		}

	// Business Libraries
	  
	 public void GoldPricesPage() throws InterruptedException
		{
		
		 Thread.sleep(2000);
		 GoldPlusPlanContentLnk.click();
		 Thread.sleep(2000);
		 MyGoldPlanContentLnk.click();
		 Thread.sleep(2000);
		 BuyGoldPlanContentLnk.click();
		 
		}
	
}


/*

@FindBy(xpath ="") private WebElement ;
@FindBy(xpath ="") private WebElement ;
@FindBy(xpath ="") private WebElement ;
@FindBy(xpath ="") private WebElement ; 
@FindBy(xpath ="") private WebElement ;
@FindBy(xpath ="") private WebElement ;
@FindBy(xpath ="") private WebElement ;
@FindBy(xpath ="") private WebElement ;
@FindBy(xpath ="") private WebElement ;
@FindBy(xpath ="") private WebElement ;

*/