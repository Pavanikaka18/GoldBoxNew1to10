package sprint_1_Positive;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import genericUtility.FMS_BaseClass;
import genericUtility.ExcelFileUtility;
import genericUtility.WebDriverUtility;
import objectRepository.DashboardPage;
import objectRepository.SchemesPage;

@Listeners(genericUtility.ListnersImplementationClass.class)
public class eSprint_1_VerifyingTheSubscribedUserAndPayingMonthlySchemePayment_Demo_FMS extends FMS_BaseClass {

	WebDriverUtility wUtil = new WebDriverUtility();
	ExcelFileUtility eUtil = new ExcelFileUtility();
	
	@Test(priority = 7, groups = "sprint-1")
	public void verifyingTheSubscribedUserAndPayingMonthlySchemePaymentTest() throws Exception, Exception
	{
//		We Have to change according to first transaction name
//		String UserName = eUtil.readDataFromExcel("Scheme",45, 1);
		String UserName = "revathi";
		
		Thread.sleep(10000);
		
		DashboardPage dPage = new DashboardPage(driver);
		
////		wUtil.waitForElementToBeClickable(driver, dPage.getTransactionsLnk());
//		
//		dPage.getTransactionsLnk().click();
//		
//		//Have to change from here
//		
//		String FirstElement = driver.findElement(By.xpath("//h4[.='All Transactions']/ancestor::div/following-sibling::div//th[.='S.No']/ancestor::thead/following-sibling::tbody//td[.='1']/following-sibling::td[.='"+UserName+"']")).getText();
//		
//		if(FirstElement.contains(UserName))
//		{
//			System.out.println("Pass");
//		}
//		else //h4[.='All Transactions']/ancestor::div/following-sibling::div//th[.='S.No']/ancestor::thead/following-sibling::tbody//td[.='1']/following-sibling::td[.='12 Months']
//		{
//			Assert.fail();
//		}
		
		wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
		dPage.getSchemesDrpDwn().click();
	    
		Thread.sleep(3000);
		
		SchemesPage sPage = new SchemesPage(driver);
		sPage.getSchemeUsersLnk().click();
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("Pavani");
		
		Thread.sleep(2000);
		
		WebElement Info = driver.findElement(By.xpath("(//h4[.='Scheme Users']/ancestor::div//th[.='Action']/ancestor::table//button[.=' Info '])[1]"));
		wUtil.waitForElementToBeClickable(driver, Info);
		Info.click();
		
		Thread.sleep(2000);
		
		wUtil.scrollPageDown(1);
		
		driver.findElement(By.xpath("//button[.=' View more ']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
		
		Thread.sleep(10000);
		
		// Paying monthly installment according to user name
		driver.findElement(By.xpath("(//th[.='Actions']/ancestor::table//button[.=' Pay '])[1]")).click();
		
		// Paying monthly installment according to user name
//		driver.findElement(By.xpath("(//h4[.='Scheme Installments of Pavani123']/ancestor::div/following-sibling::div//th[.='Actions']/ancestor::table//button[.=' Pay '])[1]")).click();
	    
		Thread.sleep(2000);
		
		WebElement Frame = driver.findElement(By.xpath("//iframe[@class='razorpay-checkout-frame']"));
		
		driver.switchTo().frame(Frame);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='contact']")).sendKeys("6309631698");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[.='Proceed']")).click();
		
		Thread.sleep(2000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[.='Netbanking']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[.='ICICI']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[.='Pay Now']")).click();
		
		Thread.sleep(2000);
		
        String ParentWin = driver.getWindowHandle();
		
		Set<String> ChildWins = driver.getWindowHandles();
		
		for(String ChildWin : ChildWins)
		{
			if(!ChildWin.equals(ParentWin))
			{
			    driver.switchTo().window(ChildWin);
			    driver.findElement(By.xpath("//button[.='Success']")).click();
			}
		}
		Thread.sleep(2000);
		
		driver.switchTo().window(ParentWin);
        
		wUtil.waitUntilAlertIsPresent(driver);
		
//		Assert.fail();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
	}
	
}
