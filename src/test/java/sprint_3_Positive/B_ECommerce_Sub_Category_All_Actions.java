package sprint_3_Positive;

import org.apache.poi.hssf.record.cf.Threshold;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.ExcelFileUtility;
import genericUtility.FMS_BaseClass;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import objectRepository.DashboardPage;
import objectRepository.EcommercePage;
import objectRepository.Ecommerce_SubCategoryPage;
import objectRepository.Ecommerce_SubCategory_AddSubcategoryPage;
import objectRepository.Ecommerce_SubCategory_EditSubcategoryPage;

@Listeners(genericUtility.ListnersImplementationClass.class)
public class B_ECommerce_Sub_Category_All_Actions extends FMS_BaseClass {
	
	JavaUtility jUtil = new JavaUtility();
	
	WebDriverUtility wUtil = new WebDriverUtility();
	ExcelFileUtility eUtil = new ExcelFileUtility();
	
	String Rings = "Rings"+jUtil.getRandomNum();
	
	@Test(groups = "sprint-3", priority = 1)
	public void a1_searching1CategoryTest()throws Exception 
	{
		Thread.sleep(2000);
		
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getEcommerceDrpDwn().click();
		
        Thread.sleep(2000);
        
        EcommercePage ecPage = new EcommercePage(driver);
        ecPage.getSubCategoryLnk().click();
        
        Thread.sleep(2000);
        
        Ecommerce_SubCategoryPage ecscPage = new Ecommerce_SubCategoryPage(driver);
        ecscPage.getSearchEdt().sendKeys("Necklace");
        
        
	}
	
	@Test(groups = "sprint-3", priority = 2)
	public void a2_adding1SubCategoryTest() throws Exception
	{
		
		String CategoryName = "Fingers";
		String SubCategoryName = "Chains"+jUtil.getSingleRandomnumber();
		String ImagePath = eUtil.readDataFromExcel("ImagePath", 0, 1);
		
        Thread.sleep(2000);
		
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getEcommerceDrpDwn().click();
		
        Thread.sleep(2000);
        
        EcommercePage ecPage = new EcommercePage(driver);
        ecPage.getSubCategoryLnk().click();
        
        Thread.sleep(2000);
        
        Ecommerce_SubCategoryPage ecscPage = new Ecommerce_SubCategoryPage(driver);
        ecscPage.getAddSubCategoryBtn().click();
        
        Thread.sleep(2000);
        
        Ecommerce_SubCategory_AddSubcategoryPage ecscascPage = new Ecommerce_SubCategory_AddSubcategoryPage(driver);
        ecscascPage.addSubCategory(driver, CategoryName, SubCategoryName, ImagePath);
        
        Thread.sleep(2000);
        
	}
	
    @Test(groups = "sprint-3", priority = 3)
	public void a3_editing1SubCategoryTest() throws Exception    //Pending
	{
    	String CategoryName = "Fingers";;
		String SubCategoryName = "Bangles"+jUtil.getRandomNum();
		String EditCategoryName = "Fingers";;
		String EditSubCategoryName = "Chains"+jUtil.getRandomNum();
		String ImagePath = eUtil.readDataFromExcel("ImagePath", 1, 1);
	    
        Thread.sleep(2000);
		
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getEcommerceDrpDwn().click();
		
        Thread.sleep(2000);
        
        EcommercePage ecPage = new EcommercePage(driver);
        ecPage.getSubCategoryLnk().click();
        
        Thread.sleep(2000);
        
        Ecommerce_SubCategoryPage ecscPage = new Ecommerce_SubCategoryPage(driver);
        ecscPage.getAddSubCategoryBtn().click();
        
        Thread.sleep(2000);
        
        Ecommerce_SubCategory_AddSubcategoryPage ecscascPage = new Ecommerce_SubCategory_AddSubcategoryPage(driver);
        ecscascPage.addSubCategory(driver, CategoryName, SubCategoryName, ImagePath);
        
        Thread.sleep(2000);
        
        ecscPage.clickOnParticularEditBtn(driver, SubCategoryName);
        
        Thread.sleep(2000);
        
        Ecommerce_SubCategory_EditSubcategoryPage esesPage = new Ecommerce_SubCategory_EditSubcategoryPage(driver);
        esesPage.editingSubCategory(driver, EditCategoryName, EditSubCategoryName, ImagePath);
        
        
	}
	
	 @Test(groups = "sprint-3", priority = 4)
	 public void a4_clickOnParticularBootStrapButtonToEnablingOrDisablingCategoryTest()throws Exception
	 {
		 String CategoryName = "Fingers";
		 String SubCategoryName = "Chains"+jUtil.getRandomNum();
		 String ImagePath = eUtil.readDataFromExcel("ImagePath", 0, 1);
		 
		 Thread.sleep(5000);
		 
		 DashboardPage dbPage = new DashboardPage(driver);
		 dbPage.getEcommerceDrpDwn().click();
	 
	     Thread.sleep(2000);
	     
	     EcommercePage ecPage = new EcommercePage(driver);
	     ecPage.getSubCategoryLnk().click();
	     
	     Thread.sleep(2000);
	     
	     Ecommerce_SubCategoryPage esPage = new Ecommerce_SubCategoryPage(driver);
	     esPage.getAddSubCategoryBtn().click();
	     
	     Thread.sleep(2000);
	     
	     Ecommerce_SubCategory_AddSubcategoryPage ecscascPage = new Ecommerce_SubCategory_AddSubcategoryPage(driver);
	     ecscascPage.addSubCategory(driver, CategoryName, SubCategoryName, ImagePath);
	     
	     Thread.sleep(2000);
	     
	     Ecommerce_SubCategoryPage escPage = new Ecommerce_SubCategoryPage(driver);
	     escPage.clickOnParticularSubCategoryBootstrapBtnToDisableParticularSubCategory(driver, SubCategoryName);
	     
		 Thread.sleep(2000);
		 
		 escPage.clickOnParticularSubCategoryDeleteBtn(driver, SubCategoryName);
		 
		 Thread.sleep(2000);
		 
	 }
	
}
