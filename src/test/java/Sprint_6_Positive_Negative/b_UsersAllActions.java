package Sprint_6_Positive_Negative;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import genericUtility.ExcelFileUtility;
import genericUtility.FMS_BaseClass;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import objectRepository.AllUsers_ReferredUserListPage;
import objectRepository.DashboardPage;
import objectRepository.UpdateUserStatusPage;
import objectRepository.UsersPage;
import objectRepository.Users_UserKycPage;
import objectRepository.Users_UserKyc_AadharCardPage;
import objectRepository.Users_UserKyc_PanCardPage;
import objectRepository.Users_UserKyc_StatusDrpDwnPage;
import objectRepository.Users_UserList_AllUsersPage;
import objectRepository.Users_UserList_AllUsers_ParticularUserInfoPage;
import objectRepository.Users_UserList_AllUsers_ParticularUserInfo_AddGoldPage;

@Listeners(genericUtility.ListnersImplementationClass.class)
public class b_UsersAllActions extends FMS_BaseClass {

	WebDriverUtility wUtil = new WebDriverUtility();
	ExcelFileUtility eUtil = new ExcelFileUtility();
	JavaUtility jUtil = new JavaUtility();
	
	@Test
	public void userAllActionsTest() throws Exception
	{
		String UserListAllUserSearchValue = eUtil.readDataFromExcel("Sprint-6 Negative", 32, 1);
		String UserId = eUtil.readDataFromExcel("Sprint-6 Negative", 33, 1);
		String ReferredUserListSearchValue = eUtil.readDataFromExcel("Sprint-6 Negative", 34, 1);
		String AddGoldAmount = eUtil.readDataFromExcel("Sprint-6 Negative", 32, 3);
		String MobileNumber = eUtil.readDataFromExcel("Sprint-6 Negative", 33, 3);
		String Reason = eUtil.readDataFromExcel("Sprint-6 Negative", 35, 6);
		
		WebDriverUtility wu=new WebDriverUtility();
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getUsersDrpDwn().click();
		Thread.sleep(2000);
		UsersPage uPage = new UsersPage(driver);
		uPage.clickOnUserListLnk();
		Thread.sleep(2000);
		Users_UserList_AllUsersPage uulauPage = new Users_UserList_AllUsersPage(driver);
		uulauPage.getSearchEdt().sendKeys(UserListAllUserSearchValue);
		Thread.sleep(2000);
		uulauPage.clickOnReferredUserViewBtn(driver, UserId);
		Thread.sleep(3000);
		AllUsers_ReferredUserListPage aurulPage = new AllUsers_ReferredUserListPage(driver);
		aurulPage.getSearchEdt().sendKeys(ReferredUserListSearchValue);
		Thread.sleep(2000);
		uPage.clickOnUserListLnk();
		Thread.sleep(2000);
		uulauPage.clickOnActionsInfoBtn(driver, UserId);
		Thread.sleep(2000);
		Users_UserList_AllUsers_ParticularUserInfoPage uuapuiPage = new Users_UserList_AllUsers_ParticularUserInfoPage(driver);
		uuapuiPage.getTransactionsBtn().click();
		Thread.sleep(2000);
		uuapuiPage.getLoginLogsBtn().click();
		Thread.sleep(2000);
		uuapuiPage.getAddGoldBtn().click();
		Thread.sleep(2000);
		Users_UserList_AllUsers_ParticularUserInfo_AddGoldPage addGoldPage = new Users_UserList_AllUsers_ParticularUserInfo_AddGoldPage(driver);
		addGoldPage.addingGold(driver, AddGoldAmount, MobileNumber);
	    
		wu.waitUntilPageLoad(driver);
		
		uPage.getUserListLnk().click();
		uulauPage.clickOnActionsBootStrapBtn(driver, UserId);
		Thread.sleep(2000);
		UpdateUserStatusPage uusPage = new UpdateUserStatusPage(driver);
		uusPage.givingReason(Reason);
		Thread.sleep(5000);
	}
	
	
	@Test
	public void userKyc() throws Exception
	{
		Thread.sleep(2000);
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getUsersDrpDwn().click();
		Thread.sleep(2000);
		UsersPage uPage = new UsersPage(driver);
		uPage.clickOnUserKycLnk();
		Thread.sleep(2000);
		Users_UserKycPage uukPage = new Users_UserKycPage(driver);
		uukPage.getAadharImgViewBtn().click();
		Thread.sleep(2000);
		Users_UserKyc_AadharCardPage uuaPage = new Users_UserKyc_AadharCardPage(driver);
		uuaPage.getCloseBtn().click();
		Thread.sleep(2000);
		uukPage.getPanImgViewBtn().click();
		Thread.sleep(2000);
		Users_UserKyc_PanCardPage uupPage = new Users_UserKyc_PanCardPage(driver);
		uupPage.getCloseBtn().click();
		
		for(;;) 
		{
			try 
			{
				Thread.sleep(2000);
				uukPage.getStatusDrpDwn().click();
				break;
			} 
			catch (Exception e) 
			{
				Thread.sleep(2000);
				uukPage.getNextPageBtn().click();
			}
		}
		
		
		Thread.sleep(2000);
		Users_UserKyc_StatusDrpDwnPage uusdPage = new Users_UserKyc_StatusDrpDwnPage(driver);
		Thread.sleep(4000);
		uusdPage.getRejectedLnk().click();
		Thread.sleep(4000);
	}
	
}