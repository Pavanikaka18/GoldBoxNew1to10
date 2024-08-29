package sprint_4_Coupons_Positive;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.FMS_BaseClass;
import objectRepository.CouponsPage;
import objectRepository.Coupons_AddCouponsPage;
import objectRepository.Coupons_AdminCouponEditPage;
import objectRepository.Coupons_AdminCouponsPage;
import objectRepository.Coupons_CouponsDescriptionPage;
import objectRepository.DashboardPage;

@Listeners(genericUtility.ListnersImplementationClass.class)
public class d_AdminCoupons_AllActions extends FMS_BaseClass {

	@Test
	public void couponListAllActionsTest() throws Exception
	{
		String SearchValue = "Xyz";
		
		String CouponAmount = "2000", FromDate = "25-07-2024", ToDate = "25-08-2024", MinimumTransactionAmount = "20000", MobileNumber = "8686184458", Description = "Admin Coupon";
		String EditCouponAmount = "4000", EditFromDate = "25-07-2024", EditToDate = "30-08-2024", EditMinimumTransactionAmount = "200000", EditMobileNumber = "9848671412", EditDescription = "Coupon";
		
		Thread.sleep(2000);
	    DashboardPage dbPage = new DashboardPage(driver);
	    dbPage.getCouponsDrpDwn().click();
	    
	    Thread.sleep(2000);
	    CouponsPage cPage = new CouponsPage(driver);
	    cPage.getAdminCouponsLnk().click();
	    
	    Thread.sleep(2000);
	    Coupons_AdminCouponsPage cacPage = new Coupons_AdminCouponsPage(driver);
	    cacPage.searchingAndHandlingNoRecordsFoundError(SearchValue);
	    
	    Thread.sleep(2000);
	    cacPage.getSearchEdt().clear();
	    
	    Thread.sleep(2000);
	    cacPage.getAddAdminCouponBtn().click();
	    
	    Thread.sleep(2000);
	    Coupons_AddCouponsPage acPage = new Coupons_AddCouponsPage(driver);
	    acPage.addingAdminCoupon(CouponAmount, FromDate, ToDate, MinimumTransactionAmount, MobileNumber, Description);
	    
	    Thread.sleep(2000);
	    driver.navigate().refresh();
	    
	    Thread.sleep(2000);
	    cacPage.getAddAdminCouponBtn().click();
	    
	    Thread.sleep(2000);
	    acPage.getCloseBtn().click();
	    
	    Thread.sleep(2000);
	    cacPage.getAdminCouponFirstViewBtn().click();
	    
	    Thread.sleep(2000);
	    Coupons_CouponsDescriptionPage ccdPage = new Coupons_CouponsDescriptionPage(driver);
	    ccdPage.getCloseBtn().click();
	    
	    Thread.sleep(2000);
	    cacPage.getAdminCouponFirstEditBtn().click();
	    
	    Thread.sleep(2000);
	    Coupons_AdminCouponEditPage cacePage = new Coupons_AdminCouponEditPage(driver);
	    cacePage.editAdminCoupon(EditCouponAmount, EditFromDate, EditToDate, EditMinimumTransactionAmount, EditMobileNumber, EditDescription);
	    
	    Thread.sleep(2000);
	    cacPage.getAdminCouponFirstEditBtn().click();
	    
	    Thread.sleep(2000);
	    cacePage.getCloseBtn().click();
	    
	    Thread.sleep(2000);
	    cacPage.clickOnEnableDisableBootStrapBtn();
	    
	    
}}
