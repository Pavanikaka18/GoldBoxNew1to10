package Sprint_5_Negative;

import java.awt.Robot;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import genericUtility.ExcelFileUtility;
import genericUtility.FMS_BaseClass;
import genericUtility.JavaUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import objectRepository.Banner_EcomBannerImagePage;
import objectRepository.BannersPage;
import objectRepository.Banners_EcomBannersPage;
import objectRepository.Banners_EcomBanners_AddEcomBannersPage;
import objectRepository.Banners_EcomBanners_UpdateEcomBannersPage;
import objectRepository.Banners_MainBannersPage;
import objectRepository.Banners_MainBanners_AddMainBannersPage;
import objectRepository.Banners_MainBanners_UpdateMainBannerPage;
import objectRepository.Banners_SplashBannersImagePage;
import objectRepository.Banners_SplashBannersPage;
import objectRepository.Banners_SplashBanners_AddSplashBannersPage;
import objectRepository.Banners_SplashBanners_UpdateSplashBannersPage;
import objectRepository.DashboardPage;

@Listeners(genericUtility.ListnersImplementationClass.class)
public class c_BannersAllActions extends FMS_BaseClass {

	WebDriverUtility wUtil = new WebDriverUtility();
	JavaUtility jUtil = new JavaUtility();
	ExcelFileUtility eUtil = new ExcelFileUtility();
	PropertyFileUtility pUtil = new PropertyFileUtility();
	
	@Test(groups = "Sprint-5",priority = 1)
	public void mainBannersAllActionsTest() throws InterruptedException, Exception, IOException
	{
		String MainBannersSearchValue = eUtil.readDataFromExcel("Sprint-5 Negative", 62, 4);
		String MainBannersFromDate = eUtil.readDataFromExcel("Sprint-5 Negative", 62, 1);
		String MainBannersToDate = eUtil.readDataFromExcel("Sprint-5 Negative", 63, 1);
		String MainBannersSequence = eUtil.readDataFromExcel("Sprint-5 Negative", 64, 1);
		String EditMainBannerFromDate = eUtil.readDataFromExcel("Sprint-5 Negative", 67, 1);
		String EditMainBannerToDate = eUtil.readDataFromExcel("Sprint-5 Negative", 68, 1);
		String EditMainBannerSequence = eUtil.readDataFromExcel("Sprint-5 Negative", 69, 1);
		String ImagePath = eUtil.readDataFromExcel("ImagePath", 0, 1);
		
		Robot r = new Robot();
		
		Thread.sleep(4000);
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.clickOnBannersLnk();
		Thread.sleep(2000);
		BannersPage bPage = new BannersPage(driver);
		bPage.getMainBannersLnk().click();
		Thread.sleep(2000);
		Banners_MainBannersPage bmbPage = new Banners_MainBannersPage(driver);
		bmbPage.getSearchEdt().sendKeys(MainBannersSearchValue);
		Thread.sleep(2000);
		WebElement NoRecordsFound = driver.findElement(By.xpath("//h5[.='No records found']"));
		Thread.sleep(2000);
		if(NoRecordsFound.isDisplayed())
		{
			Thread.sleep(2000);
			wUtil.takeScreenShot(driver, "a_Searching Invalid Main Banner Error");
		}
		else 
		{
			System.out.println("Searched Banner Displayed");
		}
		Thread.sleep(2000);
		bmbPage.getSearchEdt().clear();		
		Thread.sleep(2000);
		bmbPage.getAddMainBannersBtn().click();
		Thread.sleep(2000);
		WebElement AddMainBannersPage = driver.findElement(By.xpath("//h1[.='Add Main Banners']"));
		Thread.sleep(2000);
		if(AddMainBannersPage.isDisplayed())
		{
			Thread.sleep(2000);
			wUtil.takeScreenShot(driver, "b_Click On Add Main Banner Button Add Main Banner Page Should Not Open Error");
		}
		else 
		{
			System.out.println("Add Main Banner Page Is Not Opened");
		}
		Thread.sleep(2000);
	    Banners_MainBanners_AddMainBannersPage bmbamPage = new Banners_MainBanners_AddMainBannersPage(driver);
		Thread.sleep(2000);
		bmbamPage.getAddBtn().click();
		WebElement Error1 = driver.findElement(By.xpath("(//div[.=' Banner image is required '])[2]"));
		Thread.sleep(2000);
		if(Error1.isDisplayed())
		{
			Thread.sleep(2000);
			wUtil.takeScreenShot(driver, "c_Clicking On Add Button Without Giving Any Banner Details Error");
		}
		else 
		{
			System.out.println("Main Banner Added Successfully");
		}
		Thread.sleep(2000);
		bmbamPage.getFromDateEdt().sendKeys(MainBannersFromDate);
		Thread.sleep(5000);
		bmbamPage.getAddBtn().click();
		Thread.sleep(2000);
		if(Error1.isDisplayed())
		{
			Thread.sleep(2000);
			wUtil.takeScreenShot(driver, "d_Clicking On Add Button By Giving Only From Date Error");
		}
		else 
		{
			System.out.println("Main Banner Added Successfully");
		}
		bmbamPage.getToDateEdt().sendKeys(MainBannersToDate);
		Thread.sleep(5000);
		bmbamPage.getAddBtn().click();
		Thread.sleep(2000);
		if(Error1.isDisplayed())
		{
			Thread.sleep(2000);
			wUtil.takeScreenShot(driver, "e_Clicking On Add Button By Giving Only From,To Dates Error");
		}
		else 
		{
			System.out.println("Main Banner Added Successfully");
		}
		bmbamPage.getSequenceEdt().sendKeys(MainBannersSequence);
		Thread.sleep(5000);
		bmbamPage.getAddBtn().click();
		Thread.sleep(2000);
		if(Error1.isDisplayed())
		{
			Thread.sleep(2000);
			wUtil.takeScreenShot(driver, "f_Clicking On Add Button By Giving Only From,To Date,Sequence Error");
		}
		else 
		{
			System.out.println("Main Banner Added Successfully");
		}	
		Thread.sleep(2000);
		wUtil.clickOnChooseFileOption(driver, bmbamPage.getUploadBannerImgEdt(), ImagePath);	
		Thread.sleep(5000);
		bmbamPage.getAddBtn().click();
		Thread.sleep(2000);
		WebElement Error2 = driver.findElement(By.xpath("(//div[.=' From Date cannot be greater than To Date '])[2]"));
		if(Error2.isDisplayed())
		{
			Thread.sleep(2000);
			wUtil.takeScreenShot(driver, "g_Adding Main Banner By Giving Invalid Dates Error");
		}
		else
		{
			System.out.println("Banner added Successfully ");
		}
		Thread.sleep(2000);
		bmbamPage.getFromDateEdt().clear();
		Thread.sleep(2000);
		bmbamPage.getFromDateEdt().sendKeys(EditMainBannerFromDate);
		Thread.sleep(2000);
		bmbamPage.getToDateEdt().clear();
		Thread.sleep(2000);
		bmbamPage.getToDateEdt().sendKeys(EditMainBannerToDate);
		Thread.sleep(2000);
		bmbamPage.getSequenceEdt().sendKeys(EditMainBannerSequence);
		Thread.sleep(2000);
		bmbamPage.getAddBtn().click();
		Thread.sleep(2000);
		WebElement SuccessMsg = driver.findElement(By.xpath("(//div[.=' Main Banner Added Successfully '])[2]"));
		if(SuccessMsg.isDisplayed())
		{
			Thread.sleep(2000);
//			wUtil.takeScreenShot(driver, "h_Main Banner Added Successfully");
		}
		else 
		{
			System.out.println("Main Banner Not Added");
		}
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[.='View'])[1]")).click();
		Thread.sleep(2000);
		WebElement BannerImagePage = driver.findElement(By.xpath("//h1[.='Main Banner Image']"));
		Thread.sleep(2000);
		if(BannerImagePage.isDisplayed())
		{
			Thread.sleep(2000);
			wUtil.takeScreenShot(driver, "i_Click On Banner Image View Button Banner Image Page Should Not Open Error");
		}
		else
		{
			System.out.println("Banner Image Page Is Not Opened");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Main Banner Image']/following-sibling::button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[.=' Edit '])[1]")).click();
		Thread.sleep(2000);
		WebElement UpdateBannerPage = driver.findElement(By.xpath("//h1[.='Update Banner']"));
		if(UpdateBannerPage.isDisplayed())
		{
			Thread.sleep(2000);
			wUtil.takeScreenShot(driver, "j_Click On Edit Button But Update Banner Should Not Open Error");
		}
		else
		{
			System.out.println("Update Page Is Not Opened After Clicking On Edit Button");
		}
		Thread.sleep(2000);
		Banners_MainBanners_UpdateMainBannerPage bmbumbPage = new Banners_MainBanners_UpdateMainBannerPage(driver);
		bmbumbPage.getFromDateEdt().clear();
		Thread.sleep(2000);
		bmbumbPage.getToDateEdt().clear();
		Thread.sleep(2000);
		bmbumbPage.getUpdateBtn().click();
		Thread.sleep(2000);
		WebElement SuccessMsg1 = driver.findElement(By.xpath("(//div[.=' Main Banner Details Updated Successfully '])[2]"));
		if(SuccessMsg1.isDisplayed())
		{
			Thread.sleep(2000);
			wUtil.takeScreenShot(driver, "k_Removing From,To Dates While Updating Main Banner Success Error");
		}
		else
		{
			System.out.println("Main Banner Not Added");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[.=' Edit '])[1]")).click();
		Thread.sleep(2000);
		bmbumbPage.getSequenceEdt().clear();
		Thread.sleep(2000);
		bmbumbPage.getUpdateBtn().click();
		Thread.sleep(2000);
		if(SuccessMsg1.isDisplayed())
		{
			Thread.sleep(2000);
			wUtil.takeScreenShot(driver, "l_Removing Sequence While Updating Main Banner Success Error");
		}
		else
		{
			System.out.println("Main Banner Not Added");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[.=' Edit '])[1]")).click();
		Thread.sleep(2000);
		bmbumbPage.getCloseBtn().click();
		Thread.sleep(2000);
		if(bmbumbPage.getCloseBtn().isDisplayed())
		{
			System.out.println("Update Banner Page Is Not Closed");
		}
		else
		{
			Thread.sleep(2000);
			wUtil.takeScreenShot(driver, "m_Clicking On Close Button Update Banner Page Should Not Close");
		}
		Thread.sleep(2000);
		bmbPage.getStatusEnableDisableBootstrapBtn().click();
		WebElement UpdateSuccessMsg = driver.findElement(By.xpath("(//div[.=' Main Banner Status Updated Successfully. '])[2]"));
		if(UpdateSuccessMsg.isDisplayed())
		{
			Thread.sleep(2000);
			wUtil.takeScreenShot(driver, "n_Click On Bootstrap Button Banner Should Not Update");
		}
		else
		{
			System.out.println("Banner Updated Successfully");
		}
	}
	
	@Test(groups = "Sprint-5",priority = 2)
	public void splashBannersTest() throws Exception, IOException
	{
		String SplashBannerSearchValue = eUtil.readDataFromExcel("Sprint-5 Negative", 72, 4);
		String SplashBannerFromDate = eUtil.readDataFromExcel("Sprint-5 Negative", 72, 1);
		String SplashBannerToDate = eUtil.readDataFromExcel("Sprint-5 Negative", 73, 1);
		String SplashBannerFromDate1 = eUtil.readDataFromExcel("Sprint-5 Negative", 72, 2);
		String SplashBannerToDate1 = eUtil.readDataFromExcel("Sprint-5 Negative", 73, 2);
		String SplashBannerSequence = eUtil.readDataFromExcel("Sprint-5 Negative", 74, 1);
		String EditSplashBannerFromDate = eUtil.readDataFromExcel("Sprint-5 Negative", 77, 1);
		String EditSplashBannerToDate = eUtil.readDataFromExcel("Sprint-5 Negative", 78, 1);
		String EditSplashBannerSequence = eUtil.readDataFromExcel("Sprint-5 Negative", 79, 1);
		String ImagePath = eUtil.readDataFromExcel("ImagePath", 0, 1);                                                                   // "C:\\Users\\vikra\\OneDrive\\Desktop\\One Drive Folder\\OneDrive\\Pictures\\Saved Pictures\\download.jpg";
		
		Thread.sleep(2000);
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getBannersDrpDwn().click();
		Thread.sleep(2000);
		BannersPage bPage = new BannersPage(driver);
		bPage.getSplashBannersLnk().click();
		Thread.sleep(1000);
		Banners_SplashBannersPage bsbPage = new Banners_SplashBannersPage(driver);
		if(bsbPage.getAddSplashBannersBtn().isDisplayed())
		{
			wUtil.takeScreenShot(driver, "a_Clicking On Splash Banners Link Splash Banners Page Should Not Display");
		}
		else
		{
			System.out.println("Splash Banners Page Is Not Displayed");
		}
		Thread.sleep(2000);
		bsbPage.getSearchEdt().sendKeys(SplashBannerSearchValue);
		Thread.sleep(1000);
		WebElement NorecordsError = driver.findElement(By.xpath("//h5[.='No records found']"));
		if(NorecordsError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "b_Searching Invalid Splash Banner Error");
		}
		Thread.sleep(2000);
		bsbPage.getAddSplashBannersBtn().click();
		WebElement AddSplashBannersPage = driver.findElement(By.xpath("//h1[.='Add Splash Banners']"));
		Thread.sleep(1000);
		if(AddSplashBannersPage.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "c_After Clicking On Add Splash Banner Button Add Splash Banner Should Not Open Error");
		}
		else
		{
			System.out.println("Splash Banner Page Is Not Opened");
		}
		Thread.sleep(2000);
		Banners_SplashBanners_AddSplashBannersPage bsbasbPage = new Banners_SplashBanners_AddSplashBannersPage(driver);
		bsbasbPage.getFromDateEdt().sendKeys(SplashBannerFromDate);
		Thread.sleep(2000);
		bsbasbPage.getAddBtn().click();
		Thread.sleep(2000);
		WebElement ImageError = driver.findElement(By.xpath("(//div[.=' Banner image is required '])[2]"));
		if(ImageError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "d_Adding Splash Banner By Giving Only From Date Error");
		}
		else
		{
			System.out.println("Splash Banner Added Successfully ");
		}
		Thread.sleep(3000);
		bsbasbPage.getToDateEdt().sendKeys(SplashBannerToDate);
		Thread.sleep(1000);
		bsbasbPage.getAddBtn().click();
		Thread.sleep(2000);
		if(ImageError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "e_Adding Splash Banner By Giving Only From,To Dates Error");
		}
		else
		{
			System.out.println("Splash Banner Added Successfully ");
		}
		Thread.sleep(3000);
		wUtil.clickOnChooseFileOption(driver, bsbasbPage.getBannerImgEdt(), ImagePath);
		bsbasbPage.getBannerImgEdt();
		Thread.sleep(2000);
		bsbasbPage.getAddBtn().click();
		Thread.sleep(2000);
		WebElement SequenceError = driver.findElement(By.xpath("(//div[.=' Please Enter Sequence '])[2]"));
		Thread.sleep(2000);
		if(SequenceError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "f_Adding Splash Banner Without Giving Sequence Error");
		}
		else
		{
			System.out.println("Splash Banner Added Without Giving Sequence");
		}
		Thread.sleep(2000);
		bsbasbPage.getSequenceEdt().sendKeys(SplashBannerSequence);
		Thread.sleep(2000);
		bsbasbPage.getAddBtn().click();
		Thread.sleep(2000);
		WebElement DateError = driver.findElement(By.xpath("(//div[.=' From Date cannot be greater than To Date '])[2]"));
		Thread.sleep(1000);
		if(DateError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "g_Giving From Date More Than To Date While Adding Splash Banner Error");
		}
		else 
		{
			System.out.println("Splash Banner Added Successfully By Giving From Date More Than To Date");
		}
		bsbasbPage.getFromDateEdt().clear();
		Thread.sleep(2000);
		bsbasbPage.getFromDateEdt().sendKeys(SplashBannerFromDate1);
		Thread.sleep(2000);
		bsbasbPage.getToDateEdt().clear();
		Thread.sleep(2000);
		bsbasbPage.getToDateEdt().sendKeys(SplashBannerToDate1);
		Thread.sleep(2000);
		bsbasbPage.getAddBtn().click();
		Thread.sleep(2000);
		WebElement SuccessMsg = driver.findElement(By.xpath("(//div[.=' splash bannner added successfully '])[2]"));
		Thread.sleep(1000);
		if(SuccessMsg.isDisplayed())
		{
		//	wUtil.takeScreenShot(driver, "h_Splash Banner Added Successfully");
		}
		else 
		{
			System.out.println("Splash Banner Added Successfully");
		}
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		bsbPage.getBannerImgViewBtn().click();
		Thread.sleep(2000);
		WebElement SplashBannerImagePage = driver.findElement(By.xpath("//h1[.='Splash Banner Image']"));
		Thread.sleep(1000);
		if(SplashBannerImagePage.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "i_After Clicking On Splash Banner Image View Button Splash Banner Image Page Should Not Open Error");
		}
		Thread.sleep(2000);
		Banners_SplashBannersImagePage bsbiPage = new Banners_SplashBannersImagePage(driver);
		bsbiPage.getCloseBtn().click();
		Thread.sleep(1000);
		if(bsbiPage.getCloseBtn().isDisplayed())
		{
			System.out.println("Banner Image Page Is Not Closed");
		}
		else
		{
			wUtil.takeScreenShot(driver, "j_After Clicking On Close Button Banner Image Page Should Not Close Error");
		}
		Thread.sleep(2000);
		bsbPage.getStatusEditBtn().click();
		Thread.sleep(1000);
		WebElement UpdateBannerPage = driver.findElement(By.xpath("//h1[.='Update Banner']"));
		if(UpdateBannerPage.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "k_Click On Edit Button Update Banner Page Should Not Open Error");
		}
		else
		{
			System.out.println("Update Banner Page Is Not Opened");
		}
		Thread.sleep(2000);
		Banners_SplashBanners_UpdateSplashBannersPage bebuebPage = new Banners_SplashBanners_UpdateSplashBannersPage(driver);
		bebuebPage.getFromDateEdt().clear();
		Thread.sleep(2000);
		bebuebPage.getToDateEdt().clear();
		Thread.sleep(2000);
		bebuebPage.getUpdateBtn().click();
		Thread.sleep(2000);
		WebElement UpdateSuccessMsg = driver.findElement(By.xpath("(//div[.=' Splash Screen Details Updated Successfully '])[2]"));
		Thread.sleep(1000);
		if(UpdateSuccessMsg.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "l_While Updating Removing From And To Dates But Splash Banner Updating Successfully Error");
		}
		else 
		{
			System.out.println("Splash Banner Not Updated");
		}
		Thread.sleep(2000);
		bsbPage.getStatusEditBtn().click();
		Thread.sleep(2000);
		bebuebPage.getSequenceEdt().clear();
		Thread.sleep(2000);
		bebuebPage.getUpdateBtn().click();
		WebElement UpdateWithoutSequenceSuccessMsg = driver.findElement(By.xpath("(//div[.=' Splash Screen Details Updated Successfully '])[2]"));
		if (UpdateWithoutSequenceSuccessMsg.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "m_While Updating Removing Sequence But Splash Banner Updating Successfully Error");
		} 
		else
		{
            System.out.println("Splash Banner Not Updated");
		}
		Thread.sleep(2000);
		bsbPage.getStatusEditBtn().click();
		Thread.sleep(2000);
		bebuebPage.getFromDateEdt().clear();
		Thread.sleep(2000);
		bebuebPage.getFromDateEdt().sendKeys(EditSplashBannerFromDate);
		Thread.sleep(2000);
		bebuebPage.getToDateEdt().clear();
		Thread.sleep(2000);
		bebuebPage.getToDateEdt().sendKeys(EditSplashBannerToDate);
		Thread.sleep(2000);
		bebuebPage.getSequenceEdt().clear();
		Thread.sleep(2000);
		bebuebPage.getSequenceEdt().sendKeys(EditSplashBannerSequence);
		Thread.sleep(2000);
		bebuebPage.getUpdateBtn().click();
		WebElement UpdateSuccessMsg1 = driver.findElement(By.xpath("(//div[.=' Splash Screen Details Updated Successfully '])[2]"));
		Thread.sleep(1000);
		if (UpdateSuccessMsg1.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "n_Updating By Giving All Valid Details, Splash Banner Updating Successfully Error");
		} 
		else 
		{
            System.out.println("Splash Banner Not Updated");
		}
		Thread.sleep(2000);
		bsbPage.getStatusEnableDisableBootstrapBtn().click();
		if(UpdateSuccessMsg1.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "Clicking On Bootstrap Button Splash Banner Should Not Update Error");
		}
		else
		{
			System.out.println("Splash Banner is Not Updated");
		}
		
	}
	
	@Test(groups = "Sprint-5",priority = 3)
	public void eComBannersAllActionsTest() throws Exception, IOException
	{
		String EcomBannerSearchValue = eUtil.readDataFromExcel("Sprint-5 Negative", 82, 4);
		String EcomBannerFromDate = eUtil.readDataFromExcel("Sprint-5 Negative", 82, 1);
		String EcomBannerToDate = eUtil.readDataFromExcel("Sprint-5 Negative", 83, 1);
		String EcomBannerFromDate1 = eUtil.readDataFromExcel("Sprint-5 Negative", 82, 2);
		String EcomBannerToDate1 = eUtil.readDataFromExcel("Sprint-5 Negative", 83, 2);
		String EcomBannerSequence = eUtil.readDataFromExcel("Sprint-5 Negative", 84, 1);
		String EditEcomBannerFromDate = eUtil.readDataFromExcel("Sprint-5 Negative", 87, 1);
		String EditEcomBannerToDate = eUtil.readDataFromExcel("Sprint-5 Negative", 88, 1);
		String EditEcomBannerSequence = eUtil.readDataFromExcel("Sprint-5 Negative", 89, 1);
		String ImagePath = eUtil.readDataFromExcel("ImagePath", 0, 1);
		
		Thread.sleep(2000);
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getBannersDrpDwn().click();
		Thread.sleep(2000);
		BannersPage bPage = new BannersPage(driver);
		bPage.getEcomBannersLnk().click();
		Thread.sleep(1000);
		Banners_EcomBannersPage bebPage = new Banners_EcomBannersPage(driver);
		if(bebPage.getAddEcomBannersBtn().isDisplayed())
		{
			wUtil.takeScreenShot(driver, "a_Clicking On Ecom Banners Link Ecom Banners Page Should Not Display");
		}
		else
		{
			System.out.println("Ecom Banners Page Is Not Displayed");
		}
		Thread.sleep(2000);
		bebPage.getSearchEdt().sendKeys(EcomBannerSearchValue);
		Thread.sleep(1000);
		WebElement NorecordsError = driver.findElement(By.xpath("//h5[.='No records found']"));
		if(NorecordsError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "b_Searching Invalid Ecom Banner Error");
		}
		Thread.sleep(2000);
		bebPage.getAddEcomBannersBtn().click();
		WebElement AddEcomBannersPage = driver.findElement(By.xpath("//h1[.='Add Splash Banners']"));
		Thread.sleep(1000);
		if(AddEcomBannersPage.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "c_After Clicking On Add Ecom Banner Button Add Splash Banner Page Is Opened Error");
		}
		else
		{
			System.out.println("Add Ecom Banner Page Is Not Opened");
		}
		
		Thread.sleep(2000);
		Banners_EcomBanners_AddEcomBannersPage bebaebPage = new Banners_EcomBanners_AddEcomBannersPage(driver);
		bebaebPage.getFromDateEdt().sendKeys(EcomBannerFromDate);
		Thread.sleep(2000);
		bebaebPage.getAddBtn().click();
		Thread.sleep(2000);
		WebElement AddSplashBannerPage = driver.findElement(By.xpath("//h1[.='Add Splash Banners']"));
		if(AddSplashBannerPage.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "d_Adding Ecom Banner By Giving Only From Date Error");
		}
		else
		{
			System.out.println("Ecom Banner Added Successfully ");
		}
		
		
		
		Thread.sleep(3000);
		bebaebPage.getToDateEdt().sendKeys(EcomBannerToDate);
		Thread.sleep(1000);
		bebaebPage.getAddBtn().click();
		Thread.sleep(2000);
		if(AddSplashBannerPage.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "e_Adding Ecom Banner By Giving Only From,To Dates Error");
		}
		else
		{
			System.out.println("Ecom Banner Added Successfully ");
		}
		Thread.sleep(3000);
		wUtil.clickOnChooseFileOption(driver, bebaebPage.getBannerImgViewBtn(), ImagePath);
		bebaebPage.getBannerImgViewBtn();
		Thread.sleep(2000);
		bebaebPage.getAddBtn().click();
		Thread.sleep(2000);
		if(AddSplashBannerPage.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "f_Adding Ecom Banner Without Giving Sequence Error");
		}
		else
		{
			System.out.println("Ecom Banner Added Without Giving Sequence");
		}
		Thread.sleep(2000);
		bebaebPage.getSequenceEdt().sendKeys(EcomBannerSequence);
		Thread.sleep(2000);
		bebaebPage.getAddBtn().click();
		Thread.sleep(2000);
		WebElement DateError = driver.findElement(By.xpath("(//div[.=' From Date cannot be greater than To Date '])[2]"));
		Thread.sleep(1000);
		if(DateError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "g_Giving From Date More Than To Date While Adding Ecom Banner Error");
		}
		else 
		{
			System.out.println("Ecom Banner Added Successfully By Giving From Date More Than To Date");
		}
		bebaebPage.getFromDateEdt().clear();
		Thread.sleep(2000);
		bebaebPage.getFromDateEdt().sendKeys(EcomBannerFromDate1);
		Thread.sleep(2000);
		bebaebPage.getToDateEdt().clear();
		Thread.sleep(2000);
		bebaebPage.getToDateEdt().sendKeys(EcomBannerToDate1);
		Thread.sleep(2000);
		bebaebPage.getAddBtn().click();
		Thread.sleep(2000);
		WebElement SuccessMsg = driver.findElement(By.xpath("(//div[.='  Ecommerce Banner Added Successfully '])[2]"));
		Thread.sleep(1000);
		if(SuccessMsg.isDisplayed())
		{
		//	wUtil.takeScreenShot(driver, "h_Splash Banner Added Successfully");
		}
		else 
		{
			System.out.println("Ecom Banner Not Added");
		}
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		bebPage.getBannerImgViewBtn().click();
		Thread.sleep(2000);
		WebElement SplashBannerImagePage = driver.findElement(By.xpath("//h1[.='Ecom Banner Image']"));
		Thread.sleep(1000);
		if(SplashBannerImagePage.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "i_After Clicking On Ecom Banner Image View Button Ecom Banner Image Page Should Not Open Error");
		}
		else
		{
			System.out.println("Ecom Banner Page Is Not Displayed");
		}
		Thread.sleep(2000);
		Banner_EcomBannerImagePage bebiPage = new Banner_EcomBannerImagePage(driver);
		bebiPage.getCloseBtn().click();
		Thread.sleep(1000);
		if(bebiPage.getCloseBtn().isDisplayed())
		{
			System.out.println("Banner Image Page Is Not Closed");
		}
		else
		{
			wUtil.takeScreenShot(driver, "j_After Clicking On Close Button Banner Image Page Should Not Close Error");
		}
		Thread.sleep(2000);
		bebPage.clickOnFirstBannerStatusEditBtn(driver);
		Thread.sleep(1000);
		WebElement UpdateBannerPage = driver.findElement(By.xpath("//h1[.='Update Banner']"));
		if(UpdateBannerPage.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "k_Click On Edit Button Update Banner Page Should Not Open Error");
		}
		else
		{
			System.out.println("Update Banner Page Is Not Opened");
		}
		Thread.sleep(2000);
		Banners_EcomBanners_UpdateEcomBannersPage bebuebPage = new Banners_EcomBanners_UpdateEcomBannersPage(driver);
		bebuebPage.getFromDateEdt().clear();
		Thread.sleep(2000);
		bebuebPage.getToDateEdt().clear();
		Thread.sleep(2000);
		bebuebPage.getUpdateBtn().click();
		Thread.sleep(2000);
		WebElement UpdateSuccessMsg = driver.findElement(By.xpath("(//div[.=' Ecom Banner Details Updated Successfully '])[2]"));
		Thread.sleep(1000);
		if(UpdateSuccessMsg.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "l_While Updating Removing From And To Dates But Ecom Banner Updating Successfully Error");
		}
		else 
		{
			System.out.println("Ecom Banner Not Updated");
		}
		Thread.sleep(2000);
		bebPage.clickOnFirstBannerStatusEditBtn(driver);
		Thread.sleep(2000);
		bebuebPage.getSequenceEdt().clear();
		Thread.sleep(2000);
		bebuebPage.getUpdateBtn().click();
		WebElement UpdateWithoutSequenceSuccessMsg = driver.findElement(By.xpath("(//div[.=' Ecom Banner Details Updated Successfully '])[2]"));
		if (UpdateWithoutSequenceSuccessMsg.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "m_While Updating Removing Sequence But Ecom Banner Updating Successfully Error");
		} 
		else
		{
            System.out.println("Ecom Banner Not Updated");
		}
		Thread.sleep(2000);
		bebPage.clickOnFirstBannerStatusEditBtn(driver);
		Thread.sleep(2000);
		bebuebPage.getFromDateEdt().clear();
		Thread.sleep(2000);
		bebuebPage.getFromDateEdt().sendKeys(EditEcomBannerFromDate);
		Thread.sleep(2000);
		bebuebPage.getToDateEdt().clear();
		Thread.sleep(2000);
		bebuebPage.getToDateEdt().sendKeys(EditEcomBannerToDate);
		Thread.sleep(2000);
		bebuebPage.getSequenceEdt().clear();
		Thread.sleep(2000);
		bebuebPage.getSequenceEdt().sendKeys(EditEcomBannerSequence);
		Thread.sleep(2000);
		bebuebPage.getUpdateBtn().click();
		WebElement UpdateSuccessMsg1 = driver.findElement(By.xpath("(//div[.=' Ecom Banner Details Updated Successfully '])[2]"));
		Thread.sleep(2000);
		if (UpdateSuccessMsg1.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "n_Updating By Giving All Valid Details, Splash Banner Updating Successfully Error");
		} 
		else 
		{
            System.out.println("Splash Banner Not Updated");
		}
		Thread.sleep(4000);
		bebPage.clickOnFirstBannerStatusEnableOrDisableButton(driver);
		if(UpdateSuccessMsg1.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "o_Clicking On Bootstrap Button Ecom Banner Should Not Update Error");
		}
		else
		{
			System.out.println("Ecom Banner is Not Updated");
		}
		
	}
	
}
