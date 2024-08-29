package sprint_4_Banners_Positive;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import genericUtility.FMS_BaseClass;
import genericUtility.JavaUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import objectRepository.Banner_EcomBannerImagePage;
import objectRepository.BannersPage;
import objectRepository.Banners_EcomBannersPage;
import objectRepository.Banners_EcomBanners_AddEcomBannersPage;
import objectRepository.Banners_EcomBanners_UpdateEcomBannersPage;
import objectRepository.DashboardPage;

@Listeners(genericUtility.ListnersImplementationClass.class)
public class a_Banners_E_ComBanners extends FMS_BaseClass {
	
	PropertyFileUtility pUtil = new PropertyFileUtility();
	
	String IssuedDate = "25-01-2023", ExpireDate = "25-01-2023", SequenceNo = "1", SearchValue = "hbjkbjb";
	
	@Test(groups = "sprint-4", priority = 1)
	public void a_eComBannersAllActionsTest() throws Exception
	{
        DashboardPage dbPage = new DashboardPage(driver);
        dbPage.clickOnBannersLnk();
        
        Thread.sleep(2000);
        BannersPage bPage = new BannersPage(driver);
        bPage.clicKOnEcomBannersLnk();
        
        Thread.sleep(2000);
        Banners_EcomBannersPage bebPage = new Banners_EcomBannersPage(driver);
        bebPage.getAddEcomBannersBtn().click();
        
        
        
        Thread.sleep(2000);
        Banners_EcomBanners_AddEcomBannersPage beabPage = new Banners_EcomBanners_AddEcomBannersPage(driver);
        beabPage.addingEcomBanner(driver, IssuedDate, ExpireDate, SequenceNo);
        
        Thread.sleep(2000);
        bebPage.searching_A_Banner(SearchValue);
        
        Thread.sleep(2000);
        bebPage.getSearchEdt().clear();
        
        Thread.sleep(2000);
        driver.navigate().refresh();
        
        Thread.sleep(2000);
        Banners_EcomBannersPage bePage = new Banners_EcomBannersPage(driver);
        bePage.getBannerImgViewBtn().click();
        
        Thread.sleep(2000);
        Banner_EcomBannerImagePage bebiPage = new Banner_EcomBannerImagePage(driver);
        bebiPage.getCloseBtn().click();
        
        Thread.sleep(2000);
	    bebPage.clickOnFirstBannerStatusEditBtn(driver);
	      
	    Thread.sleep(2000);
	    Banners_EcomBanners_UpdateEcomBannersPage bebuebPage = new Banners_EcomBanners_UpdateEcomBannersPage(driver);
	    bebuebPage.updateEcomBanner(driver, IssuedDate, ExpireDate, SequenceNo);
	    
	    Thread.sleep(2000);
	    bebPage.clickOnFirstBannerStatusEnableOrDisableButton(driver);
        
	    Thread.sleep(2000);
	    }

}