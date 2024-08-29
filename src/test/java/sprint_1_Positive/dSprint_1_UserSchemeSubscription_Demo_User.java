package sprint_1_Positive;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import genericUtility.User_BaseClass;
import genericUtility.WebDriverUtility;

@Listeners(genericUtility.UserListnersImplementationClass.class)
public class dSprint_1_UserSchemeSubscription_Demo_User extends User_BaseClass{

	WebDriverUtility wUtil = new WebDriverUtility();
	
	String Msg = "Transaction Complete";
	
	@Test(priority = 4,groups = "sprint-1")
	public void userSchemeSubscriptionUsingBookingAccountTest() throws Exception
	{
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//span[.='Schemes']")).click();
        
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//button[.='Subscribe']")).click();
        
        Thread.sleep(5000);
        
        WebElement SelectAmountDrpDwn = driver.findElement(By.xpath("//select[@id='amount']"));
        Select s = new Select(SelectAmountDrpDwn);
        s.selectByVisibleText("1500");
        
        Thread.sleep(3000);
        
        WebElement MonthsDrpDwn = driver.findElement(By.xpath("//select[@formcontrolname='total_installments']"));
        Select ss = new Select(MonthsDrpDwn);
        ss.selectByVisibleText("12 Months");
        
        Thread.sleep(3000);
        
        try 
        {
        	WebElement LivePriceError = driver.findElement(By.xpath("(//div[.=' Gold live Price Issue '])[2]"));
    		if(LivePriceError.isDisplayed())
			{
    			Thread.sleep(2000);
    			driver.quit();
			}
		}
        catch(Exception e)
        {
        	Thread.sleep(1000);
            
            WebElement BookingAccountCheckBox = driver.findElement(By.xpath("//button[.=' View Coupons ']/../../../../../../following-sibling::div/div/following-sibling::div/label/../../div/input[@class='checkbox']"));
            BookingAccountCheckBox.click();
            
            Thread.sleep(3000);
            
            driver.findElement(By.xpath("//input[@placeholder='Enter amount']")).sendKeys("1800");
            
            Thread.sleep(3000);
            
            wUtil.scrollPageDown(1);
            
            Thread.sleep(3000);
            
            WebElement TermsAndConditionsCheckBox = driver.findElement(By.xpath("//div[@class='form-group pt-2 d-block']/div/input[@type='checkbox']"));
            TermsAndConditionsCheckBox.click();
            
            Thread.sleep(3000);
            
            driver.findElement(By.xpath("//button[text()=' Start Subscription ']")).click();
            
            Thread.sleep(3000);
            
            WebElement SuccessElement = driver.findElement(By.xpath("//h4[.=' Transaction Complete']"));
            
            Thread.sleep(15000);
            
//    		wUtil.waitForElementToBeVisible(driver, SuccessElement);
            
    		String SuccessMsg = SuccessElement.getText();
            
    		Assert.assertEquals(Msg, SuccessMsg);
    		
            driver.findElement(By.xpath("//button[@class='submit-but']")).click();
        }
        
        
	}
	
	@Test(priority = 5, groups = "sprint-1")
	public void userSchemeSubscriptionUsingBankingAccountTest() throws Exception
	{
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//span[.='Schemes']")).click();
        driver.findElement(By.xpath("//button[.='Subscribe']")).click();
        
        Thread.sleep(5000);
        
        WebElement SelectAmountDrpDwn = driver.findElement(By.xpath("//select[@id='amount']"));
        Select s = new Select(SelectAmountDrpDwn);
        s.selectByVisibleText("1500");
        
        Thread.sleep(3000);
        
        WebElement SelectAmountDrpDwnn = driver.findElement(By.xpath("//select[@id='amount']"));
        Select ss = new Select(SelectAmountDrpDwnn);
        ss.selectByVisibleText("1500");
        
        try 
        {
			WebElement LivePriceError = driver.findElement(By.xpath("(//div[.=' Gold live Price Issue '])[3]"));
			if(LivePriceError.isDisplayed())
			{
				driver.quit();
			}
		} 
        catch (Exception e) 
        {
        	Thread.sleep(2000);
            
            WebElement MonthsDrpDwn = driver.findElement(By.xpath("//select[@formcontrolname='total_installments']"));
            Select sss = new Select(MonthsDrpDwn);
            sss.selectByVisibleText("12 Months");
            
            WebElement TermsAndConditionsCheckBox = driver.findElement(By.xpath("//div[@class='form-group pt-2 d-block']/div/input[@type='checkbox']"));
            TermsAndConditionsCheckBox.click();
            
            wUtil.scrollPageDown(1);
            
            driver.findElement(By.xpath("//button[text()=' Start Subscription ']")).click();
            
            Thread.sleep(2000);
            
            WebElement frame = driver.findElement(By.xpath("//iframe[@class='razorpay-checkout-frame']"));
            driver.switchTo().frame(frame);
            driver.findElement(By.xpath("//input[@id='contact']")).sendKeys("6309631698");
            
            Thread.sleep(2000);
            
            driver.findElement(By.xpath("//button[text()='Proceed']")).click();
            
            Thread.sleep(2000);
            
            wUtil.scrollPageDown(1);
            
            driver.findElement(By.xpath("//div[.='Netbanking']")).click();
            
            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_PAGE_DOWN);
            r.keyRelease(KeyEvent.VK_PAGE_DOWN);
            
            driver.findElement(By.xpath("//div[.='ICICI']")).click();
            
            driver.findElement(By.xpath("//button[.='Pay Now']")).click();
            
            driver.switchTo().defaultContent();
            
            String ParentWin = driver.getWindowHandle();
    		
    		Set<String> ChildWins = driver.getWindowHandles();
    		
    		for(String ChildWin : ChildWins)
    		{
    			if(!ChildWin.equals(ParentWin))
    			{
    			    driver.switchTo().window(ChildWin);
    			    driver.findElement(By.xpath("//button[.='Success']")).click();
    			}
    		}
    		
    		driver.switchTo().window(ParentWin);
            
    		Thread.sleep(18000);
    		
    		WebElement ContinueBtn = driver.findElement(By.xpath("//button[.='Continue']"));
    		wUtil.waitForElementToBeVisible(driver, ContinueBtn);
    		
    		ContinueBtn.click();
    		
    		Thread.sleep(2000);
    		
    		driver.findElement(By.xpath("//span[.='Schemes']")).click();
    		
    		Thread.sleep(2000);
    		
    		driver.findElement(By.xpath("(//button[.='View Details'])[1]")).click();
    		
    		Thread.sleep(2000);
    		
    		driver.findElement(By.xpath("//button[text()='Receipt']")).click();
    		
    		Thread.sleep(3000);
    		
    		driver.findElement(By.xpath("//span[.='Schemes']")).click();
    		
    		Thread.sleep(2000);
    		
    		driver.findElement(By.xpath("(//button[.='Update Nick Name'])[1]")).click();
    		
    		Thread.sleep(2000);
    		
    		driver.findElement(By.xpath("(//input[@placeholder='Enter Nick Name'])[1]")).sendKeys("Abc");
    		
    		Thread.sleep(2000);
    		
    		driver.findElement(By.xpath("(//button[.='Submit'])[1]")).click();
    		
    		Thread.sleep(2000);
    		
    		driver.findElement(By.xpath("(//button[.='Update Nick Name'])[1]")).click();
    		
            Thread.sleep(2000);
    		
    		driver.findElement(By.xpath("(//input[@placeholder='Enter Nick Name'])[1]")).sendKeys("123");
    		
    		Thread.sleep(2000);
    		
    		driver.findElement(By.xpath("(//button[.='Submit'])[1]")).click();
    		
    		Thread.sleep(2000);
    	
		}
        try 
        {
            Thread.sleep(2000);
		}
        finally 
        {
        	driver.quit();
        }
        
		
		
		
	}
	
	@Test(priority = 6, groups = "sprint-1")
	public void userSchemeSubscriptionUsingBookingAndBankingAccountTest() throws Exception
	{
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//span[.='Schemes']")).click();
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[.='Subscribe']")).click();
        
        Thread.sleep(3000);
        
        WebElement SelectAmountDrpDwn = driver.findElement(By.xpath("//select[@id='amount']"));
        Select s = new Select(SelectAmountDrpDwn);
        s.selectByVisibleText("1500");
        
        Thread.sleep(2000);
        
        WebElement SelectAmountDrpDwnn = driver.findElement(By.xpath("//select[@id='amount']"));
        Select ss = new Select(SelectAmountDrpDwnn);
        ss.selectByVisibleText("1500");
        
        try 
        {
			WebElement LivePriceError = driver.findElement(By.xpath("(//div[.=' Gold live Price Issue '])[3]"));
			if(LivePriceError.isDisplayed())
			{
				driver.quit();
			}
		} 
        catch (Exception e) 
        {
        	Thread.sleep(2000);
            
            WebElement MonthsDrpDwn = driver.findElement(By.xpath("//select[@formcontrolname='total_installments']"));
            Select sss = new Select(MonthsDrpDwn);
            sss.selectByVisibleText("12 Months");
            
            Thread.sleep(2000);
            
            WebElement BookingAccountCheckBox = driver.findElement(By.xpath("//button[.=' View Coupons ']/../../../../../../following-sibling::div/div/following-sibling::div/label/../../div/input[@class='checkbox']"));
            BookingAccountCheckBox.click();
            
            Thread.sleep(3000);
            
            driver.findElement(By.xpath("//input[@placeholder='Enter amount']")).sendKeys("1500");
            
            Thread.sleep(3000);
            
            
            WebElement TermsAndConditionsCheckBox = driver.findElement(By.xpath("//div[@class='form-group pt-2 d-block']/div/input[@type='checkbox']"));
            TermsAndConditionsCheckBox.click();
            
            Thread.sleep(2000);
            wUtil.scrollPageDown(1);
            
            driver.findElement(By.xpath("//button[text()=' Start Subscription ']")).click();
            
            Thread.sleep(2000);
            
            WebElement frame = driver.findElement(By.xpath("//iframe[@class='razorpay-checkout-frame']"));
            driver.switchTo().frame(frame);
            
            driver.findElement(By.xpath("//input[@name='contact']")).sendKeys("6309631698");
            
            Thread.sleep(2000);
            
            driver.findElement(By.xpath("//button[.='Proceed']")).click();
            
            Thread.sleep(2000);
            
            wUtil.scrollPageDown(1);
            
            driver.findElement(By.xpath("//div[.='Netbanking']")).click();
            
            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_PAGE_DOWN);
            r.keyRelease(KeyEvent.VK_PAGE_DOWN);
            
            Thread.sleep(2000);
            
            driver.findElement(By.xpath("//div[.='ICICI']")).click();
            
            Thread.sleep(2000);
            
            driver.findElement(By.xpath("//button[.='Pay Now']")).click();
            
            driver.switchTo().defaultContent();
            
            String ParentWin = driver.getWindowHandle();
    		
    		Set<String> ChildWins = driver.getWindowHandles();
    		
    		for(String ChildWin : ChildWins)
    		{
    			if(!ChildWin.equals(ParentWin))
    			{
    			    driver.switchTo().window(ChildWin);
    			    driver.findElement(By.xpath("//button[.='Success']")).click();
    			}
    		}
    		
    		driver.switchTo().window(ParentWin);
            
    		Thread.sleep(20000);
    		
    		WebElement ContinueBtn = driver.findElement(By.xpath("//button[.='Continue']"));
    		
    		ContinueBtn.click();
    		
            Thread.sleep(2000);
    		
    		driver.findElement(By.xpath("//span[.='Schemes']")).click();
    		
    		Thread.sleep(2000);
    		
    		driver.findElement(By.xpath("(//button[.='View Details'])[1]")).click();
    		
    		Thread.sleep(2000);
    		
    		driver.findElement(By.xpath("//button[text()='Receipt']")).click();
    		
    		Thread.sleep(3000);
    		
    		driver.findElement(By.xpath("//span[.='Schemes']")).click();
    		
    		Thread.sleep(2000);
    		
    		driver.findElement(By.xpath("(//button[.='Update Nick Name'])[1]")).click();
    		
    		Thread.sleep(2000);
    		
    		driver.findElement(By.xpath("(//input[@placeholder='Enter Nick Name'])[1]")).sendKeys("Abc");
    		
    		Thread.sleep(2000);
    		
    		driver.findElement(By.xpath("(//button[.='Submit'])[1]")).click();
    		
    		Thread.sleep(2000);
    		
    		driver.findElement(By.xpath("(//button[.='Update Nick Name'])[1]")).click();
    		
            Thread.sleep(2000);
    		
    		driver.findElement(By.xpath("(//input[@placeholder='Enter Nick Name'])[1]")).sendKeys("123");
    		
    		Thread.sleep(2000);
    		
    		driver.findElement(By.xpath("(//button[.='Submit'])[1]")).click();
    		
    		Thread.sleep(2000);
    		
    		driver.findElement(By.xpath("(//button[@aria-label='Close'])[1]")).click();
    		
    		Thread.sleep(2000);
        }
        
	}
	
	
	
}
