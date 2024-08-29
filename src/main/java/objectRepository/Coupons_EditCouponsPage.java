package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Coupons_EditCouponsPage {

	// Rule-1 :-Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//div[.='Edit coupon']//button[@class='btn-close']")private WebElement CloseBtn;
    
    @FindBy(xpath="//h1[.='Edit coupon']/../following-sibling::div//input[@formcontrolname='amount']")private WebElement CouponAmountEdt;
    
    @FindBy(xpath="//h1[.='Edit coupon']/../following-sibling::div//input[@formcontrolname='from_date']")private WebElement FromDateEdt;
	
    @FindBy(xpath="//h1[.='Edit coupon']/../following-sibling::div//input[@formcontrolname='to_date']")private WebElement ToDateEdt;
    
    @FindBy(xpath="//h1[.='Edit coupon']/../following-sibling::div//input[@formcontrolname='minimum_transaction_amount']")private WebElement MinimumTransactionAmountEdt;
    
    @FindBy(xpath="//h1[.='Edit coupon']/../following-sibling::div//textarea[@formcontrolname='description']")private WebElement DescriptionEdt;
    
    @FindBy(xpath="//h1[.='Edit coupon']/../following-sibling::div//button[.='Update']")private WebElement UpdateBtn;
    
	//Rule-2:Create a constructor to initilise these elements
    
	public Coupons_EditCouponsPage(WebDriver driver)
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



	public WebElement getDescriptionEdt() {
		return DescriptionEdt;
	}



	public WebElement getUpdateBtn() {
		return UpdateBtn;
	}
	
	
	// Rule-4 :- Create Business Library
    
	public void editingCoupon(String EditCouponAmount, String EditFromDate, String EditToDate, String EditMinimumTransactionAmount, String EditDescription) throws Exception
	{
		Thread.sleep(2000);
		CouponAmountEdt.clear();
		Thread.sleep(2000);
		CouponAmountEdt.sendKeys(EditCouponAmount);
		Thread.sleep(2000);
		FromDateEdt.clear();
		Thread.sleep(2000);
		FromDateEdt.sendKeys(EditFromDate);
		Thread.sleep(2000);
		ToDateEdt.clear();
		Thread.sleep(2000);
		ToDateEdt.sendKeys(EditToDate);
		Thread.sleep(2000);
		MinimumTransactionAmountEdt.clear();
		Thread.sleep(2000);
		MinimumTransactionAmountEdt.sendKeys(EditMinimumTransactionAmount);
		Thread.sleep(2000);
		DescriptionEdt.clear();
		Thread.sleep(2000);
		DescriptionEdt.sendKeys(EditDescription);
		Thread.sleep(2000);
		UpdateBtn.click();
	}
}
