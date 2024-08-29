package sprint_3_Positive;

import org.testng.annotations.Test;
import genericUtility.FMS_BaseClass;
import objectRepository.DashboardPage;
import objectRepository.EcommercePage;
import objectRepository.Ecommerce_EcomTransactionsPage;

public class F_ECom_Transactions_All_Actions extends FMS_BaseClass {
	
	String Name = "naresh";
	
	@Test(groups = "sprint-3", priority = 1)
	public void a_ECommerceTransactionsTest() throws Exception
	{
        Thread.sleep(5000);
        DashboardPage dbPage = new DashboardPage(driver);
        dbPage.getEcommerceDrpDwn().click();
        
        Thread.sleep(2000);
        EcommercePage ePage = new EcommercePage(driver);
        ePage.getEcomTransactionsLnk().click();
        
        Thread.sleep(2000);
        Ecommerce_EcomTransactionsPage eePage = new Ecommerce_EcomTransactionsPage(driver);
        eePage.searchTransactionWithName(driver, Name);
        
		
	}

}
