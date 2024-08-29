package Sprint_6_Positive_Negative;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import genericUtility.ExcelFileUtility;
import genericUtility.FMS_BaseClass;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import objectRepository.DashboardPage;
import objectRepository.Events_EventRequest_StatusUpdatePage;
import objectRepository.Events_EventsRequestsPage;
import objectRepository.Events_EventsRequests_EventDetailsPage;

@Listeners(genericUtility.ListnersImplementationClass.class)
public class g_EventsAllActions extends FMS_BaseClass {

	WebDriverUtility wUtility = new WebDriverUtility();
	JavaUtility jUtility = new JavaUtility();
	ExcelFileUtility eUtility = new ExcelFileUtility();
	
	@Test
	public void eventsAllActionsTest() throws Exception
	{
		String SearchValue = eUtility.readDataFromExcel("Sprint-6 Negative", 40, 1);
		String SearchValue1 = eUtility.readDataFromExcel("Sprint-6 Negative", 40, 2);
		//1 Search Feild
		
		Thread.sleep(4000);
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getEventsLnk().click();
		Events_EventsRequestsPage eerPage = new Events_EventsRequestsPage(driver);
		eerPage.getSearchEdt().sendKeys(SearchValue);
		Thread.sleep(2000);
		eerPage.getSearchEdt().clear();
		Thread.sleep(2000);
		eerPage.getSearchEdt().sendKeys(SearchValue1);
		WebElement EventNotFound = driver.findElement(By.xpath("//h5[.='No matching records found']"));
		String Msg = EventNotFound.getText();
		if(EventNotFound.isDisplayed())
		{
			wUtility.takeScreenShot(driver, "a_Searching Invalid Event");
		}
		else
		{
			System.out.println("Event Displayed");
		}
		
		
		//2 Next -- Prev Button
		
		Thread.sleep(4000);		
		driver.navigate().refresh();		
		Thread.sleep(2000);
		eerPage.getNextPageBtn().click();
		Thread.sleep(2000);
		//eerPage.getPreviousPageBtn().click();
		//Thread.sleep(2000);
		
		//3 Info 
		 
		Thread.sleep(4000);		
		driver.navigate().refresh();		
		Thread.sleep(2000);
		eerPage.getActionInfoBtn().click();
		Thread.sleep(2000);
		Events_EventsRequests_EventDetailsPage evfPage = new Events_EventsRequests_EventDetailsPage(driver);
		evfPage.getSearchEdt().sendKeys(SearchValue);
		Thread.sleep(2000);
	    WebElement EmptyEvent = driver.findElement(By.xpath("//div[@class='table-responsive']"));
	    String a = EmptyEvent.getText(); 
		Thread.sleep(2000); 
		System.out.println(a);
		if (a.isEmpty()) 
		{
			System.out.println("Event is EmptyEvent");
			wUtility.takeScreenShot(driver, a);
			
		}
		else {
			System.out.println("Event is not Empty");
		}
		
		//4 
		
		Thread.sleep(4000);		
		driver.navigate().back();		
		Thread.sleep(2000);
//		for(;;)
//		{
//			try 
//			{
//				Thread.sleep(2000);
//				eerPage.getStatusUpdateDrpDwn().click();
//				break;
//			} 
//			catch (Exception e) 
//			{
//				Thread.sleep(2000);
//				eerPage.getNextPageBtn().click();
//			}
//		}
//		Thread.sleep(3000);
//		Events_EventRequest_StatusUpdatePage eersuPage = new Events_EventRequest_StatusUpdatePage(driver);
//		eersuPage.eventStatusUpdation(driver);
//		driver.navigate().refresh();
//		Thread.sleep(5000);
		
	}
	
	
}
