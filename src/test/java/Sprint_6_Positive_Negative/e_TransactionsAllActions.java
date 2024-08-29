package Sprint_6_Positive_Negative;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import genericUtility.ExcelFileUtility;
import genericUtility.FMS_BaseClass;
import genericUtility.JavaUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import objectRepository.DashboardPage;
import objectRepository.TransactionsPage;
import objectRepository.TransactionsPage_FilterBtn;

@Listeners(genericUtility.ListnersImplementationClass.class)
public class e_TransactionsAllActions extends FMS_BaseClass {

		WebDriverUtility wUtility = new WebDriverUtility();
		JavaUtility jUtility = new JavaUtility();
		ExcelFileUtility eUtility = new ExcelFileUtility();
		PropertyFileUtility pUtility = new PropertyFileUtility();
		
		@Test
		public void TransactionsAllActionsTest()throws InterruptedException, IOException
		{
			String SearchValue = eUtility.readDataFromExcel("Sprint-6 Negative", 19, 1);
			String SearchValue1 = eUtility.readDataFromExcel("Sprint-6 Negative", 19, 2);
			String FromDate =  eUtility.readDataFromExcel("Sprint-6 Negative", 21, 1);
			String ExpireDate = eUtility.readDataFromExcel("Sprint-6 Negative", 22, 1);
			String MobileNumber = eUtility.readDataFromExcel("Sprint-6 Negative", 23, 1);
			String TransactionId = eUtility.readDataFromExcel("Sprint-6 Negative", 24, 1);
			String AFromDate =  eUtility.readDataFromExcel("Sprint-6 Negative", 25, 1);
			String AExpireDate = eUtility.readDataFromExcel("Sprint-6 Negative", 26, 1);
			String PastFromDate = eUtility.readDataFromExcel("Sprint-6 Negative", 28, 1);
			String PastExpireDate = eUtility.readDataFromExcel("Sprint-6 Negative", 29, 1);
			
			//1 Search Feild
			
			Thread.sleep(4000);
			DashboardPage dbPage = new DashboardPage(driver);
			dbPage.getTransactionsLnk().click();
			Thread.sleep(2000);
			TransactionsPage tpage = new TransactionsPage(driver);
			tpage.getSearchEdt().sendKeys(SearchValue);
			Thread.sleep(2000);
			tpage.getSearchEdt().clear();
			Thread.sleep(2000);
			tpage.getSearchEdt().sendKeys(SearchValue1);
			Thread.sleep(2000);
			WebElement TransactionNotFound = driver.findElement(By.xpath("//h5[.='No records found']"));
			String TransactionNotFoundMsg = TransactionNotFound.getText();
			if (TransactionNotFound.isDisplayed()) 
			{
				Thread.sleep(1000);
				wUtility.takeScreenShot(driver, "a_"+TransactionNotFoundMsg);
			} 
			else 
			{
				System.out.println("Transaction Displayed");
			}
			
			
			//2 Export To Excel
			
			Thread.sleep(4000);		
			driver.navigate().refresh();		
			Thread.sleep(2000);
			tpage.getExportToExcelBtn().click();
			Thread.sleep(2000);
			String ExportToexcel = driver.findElement(By.xpath("//div[@aria-label='Excel sheet downloaded']")).getText();
			wUtility.takeScreenShot(driver, "b_"+ExportToexcel);
			Thread.sleep(2000);
			
			//3 Next & Prev Button -- ShowAll CheckBox is not responding
			
//			Thread.sleep(4000);		
//			driver.navigate().refresh();		
//			Thread.sleep(3000);
//			tpage.getNextPageLnk().click();
//			Thread.sleep(2000);
//			tpage.getPreviousPageLnk();
//			Thread.sleep(2000);
			
			//4 Filter Page --- FromDate
			
			Thread.sleep(4000);		
			driver.navigate().refresh();		
			Thread.sleep(2000);
			tpage.getFilterBtn().click();
			Thread.sleep(2000);
			TransactionsPage_FilterBtn tfPage = new TransactionsPage_FilterBtn(driver);
			tfPage.getFromDateEdt().sendKeys(FromDate);
			Thread.sleep(2000);
			tfPage.getSearchBtn().click();
			Thread.sleep(2000);
			String FromDateOnly = driver.findElement(By.xpath("(//div[contains(.,' transactions filtered ')])[2]")).getText();
			wUtility.takeScreenShot(driver, "c_"+FromDateOnly);
			Thread.sleep(2000);
		
			//5 ToDate
			
			Thread.sleep(4000);
			driver.navigate().refresh();		
			Thread.sleep(2000);
			tpage.getFilterBtn().click();
			Thread.sleep(2000);
			tfPage.getExpireDtaeEdt().sendKeys(ExpireDate);
			Thread.sleep(2000);
			tfPage.getSearchBtn().click();
			Thread.sleep(2000);
			String ExpireDateOnly = driver.findElement(By.xpath("(//div[contains(.,' transactions filtered ')])[2]")).getText();
			wUtility.takeScreenShot(driver, "d_"+ExpireDateOnly);
			Thread.sleep(2000);
			
			//6 SelectTxnType 
			
			Thread.sleep(4000);
			driver.navigate().refresh();		
			Thread.sleep(2000);
			tpage.getFilterBtn().click();
			Thread.sleep(2000);
			tfPage.getFromDateEdt().sendKeys(FromDate);
			Thread.sleep(2000);
			tfPage.getExpireDtaeEdt().sendKeys(ExpireDate);
			Thread.sleep(2000);
			tfPage.getSelectTxnTypeDrpDwn().click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[.='Promotion']")).click();
			Thread.sleep(2000);
			tfPage.getSearchBtn().click();
			Thread.sleep(2000);
			String TxnType = driver.findElement(By.xpath("//div[@aria-label='No results found']")).getText();
			wUtility.takeScreenShot(driver, "e_"+TxnType);
			Thread.sleep(2000);
			
			//7 Debict Type
			
			Thread.sleep(4000);
			driver.navigate().refresh();		
			Thread.sleep(2000);
			tpage.getFilterBtn().click();
			Thread.sleep(2000);
			tfPage.getFromDateEdt().sendKeys(FromDate);
			Thread.sleep(2000);
			tfPage.getExpireDtaeEdt().sendKeys(ExpireDate);
			Thread.sleep(2000);
			tfPage.getSelectTxnTypeDrpDwn().click();
			Thread.sleep(2000);
//			driver.findElement(By.xpath("//span[.='Promotion']")).click();
//			Thread.sleep(3000);
//			tfPage.getSelectTypeDrpDwn().click();
//			Thread.sleep(2000);
//			
          	driver.findElement( By.xpath("(//span[.='Withdraw'])")).click();
			Thread.sleep(2000);
			tfPage.getSearchBtn().click();
			Thread.sleep(2000);
			String DebictType = driver.findElement(By.xpath("//div[@aria-label='No results found']")).getText();
			wUtility.takeScreenShot(driver, "f_"+DebictType);
			Thread.sleep(2000);
		
		    //8 Credict Type
			
			Thread.sleep(4000);
			driver.navigate().refresh();		
			Thread.sleep(2000);
			tpage.getFilterBtn().click();
			Thread.sleep(2000);
			tfPage.getFromDateEdt().sendKeys(FromDate);
			Thread.sleep(2000);
			tfPage.getExpireDtaeEdt().sendKeys(ExpireDate);
			Thread.sleep(2000);
			tfPage.getSelectTxnTypeDrpDwn().click();
			Thread.sleep(2000);
//			driver.findElement(By.xpath("//span[.='Transfer']")).click();
//			Thread.sleep(2000);
//			tfPage.getSelectTypeDrpDwn().click();
//			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[.='Convert']")).click();
			Thread.sleep(2000);
			tfPage.getSearchBtn().click();
			Thread.sleep(2000);
			String CredictType = driver.findElement(By.xpath("//div[@aria-label='No results found']")).getText();
			wUtility.takeScreenShot(driver, "g_"+CredictType);
			Thread.sleep(2000);
		
		    //9 No Details -- Search Button
		
			Thread.sleep(4000);
			driver.navigate().refresh();		
			Thread.sleep(2000);
			tpage.getFilterBtn().click();
			Thread.sleep(2000);
			tfPage.getSearchBtn().click();
			Thread.sleep(2000);
			String SearchButton = driver.findElement(By.xpath("(//div[contains(.,' transactions filtered ')])[2]")).getText();
			wUtility.takeScreenShot(driver, "h_"+SearchButton);
			Thread.sleep(2000);
			
			//10 Past Date -- Future Date
			
			Thread.sleep(4000);
			driver.navigate().refresh();		
			Thread.sleep(2000);
			tpage.getFilterBtn().click();
			Thread.sleep(2000);
			tfPage.getFromDateEdt().sendKeys(PastFromDate);
			Thread.sleep(2000);
			tfPage.getExpireDtaeEdt().sendKeys(PastExpireDate);
			Thread.sleep(2000);
			tfPage.getSearchBtn().click();
			Thread.sleep(2000);
			String PastDates = driver.findElement(By.xpath("//div[@aria-label='No results found']")).getText();
			wUtility.takeScreenShot(driver, "i_"+PastDates);
			Thread.sleep(2000);
			
			//11 All Actions
			
			Thread.sleep(4000);
			driver.navigate().refresh();		
			Thread.sleep(2000);
			tpage.getFilterBtn().click();
			Thread.sleep(2000);
			tfPage.getFromDateEdt().sendKeys(AFromDate);
			Thread.sleep(2000);
			tfPage.getExpireDtaeEdt().sendKeys(AExpireDate);
			Thread.sleep(2000);
			tfPage.getSelectTxnTypeDrpDwn().click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[.='Buy']")).click();
			Thread.sleep(2000);
//			tfPage.getSelectTypeDrpDwn().click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//span[.='Credict']")).click();
//			Thread.sleep(2000);
			tfPage.getMobileNumberEdt().sendKeys(MobileNumber);
			Thread.sleep(2000);
			tfPage.getTransactionIdEdt().sendKeys(TransactionId);
			Thread.sleep(2000);
			tfPage.getSearchBtn().click();  // //div[@aria-label='1 transactions filtered']
			Thread.sleep(2000);
			String Msg = driver.findElement(By.xpath("(//div[.=' No results found '])[2]")).getText();
			wUtility.takeScreenShot(driver, "j_"+Msg);
			Thread.sleep(5000);
		
			
		}
	
}
