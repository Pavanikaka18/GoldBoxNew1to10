package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ecommerce_EcommerceOrders_FilterPage {

	    //Rule-1 :- Find Web-Elements using FindBy Annotations
	    
		@FindBy(xpath="//input[@placeholder='Start date']")private WebElement StartDateEdt;
		
	    @FindBy(xpath="//input[@placeholder='End date']")private WebElement EndDateEdt;
	    
	    @FindBy(xpath="//span[.='Select Order status']")private WebElement SelectOrderStatusDrpDwn;
	    
	    @FindBy(xpath="//input[@placeholder='Mobile number']")private WebElement MobileNumberEdt;
	    
	    @FindBy(xpath="//button[@type='submit']")private WebElement SearchBtn;
	    
	    @FindBy(xpath="//button[@type='reset']")private WebElement ResetBtn;
		
	    @FindBy(xpath= "//a[@class='btn btn-filter setclose']")private WebElement CloseFilterPageBtn;
	  
		//Rule-2:Create a constructor to initilise these elements
	    
		public Ecommerce_EcommerceOrders_FilterPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}


		//Rule-3 :- Provide getters to access these variables
	    
		public WebElement getStartDateEdt() {
			return StartDateEdt;
		}


		public WebElement getEndDateEdt() {
			return EndDateEdt;
		}


		public WebElement getSelectOrderStatusDrpDwn() {
			return SelectOrderStatusDrpDwn;
		}


		public WebElement getMobileNumberEdt() {
			return MobileNumberEdt;
		}


		public WebElement getSearchBtn() {
			return SearchBtn;
		}


		public WebElement getResetBtn() {
			return ResetBtn;
		}
	    
		//Rule-4 :- Create Business Library
        
		public void searchDateWiseInFilter(String StartDate, String EndDate) throws Exception
		{
			Thread.sleep(1000);
			StartDateEdt.sendKeys(StartDate);
			Thread.sleep(1000);
		    EndDateEdt.sendKeys(EndDate);
			Thread.sleep(1000);
			SearchBtn.click();
			Thread.sleep(1000);
			SearchBtn.click();
			Thread.sleep(1000);
			ResetBtn.click();
			Thread.sleep(2000);
		}
		
		public void searchDateStatusMobileNumberWiseInFilter(WebDriver driver, String StartDate, String EndDate, String MobileNumber) throws Exception
		{
			Thread.sleep(1000);
			StartDateEdt.sendKeys(StartDate);
			Thread.sleep(1000);
		    EndDateEdt.sendKeys(EndDate);
			Thread.sleep(1000);
			SearchBtn.click();
			Thread.sleep(1000);
			SelectOrderStatusDrpDwn.click();
			driver.findElement(By.xpath("//span[.='Order Accepted']")).click();
			Thread.sleep(1000);
			MobileNumberEdt.sendKeys(MobileNumber);
			Thread.sleep(1000);
			SearchBtn.click();
			Thread.sleep(1000);
			ResetBtn.click();
			Thread.sleep(2000);
		}
		
	
}
