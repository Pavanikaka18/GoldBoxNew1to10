package sprint_4_Banners_Positive;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import genericUtility.FMS_BaseClass;
import genericUtility.PropertyFileUtility;
import objectRepository.BannersPage;
import objectRepository.Banners_SplashBannersImagePage;
import objectRepository.Banners_SplashBannersPage;
import objectRepository.Banners_SplashBanners_AddSplashBannersPage;
import objectRepository.Banners_SplashBanners_UpdateSplashBannersPage;
import objectRepository.DashboardPage;

@Listeners(genericUtility.ListnersImplementationClass.class)
public class c_Banners_SplashBanners extends FMS_BaseClass {

	PropertyFileUtility pUtil = new PropertyFileUtility();
	String FromDate = "25-04-2024", ToDate = "30-05-2024", Sequence = "1";
	String EditFromDate = "25-04-2024", EditToDate = "30-05-2024", EditSequence = "2";
	
	@Test(groups = "sprint-4", priority = 1)
	public void splashBannersAllActionsTest() throws Exception
	{
        DashboardPage dbPage = new DashboardPage(driver);
        dbPage.clickOnBannersLnk();
        
        Thread.sleep(2000);
        BannersPage bPage = new BannersPage(driver);
        bPage.getSplashBannersLnk().click();
        
        Thread.sleep(2000);
        Banners_SplashBannersPage bsbPage = new Banners_SplashBannersPage(driver);
        bsbPage.getAddSplashBannersBtn().click();
        
        Thread.sleep(2000);
        Banners_SplashBanners_AddSplashBannersPage bsbasbPage = new Banners_SplashBanners_AddSplashBannersPage(driver);
        bsbasbPage.addingSplashBanner(driver, FromDate, ToDate, Sequence);
        
        Thread.sleep(2000);
        driver.navigate().refresh();
        
        Thread.sleep(2000);
        bsbPage.getBannerImgViewBtn().click();
        
        Thread.sleep(2000);
        Banners_SplashBannersImagePage bsbiPage = new Banners_SplashBannersImagePage(driver);
        bsbiPage.getCloseBtn().click();
        
        Thread.sleep(2000);
        bsbPage.getStatusEditBtn().click();
        
        Thread.sleep(2000);
        Banners_SplashBanners_UpdateSplashBannersPage bsbusbPage = new Banners_SplashBanners_UpdateSplashBannersPage(driver);
        bsbusbPage.updateSplashBanner(driver, EditFromDate, EditToDate, EditSequence);
		
        Thread.sleep(2000);
        bsbPage.getStatusEnableDisableBootstrapBtn().click();
        
        Thread.sleep(3000);
        
	}
	
	
}