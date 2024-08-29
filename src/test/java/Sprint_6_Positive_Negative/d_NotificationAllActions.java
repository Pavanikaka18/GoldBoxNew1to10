package Sprint_6_Positive_Negative;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericUtility.ExcelFileUtility;
import genericUtility.FMS_BaseClass;
import genericUtility.JavaUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import objectRepository.DashboardPage;
import objectRepository.NotificationListPage;
import objectRepository.Notification_AddNotificationPage;
import objectRepository.Notification_MessageViewPage;
import objectRepository.Notification_UpdateNotificationPage;

@Listeners(genericUtility.ListnersImplementationClass.class)
public class d_NotificationAllActions extends FMS_BaseClass {

	ExcelFileUtility eUtil = new ExcelFileUtility();
	PropertyFileUtility pUtil = new PropertyFileUtility();
	WebDriverUtility wUtil = new WebDriverUtility();
	JavaUtility jUtil = new JavaUtility();
	
	@Test
	public void notificationsAllActionsTest() throws Exception
	{
		String NotificationSearchValue = eUtil.readDataFromExcel("Sprint-6 Negative", 6, 1);
		String NotificationSearchValue1 = eUtil.readDataFromExcel("Sprint-6 Negative", 6, 2);
		String Title = eUtil.readDataFromExcel("Sprint-6 Negative", 9, 1);
		String Message = eUtil.readDataFromExcel("Sprint-6 Negative", 10, 1);
		String Type = eUtil.readDataFromExcel("Sprint-6 Negative", 11, 1);
		
		String UpdateTitle = eUtil.readDataFromExcel("Sprint-6 Negative", 14, 1);
		String UpdateMessage = eUtil.readDataFromExcel("Sprint-6 Negative", 15, 1);
		String UpdateType = eUtil.readDataFromExcel("Sprint-6 Negative", 16, 1);
		 
		
		Thread.sleep(5000);
		DashboardPage dPage = new DashboardPage(driver);
		dPage.getNotificationLnk().click();
		Thread.sleep(1000);
		NotificationListPage nlPage = new NotificationListPage(driver);
		nlPage.searchedInvalidNotification(NotificationSearchValue);
		WebDriverUtility wUtil = new WebDriverUtility();
		Thread.sleep(3000);
		nlPage.getSearchEdt().clear();
		Thread.sleep(2000);
		nlPage.searchedInvalidNotification(NotificationSearchValue1);
		Thread.sleep(1000);
		WebElement NoRecordsFoundMsg = driver.findElement(By.xpath("//h5[.='No records found']"));
		Thread.sleep(1000);
		if(NoRecordsFoundMsg.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "a_Searching Invalid Notification Error");
		}
		else
		{
			System.out.println("Searched Notification Displayed");
		}
		Thread.sleep(2000);
		nlPage.getSearchEdt().clear();
		Thread.sleep(2000);
		nlPage.getAddNotificationBtn().click();
		Thread.sleep(2000);
		Notification_AddNotificationPage nanPage = new Notification_AddNotificationPage(driver);
		nanPage.getTitleEdt().sendKeys(Title);
		Thread.sleep(2000);
		nanPage.getAddBtn().click();
		if(nanPage.getAddBtn().isDisplayed())
		{
			wUtil.takeScreenShot(driver, "b_Adding Notification By Giving Only Title");
		}
		else
		{
			System.out.println("Notification Added Successfully");
		}
		Thread.sleep(2000);
		nanPage.getMessageEdt().sendKeys(Message);
		Thread.sleep(2000);
		nanPage.getAddBtn().click();
		if(nanPage.getAddBtn().isDisplayed())
		{
			wUtil.takeScreenShot(driver, "c_Adding Notification By Giving Only Title, Message");
		}
		else
		{
			System.out.println("Notification Added Successfully");
		}
		Thread.sleep(2000);
		nanPage.getTypeEdt().sendKeys(Type);
		Thread.sleep(2000);
		nanPage.getAddBtn().click();
		Thread.sleep(1000);
		WebElement SuccessMsg = driver.findElement(By.xpath("(//div[.=' Notification Created Successfully '])[2]"));
		
		if(SuccessMsg.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "d_Adding Notification With Valid Details Success");
		}
		else
		{
			System.out.println("Notification Not Added Successfully");
		}
		Thread.sleep(2000);
		driver.navigate().refresh();		
		Thread.sleep(2000);
		nlPage.clickOnParticularNotificationMsgViewBtn(driver, Title);
		Thread.sleep(2000);
		WebElement MsgPage = driver.findElement(By.xpath("(//div[@class='modal-content'])[1]"));
		if(MsgPage.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "e_Clicking On Message View Button Msg Page Sould Not Display");
		}
		else
		{
			System.out.println("Message Page Is Not Displayed");
		}
		Thread.sleep(2000);
		Notification_MessageViewPage nmvPage = new Notification_MessageViewPage(driver);
		nmvPage.getUnderstoodBtn().click();
		Thread.sleep(1000);
		if(nmvPage.getUnderstoodBtn().isDisplayed())
		{
			System.out.println("Notification Message Page Is Not Closed");
		}
		else
		{
			wUtil.takeScreenShot(driver, "f_Clicking On Understand Button Notification Message Page Should Not Close Error");
		}
		Thread.sleep(2000);
		nlPage.clickOnParticularNotificationEditButton(driver, Title);
		Thread.sleep(2000);
		Notification_UpdateNotificationPage nunPage = new Notification_UpdateNotificationPage(driver);
		nunPage.updateNotification(UpdateTitle, UpdateMessage, UpdateType);
		Thread.sleep(2000);
		nlPage.sendParticularNotification(driver, UpdateTitle);
		Thread.sleep(1000);
		WebElement SendMsg = driver.findElement(By.xpath("(//div[.=' Notifications sent successfully '])[2]"));
		if(SendMsg.isDisplayed())
		{
			Thread.sleep(4000);
			wUtil.takeScreenShot(driver, "h_Clicking On Send Button Notification Should Not Send");
		}
		else 
		{
			wUtil.takeScreenShot(driver, "h_Clicking On Send Button Notification Should Not Send");
		}
		nlPage.deleteParticularNotification(driver, UpdateTitle);
		Thread.sleep(2000);
		WebElement DeleteMsg = driver.findElement(By.xpath("(//div[.=' Notification Deleted Successfully '])[2]"));
		if(DeleteMsg.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "i_Clicking On Delete Button Notification Should Not Delete");
		}
		else
		{
			System.out.println("Notification Not Deleted");
		}
		
		
//		WebElement Page = driver.findElement(By.xpath("//div[@class='table-responsive']"));
//		String Value = Page.getText();
//		if(Value.isEmpty())
//		{
//			
//		}
		
	}
	
}
