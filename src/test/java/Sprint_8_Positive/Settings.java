package Sprint_8_Positive;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.ExcelFileUtility;
import genericUtility.FMS_BaseClass;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import objectRepository.DashboardPage;
import objectRepository.SettingsPage;
import objectRepository.Settings_AddFmsUserPage;
import objectRepository.Settings_AddPaymentMethodPage;
import objectRepository.Settings_EditFmsUsersPage;
import objectRepository.Settings_FmsUsersPage;
import objectRepository.Settings_OtpListPage;
import objectRepository.Settings_PaymentManagementPage;
import objectRepository.Settings_Roles_AddRolePage;
import objectRepository.Settings_Roles_RolesListPage;
import objectRepository.Settings_Roles_UpdateRolePage;

@Listeners(genericUtility.ListnersImplementationClass.class)

public class Settings extends FMS_BaseClass{
	
	WebDriverUtility wUtil = new WebDriverUtility();
	ExcelFileUtility eUtil = new ExcelFileUtility();
	JavaUtility jUtil = new JavaUtility();
	
  @Test
   public void SettingsOtpList() throws Exception 
   {
	   
	    String SearchFeild = eUtil.readDataFromExcel("Sprint 8", 14, 1);
	    String Title = eUtil.readDataFromExcel("Sprint 8", 17, 1);
	    String SearchInputFeild = eUtil.readDataFromExcel("Sprint 8", 20, 1);
		String RoleTitle = eUtil.readDataFromExcel("Sprint 8", 21, 1);
		String RoleTitleEdit = eUtil.readDataFromExcel("Sprint 8", 22, 1);
	    String FmsSearchFeild = eUtil.readDataFromExcel("Sprint 8", 25, 1);
	    String AddFullName = eUtil.readDataFromExcel("Sprint 8", 26, 1);
	    String AddPhonenUmber = eUtil.readDataFromExcel("Sprint 8", 27, 1);
		String AddEmail = eUtil.readDataFromExcel("Sprint 8", 28, 1);
		String AddPassword = eUtil.readDataFromExcel("Sprint 8", 29, 1);
		   //String Role = eUtil.readDataFromExcel("Sprint 8", 30, 1);
	    String EditFullName = eUtil.readDataFromExcel("Sprint 8", 33, 1);
		String EditPhonenUmber = eUtil.readDataFromExcel("Sprint 8", 34, 1);
		String EditEmail = eUtil.readDataFromExcel("Sprint 8", 35, 1);
		String EditPassword = eUtil.readDataFromExcel("Sprint 8", 36, 1);
	
		
		// Otp List

		Thread.sleep(5000);
		WebDriverUtility wu=new WebDriverUtility(); 
		DashboardPage dbPage = new DashboardPage(driver);
		Thread.sleep(2000);
		dbPage.getSettingsDrpDwn().click();
		Thread.sleep(2000);
		SettingsPage SPage = new SettingsPage(driver);
		Thread.sleep(2000);
		SPage.getOtpListLnk().click();
		Thread.sleep(2000);		
		Settings_OtpListPage SOLPage = new Settings_OtpListPage(driver);
		Thread.sleep(2000);
		SOLPage.getSearchEdt().sendKeys(SearchFeild);
		Thread.sleep(2000);
		SOLPage.getSearchEdt().clear();
		Thread.sleep(1000);	
		driver.navigate().refresh();
		Thread.sleep(1000);
		SOLPage.getNextPageLnk().click();
		Thread.sleep(2000);
		SOLPage.getPreviousPageLnk().click();
		Thread.sleep(5000);
		
		// App Management
		
		Thread.sleep(4000);
		dbPage.getSettingsDrpDwn().click();
		Thread.sleep(4000);
		SPage.getAppManagementLnk().click();
		Thread.sleep(4000);
		
		// Payment Management
		
		Thread.sleep(4000);
		SPage.getPaymentManagementLnk().click();
		Thread.sleep(4000);
		Settings_PaymentManagementPage SPMPage = new Settings_PaymentManagementPage(driver);
		Thread.sleep(2000);
		SPMPage.getAddPaymentMethodBtn().click();
		Thread.sleep(2000);
		Settings_AddPaymentMethodPage SAPMPage = new Settings_AddPaymentMethodPage(driver);
		Thread.sleep(2000);
		SAPMPage.getEnterTitleEdt().sendKeys(Title);
		Thread.sleep(2000);
		SAPMPage.getBootstrapBtn().click();
		Thread.sleep(2000);
		SAPMPage.getAddBtn().click();	
		
		WebElement Exixts = driver.findElement(By.xpath("//div[@aria-label='Title is Already Existed, Please Enter Another Title']"));
		Thread.sleep(2000);
		if (Exixts.isDisplayed()) 
		{
		   System.out.println("Already Exists");
		} 
		else 
		{
            System.out.println("Add Payment Method");
		}
		Thread.sleep(2000);
		SAPMPage.getCloseBtn().click();
		Thread.sleep(3000);
		SPMPage.getPaymentStatusBootStrapBtn().click();
		Thread.sleep(4000);

		// Roles
		
		Thread.sleep(4000);
		SPage.getRolesLnk().click();
		Thread.sleep(2000);
		Settings_Roles_RolesListPage SRLPage = new Settings_Roles_RolesListPage(driver);
		SRLPage.getSearchEdt().sendKeys(SearchInputFeild);
		Thread.sleep(2000);
		SRLPage.getSearchEdt().clear();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		SRLPage.getAddRoleBtn().click();
		Thread.sleep(2000);
		Settings_Roles_AddRolePage SARPage = new Settings_Roles_AddRolePage(driver);
		Thread.sleep(2000);
		SARPage.getTitleEdt().sendKeys(RoleTitle);
		Thread.sleep(5000);
		SARPage.getAddBtn().click();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		SRLPage.getNextPageBtn().click();
		Thread.sleep(5000);
		SRLPage.getEditBtn().click();
		Thread.sleep(2000);
		Settings_Roles_UpdateRolePage SERPage = new Settings_Roles_UpdateRolePage(driver);
		Thread.sleep(2000);
		SERPage.getTitleEdt().clear();
		Thread.sleep(2000);
		SERPage.getTitleEdt().sendKeys(RoleTitleEdit);
		Thread.sleep(2000);
		SERPage.getUpdateBtn().click();
		Thread.sleep(2000);
		SRLPage.getDeleteBtn().click();
		Thread.sleep(2000);	
		SRLPage.getYesDeleteBtn().click();
		Thread.sleep(2000);	
		SRLPage.getPreviousPageBtn().click();
		Thread.sleep(5000);
		
		// Fms Users
		
		Thread.sleep(5000);
		
	    wUtility = new WebDriverUtility();
		wUtility.scrollPageUp(5);
		
		dbPage.getSettingsDrpDwn().click();
		Thread.sleep(4000);
		SPage.getFmsUsersLnk().click();
		Thread.sleep(2000);
		Settings_FmsUsersPage SFUPage = new Settings_FmsUsersPage(driver);
		Thread.sleep(2000);
		SFUPage.getSearchEdt().sendKeys(SearchFeild);
		Thread.sleep(2000);
		SFUPage.getSearchEdt().clear();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		SFUPage.getAddFmsUsersBtn().click();
		Thread.sleep(2000);
		Settings_AddFmsUserPage SAFUPage = new Settings_AddFmsUserPage(driver);
		Thread.sleep(2000);
		SAFUPage.getEnterNameEdt().sendKeys(AddFullName);
		Thread.sleep(2000);
		SAFUPage.getMobilenUmberEdt().sendKeys(AddPhonenUmber);
		Thread.sleep(2000);
		SAFUPage.getMailEdt().sendKeys(AddEmail);
		Thread.sleep(2000);
		SAFUPage.getPasswordEdt().sendKeys(AddPassword);
		Thread.sleep(3000);
		SAFUPage.Select(driver);
		Thread.sleep(2000);
		SAFUPage.getAddBtn().click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		SFUPage.getEditBtn().click();
		Thread.sleep(2000);		
		Settings_EditFmsUsersPage SEFUPage = new Settings_EditFmsUsersPage(driver);
		SEFUPage.getEnterFullNameEdt().clear();
		Thread.sleep(2000);
		SEFUPage.getEnterFullNameEdt().sendKeys(EditFullName);
		Thread.sleep(2000);
		SEFUPage.getMobileNumberEdt().clear();
		Thread.sleep(2000);
		SEFUPage.getMobileNumberEdt().sendKeys(EditPhonenUmber);
		Thread.sleep(2000);
		SEFUPage.getEmailEdt().clear();
		Thread.sleep(2000);
		SEFUPage.getEmailEdt().sendKeys(EditEmail);
		Thread.sleep(2000);
		SEFUPage.getPasswordEdt().clear();
		Thread.sleep(2000);
		SEFUPage.getPasswordEdt().sendKeys(EditPassword);
		Thread.sleep(2000);
		SEFUPage.getUpdateBtn().click();
		Thread.sleep(2000);		
		driver.navigate().refresh();		
		Thread.sleep(2000);
		SFUPage.getDeleteBtn().click();		
		Thread.sleep(2000);	
		SFUPage.getYesDeleteBtn().click();
		Thread.sleep(2000);	
		
		
   }
}