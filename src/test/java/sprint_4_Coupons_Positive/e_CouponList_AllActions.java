package sprint_4_Coupons_Positive;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import genericUtility.FMS_BaseClass;
import genericUtility.JavaUtility;
import objectRepository.CouponsPage;
import objectRepository.Coupons_AddCouponsPage;
import objectRepository.Coupons_CouponUserDetailsPage;
import objectRepository.Coupons_CouponsDescriptionPage;
import objectRepository.Coupons_CouponsListPage;
import objectRepository.Coupons_EditCouponsPage;
import objectRepository.DashboardPage;

@Listeners(genericUtility.ListnersImplementationClass.class)
public class e_CouponList_AllActions extends FMS_BaseClass {

	JavaUtility jUtil = new JavaUtility();
	String CouponAmount = "300", FromDate = "25-07-2024", ToDate = "30-07-2024", MinimumTransactionAmount = "10000", Description = "Month End Sale";
	String FrommDate = jUtil.getSystemDate();
	String EditCouponAmount = "400", EditFromDate = "25-07-2024", EditToDate = "25-08-2024", EditMinimumTransactionAmount = "20000", EditDescription = "End Sale";
	
	@Test
	public void couponListAllActionsTest() throws Exception
	{
	    DashboardPage dbPage = new DashboardPage(driver);
	    dbPage.getCouponsDrpDwn().click();
	    
	    Thread.sleep(2000);
	    CouponsPage cPage = new CouponsPage(driver);
	    cPage.getCouponListLnk().click();
	    
	    Thread.sleep(2000);
	    Coupons_CouponsListPage cclPage = new Coupons_CouponsListPage(driver);
	    cclPage.getSearchEdt().sendKeys("!@#$%^&abc");
	    
	    Thread.sleep(2000);
	    cclPage.noRecordsErrorPositiveHandling();
	    
	    Thread.sleep(2000);
	    cclPage.getSearchEdt().clear();
	    
	    Thread.sleep(2000);
	    cclPage.getAddCouponsBtn().click();
	    
	    Thread.sleep(2000);
	    Coupons_AddCouponsPage cacPage = new Coupons_AddCouponsPage(driver);
	    cacPage.addingCoupon(CouponAmount, FromDate, ToDate, MinimumTransactionAmount, Description);
	    
	    Thread.sleep(2000);
	    driver.navigate().refresh();
	    
	    Thread.sleep(2000);
	    cclPage.getAddCouponsBtn().click();
	    
	    Thread.sleep(2000);
	    cacPage.getCloseBtn().click();
	    
	    Thread.sleep(2000);
	    cclPage.getCouponDescriptionViewBtn().click();
	    
	    Thread.sleep(2000);
	    Coupons_CouponsDescriptionPage ccdPage = new Coupons_CouponsDescriptionPage(driver);
	    ccdPage.getCloseBtn().click();
	    
	    Thread.sleep(2000);
	    cclPage.getActionsUsedUsersBtn().click();
	    
	    Thread.sleep(2000);
	    Coupons_CouponUserDetailsPage ccudPage = new Coupons_CouponUserDetailsPage(driver);
	    ccudPage.getSearchEdt().sendKeys("Abc");	    
	    
	    Thread.sleep(2000);
	    ccudPage.handlindNoRecordsFindErrorAndClearingDataInSearchField();
	    
	    Thread.sleep(2000);
	    dbPage.getCouponsDrpDwn().click();
	    
	    Thread.sleep(2000);
	    cPage.getCouponListLnk().click();
	    
	    Thread.sleep(2000);
	    cclPage.getActionsEditBtn().click();
	    
	    Thread.sleep(2000);
	    Coupons_EditCouponsPage cecPage = new Coupons_EditCouponsPage(driver);
	    
	    Thread.sleep(2000);
	    cecPage.editingCoupon(EditCouponAmount, EditFromDate, EditToDate, EditMinimumTransactionAmount, EditDescription);
	    
	    Thread.sleep(2000);
	    cclPage.getActionsEditBtn().click();
	    
	    Thread.sleep(2000);
	    cecPage.getCloseBtn().click();
	    
	    Thread.sleep(2000);
	    cclPage.clickOnBootStrapBtn();
	    
	    
	}
	
}
