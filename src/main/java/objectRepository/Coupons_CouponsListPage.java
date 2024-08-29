package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Coupons_CouponsListPage {

	// Rule-1 :-Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//input[@placeholder='Search...']")private WebElement SearchEdt;
    
    @FindBy(xpath="//button[.='Add Coupon']")private WebElement AddCouponBtn;
    
    @FindBy(xpath="(//button[.='View'])[1]")private WebElement CouponDescriptionViewBtn;
	
    @FindBy(xpath="(//button[.='Used Users'])[1]")private WebElement ActionsUsedUsersBtn;
    
    @FindBy(xpath="(//button[.='Edit'])[1]")private WebElement ActionsEditBtn;
    
    //td[.='U6n4JZpW']/following-sibling::td/button[.='View']/../following-sibling::td/button[.='Edit']/..//div[@class='mdc-switch__icons']
    @FindBy(xpath="(//div[@class='mdc-switch__icons'])[1]")private WebElement ActionsEnableDisableBootstrapBtn;
    
    @FindBy(xpath="//a[text()=' Next ']")private WebElement NextPageLnk;
    
    @FindBy(xpath="//span[text()=' Prev ']")private WebElement PreviousPageLnk;
    
    @FindBy(xpath="//h5[.='No records found']")private WebElement NoRecordsFoundError;
    
    @FindBy(xpath="(//div[.='  Coupon Status Updated Successfully. '])[2]")private WebElement UpdateMsg;
    
	//Rule-2:Create a constructor to initilise these elements
    
	public Coupons_CouponsListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Rule-3:Provide getters to access these variables
	
	public WebElement getSearchEdt() {
		return SearchEdt;
	}


	public WebElement getAddCouponsBtn() {
		return AddCouponBtn;
	}


	public WebElement getCouponDescriptionViewBtn() {
		return CouponDescriptionViewBtn;
	}


	public WebElement getActionsUsedUsersBtn() {
		return ActionsUsedUsersBtn;
	}


	public WebElement getActionsEditBtn() {
		return ActionsEditBtn;
	}


	public WebElement getActionsEnableDisableBootstrapBtn() {
		return ActionsEnableDisableBootstrapBtn;
	}
	
	
	public WebElement getNextPageLnk() {
		return NextPageLnk;
	}


	public WebElement getPreviousPageLnk() {
		return PreviousPageLnk;
	}



	public WebElement getNoRecordsFoundError() {
		return NoRecordsFoundError;
	}
	
	
	public WebElement getAddCouponBtn() {
		return AddCouponBtn;
	}


	public WebElement getUpdateMsg() {
		return UpdateMsg;
	}
	
	
	// Rule-4 :- Create Business Library

	public void noRecordsErrorPositiveHandling()
	{
		if(NoRecordsFoundError.isDisplayed())
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}
	}
	
	public void clickOnBootStrapBtn() throws Exception
	{
		Thread.sleep(2000);
		ActionsEnableDisableBootstrapBtn.click();
		Thread.sleep(2000);
		if(UpdateMsg.isDisplayed())
		{
			System.out.println("Updated");
		}
		else 
		{
			System.out.println("Not Updated");
		}
		
	}
}
