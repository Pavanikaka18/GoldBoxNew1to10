package Sprint_6_Positive_Negative;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.ExcelFileUtility;
import genericUtility.FMS_BaseClass;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import objectRepository.DashboardPage;

@Listeners(genericUtility.ListnersImplementationClass.class)
public class a_DashboardAllActions extends FMS_BaseClass {

	WebDriverUtility wUtil = new WebDriverUtility();
	ExcelFileUtility eUtil = new ExcelFileUtility();
	JavaUtility jUtil = new JavaUtility();
	
	@Test
	public void dashboardTransactionReportsTest() throws Exception
	{
		String StartDate = eUtil.readDataFromExcel("Sprint-6 Negative", 1, 1);
		String StartYear = eUtil.readDataFromExcel("Sprint-6 Negative", 3, 1);
		String StartMonth = eUtil.readDataFromExcel("Sprint-6 Negative", 2, 1);
		String EndDate = eUtil.readDataFromExcel("Sprint-6 Negative", 2, 5);
		String EndMonth = eUtil.readDataFromExcel("Sprint-6 Negative", 2, 3);
		String EndYear = eUtil.readDataFromExcel("Sprint-6 Negative", 3, 3);
		
		DashboardPage dPage = new DashboardPage(driver);
		dPage.checkingTransactionReport(driver, StartYear, StartDate, StartMonth, EndDate);
		
		
		
	}
	
}
