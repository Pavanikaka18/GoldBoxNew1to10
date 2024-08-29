package Sprint_10_Positive;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import genericUtility.ExcelFileUtility;
import genericUtility.FMS_BaseClass;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import objectRepository.DashboardPage;
import objectRepository.ZScheme_SL_TenureInfoBtnPage;
import objectRepository.ZSchemes;
import objectRepository.ZSchemes_GPPIPPaymentPage;
import objectRepository.ZSchemes_GPPIPViewMorePage;
import objectRepository.ZSchemes_GoldPlusPlanInfoPage;
import objectRepository.ZSchemes_GoldPlusPlanUsersPage;
import objectRepository.ZSchemes_MGPInfoPage;
import objectRepository.ZSchemes_MGPPaymentPage;
import objectRepository.ZSchemes_MyGoldPlanUsersPage;
import objectRepository.ZSchemes_PhysicalGoldUsersPage;
import objectRepository.ZSchemes_SL_AddSchemePage;
import objectRepository.ZSchemes_SL_DescriptionViewBtn;
import objectRepository.ZSchemes_SL_EditSchemePage;
import objectRepository.ZSchemes_SchemesListPage;
import objectRepository.ZSchemes_Sl_AmountInfoBtnPage;

@Listeners(genericUtility.ListnersImplementationClass.class)

public class Schemes extends FMS_BaseClass
{

	WebDriverUtility wUtil = new WebDriverUtility();
	ExcelFileUtility eUtil = new ExcelFileUtility();
	JavaUtility jUtil = new JavaUtility();

	@Test
	public void SchemesUpdated() throws Exception 
	{
		
		// Add Scheme
		String AddSchemeName = eUtil.readDataFromExcel("Sprint 10", 3, 1);
		String SelectCountry = eUtil.readDataFromExcel("Sprint 10", 4, 1);
		String CalculationType = eUtil.readDataFromExcel("Sprint 10", 5, 1);
		String Description = eUtil.readDataFromExcel("Sprint 10", 6, 1);
		// edit Scheme
		String EditSchemeName = eUtil.readDataFromExcel("Sprint 10", 9, 1);
		String EditSelectCountry = eUtil.readDataFromExcel("Sprint 10", 10, 1);
		String EditCalculationType = eUtil.readDataFromExcel("Sprint 10", 11, 1);
		String EditDescription = eUtil.readDataFromExcel("Sprint 10", 12, 1);

		String EnterMonths = eUtil.readDataFromExcel("Sprint 10", 15, 1);
		
		String EnterAmount = eUtil.readDataFromExcel("Sprint 10", 18, 1);
		
		String SearchEdit = eUtil.readDataFromExcel("Sprint 10", 22, 1);
		String UpiNameEdt = eUtil.readDataFromExcel("Sprint 10", 23, 1);
		
		String PhoneNumberEdt = eUtil.readDataFromExcel("Sprint 10", 24, 1);

		Thread.sleep(10000);
	
		WebDriverUtility wu=new WebDriverUtility(); 
		Thread.sleep(4000);
		DashboardPage DBPage = new DashboardPage(driver);
		DBPage.getSchemesDrpDwn().click();
		Thread.sleep(2000);
		ZSchemes ZSPage = new ZSchemes(driver);		
		Thread.sleep(5000);
		
		ZSPage.getSchemeListLnk().click();
		Thread.sleep(2000);
		ZSchemes_SchemesListPage ZSSLPage = new ZSchemes_SchemesListPage(driver);
		Thread.sleep(2000);
		ZSSLPage.getAddSchemeBtn().click();
		Thread.sleep(2000);
		ZSchemes_SL_AddSchemePage ZSLADDSPage = new ZSchemes_SL_AddSchemePage(driver);
		Thread.sleep(2000);
		ZSLADDSPage.getSchemeNameEdt().sendKeys(AddSchemeName);
		Thread.sleep(2000);
		ZSLADDSPage.getCountryDrpDwn().sendKeys(SelectCountry);
		Thread.sleep(2000);
		ZSLADDSPage.getCalculationDrpDwn().sendKeys(CalculationType);
		Thread.sleep(2000);
		ZSLADDSPage.getDescriptionEdt().sendKeys(Description);
		Thread.sleep(2000);
		ZSLADDSPage.getAddBtn().click();
		Thread.sleep(5000);

		//ZSLADDSPage.getCloseBtn().click();
		//Thread.sleep(3000);

		Thread.sleep(2000);
		ZSSLPage.getSchemeListViewBtn().click();
		Thread.sleep(2000);
		ZSchemes_SL_DescriptionViewBtn ZSSLSVbtnPage = new ZSchemes_SL_DescriptionViewBtn(driver);
		Thread.sleep(2000);
		ZSSLSVbtnPage.getUnderstoodBtn().click();
		Thread.sleep(3000);

		Thread.sleep(2000);
		ZSSLPage.getTenureListInfoBtn().click();
		Thread.sleep(2000);
		ZScheme_SL_TenureInfoBtnPage ZSSLTIBPage = new ZScheme_SL_TenureInfoBtnPage(driver);
		Thread.sleep(2000);
		ZSSLTIBPage.getEnterMonthsEdt().sendKeys(EnterMonths);
		Thread.sleep(3000);
		ZSSLTIBPage.getAddBtn().click();
		Thread.sleep(3000);
		ZSSLTIBPage.getCloseBtn().click();
		Thread.sleep(3000);

		Thread.sleep(2000);
		ZSSLPage.getAmountListInfoBtn().click();
		Thread.sleep(3000);
		ZSchemes_Sl_AmountInfoBtnPage ZSSLAIBPage = new ZSchemes_Sl_AmountInfoBtnPage(driver);
		Thread.sleep(3000);
		ZSSLAIBPage.getEnterAmountEdt().sendKeys(EnterAmount);
		Thread.sleep(3000);
		ZSSLAIBPage.getAddBtn().click();
		Thread.sleep(2000);
				
		driver.navigate().refresh();

		Thread.sleep(2000);
		ZSSLPage.getSchemeListEditBtn().click();
		Thread.sleep(2000);
		ZSchemes_SL_EditSchemePage ZSSLESPage = new ZSchemes_SL_EditSchemePage(driver);
		Thread.sleep(3000);
		ZSSLESPage.getEditSchemeNameEdt().clear();
		Thread.sleep(3000);
		ZSSLESPage.getEditSchemeNameEdt().sendKeys(EditSchemeName);
		Thread.sleep(2000);
		ZSSLESPage.getEditCountryDrpDwn().sendKeys(EditSelectCountry);
		Thread.sleep(2000);
		ZSSLESPage.getEditCalculationDrpDwn().sendKeys(EditCalculationType);
		Thread.sleep(2000);
		ZSSLESPage.getEditDescriptionEdt().clear();
		Thread.sleep(2000);
		ZSSLESPage.getEditDescriptionEdt().sendKeys(EditDescription);
		Thread.sleep(2000);
		ZSSLESPage.getUpdateBtn().click();
		Thread.sleep(5000);

		// Gold Plus Plan

		Thread.sleep(5000);
		DBPage.getSchemesDrpDwn().click();
		Thread.sleep(2000);
		ZSPage.getGoldPlusPlanUsersLnk().click();
		Thread.sleep(2000);
		ZSchemes_GoldPlusPlanUsersPage ZSGPPUsersPage = new ZSchemes_GoldPlusPlanUsersPage(driver);
		Thread.sleep(2000);
		ZSGPPUsersPage.getGPPUSearchEdt().sendKeys(SearchEdit);
		Thread.sleep(2000);
		ZSGPPUsersPage.getGPPUSearchEdt().clear();
		Thread.sleep(2000);

		driver.navigate().refresh();

		Thread.sleep(2000);
		DBPage.getSchemesDrpDwn().click();
		Thread.sleep(5000);
		ZSPage.getGoldPlusPlanUsersLnk().click();
		Thread.sleep(3000);
		ZSGPPUsersPage.getGPPUInfoBtn().click();
		Thread.sleep(3000);

		Thread.sleep(3000);
		ZSchemes_GoldPlusPlanInfoPage ZSGPPInfoPage = new ZSchemes_GoldPlusPlanInfoPage(driver);
		Thread.sleep(2000);
		ZSGPPInfoPage.getGPPIPPayBtn().click();
		Thread.sleep(5000);
		ZSchemes_GPPIPPaymentPage zp=new ZSchemes_GPPIPPaymentPage(driver);
		Thread.sleep(3000);
		zp.ZSchemes_GoldPlusPlanInfoPage(driver);
		Thread.sleep(7000);

		driver.navigate().refresh();

		Thread.sleep(3000);
		ZSGPPInfoPage.getGPPIPViewMoreBtn().click();
		Thread.sleep(2000);
		ZSchemes_GPPIPViewMorePage ZSGPPViewMorePage = new ZSchemes_GPPIPViewMorePage(driver);
		Thread.sleep(2000);
		ZSGPPViewMorePage.getCloseBtn().click();
		Thread.sleep(2000);

		// My Gold Plan	
		
		Thread.sleep(2000);
		ZSPage.getMyGoldPlanUsersLnk().click();
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		ZSchemes_MyGoldPlanUsersPage ZSMGPUsersPage = new ZSchemes_MyGoldPlanUsersPage(driver);
		Thread.sleep(2000);
		ZSMGPUsersPage.getMyGoldPlanSearchEdt().sendKeys(SearchEdit);
		Thread.sleep(2000);
		ZSMGPUsersPage.getAllUsersBtn().click();
		Thread.sleep(2000);
		ZSMGPUsersPage.getDailyUsersBtn().click();
		Thread.sleep(2000);
		ZSMGPUsersPage.getWeeklyUsersBtn().click();
		Thread.sleep(2000);
		ZSMGPUsersPage.getMonthlyUsersBtn().click();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		ZSMGPUsersPage.getInfoBtn().click();
		Thread.sleep(2000);
		
		ZSchemes_MGPInfoPage ZSMGPInfoPage = new ZSchemes_MGPInfoPage(driver);
		Thread.sleep(2000);
		ZSMGPInfoPage.getInfoSearchEdt().sendKeys(SearchEdit);
		Thread.sleep(2000);
		ZSMGPInfoPage.getInfoSearchEdt().clear();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
	    wUtility = new WebDriverUtility();
		wUtility.scrollPageDown(5);

		Thread.sleep(2000);
		ZSMGPInfoPage.getInfoPayBtn().click();
		Thread.sleep(2000);
		
		ZSchemes_MGPPaymentPage ZSMGPPaymentPage = new ZSchemes_MGPPaymentPage(driver);
		ZSMGPPaymentPage.ZSchemes_GoldPlusPlanInfoPage(driver);
        Thread.sleep(7000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		ZSMGPInfoPage.getInfoViewMoreBtn().click();
		Thread.sleep(2000);
		ZSMGPInfoPage.getViewMoreCloseBtn().click();
		Thread.sleep(2000);
		
		// Physical Gold Users
		
		Thread.sleep(2000);
		ZSPage.getPhysicalGoldUsersLnk().click();
		Thread.sleep(2000);
		ZSchemes_PhysicalGoldUsersPage ZSPGUsersPage = new ZSchemes_PhysicalGoldUsersPage(driver);
		Thread.sleep(2000);
		ZSPGUsersPage.getPhysicalGoldUsersSearchEdt().sendKeys(SearchEdit);
		Thread.sleep(2000);
		
		
	}
	
}