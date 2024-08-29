package Sprint_9_Positive;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.ExcelFileUtility;
import genericUtility.FMS_BaseClass;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import objectRepository.DashboardPage;
import objectRepository.UsersPage;
import objectRepository.Users_PenaltyUsers;

@Listeners(genericUtility.ListnersImplementationClass.class)

public class PenaltyUsers extends FMS_BaseClass 
{

	WebDriverUtility wUtil = new WebDriverUtility();
	ExcelFileUtility eUtil = new ExcelFileUtility();
	JavaUtility jUtil = new JavaUtility();

	@Test
	public void PenaltyUsers() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		
		Thread.sleep(10000);
		
		String PenaltyUsersSearchEdt = eUtil.readDataFromExcel("Sprint 9", 12, 1);
		
		WebDriverUtility wu=new WebDriverUtility(); 
		Thread.sleep(4000);
		DashboardPage DBPage = new DashboardPage(driver);
		DBPage.getUsersDrpDwn().click();
		Thread.sleep(4000);
		UsersPage UPage = new UsersPage(driver);
		UPage.getPenaltyUsersLnk().click();
		Thread.sleep(4000);
		Users_PenaltyUsers UPUPage = new Users_PenaltyUsers(driver);
		Thread.sleep(4000);
		UPUPage.getPenaltyUsersSearchEdt().sendKeys(PenaltyUsersSearchEdt);
		Thread.sleep(4000);
		UPUPage.getPenaltyUsersSearchEdt().clear();
		Thread.sleep(4000);
		UPUPage.getPenaltyUsersFilterBtn().click();
		Thread.sleep(4000);
		UPUPage.getSelectSchemeLnk().click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[.='Gold Plus']")).click();
		Thread.sleep(4000);
		UPUPage.getFilterSearchBtn().click();
		Thread.sleep(4000);
		UPUPage.getFiltersRefreshBtn().click();
		Thread.sleep(4000);
		UPUPage.getFilterCloseBtn().click();
		Thread.sleep(4000);
		UPUPage.getPenaltyUsersInfoBtn().click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		
		
	}
}