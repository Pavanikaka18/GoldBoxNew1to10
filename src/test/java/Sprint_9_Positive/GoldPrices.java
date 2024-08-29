package Sprint_9_Positive;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.ExcelFileUtility;
import genericUtility.FMS_BaseClass;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import objectRepository.DashboardPage;
import objectRepository.GoldPricesPage;

@Listeners(genericUtility.ListnersImplementationClass.class)

public class GoldPrices extends FMS_BaseClass 
{

	WebDriverUtility wUtil = new WebDriverUtility();
	ExcelFileUtility eUtil = new ExcelFileUtility();
	JavaUtility jUtil = new JavaUtility();

	@Test
	public void GoldPrices() throws InterruptedException, IOException 
	{
		
		Thread.sleep(10000);
		
		String SearchEdt = eUtil.readDataFromExcel("Sprint 9", 2, 1);
		String EnterDate = eUtil.readDataFromExcel("Sprint 9", 6, 1);
		String StartTime = eUtil.readDataFromExcel("Sprint 9", 7, 1);
		String EndTime = eUtil.readDataFromExcel("Sprint 9", 8, 1);
	
		WebDriverUtility wu=new WebDriverUtility(); 
		Thread.sleep(4000);
		DashboardPage DBPage = new DashboardPage(driver);
		DBPage.getGoldPricesLnk().click();
		Thread.sleep(4000);
		GoldPricesPage GPPage = new GoldPricesPage(driver);
		
		GPPage.getGoldPricesSearchEdt().sendKeys(SearchEdt);
		Thread.sleep(4000);
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		GPPage.getGoldPricesFilterBtn().click();
		Thread.sleep(4000);
		GPPage.getGPEnterDateEdt().sendKeys(EnterDate);
		Thread.sleep(2000);
		GPPage.getGPStartTimeEdt().sendKeys(StartTime);
		Thread.sleep(2000);
		GPPage.getGPEndTimeEdt().sendKeys(EndTime);
		Thread.sleep(2000);
		GPPage.getGPSearchBtn().click();
		Thread.sleep(15000);
		GPPage.getGPRefreshBtn().click();
		Thread.sleep(4000);			
		
		Thread.sleep(2000);
		driver.navigate().refresh();

		Thread.sleep(3000);
		GPPage.getGoldPricesFilterBtn().click();
		Thread.sleep(4000);
		GPPage.getGPEnterDateEdt().sendKeys(EnterDate);
		Thread.sleep(2000);
		GPPage.getGPStartTimeEdt().sendKeys("10:00:00");
		Thread.sleep(2000);
		GPPage.getGPEndTimeEdt().sendKeys("11:00:00");
		Thread.sleep(2000);
		GPPage.getGPSearchBtn().click();
		Thread.sleep(15000);
		GPPage.getGPRefreshBtn().click();
		Thread.sleep(4000);	

		Thread.sleep(2000);
		driver.navigate().refresh();

		Thread.sleep(3000);
		GPPage.getGoldPricesFilterBtn().click();
		Thread.sleep(4000);
		GPPage.getGPEnterDateEdt().sendKeys("09-08-2024");
		Thread.sleep(2000);
		GPPage.getGPStartTimeEdt().sendKeys(StartTime);
		Thread.sleep(2000);
		GPPage.getGPEndTimeEdt().sendKeys(EndTime);
		Thread.sleep(2000);
		GPPage.getGPSearchBtn().click();
		Thread.sleep(15000);
		GPPage.getGPRefreshBtn().click();
		Thread.sleep(4000);	

		driver.close();
	}
	
	
}