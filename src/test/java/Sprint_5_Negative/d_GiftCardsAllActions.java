package Sprint_5_Negative;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import genericUtility.ExcelFileUtility;
import genericUtility.FMS_BaseClass;
import genericUtility.JavaUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;

@Listeners(genericUtility.ListnersImplementationClass.class)
public class d_GiftCardsAllActions extends FMS_BaseClass {

	ExcelFileUtility eUtil = new ExcelFileUtility();
	PropertyFileUtility pUtil = new PropertyFileUtility();
	WebDriverUtility wUtil = new WebDriverUtility();
	JavaUtility jUtil = new JavaUtility();
	
	@Test(groups = "Sprint-5",priority = 1)
	public void a_giftCardsAllActionsTest() throws Exception
	{
		String SearchValue = eUtil.readDataFromExcel("Sprint-5 Negative", 130, 1);
		String Amount = eUtil.readDataFromExcel("Sprint-5 Negative", 132, 1);
		String InvalidKey = eUtil.readDataFromExcel("Sprint-5 Negative", 133, 1);
		String Quantity = eUtil.readDataFromExcel("Sprint-5 Negative", 135, 1);
		String ValidKey = eUtil.readDataFromExcel("Sprint-5 Negative", 134, 1);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Gift Cards']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.='All Gift cards']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys(SearchValue);
		Thread.sleep(1000);
		WebElement AfterSearchResult = driver.findElement(By.xpath("//ul[@class='ngx-pagination responsive ng-star-inserted']"));
		System.out.println(AfterSearchResult);
		Thread.sleep(1000);
		if(AfterSearchResult.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "a_Searched Invalid Giftcard Error");
		}
		driver.findElement(By.xpath("//input[@placeholder='Search...']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Add Gift Card']")).click();
		Thread.sleep(1000);
		WebElement AddGiftCardPage = driver.findElement(By.xpath("//h1[.='Add Gift Card']"));
		Thread.sleep(1000);
		if(AddGiftCardPage.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "b_Add Giftcard Page Should Not Open Error");
		}
		
		WebElement AddBtn = driver.findElement(By.xpath("//button[.='Add']"));
		AddBtn.click();
		Thread.sleep(1000);
		WebElement AmountRequiredError = driver.findElement(By.xpath("(//div[.='Amount is required'])[1]"));
		Thread.sleep(1000);
		if(AmountRequiredError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "c_Adding Giftcard Without Giving Any Data Error");
		}
		Thread.sleep(1000);
		WebElement MerchantDrpDwnElement = driver.findElement(By.xpath("//select[@formcontrolname='merchant_id']"));
		Thread.sleep(1000);
		String MerchantDrpDwnValue = driver.findElement(By.xpath("//option[.='matrika']")).getText();
		Thread.sleep(1000);
		Select s = new Select(MerchantDrpDwnElement);
		s.selectByVisibleText(MerchantDrpDwnValue);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@formcontrolname='amount']")).sendKeys(Amount);
		Thread.sleep(1000);
		AddBtn.click();
		WebElement Error1 = driver.findElement(By.xpath("//div[.='Key is required']/div[@class='ng-star-inserted']"));
		if(Error1.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "d_Gift Card Adding Without Giving Key And Quantity Error");
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@formcontrolname='key']")).sendKeys(InvalidKey);
		Thread.sleep(1000);
		AddBtn.click();
		WebElement Error2 = driver.findElement(By.xpath("//div[.='Quantity is required']/div[@class='ng-star-inserted']"));
		if(Error2.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "e_Gift Card Adding Without Giving Quantity Error");
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@formcontrolname='quantity']")).sendKeys(Quantity);
		Thread.sleep(1000);
		AddBtn.click();
//		WebElement Error3 = driver.findElement(By.xpath("(//div[.=' Data added successfully '])[2]"));
		if(AddBtn.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "f_Gift Card Adding By Giving Invalid Key Error");
		}
		else 
		{
			System.out.println("Giftcard Added Successfully");
			 
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@formcontrolname='key']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@formcontrolname='key']")).sendKeys(ValidKey);
		Thread.sleep(1000);
		AddBtn.click();
//		WebElement SuccessMsg = driver.findElement(By.xpath("(//div[.=' Data added successfully '])[2]"));
//		if(SuccessMsg.isDisplayed())
//		{
//			wUtil.takeScreenShot(driver, "g_Gift Card Adding By Giving Valid Key Success");
//		}
//		else
//		{
//			System.out.println("Giftcard Not Added Successfully");
//		}
		try 
		{
			WebElement SerialNo = driver.findElement(By.xpath("//td[.='1']"));
			if(SerialNo.isDisplayed())
			{
				System.out.println("All Gift cards Displayed");
			}
		}
		catch (Exception e)
		{
			wUtil.takeScreenShot(driver, "g_All Giftcards Not Displayed In Giftcard Page Error");
		}
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[.='Buy Users'])[1]")).click();
		Thread.sleep(1000);
		WebElement GiftCardBuyUsersPage = driver.findElement(By.xpath("//h4[.='Gift card buy users']"));
		if(GiftCardBuyUsersPage.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "h_Gift Card Buy Users Page Should Not Open Error");
		}
		else
		{
			System.out.println("Gift Card Buy Users Page Is Not Opened");
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='Gift Cards']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.='All Gift cards']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[.='Gift Card Used Users'])[1]")).click();
		Thread.sleep(1000);
		WebElement GiftCardUsedUsersPage = driver.findElement(By.xpath("//h4[.='Gift card used users']"));
		if(GiftCardUsedUsersPage.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "i_Gift Card Used Users Page Should Not Open Error");
		}
		else 
		{
			System.out.println("Gift Card Used Users Page Is Not Displayed");
		}
		
		
		
		
	}
	
}
