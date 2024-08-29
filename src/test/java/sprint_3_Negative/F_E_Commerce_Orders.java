package sprint_3_Negative;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class F_E_Commerce_Orders {

	WebDriverUtility w = new WebDriverUtility();
	PropertyFileUtility pUtil = new PropertyFileUtility();
    
	//66TC
	
	@Test(groups = "Sprint-3", priority = 1)
	public void a_ordersToAndFromDateTest()throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().clearDriverCache().setup();
		WebDriverManager.chromedriver().clearResolutionCache().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(8000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Ecommerce Orders']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("3/5/2024 - 3/22/2024");
        
        WebElement NoResultFound = driver.findElement(By.xpath("//h5[.='No records found']"));
        
        try 
        {
        	if (NoResultFound.isDisplayed()) 
            {
    			w.takeScreenShot(driver, "a_ordersToAndFromDateTest");
    			Thread.sleep(2000);	
    		}
        	else 
        	{
        		System.out.println("Orders Are Available");
			}
		} 
        finally 
        {
			driver.quit();
		}

	}
	
	//67TC
	
	@Test(groups = "Sprint-3", priority = 2)
	public void b_searchingOrdersEnteringInvalidMobileNumberTest()throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().clearDriverCache().setup();
		WebDriverManager.chromedriver().clearResolutionCache().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(8000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Ecommerce Orders']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("'9666441040");
        Thread.sleep(2000);
        
        WebElement NoResultFound = driver.findElement(By.xpath("//h5[.='No records found']"));
        
        try 
        {
        	if (NoResultFound.isDisplayed()) 
            {
    			w.takeScreenShot(driver, "b_searchingOrdersEnteringInvalidMobileNumberTest");
    			Thread.sleep(2000);
    		}
            else 
            {
                System.out.println("Orders Are Available");
    		}
		} 
        finally 
        {
			driver.quit();
        }

	}

	//68TC

	@Test(groups = "Sprint-3", priority = 3)
	public void c_searchingOrdersEnteringInFilterOptionTest()throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().clearDriverCache().setup();
		WebDriverManager.chromedriver().clearResolutionCache().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Ecommerce Orders']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='btn btn-filter']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Start date']")).sendKeys("22/02/2024");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='End date']")).sendKeys("25/02/2024");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//mat-select[@placeholder='Select Order status']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[.='Order Accepted']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Mobile number']")).sendKeys("9666441040");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        
        WebElement Error = driver.findElement(By.xpath("(//div[.=' No results found '])[2]"));
      
        try 
        {
        	if(Error.isDisplayed()) 
            {
    			w.takeScreenShot(driver, "c_searchingOrdersEnteringInFilterOptionTest");
    			Thread.sleep(2000);
    		}
            else 
            {
                System.out.println("Orders Are Available");
    		}
		}
        finally 
        {
        	driver.quit();
		}

	}
	
	//70TC
    
	@Test(groups = "Sprint-3", priority = 4)
	public void d_ordersViewButtonErrorTest() throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().clearDriverCache().setup();
		WebDriverManager.chromedriver().clearResolutionCache().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Ecommerce Orders']")).click();
        Thread.sleep(2000);
        
        Actions act = new Actions(driver);
        act.moveByOffset(200, 0).perform();
        
        Thread.sleep(2000);
        
        Robot s = new Robot();
        
        s.keyPress(KeyEvent.VK_PAGE_DOWN);
        s.keyRelease(KeyEvent.VK_PAGE_DOWN);
        
        driver.findElement(By.xpath("(//button[text()=' View '])[1]")).click();
        
        WebElement OrderedProductsPage = driver.findElement(By.xpath("//h1[.='Ordered Products']"));
        Thread.sleep(2000);
        
        try 
        {
        	if(OrderedProductsPage.isDisplayed())
            {
        		w.takeScreenShot(driver, "d_ordersViewButtonErrorTest");
    			Thread.sleep(2000);
    		} 
            else 
            {
            	System.out.println("Ordered Products Page is not Displaying");
    		}
		} 
        finally 
        {
        	driver.quit();
		} 
        
	}
	
	//69TC
    
	@Test(groups = "Sprint-3", priority = 5)
	public void e_ordersStatusButtonTest()throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().clearDriverCache().setup();
		WebDriverManager.chromedriver().clearResolutionCache().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Ecommerce Orders']")).click();
        Thread.sleep(2000);
        Actions act = new Actions(driver);
        act.moveByOffset(200, 0).perform();
        Thread.sleep(2000);
        Robot s = new Robot();
        s.keyPress(KeyEvent.VK_PAGE_DOWN);
        s.keyRelease(KeyEvent.VK_PAGE_DOWN);
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[.=' Status '])[1]")).click();
        Thread.sleep(2000);
        WebElement OrderStatus = driver.findElement(By.xpath("(//h1[contains(.,'Order status')])[1]"));
        Thread.sleep(2000);
        try 
        {
        	if(OrderStatus.isDisplayed())
            {
        		w.takeScreenShot(driver, "e_ordersStatusButtonTest");
    			Thread.sleep(1000);
    		} 
            else 
            {
            	System.out.println("Order Status page is not displayed");
    		}
		} 
        finally 
        {
        	driver.quit();
		}

	}
	
	
}


