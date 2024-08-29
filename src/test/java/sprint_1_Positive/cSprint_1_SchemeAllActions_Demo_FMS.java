package sprint_1_Positive;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import genericUtility.FMS_BaseClass;
import genericUtility.ExcelFileUtility;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import objectRepository.DashboardPage;
import objectRepository.Scheme_SchemeList_DescriptionPage;
import objectRepository.Scheme_SchemesList_ActionInfoBtn_SchemeInfoPage;
import objectRepository.Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFaqPage;
import objectRepository.Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFeaturePage;
import objectRepository.Scheme_SchemesList_EditFaqPage;
import objectRepository.Scheme_SchemesList_EditFeaturePage;
import objectRepository.Scheme_SchemesList_ManageTenureAmountPage;
import objectRepository.Scheme_SchemesList_ManageTenuresPage;
import objectRepository.SchemesPage;
import objectRepository.Schemes_SchemeListPage;
import objectRepository.Schemes_SchemeList_AddSchemePage;

@Listeners(genericUtility.ListnersImplementationClass.class)
public class cSprint_1_SchemeAllActions_Demo_FMS extends FMS_BaseClass {
	
	WebDriverUtility wUtil = new WebDriverUtility();
	JavaUtility jUtil = new JavaUtility();
	ExcelFileUtility eUtil = new ExcelFileUtility();
	
	@Test(priority = 3, groups = "sprint-1")
	public void schemeCreationTest() throws Exception
	{
		String Months = eUtil.readDataFromExcel("Scheme", 29, 1);
		String Amount = eUtil.readDataFromExcel("Scheme", 30, 1);
		String Content = eUtil.readDataFromExcel("Scheme", 31, 1);
		String TermsAndConditions = eUtil.readDataFromExcel("Scheme", 32, 1);
		String Feature = eUtil.readDataFromExcel("Scheme", 33, 1);
		String Explanation = eUtil.readDataFromExcel("Scheme", 34, 1);
		String FaqQuestion = eUtil.readDataFromExcel("Scheme", 35, 1);
		String FaqAnswer = eUtil.readDataFromExcel("Scheme", 36, 1);
		String EditFeature = eUtil.readDataFromExcel("Scheme", 37, 1);
		String EditExplanation = eUtil.readDataFromExcel("Scheme", 38, 1);
		String EditFaqQuestion = eUtil.readDataFromExcel("Scheme", 39, 1);
		String EditFaqAnswer = eUtil.readDataFromExcel("Scheme", 40, 1);
		String SchemeTitle = eUtil.readDataFromExcel("Scheme", 41, 1)+jUtil.getRandomNum();
		String SchemeDescription = eUtil.readDataFromExcel("Scheme", 42, 1)+jUtil.getRandomNum();
		
		DashboardPage dPage = new DashboardPage(driver);
		wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
		dPage.getSchemesDrpDwn().click();
	    
		Thread.sleep(3000);
		
		SchemesPage sPage = new SchemesPage(driver);
		sPage.getSchemesListLnk().click();
		
		Thread.sleep(3000);
		
		Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
		sslPage.getAddSchemeBtn().click();
		
		Thread.sleep(3000);
		
		Schemes_SchemeList_AddSchemePage ssaPage = new Schemes_SchemeList_AddSchemePage(driver);
		ssaPage.createScheme(SchemeTitle, SchemeDescription);
		
		Thread.sleep(3000);
		
		WebElement AllEle = driver.findElement(By.xpath("((//table[@class='table datanew table-striped'])[1]/thead/following-sibling::tbody/tr/td[contains(.,'')])[1]"));
		String Element = AllEle.getText();
		
		Assert.assertEquals(SchemeTitle, Element);
		
		Thread.sleep(2000);
		
		sslPage.clickOnSchemeDescriptionViewBtn(driver, SchemeTitle);
		
		Thread.sleep(2000);
		
		Scheme_SchemeList_DescriptionPage ssdPage = new Scheme_SchemeList_DescriptionPage(driver);
		ssdPage.clickOnUnderstandBtn();
		
		Thread.sleep(2000);
		
	    sslPage.clickOnSchemeTenureInfoBtn(driver, SchemeTitle);
		
	    Thread.sleep(2000);
	    
		Scheme_SchemesList_ManageTenuresPage ssmtPage = new Scheme_SchemesList_ManageTenuresPage(driver);
		ssmtPage.addingTenure(Months);
		Thread.sleep(2000);
		
		sslPage.clickOnSchemeTenureInfoBtn(driver, SchemeTitle);
		
		Thread.sleep(3000);
		sslPage.clickOnSchemeEnableDisableBtn(driver, SchemeTitle);
		Thread.sleep(3000);
		sslPage.clickOnSchemeEnableDisableBtn(driver, SchemeTitle);
		Thread.sleep(3000);
		
		ssmtPage.deleteTenure(driver, Months);
		Thread.sleep(3000);
		
		sslPage.clickOnSchemeTenureAmountInfoBtn(driver, SchemeTitle);
		Thread.sleep(2000);
		
		Scheme_SchemesList_ManageTenureAmountPage ssmtaPage = new Scheme_SchemesList_ManageTenureAmountPage(driver);
		ssmtaPage.addAmount(Amount);
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		sslPage.clickOnSchemeTenureAmountInfoBtn(driver, SchemeTitle);
		Thread.sleep(2000);
		
		ssmtaPage.tenureAmountEnablingAndDisabling(driver, Amount);
		Thread.sleep(2000);
		ssmtaPage.tenureAmountDeleting(driver, Amount);
		ssmtaPage.getCloseBtn().click();
		
		sslPage.clickOnActionInfoButton(driver, SchemeTitle);
		
		Scheme_SchemesList_ActionInfoBtn_SchemeInfoPage ssaiPage = new Scheme_SchemesList_ActionInfoBtn_SchemeInfoPage(driver);
		ssaiPage.addContent(Content);
		
		ssaiPage.addSchemeTermsAndConditions(driver, TermsAndConditions);
		
		ssaiPage.getAddFeatureBtn().click();
		
		Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFeaturePage ssasafPage = new Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFeaturePage(driver);
		ssasafPage.addFeature(Feature, Explanation);
	    
		Thread.sleep(2000);
		
		ssaiPage.clickOnEditFeatureBtn(driver, Feature);
		
		Thread.sleep(2000);
		
		Scheme_SchemesList_EditFeaturePage ssefPage = new Scheme_SchemesList_EditFeaturePage(driver);
		ssefPage.editFeature(EditFeature, EditExplanation);
		
		Thread.sleep(3000);
		
		ssaiPage.clickOnDeleteFeature(driver, EditFeature);
		
		ssaiPage.getAddFeatureBtn().click();
		
		ssasafPage.addFeature(Feature, Explanation);
		
		Thread.sleep(3000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(2000);
		
		ssaiPage.getAddFaqBtn().click();
		
		Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFaqPage ssasafaqPage = new Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFaqPage(driver);
		ssasafaqPage.addFaq(FaqQuestion, FaqAnswer);
	    
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(2000);
		
		ssaiPage.clickOnEditFaqBtn(driver, FaqQuestion);
		
		Scheme_SchemesList_EditFaqPage ssefaqPage = new Scheme_SchemesList_EditFaqPage(driver);
		ssefaqPage.editFaq(EditFaqQuestion, EditFaqAnswer);
		
		Thread.sleep(2000);
		
		ssaiPage.clickOnDeleteFaqBtn(driver, EditFaqQuestion);
		
		Thread.sleep(2000);
		
		ssaiPage.getAddFaqBtn().click();
		
		ssasafaqPage.addFaq(FaqQuestion, FaqAnswer);
		
		dPage.getSchemesDrpDwn().click();
		
		sPage.getSchemesListLnk().click();
		
		String FirstScheme = driver.findElement(By.xpath("(//th[.='Title']/../../following-sibling::tbody//td)[1]")).getText();
		Assert.assertEquals(SchemeTitle, FirstScheme);
		
		driver.findElement(By.xpath("(//th[.='Title']/../../following-sibling::tbody//td)[1]/..//button[.=' Edit ']/..//div[@class='mdc-switch__icons']")).click();
		
		driver.findElement(By.xpath("//span[.='Dashboard']")).click();
		
		
		
//		(//div[.=' Scheme Tenure Added Successfully '])[4]
		//div[@aria-label='Scheme Added Successfully']
		//div[@aria-label='Scheme Already Existed']
		//div[@aria-label='Scheme Tenure Details Updated Successfully']
		//div[@aria-label='Scheme Tenure Deleted Sucessfully']
		
		
	}
	

}
