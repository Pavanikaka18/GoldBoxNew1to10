package Sprint_5_Negative;

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
import objectRepository.Coupons_CouponsListPage;

@Listeners(genericUtility.ListnersImplementationClass.class)
public class b_CouponsAllActions extends FMS_BaseClass {

	WebDriverUtility wUtil = new WebDriverUtility();
	JavaUtility jUtil = new JavaUtility();
	ExcelFileUtility eUtil = new ExcelFileUtility();
	PropertyFileUtility pUtil = new PropertyFileUtility();
	
	@Test(groups = "Sprint-5",priority = 1)
	public void a_couponListAllActionsTest() throws Exception
	{
		SoftAssert sa = new SoftAssert();
		Coupons_CouponsListPage cclPage = new Coupons_CouponsListPage(driver);
		
		String CouponListCouopnAmount = eUtil.readDataFromExcel("Sprint-5 Negative", 95, 1);
		String CouponListFromDate = eUtil.readDataFromExcel("Sprint-5 Negative", 96, 1);
		String CouponListToDate = eUtil.readDataFromExcel("Sprint-5 Negative", 97, 1);
		String CouponListFromDate2 = eUtil.readDataFromExcel("Sprint-5 Negative", 96, 2);
		String CouponListToDate2 = eUtil.readDataFromExcel("Sprint-5 Negative", 97, 2);
		String CouponListMinTransAmount = eUtil.readDataFromExcel("Sprint-5 Negative", 98, 1);
		String CouponListMinTransAmount2 = eUtil.readDataFromExcel("Sprint-5 Negative", 98, 2);
		String CouponListDescription = eUtil.readDataFromExcel("Sprint-5 Negative", 99, 1);
		String CouponListSearchValue = eUtil.readDataFromExcel("Sprint-5 Negative", 99, 4);
		String EditCouponListCouponAmount = eUtil.readDataFromExcel("Sprint-5 Negative", 102, 1);
		String EditCouponListFromDate = eUtil.readDataFromExcel("Sprint-5 Negative", 103, 1);
		String EditCouponListToDate = eUtil.readDataFromExcel("Sprint-5 Negative", 104, 1);
		String EditCouponListMinTransAmount = eUtil.readDataFromExcel("Sprint-5 Negative", 105, 1);
		String EditCouponListDescription = eUtil.readDataFromExcel("Sprint-5 Negative", 106, 1);
		String EditCouponListDescription2 = eUtil.readDataFromExcel("Sprint-5 Negative", 107, 1);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[.='Coupons']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.='Coupons List']")).click();
		Thread.sleep(5000);
		WebElement AddCouponBtn = driver.findElement(By.xpath("//button[.='Add Coupon']"));
		wUtil.waitForElementToBeVisible(driver, AddCouponBtn);
		AddCouponBtn.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Add']")).click();
		Thread.sleep(1000);
		WebElement AmountRequiredError = driver.findElement(By.xpath("//h1[.='Add coupon']/ancestor::div[@class='modal-content']//label[.='Coupon Amount']/following-sibling::div/div[.='Amount is required']"));
		if(AmountRequiredError.isDisplayed())
		{
			sa.fail();
			wUtil.takeScreenShot(driver, "a_Without Giving Amount In Coupon Amount Field Error");
		}
		else
		{
			System.out.println("a_Coupon Added Successfully Without Giving Any Coupon Details");
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/ancestor::div[@class='modal-content']//input[@formcontrolname='amount']")).sendKeys(CouponListCouopnAmount);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Add']")).click();
		
		WebElement FromDateError = driver.findElement(By.xpath("//h1[.='Add coupon']/ancestor::div[@class='modal-content']//input[@formcontrolname='from_date']/following-sibling::div/div[.='From_date is required']"));
		Thread.sleep(1000);
		if(FromDateError.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "b_Without Giving From Date In Coupon From Date Field Error");
		}
		else
		{
			System.out.println("b_Coupon Added Successfully By Giving Only Coupon Amount");
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/ancestor::div[@class='modal-content']//input[@formcontrolname='from_date']")).sendKeys(CouponListFromDate);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Add']")).click();
		Thread.sleep(1000);
		WebElement ToDateError = driver.findElement(By.xpath("//h1[.='Add coupon']/ancestor::div[@class='modal-content']//input[@formcontrolname='to_date']/following-sibling::div/div[.='To_date is required']"));
        Thread.sleep(1000);
        if(ToDateError.isDisplayed())
        {
        	wUtil.takeScreenShot(driver, "c_Without Giving To Date In Coupon From Date Field Error");
        }
        else 
		{
			System.out.println("c_Coupon Added Successfully By Giving Only Coupon Amount,From Date");
		}
        Thread.sleep(5000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/ancestor::div[@class='modal-content']//input[@formcontrolname='to_date']")).sendKeys(CouponListToDate);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Add']")).click();
		Thread.sleep(1000);
		WebElement TransAmountError = driver.findElement(By.xpath("//h1[.='Add coupon']/ancestor::div[@class='modal-content']//input[@formcontrolname='minimum_transaction_amount']/following-sibling::div/div[.='Minimum_transaction_amount is required ']"));
        Thread.sleep(1000);
		if(TransAmountError.isDisplayed())
		{
			sa.fail();
			wUtil.takeScreenShot(driver, "d_Without Giving Minimum Transaction Amount Error");
		}
		else 
		{
			System.out.println("d_Coupon Added Successfully By Giving Only Coupon Amount,From Date,To Date");
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/ancestor::div[@class='modal-content']//input[@formcontrolname='minimum_transaction_amount']")).sendKeys(CouponListMinTransAmount);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Add']")).click();
		Thread.sleep(1000);
		WebElement DescriptionRequiredError = driver.findElement(By.xpath("//h1[.='Add coupon']/ancestor::div[@class='modal-content']//textarea[@formcontrolname='description']/following-sibling::div/div[.='description is required']"));
        Thread.sleep(1000);
		if(DescriptionRequiredError.isDisplayed())
		{
			sa.fail();
			wUtil.takeScreenShot(driver, "e_Without Giving Coupon Description Error");
		}
		else 
		{
			System.out.println("e_Coupon Added Successfully By Giving Only Coupon Amount,From Date,To Date,Min Trans Amount");
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/ancestor::div[@class='modal-content']//textarea[@formcontrolname='description']")).sendKeys(CouponListDescription);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Add']")).click();
		Thread.sleep(1000);
		WebElement MinimumTransactionAmountShouldBeGreaterThanAmount = driver.findElement(By.xpath("(//div[.=' Minimum Transaction Amount should be greater than Amount. '])[2]"));
        Thread.sleep(1000);
        if(MinimumTransactionAmountShouldBeGreaterThanAmount.isDisplayed())
        {
        	sa.fail();
        	wUtil.takeScreenShot(driver, "f_Giving Minimum Transaction Amount Less Than Total Amount In Coupon List Page Error");
        }
        else 
		{
			System.out.println("f_Coupon Added Successfully By Giving Min Trans Amount Less Than Coupon Amount");
		}
        Thread.sleep(5000);
        driver.findElement(By.xpath("//h1[.='Add coupon']/ancestor::div[@class='modal-content']//input[@formcontrolname='minimum_transaction_amount']")).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//h1[.='Add coupon']/ancestor::div[@class='modal-content']//input[@formcontrolname='minimum_transaction_amount']")).sendKeys(CouponListMinTransAmount2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Add']")).click();
		Thread.sleep(1000);
		WebElement DateError = driver.findElement(By.xpath("(//div[.=' From Date and To Date cannot be less than current date '])[2]"));
		Thread.sleep(1000);
		if(DateError.isDisplayed())
		{
			sa.fail();
			wUtil.takeScreenShot(driver, "g_From Date and To Date cannot be less than current Date Error");
		}
		else 
		{
			System.out.println("g_Coupon Added Successfully By Giving From And To Dates Less Than Less Tan Current Dates");
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/ancestor::div[@class='modal-content']//input[@formcontrolname='from_date']")).sendKeys(CouponListFromDate2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/ancestor::div[@class='modal-content']//input[@formcontrolname='to_date']")).sendKeys(CouponListToDate2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Add']")).click();
		Thread.sleep(1000);
		WebElement SuccessMsg = driver.findElement(By.xpath("(//div[.=' coupon added successfully '])[2]"));
		Thread.sleep(1000);
		if(SuccessMsg.isDisplayed())
		{
			System.out.println("Coupon Added Successfully");
			//wUtil.takeScreenShot(driver, "h_Coupon Added Successfully");
		}
		else 
		{
			System.out.println("h_Coupon Is Not Added Successfully By Giving Valid Details");
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[.='View'])[1]")).click();
		Thread.sleep(4000);
		WebElement CloseBtn = driver.findElement(By.xpath("//h1[.='Coupon Description']/following-sibling::button[@aria-label='Close']"));
		if(CloseBtn.isDisplayed())
		{
			System.out.println("Coupon Description Page Should Not Open");
			//wUtil.takeScreenShot(driver, "i_Coupon Description Page Should Not Open Error");
		}
		else 
		{
			System.out.println("i_Coupon Description Page is Opened After Clicking On View Button");
		}
		Thread.sleep(2000);
		CloseBtn.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[.='Used Users'])[1]")).click();
		Thread.sleep(2000);
		WebElement CouponUsedUsersPage = driver.findElement(By.xpath("//h4[.='Coupon Users Details']"));
		if(CouponUsedUsersPage.isDisplayed())
		{
			System.out.println("Coupon Users Details Should Not Open But Opened");
			//wUtil.takeScreenShot(driver, "j_Coupon Users Details Should Not Open");
		}
		else 
		{
			System.out.println("j_Coupon Users Details Page is Opened After Clicking On Users Details Button");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys(CouponListSearchValue);
		Thread.sleep(1000);
		WebElement NoResultError = driver.findElement(By.xpath("//h5[.='No records found']"));
		if(NoResultError.isDisplayed())
		{
			sa.fail();
			wUtil.takeScreenShot(driver, "k_Search Result Should Display Error");
		}
		else
		{
			System.out.println("k_Searched Coupon Is Displayed");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Coupons List']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys(CouponListSearchValue);
		Thread.sleep(1000);
		WebElement NoRecordsError = driver.findElement(By.xpath("//h5[.='No records found']"));
		Thread.sleep(1000);
		if(NoRecordsError.isDisplayed())
		{
			sa.fail();
			wUtil.takeScreenShot(driver, "l_Searching Invalid Coupon Error");
		}
		else
		{
			System.out.println("l_Searched Coupon Is Displayed");
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Search...']")).clear();
		Thread.sleep(1000);
		
//		Edit Element Traversing from Amount 
//		driver.findElement(By.xpath("(//td[.='₹500.00']/following-sibling::td[.='₹1,000.00']/following-sibling::td//button[.='Edit'])[1]")).click();
		
		driver.navigate().refresh();
		
		cclPage.getActionsEditBtn().click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/ancestor::div[@class='modal-content']//label[.='Coupon Amount']/following-sibling::input[@placeholder='Enter Amount']")).clear();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[.='Update']")).click();
		WebElement ClearingAmountWhileUpdatingCouponSuccessMsg = driver.findElement(By.xpath("(//div[.=' Data updated successfully '])[2]"));
		Thread.sleep(1000);
//		driver.navigate().refresh();
		if(ClearingAmountWhileUpdatingCouponSuccessMsg.isDisplayed())
		{
			sa.fail();
			wUtil.takeScreenShot(driver, "m_Clearing Amount While Updating Coupon Success Error");
		}
		else
		{
			System.out.println("m_After Clearing Amount While Editing Success");
		}
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		cclPage.getActionsEditBtn().click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/ancestor::div[@class='modal-content']//label[.='From Date']/following-sibling::input[@formcontrolname='from_date']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/ancestor::div[@class='modal-content']//label[.='To Date']/following-sibling::input[@formcontrolname='to_date']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Update']")).click();
//		driver.navigate().refresh();
		WebElement ClearingFromAndToDateWhileUpdatingCouponSuccessMsg = driver.findElement(By.xpath("(//div[.=' Data updated successfully '])[2]"));
		Thread.sleep(5000);
		if(ClearingFromAndToDateWhileUpdatingCouponSuccessMsg.isDisplayed())
		{
			sa.fail();
			wUtil.takeScreenShot(driver, "n_Clearing From And To Dates While Updating Coupon Success Error");
		}
		else
		{
			System.out.println("n_After Clearing From and To Dates While Editing Success");
		}
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		cclPage.getActionsEditBtn().click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/ancestor::div[@class='modal-content']//label[.='Minimum Transaction Amount']/following-sibling::input[@formcontrolname='minimum_transaction_amount']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/ancestor::div[@class='modal-content']//label[.='Description']/following-sibling::textarea[@formcontrolname='description']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Update']")).click();
		WebElement ClearingMinTransAmountAndDescriptionWhileUpdatingCouponSuccessMsg = driver.findElement(By.xpath("(//div[.=' Data updated successfully '])[2]"));
		Thread.sleep(1000);
//		driver.navigate().refresh();
		if(ClearingMinTransAmountAndDescriptionWhileUpdatingCouponSuccessMsg.isDisplayed())
		{
			sa.fail();
			wUtil.takeScreenShot(driver, "o_Clearing Min Trans Amount And Description While Updating Coupon Success Error");
		}
		else
		{
			System.out.println("o_After Clearing Min Trans Amount And Description While Updating Success");
		}
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		cclPage.getActionsEditBtn().click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/ancestor::div[@class='modal-content']//label[.='Coupon Amount']/following-sibling::input[@placeholder='Enter Amount']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/ancestor::div[@class='modal-content']//label[.='Coupon Amount']/following-sibling::input[@placeholder='Enter Amount']")).sendKeys(EditCouponListCouponAmount);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/ancestor::div[@class='modal-content']//label[.='From Date']/following-sibling::input[@formcontrolname='from_date']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/ancestor::div[@class='modal-content']//label[.='From Date']/following-sibling::input[@formcontrolname='from_date']")).sendKeys(EditCouponListFromDate);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/ancestor::div[@class='modal-content']//label[.='To Date']/following-sibling::input[@formcontrolname='to_date']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/ancestor::div[@class='modal-content']//label[.='To Date']/following-sibling::input[@formcontrolname='to_date']")).sendKeys(EditCouponListToDate);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/ancestor::div[@class='modal-content']//label[.='Minimum Transaction Amount']/following-sibling::input[@formcontrolname='minimum_transaction_amount']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/ancestor::div[@class='modal-content']//label[.='Minimum Transaction Amount']/following-sibling::input[@formcontrolname='minimum_transaction_amount']")).sendKeys(EditCouponListMinTransAmount);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/ancestor::div[@class='modal-content']//label[.='Description']/following-sibling::textarea[@formcontrolname='description']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/ancestor::div[@class='modal-content']//label[.='Description']/following-sibling::textarea[@formcontrolname='description']")).sendKeys(EditCouponListDescription);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Update']")).click();
		Thread.sleep(1000);
		WebElement UpdatingCouponErrorMsg = driver.findElement(By.xpath("(//div[.=' From Date and To Date cannot be less than current date '])[2]"));
		Thread.sleep(1000);
		if(UpdatingCouponErrorMsg.isDisplayed())
		{
			sa.fail();
			wUtil.takeScreenShot(driver, "p_Updating Coupon By Giving Previous Dates Error");
		}
		else
		{
			System.out.println("p_Coupon Updated Successfully By Giving From And To Dates less than Current Date");
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/following-sibling::button[@aria-label='Close']")).click();
		Thread.sleep(1000);
		WebElement EditCouponPage = driver.findElement(By.xpath("//h1[..='Edit coupon']"));
		if(EditCouponPage.isDisplayed())
		{
			System.out.println("q_Close Button Clicked But Not Closed Edit Coupon Page");
		}
		else 
		{
			sa.fail();
			wUtil.takeScreenShot(driver, "q_Edit Coupon Page Closed");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='mdc-switch__icons'])[1]")).click();
		WebElement UpdateMsg = driver.findElement(By.xpath("(//div[.='  Coupon Status Updated Successfully. '])[2]"));
		Thread.sleep(1000);
		if(UpdateMsg.isDisplayed())
		{
			sa.fail();
			wUtil.takeScreenShot(driver, "r_Click On Bootstrap Button Coupon Should Not Update");
		}
		else 
		{
			System.out.println("r_Coupon Updated Successfully");
		}
		Thread.sleep(4000);
		
		
	}
	
	
	@Test(groups = "Sprint-5",priority = 2)
	public void b_adminCouponAllActionTest() throws Exception
	{
		SoftAssert as = new SoftAssert();
		
		String AdminCouponSearchValue = eUtil.readDataFromExcel("Sprint-5 Negative", 116, 4);
		String AdminCouponCouponAmount = eUtil.readDataFromExcel("Sprint-5 Negative", 111, 1);
		String AdminCouponFromDate = eUtil.readDataFromExcel("Sprint-5 Negative", 112, 1);
		String AdminCouponToDate = eUtil.readDataFromExcel("Sprint-5 Negative", 113, 1);
		String AdminCouponLatestFromDate = eUtil.readDataFromExcel("Sprint-5 Negative", 112, 2);
		String AdminCouponLatestToDate = eUtil.readDataFromExcel("Sprint-5 Negative", 113, 2);
		String AdminCouponMinTransAmount = eUtil.readDataFromExcel("Sprint-5 Negative", 114, 1);
		String AdminCouponMobileNumber = eUtil.readDataFromExcel("Sprint-5 Negative", 115, 1);
		String AdminCouponValidMobileNumber = eUtil.readDataFromExcel("Sprint-5 Negative", 115, 2);
		String AdminCouponDescription = eUtil.readDataFromExcel("Sprint-5 Negative", 116, 1);
		String EditAdminCouponCouponAmount = eUtil.readDataFromExcel("Sprint-5 Negative", 119, 1);
		String EditAdminCouponFromDate = eUtil.readDataFromExcel("Sprint-5 Negative", 120, 1);
		String EditAdminCouponToDate = eUtil.readDataFromExcel("Sprint-5 Negative", 121, 1);
		String EditAdminCouponMinTransAmount = eUtil.readDataFromExcel("Sprint-5 Negative", 122, 1);
		String EditAdminCouponMobileNumber = eUtil.readDataFromExcel("Sprint-5 Negative", 123, 1);
		String EditAdminCouponDescription = eUtil.readDataFromExcel("Sprint-5 Negative", 124, 1);
		String EditAdminCouponDescription2 = eUtil.readDataFromExcel("Sprint-5 Negative", 125, 1);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[.='Coupons']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.='Admin Coupons']")).click();
		Thread.sleep(2000);
		WebElement SearchEdt = driver.findElement(By.xpath("//input[@placeholder='Search...']"));
		SearchEdt.sendKeys(AdminCouponSearchValue);
		WebElement NoRecordsError = driver.findElement(By.xpath("//h5[.='No records found']"));
		if(NoRecordsError.isDisplayed())
		{
			as.fail();
			wUtil.takeScreenShot(driver, "a_Searching Invalid Admin Coupon Error");
		}
		else 
		{
			System.out.println("a_Searched Coupon Displayed");
		}
		Thread.sleep(1000);
		SearchEdt.clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Add admin Coupon']")).click();
		Thread.sleep(1000);
		WebElement AddCouponPage = driver.findElement(By.xpath("//h1[.='Add coupon']"));
		Thread.sleep(1000);
		if(AddCouponPage.isDisplayed())
		{
			as.fail();
			wUtil.takeScreenShot(driver, "b_Add Coupon Page Should Not Display But Displayed");
		}
		else
		{
			System.out.println("b_Add Coupon Page Is Not Displayed");
		}
		Thread.sleep(1000);
		WebElement AddBtn = driver.findElement(By.xpath("//button[.='Add']"));
		AddBtn.click();
		Thread.sleep(1000);
		WebElement AmountRequiredError = driver.findElement(By.xpath("//label[.='Coupon Amount']/following-sibling::div/div[.='Amount is required']"));
		Thread.sleep(1000);
		if(AmountRequiredError.isDisplayed())
		{
			as.fail();
			wUtil.takeScreenShot(driver, "c_Clicking On Add Button Without Giving Any Admin Coupon Details");
		}
		else
		{
			System.out.println("c_Admin Coupon Successfully Added Without Giving Any details");
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//input[@formcontrolname='amount']")).sendKeys(AdminCouponCouponAmount);
		Thread.sleep(1000);
		AddBtn.click();
		Thread.sleep(1000);
		WebElement FromDateRequiredError = driver.findElement(By.xpath("(//label[.='Coupon Amount']/../following-sibling::div/div)[1]"));
		Thread.sleep(1000);
		if(FromDateRequiredError.isDisplayed())
		{
			as.fail();
			wUtil.takeScreenShot(driver, "d_Admin Coupon Adding By Giving Only Coupon Amount Error");
		}
		else
		{
			System.out.println("d_Admin Coupon Successfully Added By Giving Only Coupon Amount Details");
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//input[@formcontrolname='from_date']")).sendKeys(AdminCouponFromDate);
		Thread.sleep(1000);
		AddBtn.click();
		Thread.sleep(1000);
		WebElement ToDateRequiredError = driver.findElement(By.xpath("(//label[.='Coupon Amount']/../following-sibling::div/div)[1]"));
		Thread.sleep(1000);
		if(ToDateRequiredError.isDisplayed())
		{
			as.fail();
			wUtil.takeScreenShot(driver, "e_Admin Coupon Adding By Giving Only Coupon Amount,From Date Error");
		}
		else
		{
			System.out.println("e_Admin Coupon Successfully Added By Giving Only Coupon Amount, From Date Details");
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//input[@formcontrolname='to_date']")).sendKeys(AdminCouponToDate);
		Thread.sleep(1000);
		AddBtn.click();
		Thread.sleep(1000);
		WebElement MinTransAmountRequiredError = driver.findElement(By.xpath("(//label[.='Coupon Amount']/../following-sibling::div/div)[1]"));
		Thread.sleep(1000);
		if(MinTransAmountRequiredError.isDisplayed())
		{
			as.fail();
			wUtil.takeScreenShot(driver, "f_Admin Coupon Adding By Giving Only Coupon Amount,From Date,To Date Error");
		}
		else
		{
			System.out.println("f_Admin Coupon Successfully Added By Giving Only Coupon Amount, From Date, To Date Details");
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//input[@formcontrolname='minimum_transaction_amount']")).sendKeys(AdminCouponMinTransAmount);
		Thread.sleep(1000);
		AddBtn.click();
		Thread.sleep(1000);
		WebElement MobileIsRequiredError = driver.findElement(By.xpath("(//label[.='Coupon Amount']/../following-sibling::div/div)[1]"));
		Thread.sleep(1000);
		if(MobileIsRequiredError.isDisplayed())
		{
			as.fail();
			wUtil.takeScreenShot(driver, "g_Admin Coupon Adding By Giving Only Coupon Amount,From Date,To Date,Min Trans Amount Error");
		}
		else
		{
			System.out.println("g_Admin Coupon Successfully Added By Giving Only Coupon Amount, From Date, To Date,Min Trans Amount Details");
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//input[@formcontrolname='mobile']")).sendKeys(AdminCouponMobileNumber);
		Thread.sleep(1000);
		AddBtn.click();
		Thread.sleep(1000);
		WebElement DescriptionIsRequiredError = driver.findElement(By.xpath("(//label[.='Coupon Amount']/../following-sibling::div/div)[1]"));
		Thread.sleep(1000);
		if(DescriptionIsRequiredError.isDisplayed())
		{
			as.fail();
			wUtil.takeScreenShot(driver, "h_Admin Coupon Adding By Giving Only Coupon Amount,From Date,To Date,Min Trans Amount,Mobile Error");
		}
		else
		{
			System.out.println("h_Admin Coupon Successfully Added By Giving Only Coupon Amount, From Date, To Date, Min Trans Amount, Mobile Details");
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//textarea[@formcontrolname='description']")).sendKeys(AdminCouponDescription);
		Thread.sleep(1000);
		AddBtn.click();
		Thread.sleep(1000);
		WebElement DateError = driver.findElement(By.xpath("(//div[.=' From Date and To Date cannot be less than current date '])[2]"));
		Thread.sleep(1000);
		if(DateError.isDisplayed())
		{
			as.fail();
			wUtil.takeScreenShot(driver, "i_Admin Coupon Adding By Giving From Date less Than Current Date Error");
		}
		else
		{
			System.out.println("i_Coupon Added Successfuly By Giving From Date Less Than Current Date");
		}
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//input[@formcontrolname='from_date']")).sendKeys(AdminCouponLatestFromDate);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//input[@formcontrolname='to_date']")).sendKeys(AdminCouponLatestToDate);
		Thread.sleep(1000);
		AddBtn.click();
		Thread.sleep(1000);
		WebElement MobileNumError = driver.findElement(By.xpath("(//div[.=' Not Found This Mobile Number in Records '])[2]"));
		Thread.sleep(1000);
		if(MobileNumError.isDisplayed())
		{
			as.fail();
			wUtil.takeScreenShot(driver, "j_Admin Coupon Adding By Giving Invalid Mobile Number Error");
		}
		else
		{
			System.out.println("j_Coupon Added Successfuly By Giving Invalid Mobile Number");
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//input[@formcontrolname='mobile']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//input[@formcontrolname='mobile']")).sendKeys(AdminCouponValidMobileNumber);
		Thread.sleep(1000);
		AddBtn.click();
		Thread.sleep(1000);
		WebElement SuccessMsg = driver.findElement(By.xpath("(//div[.=' coupon added successfully '])[2]"));
		if(SuccessMsg.isDisplayed())
		{
			System.out.println("Coupon Added Successfully");
		}
		else 
		{
			System.out.println("Coupon Not Added");
		}
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[.='View'])[1]")).click();
		Thread.sleep(1000);
		WebElement CouponDescripionPage = driver.findElement(By.xpath("//h1[.='Coupon Description']"));
		if(CouponDescripionPage.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "k_Coupon Description Page Should Not Open Error");
		}
		else 
		{
			System.out.println("Coupon Description Page Is Not Opened");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Coupon Description']/following-sibling::button[@aria-label='Close']")).click();
		Thread.sleep(1000);
		if(CouponDescripionPage.isDisplayed())
		{
			System.out.println("Close Button Clicked Description Page Is Closed");
		}
		else 
		{
			wUtil.takeScreenShot(driver, "l_Click On Close Button Coupon Description Page Should Not Close Error");
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[.='Edit'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//input[@formcontrolname='amount']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Update']")).click();
		Thread.sleep(2000);
		WebElement UpdateAmountSuccessMsg = driver.findElement(By.xpath("(//div[.=' Data updated successfully '])[2]"));
		if(UpdateAmountSuccessMsg.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "m_Clearing Amount And Clicking On Update Button While Updating Admin Coupon Should Not Update. But Coupon Updating Successfully Error");
		}
		else 
		{
			System.out.println("Admin Coupon Updated Successfully");
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[.='Edit'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//input[@formcontrolname='from_date']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//input[@formcontrolname='to_date']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Update']")).click();
		Thread.sleep(2000);
		WebElement AfterRemovingFromAndToDatesSuccessMsg = driver.findElement(By.xpath("(//div[.=' Data updated successfully '])[2]"));
		if(AfterRemovingFromAndToDatesSuccessMsg.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "n_Clearing From And To Dates And Clicking On Update Button While Updating Admin Coupon Should Not Update. But Coupon Updating Successfully Error");
		}
		else 
		{
			System.out.println("Admin Coupon Updated Successfully");
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[.='Edit'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//input[@formcontrolname='minimum_transaction_amount']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//input[@formcontrolname='mobile']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Update']")).click();
		Thread.sleep(2000);
		WebElement AfterRemovingMinTransAndMobileNumSuccessMsg = driver.findElement(By.xpath("(//div[.=' Data updated successfully '])[2]"));
		if(AfterRemovingMinTransAndMobileNumSuccessMsg.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "o_Clearing Min Trans Amount And Mobile Clicking On Update Button While Updating Admin Coupon Should Not Update. But Coupon Updating Successfully Error");
		}
		else 
		{
			System.out.println("Admin Coupon Updated Successfully");
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[.='Edit'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//textarea[@formcontrolname='description']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Update']")).click();
		Thread.sleep(2000);
		WebElement AfterRemovingDescriptionSuccessMsg = driver.findElement(By.xpath("(//div[.=' Data updated successfully '])[2]"));
		if(AfterRemovingDescriptionSuccessMsg.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "p_Clearing Description Clicking On Update Button While Updating Admin Coupon Should Not Update. But Coupon Updating Successfully Error");
		}
		else 
		{
			System.out.println("Admin Coupon Updated Successfully");
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[.='Edit'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//input[@formcontrolname='amount']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//input[@formcontrolname='amount']")).sendKeys(EditAdminCouponCouponAmount);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//input[@formcontrolname='from_date']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//input[@formcontrolname='from_date']")).sendKeys(EditAdminCouponFromDate);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//input[@formcontrolname='to_date']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//input[@formcontrolname='to_date']")).sendKeys(EditAdminCouponToDate);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//input[@formcontrolname='minimum_transaction_amount']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//input[@formcontrolname='minimum_transaction_amount']")).sendKeys(EditAdminCouponMinTransAmount);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//input[@formcontrolname='mobile']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//input[@formcontrolname='mobile']")).sendKeys(EditAdminCouponMobileNumber);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//textarea[@formcontrolname='description']")).clear();		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//textarea[@formcontrolname='description']")).sendKeys(EditAdminCouponDescription2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Update']")).click();
		Thread.sleep(2000);
		WebElement UpdatingAdminCouponByGivingValidDataSuccessMsg = driver.findElement(By.xpath("(//div[.=' Data updated successfully '])[2]"));
		if(UpdatingAdminCouponByGivingValidDataSuccessMsg.isDisplayed())
		{
			System.out.println("Admin Coupon Updated Successfully With Valid Data");
		//	wUtil.takeScreenShot(driver, "p_Clearing Description Clicking On Update Button While Updating Admin Coupon Should Not Update. But Coupon Updating Successfully Error");
		}
		else 
		{
			System.out.println("Admin Coupon Not Updated Successfully");
		}
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[.='Edit'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/following-sibling::button[@aria-label='Close']")).click();
		Thread.sleep(1000);
		WebElement EditCouponPage = driver.findElement(By.xpath("//h1[.='Edit coupon']"));
		if(EditCouponPage.isDisplayed())
		{
			System.out.println("Edit Coupon Page Is Not Closed");
		}
		else 
		{
			wUtil.takeScreenShot(driver, "q_Edit Coupon Page Should Not Close");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='mdc-switch__icons'])[1]")).click();
		Thread.sleep(2000);
		WebElement UpdateMsg = driver.findElement(By.xpath("(//div[.='  Coupon Status Updated Successfully. '])[2]"));
		if(UpdateMsg.isDisplayed())
		{
			wUtil.takeScreenShot(driver, "r_Admin Coupon Should Not Update After Clicking On BootStrap Button");
		}
		else 
		{
			System.out.println("Admin Coupon Not Updated");
		}
		
	}
	
	
}
