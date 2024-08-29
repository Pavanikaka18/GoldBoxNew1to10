package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Coupons_AddCouponsPage {

	// Rule-1 :-Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//div[.='Add coupon']//button[@class='btn-close']")private WebElement CloseBtn;
    
    @FindBy(xpath="//h1[.='Add coupon']/../following-sibling::div//input[@formcontrolname='amount']")private WebElement CouponAmountEdt;
    
    @FindBy(xpath="//h1[.='Add coupon']/../following-sibling::div//input[@formcontrolname='from_date']")private WebElement FromDateEdt;
	
    @FindBy(xpath="//h1[.='Add coupon']/../following-sibling::div//input[@formcontrolname='to_date']")private WebElement ToDateEdt;
    
    @FindBy(xpath="//h1[.='Add coupon']/../following-sibling::div//input[@formcontrolname='minimum_transaction_amount']")private WebElement MinimumTransactionAmountEdt;
    
    @FindBy(xpath="//h1[.='Add coupon']/../following-sibling::div//input[@placeholder='Enter Moible number']")private WebElement MobileNumberEdt;
  
    @FindBy(xpath="//h1[.='Add coupon']/../following-sibling::div//textarea[@formcontrolname='description']")private WebElement DescriptionEdt;
    
    @FindBy(xpath="(//input[@placeholder='Enter Moible number'])[1]")private WebElement AddAdminCouponMobileNumberEdt;
    
    @FindBy(xpath="//h1[.='Add coupon']/../following-sibling::div//button[.='Add']")private WebElement AddBtn;
    
	//Rule-2:Create a constructor to initilise these elements
    
	public Coupons_AddCouponsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	//Rule-3:Provide getters to access these variables
	
	public WebElement getCloseBtn() {
		return CloseBtn;
	}



	public WebElement getCouponAmountEdt() {
		return CouponAmountEdt;
	}



	public WebElement getFromDateEdt() {
		return FromDateEdt;
	}



	public WebElement getToDateEdt() {
		return ToDateEdt;
	}



	public WebElement getMinimumTransactionAmountEdt() {
		return MinimumTransactionAmountEdt;
	}
	
	
	
	public WebElement getMobileNumberEdt() {
		return MobileNumberEdt;
	}



	public WebElement getDescriptionEdt() {
		return DescriptionEdt;
	}

    

	public WebElement getAddAdminCouponMobileNumberEdt() {
		return AddAdminCouponMobileNumberEdt;
	}



	public WebElement getAddBtn() {
		return AddBtn;
	}
	
	
	// Rule-4 :- Create Business Library
    
	public void addingCoupon(String CouponAmount, String FromDate, String ToDate, String MinimumTransactionAmount, String Description) throws Exception
	{
		Thread.sleep(2000);
		CouponAmountEdt.sendKeys(CouponAmount);
		Thread.sleep(2000);
		FromDateEdt.sendKeys(FromDate);
		Thread.sleep(2000);
		ToDateEdt.sendKeys(ToDate);
		Thread.sleep(2000);
		MinimumTransactionAmountEdt.sendKeys(MinimumTransactionAmount);
		Thread.sleep(2000);
		DescriptionEdt.sendKeys(Description);
		Thread.sleep(2000);
		AddBtn.click();
		Thread.sleep(2000);
	}
	
	public void addingAdminCoupon(String CouponAmount, String FromDate, String ToDate, String MinimumTransactionAmount, String MobileNumber, String Description) throws Exception
	{
		Thread.sleep(2000);
		CouponAmountEdt.sendKeys(CouponAmount);
		Thread.sleep(2000);
		FromDateEdt.sendKeys(FromDate);
		Thread.sleep(2000);
		ToDateEdt.sendKeys(ToDate);
		Thread.sleep(2000);
		MinimumTransactionAmountEdt.sendKeys(MinimumTransactionAmount);
		Thread.sleep(2000);
		AddAdminCouponMobileNumberEdt.sendKeys(MobileNumber);
		Thread.sleep(2000);
		DescriptionEdt.sendKeys(Description);
		Thread.sleep(2000);
		AddBtn.click();
		Thread.sleep(2000);
	}
	
}
