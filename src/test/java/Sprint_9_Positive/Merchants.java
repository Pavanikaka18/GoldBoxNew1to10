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
import objectRepository.GiftCardsPage;
import objectRepository.GiftCards_AddMerchantsPage;
import objectRepository.GiftCards_MerchantsPage;

@Listeners(genericUtility.ListnersImplementationClass.class)

public class Merchants extends FMS_BaseClass 
{

	WebDriverUtility wUtil = new WebDriverUtility();
	ExcelFileUtility eUtil = new ExcelFileUtility();
	JavaUtility jUtil = new JavaUtility();
	
	@Test
	public void Merchants() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		Thread.sleep(10000);
		
		String MerchantsSearchEdt = eUtil.readDataFromExcel("Sprint 9", 16, 1);
		String MerchantNameEdt = eUtil.readDataFromExcel("Sprint 9", 20, 1);
		String MerchantJoinedDateEdt = eUtil.readDataFromExcel("Sprint 9", 21, 1);
		String MerchantEmailEdt = eUtil.readDataFromExcel("Sprint 9", 22, 1);
		String MerchantAddressEdt = eUtil.readDataFromExcel("Sprint 9", 23, 1);
		String MerchantsGcExpiryTimeEdt = eUtil.readDataFromExcel("Sprint 9", 24, 1);
		String MerchantsPhoneNumberEdt = eUtil.readDataFromExcel("Sprint 9", 25, 1);
		
		//
		
		String MerchantsEditMerchantsNameEdt = eUtil.readDataFromExcel("Sprint 9", 29, 1);		
		String MerchantEditJoinedDateEdt = eUtil.readDataFromExcel("Sprint 9", 30, 1);
		String MerchantEditEmailEdt = eUtil.readDataFromExcel("Sprint 9", 31, 1);
		String MerchantEditAddressEdt = eUtil.readDataFromExcel("Sprint 9", 32, 1);
		String MerchantEditGcExpiryTimeEdt = eUtil.readDataFromExcel("Sprint 9", 33, 1);
		String MerchantEditPhoneNumberEdt = eUtil.readDataFromExcel("Sprint 9", 34, 1);
		
	
		WebDriverUtility wu=new WebDriverUtility(); 
		Thread.sleep(4000);
		DashboardPage DBPage = new DashboardPage(driver);
		Thread.sleep(4000);
		DBPage.getGiftCardsDrpDwn().click();
		Thread.sleep(4000);
		GiftCardsPage GCPage = new GiftCardsPage(driver);
		GCPage.getMerchantsLnk().click();
		Thread.sleep(4000);
		GiftCards_MerchantsPage GCMPage = new GiftCards_MerchantsPage(driver);
		Thread.sleep(4000);
		GCMPage.getMerchantsSearchEdt().sendKeys(MerchantsSearchEdt);
		Thread.sleep(4000);
		GCMPage.getMerchantsSearchEdt().clear();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		GCMPage.getMerchantsAddMerchantsBtn().click();
		Thread.sleep(4000);
		GiftCards_AddMerchantsPage GCAMPage = new GiftCards_AddMerchantsPage(driver);
		Thread.sleep(4000);
		GCAMPage.getMerchantNameEdt().sendKeys(MerchantNameEdt);
		Thread.sleep(4000);
		GCAMPage.getMerchantJoinedDateEdt().sendKeys(MerchantJoinedDateEdt);
		Thread.sleep(4000);
		GCAMPage.getMerchantEmailEdt().sendKeys(MerchantEmailEdt);
		Thread.sleep(4000);
		GCAMPage.getMerchantAddressEdt().sendKeys(MerchantAddressEdt);
		Thread.sleep(4000);
		GCAMPage.getMerchantsGcExpiryTimeEdt().sendKeys(MerchantsGcExpiryTimeEdt);
		Thread.sleep(4000);
		GCAMPage.getMerchantsPhoneNumberEdt().sendKeys(MerchantsPhoneNumberEdt);
		Thread.sleep(4000);
		GCAMPage.getMerchantsCloseBtn().click();
		Thread.sleep(4000);
		GCMPage.getMerchantsNextPageBtn().click();
		Thread.sleep(4000);
		GCMPage.getMerchantsPrevPageBtn().click();
		Thread.sleep(4000);
		
		
	}

}
