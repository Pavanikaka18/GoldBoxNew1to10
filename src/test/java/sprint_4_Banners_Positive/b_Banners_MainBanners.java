package sprint_4_Banners_Positive;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import genericUtility.FMS_BaseClass;
import genericUtility.PropertyFileUtility;
import objectRepository.BannersPage;
import objectRepository.Banners_MainBannerImagePage;
import objectRepository.Banners_MainBannersPage;
import objectRepository.Banners_MainBanners_AddMainBannersPage;
import objectRepository.Banners_MainBanners_UpdateMainBannerPage;
import objectRepository.DashboardPage;

@Listeners(genericUtility.ListnersImplementationClass.class)
public class b_Banners_MainBanners extends FMS_BaseClass {
	
	PropertyFileUtility pUtil = new PropertyFileUtility();
	String FromDate = "26-04-2024", ToDate = "30-05-2025", Sequence = "2";
    
	@Test(groups = "sprint-4", priority = 1)
	public void mainBannerAllActionsTest()throws Exception
	{	
        DashboardPage dbPage = new DashboardPage(driver);
        dbPage.clickOnBannersLnk();
        
        Thread.sleep(2000);
        BannersPage bPage = new BannersPage(driver);
        bPage.getMainBannersLnk().click();
        
        Thread.sleep(2000);
        Banners_MainBannersPage bmbPage = new Banners_MainBannersPage(driver);
        bmbPage.getAddMainBannersBtn().click();
        
        Thread.sleep(2000);
        Banners_MainBanners_AddMainBannersPage bmbambPage = new Banners_MainBanners_AddMainBannersPage(driver);
        bmbambPage.addingMainBanner(driver, FromDate, ToDate, Sequence);
        
        Thread.sleep(2000);
        bmbPage.getBannerImgViewBtn().click();
        
        Thread.sleep(2000);
        Banners_MainBannerImagePage bmbiPage = new Banners_MainBannerImagePage(driver);
        bmbiPage.getCloseBtn().click();
        
        Thread.sleep(2000);
        bmbPage.getStatusEditBtn().click();
        
        Thread.sleep(2000);
        Banners_MainBanners_UpdateMainBannerPage bmbumbPage = new Banners_MainBanners_UpdateMainBannerPage(driver);
        bmbumbPage.updateMainBanner(driver);
        
        Thread.sleep(2000);
        bmbPage.enableOrDisableParticularBanner(driver);
        Thread.sleep(3000);
	}	
	
 }