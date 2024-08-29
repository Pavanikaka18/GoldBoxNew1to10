package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Coupons_CouponUserDetailsPage {

	// Rule-1 :-Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//h4[.='Coupon Users Details']/ancestor::div[@class='page-header']//input[@placeholder='Search...']")private WebElement SearchEdt;
    
    @FindBy(xpath="//h5[.='No records found']")private WebElement NoRecordsFindError;
    
    @FindBy(xpath="//span[text()=' Prev ']")private WebElement PrevBtn;
    
    @FindBy(xpath="//span[text()=' Next ']")private WebElement NextBtn;
    
    
	//Rule-2:Create a constructor to initilise these elements
    
	public Coupons_CouponUserDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	//Rule-3:Provide getters to access these variables
	
	public WebElement getSearchEdt() {
		return SearchEdt;
	}



	public WebElement getPrevBtn() {
		return PrevBtn;
	}



	public WebElement getNextBtn() {
		return NextBtn;
	}
	
	
	// Rule-4 :- Create Business Library
	
	public void handlindNoRecordsFindErrorAndClearingDataInSearchField() throws Exception
	{
		if(NoRecordsFindError.isDisplayed())
		{
			System.out.println("Pass");
			Thread.sleep(2000);
			SearchEdt.clear();
		}
	}
	
}
