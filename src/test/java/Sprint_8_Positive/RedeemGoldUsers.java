package Sprint_8_Positive;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.ExcelFileUtility;
import genericUtility.FMS_BaseClass;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import objectRepository.DashboardPage;
import objectRepository.RedeemPage;
import objectRepository.UsersPage;
import objectRepository.Redeem_ReddemGoldusers_FilterPage;
import objectRepository.Redeem_RedeemGoldUsersPage;
import objectRepository.Redeem_RedeemGold_RedeemGoldButtonPage;

@Listeners(genericUtility.ListnersImplementationClass.class)

public class RedeemGoldUsers extends FMS_BaseClass {
	
	WebDriverUtility wUtil = new WebDriverUtility();
	ExcelFileUtility eUtil = new ExcelFileUtility();
	JavaUtility jUtil = new JavaUtility();

	@Test
	public void RedeemGoldUsers() throws Exception
	{
		
		Thread.sleep(10000);
		
		String SearchFeild = eUtil.readDataFromExcel("Sprint 8", 1, 1);
		String EnterPaymentId = eUtil.readDataFromExcel("Sprint 8", 3, 1);
		String UploadGstNumber = eUtil.readDataFromExcel("Sprint 8", 4, 1);
		String ImagePaths = eUtil.readDataFromExcel("Sprint 8", 5, 1);
		String FromDate = eUtil.readDataFromExcel("Sprint 8", 7, 1);
		String EndDate = eUtil.readDataFromExcel("Sprint 8", 8, 1);
		String MobileNumber = eUtil.readDataFromExcel("Sprint 8", 9, 1);
		String TransactionId = eUtil.readDataFromExcel("Sprint 8", 10, 1);
		String TxnType = eUtil.readDataFromExcel("Sprint 8", 11, 1);

		
		Thread.sleep(5000);
		
		WebDriverUtility wu=new WebDriverUtility(); 
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getRedeemDrpDwn().click();
		Thread.sleep(2000);
		
		RedeemPage RPage = new RedeemPage(driver);
		RPage.getRedeemGoldUsersLnk().click();
		Redeem_RedeemGoldUsersPage RGUPage = new Redeem_RedeemGoldUsersPage(driver);
		RGUPage.getSearchEdt().sendKeys(SearchFeild);
		Thread.sleep(2000);
		RGUPage.getSearchEdt().clear();
		Thread.sleep(2000);
		RGUPage.getExportToExcelLnk().click();
		Thread.sleep(2000);
		RGUPage.getViewBtn().click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000); 
		
	    RGUPage.getReedemGoldBtn().click();
	    Thread.sleep(2000);
	    Redeem_RedeemGold_RedeemGoldButtonPage RGRGBPage = new Redeem_RedeemGold_RedeemGoldButtonPage(driver);
	    RGRGBPage.getCloseBtn().click();
        Thread.sleep(2000);

	    wUtility = new WebDriverUtility();
		wUtility.scrollPageUp(3);

		Thread.sleep(4000);
	    RGUPage.getFilterBtn().click();
	    Thread.sleep(2000);
	    Redeem_ReddemGoldusers_FilterPage RGUFPage = new Redeem_ReddemGoldusers_FilterPage(driver);
        Thread.sleep(3000); 
        RGUFPage.getTxnTypeDrpdwn().click();
        driver.findElement(By.xpath("(//span[.='Redeemed'])[1]")).click();
        Thread.sleep(3000);        
	    driver.navigate().refresh();
	     
		Thread.sleep(4000);
	    RGUPage.getFilterBtn().click();
        Thread.sleep(3000); 
        RGUFPage.getTxnTypeDrpdwn().click();
        driver.findElement(By.xpath("(//span[.='Redeem'])[2]")).click();
        Thread.sleep(3000);        
	    driver.navigate().refresh();
	     
	    wUtility = new WebDriverUtility();
		wUtility.scrollPageDown(3);

	    Thread.sleep(3000);
	    RGUPage.getNextBtn().click();
	    Thread.sleep(3000);
	    RGUPage.getPrevBtn().click();
	    Thread.sleep(3000);
	    
	    driver.navigate().refresh();

	    wUtility = new WebDriverUtility();
		wUtility.scrollPageUp(3);
		
	}

}
		
