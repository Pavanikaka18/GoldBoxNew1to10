package sprint_3_Positive;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.ExcelFileUtility;
import genericUtility.FMS_BaseClass;
import genericUtility.JavaUtility;
import objectRepository.DashboardPage;
import objectRepository.EcommercePage;
import objectRepository.Ecommerce_CategoryPage;
import objectRepository.Ecommerce_Category_AddCategoryPage;
import objectRepository.Ecommerce_Category_EditCategoryPage;

@Listeners(genericUtility.ListnersImplementationClass.class)
public class A_ECommerce_Category_All_Actions extends FMS_BaseClass {
	
	ExcelFileUtility eUtil = new ExcelFileUtility();
	JavaUtility jUtil = new JavaUtility();
	
	@Test(groups = "sprint-3", priority = 1)
	public void a1_addingCaterogeyTest() throws Exception 
	{
		String CategoryName = "Chains1"+jUtil.getRandomNum();
		String ImagePath = eUtil.readDataFromExcel("ImagePath", 0, 1);
		String EditCategoryName = "EditChains"+jUtil.getRandomNum();
		
        Thread.sleep(3000);
        
        DashboardPage dbPage = new DashboardPage(driver);
        dbPage.getEcommerceDrpDwn().click();
        
        Thread.sleep(2000);
        
        EcommercePage ecPage = new EcommercePage(driver);
        ecPage.getCategoryLnk().click();
        
        Thread.sleep(2000);
        
        Ecommerce_CategoryPage eccPage = new Ecommerce_CategoryPage(driver);
        eccPage.getAddCategoryBtn().click();
        
        Thread.sleep(3000);
        
        Ecommerce_Category_AddCategoryPage eccacPage = new Ecommerce_Category_AddCategoryPage(driver);
        eccacPage.addCategory(driver, CategoryName,ImagePath);
        
        Thread.sleep(2000);
        
        eccPage.clickOnParticularCategoryEditBtn(driver, CategoryName);
        
        Thread.sleep(2000);
        
        Ecommerce_Category_EditCategoryPage eccecPage = new Ecommerce_Category_EditCategoryPage(driver);
        eccecPage.editCategory(driver, EditCategoryName, ImagePath);
        
	}
	
	@Test(groups = "sprint-3", priority = 2)
	public void a2_editingCategoryTest()throws Exception
	{
		String CategoryName = "Chains"+jUtil.getRandomNum();
		String EditCategoryName = "EditChains"+jUtil.getRandomNum();
		String ImagePath = eUtil.readDataFromExcel("ImagePath", 0, 1);
		
        Thread.sleep(3000);
        
        DashboardPage dbPage = new DashboardPage(driver);
        dbPage.getEcommerceDrpDwn().click();
        
        Thread.sleep(2000);
        
        EcommercePage ecPage = new EcommercePage(driver);
        ecPage.getCategoryLnk().click();
        
        Thread.sleep(2000);
        
        Ecommerce_CategoryPage eccPage = new Ecommerce_CategoryPage(driver);
        eccPage.getAddCategoryBtn().click();
        
        Thread.sleep(3000);
        
        Ecommerce_Category_AddCategoryPage eccacPage = new Ecommerce_Category_AddCategoryPage(driver);
        eccacPage.addCategory(driver, CategoryName, ImagePath);
        
        Thread.sleep(2000);
        
        eccPage.clickOnParticularCategoryEditBtn(driver, CategoryName);
        
        Thread.sleep(2000);
        
        Ecommerce_Category_EditCategoryPage eccecPage = new Ecommerce_Category_EditCategoryPage(driver);
        eccecPage.editCategory(driver, EditCategoryName, ImagePath);
        
        
		
	}
	
	
	  @Test(groups = "sprint-3", priority = 3)
	  public void a3_categoryBootStrapButtonTurningOnOrOffTest() throws Exception
	  {
		    String EditCategoryName = "Chains"+jUtil.getRandomNum();
		    String ImagePath = eUtil.readDataFromExcel("ImagePath", 0, 1);
			
	        Thread.sleep(3000);
	        
	        DashboardPage dbPage = new DashboardPage(driver);
	        dbPage.getEcommerceDrpDwn().click();
	        
	        Thread.sleep(2000);
	        
	        EcommercePage ecPage = new EcommercePage(driver);
	        ecPage.getCategoryLnk().click();
	        
	        Thread.sleep(2000);
	        
	        Ecommerce_CategoryPage eccPage = new Ecommerce_CategoryPage(driver);
	        eccPage.getAddCategoryBtn().click();
	        
	        Thread.sleep(2000);
	        
	        Ecommerce_Category_AddCategoryPage eccacPage = new Ecommerce_Category_AddCategoryPage(driver);
	        eccacPage.addCategory(driver, EditCategoryName, ImagePath);
	        
	        Thread.sleep(2000);
	        
	        eccPage.clickOnParticularCategoryBootStrapBtnToDisableParticularCategory(driver, EditCategoryName);
	        
	        Thread.sleep(2000);
		  
		  
	  }
	  
	  @Test
	  public void a4_deletingParticularCategoryTest() throws Exception
	  {
		    String EditCategoryName = "Chains"+jUtil.getRandomNum();
		    String ImagePath = eUtil.readDataFromExcel("ImagePath", 0, 1);
		    
            Thread.sleep(3000);
	        
	        DashboardPage dbPage = new DashboardPage(driver);
	        dbPage.getEcommerceDrpDwn().click();
	        
	        Thread.sleep(2000);
	        
	        EcommercePage ecPage = new EcommercePage(driver);
	        ecPage.getCategoryLnk().click();
	        
	        Thread.sleep(2000);
	        
	        Ecommerce_CategoryPage eccPage = new Ecommerce_CategoryPage(driver);
	        eccPage.getAddCategoryBtn().click();
	        
	        Thread.sleep(2000);
	        
	        Ecommerce_Category_AddCategoryPage eccacPage = new Ecommerce_Category_AddCategoryPage(driver);
	        eccacPage.addCategory(driver, EditCategoryName,ImagePath);
	        
	        Thread.sleep(2000);
	        
	        eccPage.clickOnParticularCategoryDeleteBtn(driver, EditCategoryName);
	        
	        Thread.sleep(2000);
		    
		  
	  }
	  
 }

