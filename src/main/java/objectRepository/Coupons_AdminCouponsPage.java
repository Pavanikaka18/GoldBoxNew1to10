package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Coupons_AdminCouponsPage {

	// Rule-1 :-Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//input[@placeholder='Search...']")private WebElement SearchEdt;
    
    @FindBy(xpath="//button[.='Add admin Coupon']")private WebElement AddAdminCouponBtn;
    
    @FindBy(xpath="(//button[.='View'])[1]")private WebElement AdminCouponFirstViewBtn;
	
    @FindBy(xpath="(//button[.='Edit'])[1]")private WebElement AdminCouponFirstEditBtn;
    
    @FindBy(xpath="(//div[@class='mdc-switch__icons'])[1]")private WebElement AdminCouponFirstEnableDisableBtn;
    
    @FindBy(xpath="//span[text()=' Prev ']")private WebElement AdminCouponPreviousPageBtn;
    
    @FindBy(xpath="//a[text()=' Next ']")private WebElement NextPageBtn;
    
    @FindBy(xpath="//h5[.='No records found']")private WebElement NoRecordsFindError;
    
    @FindBy(xpath="(//div[.='  Coupon Status Updated Successfully. '])[2]")private WebElement UpdateMsg;
    
	//Rule-2:Create a constructor to initilise these elements
    
	public Coupons_AdminCouponsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	//Rule-3:Provide getters to access these variables
	
	public WebElement getSearchEdt() {
		return SearchEdt;
	}



	public WebElement getAddAdminCouponBtn() {
		return AddAdminCouponBtn;
	}



	public WebElement getAdminCouponFirstViewBtn() {
		return AdminCouponFirstViewBtn;
	}



	public WebElement getAdminCouponFirstEditBtn() {
		return AdminCouponFirstEditBtn;
	}



	public WebElement getAdminCouponFirstEnableDisableBtn() {
		return AdminCouponFirstEnableDisableBtn;
	}



	public WebElement getAdminCouponPreviousPageBtn() {
		return AdminCouponPreviousPageBtn;
	}



	public WebElement getNextPageBtn() {
		return NextPageBtn;
	}
	
	
	
	public WebElement getUpdateMsg() {
		return UpdateMsg;
	}



	public WebElement getNoRecordsFindError() {
		return NoRecordsFindError;
	}
	
	
	// Rule-4 :- Create Business Library
    
	public void searchingAndHandlingNoRecordsFoundError(String SearchValue) throws Exception
    {
    	Thread.sleep(2000);
    	SearchEdt.sendKeys(SearchValue);
    	Thread.sleep(2000);
    	if(NoRecordsFindError.isDisplayed())
    	{
    		System.out.println("Pass");
    	}
    	else 
    	{
    		System.out.println("Fail");
		}
    }
	
	public void clickOnEnableDisableBootStrapBtn() throws Exception
    {
    	Thread.sleep(2000);
    	AdminCouponFirstEnableDisableBtn.click();
    	Thread.sleep(1000);
    	if(UpdateMsg.isDisplayed())
    	{
    		System.out.println("Updated Successfully");
    	}
    	else 
    	{
    		System.out.println("Not Updated");
		}
    }
	
}
