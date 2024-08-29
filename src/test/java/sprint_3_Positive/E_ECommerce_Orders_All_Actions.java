package sprint_3_Positive;

import org.testng.annotations.Test;
import genericUtility.FMS_BaseClass;
import genericUtility.WebDriverUtility;
import objectRepository.DashboardPage;
import objectRepository.EcommercePage;
import objectRepository.Ecommerce_EcommerceOrdersPage;
import objectRepository.Ecommerce_EcommerceOrders_FilterPage;
import objectRepository.Ecommerce_EcommerceOrders_OrderedProductsPage;
import objectRepository.Ecommerce_EcommerceOrders_StatusPage;

public class E_ECommerce_Orders_All_Actions extends FMS_BaseClass {
	
	WebDriverUtility wUtil = new WebDriverUtility();
	
	String CustomerName = "naresh";
	long OrderId = 9892369397l;
	String StartDate = "28/2/2024";
	String EndDate = "28/3/2024";
	String MobileNumber = "919892369397";
	
	@Test(groups = "sprint-3", priority = 1)
	public void eCommerceOrders()throws Exception
	{
        Thread.sleep(5000);
        
        DashboardPage dbPage = new DashboardPage(driver);
        dbPage.getEcommerceDrpDwn().click();
        
        Thread.sleep(2000);
        
        EcommercePage ePage = new EcommercePage(driver);
        ePage.getEcommerceOrdersLnk().click();
        
        Thread.sleep(5000);
        
        Ecommerce_EcommerceOrdersPage eeoPage = new Ecommerce_EcommerceOrdersPage(driver);
        eeoPage.searchCustomer(CustomerName);
        
        Thread.sleep(1000);
        
        eeoPage.getSearchEdt().clear();
        
        Thread.sleep(1000);
        
        driver.navigate().refresh();
        
        Thread.sleep(1000);
        
        eeoPage.getProductsViewBtn().click();
        
        Thread.sleep(1000);
        
        Ecommerce_EcommerceOrders_OrderedProductsPage eeopPage = new Ecommerce_EcommerceOrders_OrderedProductsPage(driver);
        eeopPage.clickOnCloseOrderedPageButton();
        
        Thread.sleep(2000);
        
        eeoPage.clickOnParticularProductStatusBtn(OrderId, driver);
        
        Thread.sleep(2000);
        
        Ecommerce_EcommerceOrders_StatusPage eesPage = new Ecommerce_EcommerceOrders_StatusPage(driver);
        eesPage.clickOnStatusPageCloseBtn();
        
        Thread.sleep(2000);
        
        eeoPage.getFilterBtn().click();
        
        Thread.sleep(2000);
        
        Ecommerce_EcommerceOrders_FilterPage eefPage = new Ecommerce_EcommerceOrders_FilterPage(driver);
        eefPage.searchDateStatusMobileNumberWiseInFilter(driver, StartDate, EndDate, MobileNumber);
        
        
        
        
       
	}
}