package sprint_3_Negative;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class A_E_Commerce_LoginErrors {

	WebDriverUtility w = new WebDriverUtility();
	PropertyFileUtility pUtil = new PropertyFileUtility();
	//Tc_1
	@Test(groups = "Sprint-3", priority = 1)
	public void a_loginWithInvalidCredentialsErrorTest()throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
	    
		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().clearDriverCache().setup();
		WebDriverManager.chromedriver().clearResolutionCache().setup();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		driver.get(URL);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("goldbox@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldbox@2023",Keys.ENTER);
        Thread.sleep(2000);
        
        WebElement Error = driver.findElement(By.xpath("(//div[.=' Admin Does Not Exist '])[2]"));
        
        try 
        {
            if(Error.isDisplayed())
            {
            	w.takeScreenShot(driver, "a_loginWithInvalidCredentialsErrorTest");
                Thread.sleep(2000);
            }
            else 
            {
				System.out.println("Login Successfully");
			}
		} 
        finally 
        {
        	driver.quit();
		}
        
	}
	
	//2TC
	
	@Test(groups = "Sprint-3", priority = 2)
	public void b_loginToApplicationWithInvalidCredentialsErrorTest()throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
    	
		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().clearDriverCache().setup();
		WebDriverManager.chromedriver().clearResolutionCache().setup();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		driver.get(URL);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023",Keys.ENTER);
        Thread.sleep(2000);
        WebElement ErrorMsg = driver.findElement(By.xpath("(//div[.=' Invalid Credentials '])[2]"));
        Thread.sleep(2000);
        
        try 
        {
        	if (ErrorMsg.isDisplayed())
            {
            	w.takeScreenShot(driver, "b_loginToApplicationWithInvalidCredentialsErrorTest");
            	Thread.sleep(2000);
    		}
            else 
            {
            	System.out.println("Dashboard is Displayed");
    			Thread.sleep(2000);
    		}
		} 
        finally 
        {
        	driver.quit();
		}
        
	}
	
}
