package Sprint_7_Positive;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.FMS_BaseClass;
import objectRepository.DashboardPage;
import objectRepository.EcommercePage;
import objectRepository.Ecommerce_BrandsPage;
import objectRepository.Ecommerce_CategoryPage;
import objectRepository.Ecommerce_ProductsListPage;
import objectRepository.Ecommerce_SubCategoryPage;

@Listeners(genericUtility.ListnersImplementationClass.class)
public class c_Deleting_CategorySubCategoryAndProduct_In_Fms extends FMS_BaseClass {

	@Test
	public void c_DeletingCategorySubCategoryProductInFmsTest() throws Exception
	{
		String CategoryName = "EditChains";
		String SubCategoryName = "EditChains";
	    
		Thread.sleep(5000);
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getEcommerceDrpDwn().click();
		Thread.sleep(2000);
		EcommercePage ecPage = new EcommercePage(driver);
		ecPage.getProductsLnk().click();
		Thread.sleep(2000);
		Ecommerce_ProductsListPage eplPage = new Ecommerce_ProductsListPage(driver);
		eplPage.getDeleteBtn().click();
		Thread.sleep(2000);
		ecPage.getBrandsLnk().click();
		Thread.sleep(2000);
		Ecommerce_BrandsPage ebPage = new Ecommerce_BrandsPage(driver);
		ebPage.getDeleteBtn().click();
		Thread.sleep(2000);
		ecPage.getSubCategoryLnk().click();
		Thread.sleep(2000);
		Ecommerce_SubCategoryPage esPage = new Ecommerce_SubCategoryPage(driver);
		esPage.clickOnParticularSubCategoryDeleteBtn(driver, SubCategoryName);
		Thread.sleep(2000);
		ecPage.getCategoryLnk().click();
		Thread.sleep(2000);
		Ecommerce_CategoryPage eccPage = new Ecommerce_CategoryPage(driver);
		eccPage.clickOnParticularCategoryDeleteBtn(driver, CategoryName);
		Thread.sleep(4000);
		
		
	}
	
}
