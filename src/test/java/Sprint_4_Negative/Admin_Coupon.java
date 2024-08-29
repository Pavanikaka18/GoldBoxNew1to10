package Sprint_4_Negative;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v116.v116CdpInfo;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Admin_Coupon {
	
	WebDriverUtility w = new WebDriverUtility();
	PropertyFileUtility pUtil = new PropertyFileUtility();
	
	//54
	
	@Test
	public void a_add_Admin_Coupon_Test() throws Exception
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
		driver.findElement(By.xpath("//span[.='Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Admin Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Add admin Coupon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//button[.='Add']")).click();
		Thread.sleep(2000);
		
		WebElement ErrorMessage51 = driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Coupon Amount']/..//div[@class='invalid-feedback ng-star-inserted']"));
		 Thread.sleep(2000);
			try {
				if (ErrorMessage51.isDisplayed()) 
		        {
		        	w.takeScreenShot(driver, "a_add_Admin_Coupon_Test");
		            Thread.sleep(2000);
		        	
				} 
		        else 
				{
		        	System.out.println("Coupon Added sucessfully");
				}
			} finally {
		
				driver.quit();
			}
			
	}
	
	//55
	
	@Test
	public void b_add_Admin_Coupon_Page_Amount_Test()throws Exception
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
		driver.findElement(By.xpath("//span[.='Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Admin Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Add admin Coupon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Coupon Amount']/..//input[@placeholder='Enter Amount']")).sendKeys("5000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//button[.='Add']")).click();
		Thread.sleep(2000);
		
		WebElement ErrorMessage52 = driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='From Date']/..//div[@class='invalid-feedback ng-star-inserted']"));
		 Thread.sleep(2000);
			try {
				if (ErrorMessage52.isDisplayed()) 
		        {
		        	w.takeScreenShot(driver, "b_add_Admin_Coupon_Page_Amount_Test");
		            Thread.sleep(2000);
		        	
				} 
		        else 
				{
		        	System.out.println("Coupon Added sucessfully");
				}
			} finally {
				driver.quit();
			}
			
	}
	
	//56
	
	@Test
	public void c_add_Admin_Coupon_Page_Amount_Date_Test()throws Exception
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
		driver.findElement(By.xpath("//span[.='Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Admin Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Add admin Coupon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Coupon Amount']/..//input[@placeholder='Enter Amount']")).sendKeys("5000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='From Date']/..//input[@formcontrolname='from_date']")).sendKeys("4/15/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='To Date']/..//input[@formcontrolname='to_date']")).sendKeys("4/20/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//button[.='Add']")).click();
		Thread.sleep(2000);
		
		WebElement ErrorMessage53 = driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Minimum Transaction Amount']/..//div[@class='invalid-feedback ng-star-inserted']"));
		 Thread.sleep(2000);
			try {
				if (ErrorMessage53.isDisplayed()) 
		        {
		        	w.takeScreenShot(driver, "c_add_Admin_Coupon_Page_Amount_Date_Test");
		            Thread.sleep(2000);
		        	
				} 
		        else 
				{
		        	System.out.println("Coupon Added sucessfully");
				}
			} finally {
				driver.quit();
			}
			
	}
	
	//57
	
	@Test
	public void d_add_Admin_Coupon_Page_Amount_Date_Minimumamount_Test()throws Exception
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
		driver.findElement(By.xpath("//span[.='Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Admin Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Add admin Coupon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Coupon Amount']/..//input[@placeholder='Enter Amount']")).sendKeys("5000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='From Date']/..//input[@formcontrolname='from_date']")).sendKeys("4/15/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='To Date']/..//input[@formcontrolname='to_date']")).sendKeys("4/20/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Minimum Transaction Amount']/..//input[@placeholder='Enter Amount']")).sendKeys("500");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//button[.='Add']")).click();
		Thread.sleep(2000);
		
		WebElement ErrorMessage54 = driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='User registered mobile number']/..//div[@class='invalid-feedback ng-star-inserted']"));
		 Thread.sleep(2000);
			try {
				if (ErrorMessage54.isDisplayed()) 
		        {
		        	w.takeScreenShot(driver, "d_add_Admin_Coupon_Page_Amount_Date_Minimumamount_Test");
		            Thread.sleep(2000);
		        	
				} 
		        else 
				{
		        	System.out.println("Coupon Added sucessfully");
				}
			} finally {
				driver.quit();
			}
			
	}
	
	//58
	
	@Test
	public void e_add_Admin_Coupon_Page_MobileNumberMissing_Test()throws Exception
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
		driver.findElement(By.xpath("//span[.='Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Admin Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Add admin Coupon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Coupon Amount']/..//input[@placeholder='Enter Amount']")).sendKeys("5000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='From Date']/..//input[@formcontrolname='from_date']")).sendKeys("4/15/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='To Date']/..//input[@formcontrolname='to_date']")).sendKeys("4/20/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Minimum Transaction Amount']/..//input[@placeholder='Enter Amount']")).sendKeys("500");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Description']/..//textarea[@formcontrolname='description']")).sendKeys("Festival Coupon");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//button[.='Add']")).click();
		Thread.sleep(2000);
		
		WebElement ErrorMessage55 = driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='User registered mobile number']/..//div[@class='invalid-feedback ng-star-inserted']"));
		 Thread.sleep(2000);
			try {
				if (ErrorMessage55.isDisplayed()) 
		        {
		        	w.takeScreenShot(driver, "e_add_Admin_Coupon_Page_MobileNumberMissing_Test");
		            Thread.sleep(2000);
				} 
		        else 
				{
		        	System.out.println("Coupon Added sucessfully");
				}
			} finally {
				driver.quit();
			}
		
	}
	
	//59 - "Coupon Added sucessfully"
	
	@Test
	public void f_add_Admin_Coupon_Page_MNM_MinimumAmount_Test()throws Exception
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
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(5000);
		driver.findElement(By.xpath("//span[.='Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Admin Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Add admin Coupon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Coupon Amount']/..//input[@placeholder='Enter Amount']")).sendKeys("5000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='From Date']/..//input[@formcontrolname='from_date']")).sendKeys("30/7/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='To Date']/..//input[@formcontrolname='to_date']")).sendKeys("30/8/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Minimum Transaction Amount']/..//input[@placeholder='Enter Amount']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Minimum Transaction Amount']/..//input[@placeholder='Enter Amount']")).sendKeys("50");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='User registered mobile number']/..//input[@formcontrolname='mobile']")).sendKeys("8500298784");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Description']/..//textarea[@formcontrolname='description']")).sendKeys("Festival Coupon");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//button[.='Add']")).click();
		Thread.sleep(1000);
		
		WebElement ErrorMessage56 = driver.findElement(By.xpath("//div[@aria-label='coupon added successfully']"));
		Thread.sleep(1000);
		try {
			if (ErrorMessage56.isDisplayed()) 
	        {
	        	w.takeScreenShot(driver, "f_add_Admin_Coupon_Page_MNM_MinimumAmount_Test");
	            Thread.sleep(2000);
			} 
	        else 
			{
	        	System.out.println("Coupon Added sucessfully");
			}
		} finally {
			driver.quit();
		}
			
	}
	
	//60
	
	@Test
	public void g_add_Admin_Coupon_Page_Expired_Date_Test()throws Exception
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
		driver.findElement(By.xpath("//span[.='Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Admin Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Add admin Coupon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Coupon Amount']/..//input[@placeholder='Enter Amount']")).sendKeys("5000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='From Date']/..//input[@formcontrolname='from_date']")).sendKeys("18/1/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='To Date']/..//input[@formcontrolname='to_date']")).sendKeys("20/2/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Minimum Transaction Amount']/..//input[@placeholder='Enter Amount']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Minimum Transaction Amount']/..//input[@placeholder='Enter Amount']")).sendKeys("6000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='User registered mobile number']/..//input[@formcontrolname='mobile']")).sendKeys("8500298784");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Description']/..//textarea[@formcontrolname='description']")).sendKeys("Festival Coupon");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//button[.='Add']")).click();
		Thread.sleep(2000);
		
		WebElement ErrorMessage57 = driver.findElement(By.xpath("//div[@aria-label='From Date and To Date cannot be less than current date']"));
		 Thread.sleep(2000);
			try {
				if (ErrorMessage57.isDisplayed()) 
		        {
		        	w.takeScreenShot(driver, "g_add_Admin_Coupon_Page_Expired_Date_Test");
		            Thread.sleep(2000);
				} 
		        else 
				{
		        	System.out.println("Coupon Added sucessfully");
				}
			} finally {
				driver.quit();
			}
		
	}
	
	//61 - "Coupon Added sucessfully"
	
	@Test
	public void h_add_Admin_Coupon_Page_MinimumAmountEqual_Test()throws Exception{
		
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
		driver.findElement(By.xpath("//span[.='Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Admin Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Add admin Coupon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Coupon Amount']/..//input[@placeholder='Enter Amount']")).sendKeys("500");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='From Date']/..//input[@formcontrolname='from_date']")).sendKeys("20/7/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='To Date']/..//input[@formcontrolname='to_date']")).sendKeys("20/8/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Minimum Transaction Amount']/..//input[@placeholder='Enter Amount']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Minimum Transaction Amount']/..//input[@placeholder='Enter Amount']")).sendKeys("500");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='User registered mobile number']/..//input[@formcontrolname='mobile']")).sendKeys("8500298784");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Description']/..//textarea[@formcontrolname='description']")).sendKeys("Festival Coupon");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//button[.='Add']")).click();
		Thread.sleep(2000);
		
		WebElement ErrorMessage58 = driver.findElement(By.xpath("//div[@aria-label='coupon added successfully']"));
		Thread.sleep(1000);
		
		try {
			if (ErrorMessage58.isDisplayed()) 
	        {
	        	w.takeScreenShot(driver, "h_add_Admin_Coupon_Page_MinimumAmountEqual_Test");
	            Thread.sleep(2000);
			} 
	        else 
			{
	        	System.out.println("Coupon Not Added");
			}
		} finally {
			driver.quit();
		}
			
	}
	
	//62
	
	@Test
	public void i_add_Admin_Coupon_Page_Valid_Mobile_Number_Test()throws Exception
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
		driver.findElement(By.xpath("//span[.='Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Admin Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Add admin Coupon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Coupon Amount']/..//input[@placeholder='Enter Amount']")).sendKeys("5000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='From Date']/..//input[@formcontrolname='from_date']")).sendKeys("18/7/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='To Date']/..//input[@formcontrolname='to_date']")).sendKeys("20/8/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Minimum Transaction Amount']/..//input[@placeholder='Enter Amount']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Minimum Transaction Amount']/..//input[@placeholder='Enter Amount']")).sendKeys("7000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='User registered mobile number']/..//input[@formcontrolname='mobile']")).sendKeys("85008784");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Description']/..//textarea[@formcontrolname='description']")).sendKeys("Festival Coupon");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//button[.='Add']")).click();
		Thread.sleep(2000);
		
		WebElement ErrorMessage59 = driver.findElement(By.xpath("//div[@aria-label='Not Found This Mobile Number in Records']"));
		 Thread.sleep(2000);
			try {
				if (ErrorMessage59.isDisplayed()) 
		        {
		        	w.takeScreenShot(driver, "i_add_Admin_Coupon_Page_Valid_Mobile_Number_Test");
		            Thread.sleep(2000);
				} 
		        else 
				{
		        	System.out.println("Coupon Added sucessfully");
				}
			} finally {
				driver.quit();
			}
			
	}
	
	//63
	
	@Test
	public void j_add_Admin_Coupon_Page_Unregistered_Mobile_Number_Test()throws Exception
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
		driver.findElement(By.xpath("//span[.='Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Admin Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Add admin Coupon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Coupon Amount']/..//input[@placeholder='Enter Amount']")).sendKeys("5000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='From Date']/..//input[@formcontrolname='from_date']")).sendKeys("18/7/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='To Date']/..//input[@formcontrolname='to_date']")).sendKeys("20/8/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Minimum Transaction Amount']/..//input[@placeholder='Enter Amount']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Minimum Transaction Amount']/..//input[@placeholder='Enter Amount']")).sendKeys("7000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='User registered mobile number']/..//input[@formcontrolname='mobile']")).sendKeys("9809090989");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Description']/..//textarea[@formcontrolname='description']")).sendKeys("Festival Coupon");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//button[.='Add']")).click();
		Thread.sleep(2000);
		
		WebElement ErrorMessage60 = driver.findElement(By.xpath("//div[@aria-label='Not Found This Mobile Number in Records']"));
		 Thread.sleep(2000);
			try {
				if (ErrorMessage60.isDisplayed()) 
		        {
		        	w.takeScreenShot(driver, "j_add_Admin_Coupon_Page_Unregistered_Mobile_Number_Test");
		            Thread.sleep(2000);
				} 
		        else 
				{
		        	System.out.println("Coupon Added sucessfully");
				}
			} finally {
				driver.quit();
			}
			
	}
	
	//64 - Output : Coupon Closed sucessfully
	
	@Test
	public void k_add_Admin_Coupon_Page_Close_Button_Test()throws Exception
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
		driver.findElement(By.xpath("//span[.='Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Admin Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Add admin Coupon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Coupon Amount']/..//input[@placeholder='Enter Amount']")).sendKeys("5000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='From Date']/..//input[@formcontrolname='from_date']")).sendKeys("18/5/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='To Date']/..//input[@formcontrolname='to_date']")).sendKeys("20/6/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Minimum Transaction Amount']/..//input[@placeholder='Enter Amount']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Minimum Transaction Amount']/..//input[@placeholder='Enter Amount']")).sendKeys("7000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='User registered mobile number']/..//input[@formcontrolname='mobile']")).sendKeys("9809090989");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Description']/..//textarea[@formcontrolname='description']")).sendKeys("Festival Coupon");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/..//button[@aria-label='Close']")).click();
		Thread.sleep(1000);
		WebElement ErrorMessage61 = driver.findElement(By.xpath("//button[.='Add admin Coupon']"));
		Thread.sleep(1000);
			try {
				if (ErrorMessage61.isDisplayed()) 
		        {
					w.takeScreenShot(driver, "k_add_Admin_Coupon_Page_Close_Button_Test");
		            Thread.sleep(2000);
				} 
		        else 
				{
		        	System.out.println("Coupon Closed sucessfully");
				}
			} finally {
				driver.quit();
			}
			
	}
	
	//65
	
	@Test
	public void l_add_Admin_Coupon_Page_Search_Feild_Test()throws Exception
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
		driver.findElement(By.xpath("//span[.='Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Admin Coupons']")).click();
		Thread.sleep(2000);
		
		WebElement ErrorMessage62 = driver.findElement(By.xpath("//input[@placeholder='Search...']"));
		ErrorMessage62.sendKeys("KP1128YK");
		Thread.sleep(2000);
		try {
			if (ErrorMessage62.isDisplayed()) 
	        {
	        	w.takeScreenShot(driver, "l_add_Admin_Coupon_Page_Search_Feild_Test");
	            Thread.sleep(2000);
	        	
			} 
	        else 
			{
	        	System.out.println("Coupon Found sucessfully");
			}
		} finally {
			driver.quit();
		}
		
	}
	
	//66
	
	@Test
	public void m_add_Admin_Coupon_Page_Edit_Amount_Test()throws Exception
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
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(5000);
		driver.findElement(By.xpath("//span[.='Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Admin Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[.='Edit'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/ancestor::div[@class='modal-content']//input[@formcontrolname='amount']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/ancestor::div[@class='modal-content']//input[@formcontrolname='from_date']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/ancestor::div[@class='modal-content']//input[@formcontrolname='from_date']")).sendKeys("30/7/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/ancestor::div[@class='modal-content']//input[@formcontrolname='to_date']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/ancestor::div[@class='modal-content']//input[@formcontrolname='to_date']")).sendKeys("30/8/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/ancestor::div[@class='modal-content']//input[@formcontrolname='minimum_transaction_amount']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/ancestor::div[@class='modal-content']//input[@formcontrolname='minimum_transaction_amount']")).sendKeys("50");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/ancestor::div[@class='modal-content']//textarea[@formcontrolname='description']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/ancestor::div[@class='modal-content']//textarea[@formcontrolname='description']")).sendKeys("Festival Coupon");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//button[.='Update']")).click();
		Thread.sleep(2000);
		
		WebElement ErrorMessage63 = driver.findElement(By.xpath("(//div[.=' Data updated successfully '])[2]"));
		Thread.sleep(1000);
		try {
			if (ErrorMessage63.isDisplayed()) 
	        {
	        	w.takeScreenShot(driver, "m_add_Admin_Coupon_Page_Edit_Amount_Test");
	            Thread.sleep(1000);
			} 
	        else 
			{
	        	System.out.println("Coupon Updated sucessfully");
			}
		} finally {
			driver.quit();
		}
		
	}
	
	//67 
	
	@Test
	public void n_add_Admin_Coupon_Page_Edit_Expired_Date_Test()throws Exception
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
		driver.findElement(By.xpath("//span[.='Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Admin Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[.='Edit'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Coupon Amount']/..//input[@placeholder='Enter Amount']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Coupon Amount']/..//input[@placeholder='Enter Amount']")).sendKeys("6000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='From Date']/../input[@formcontrolname='from_date']")).sendKeys("18/1/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='To Date']/../input[@formcontrolname='to_date']")).sendKeys("18/2/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Minimum Transaction Amount']/../input[@placeholder='Enter Amount']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Minimum Transaction Amount']/../input[@placeholder='Enter Amount']")).sendKeys("50");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='User registered mobile number']/../input[@placeholder='Enter Moible number']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='User registered mobile number']/../input[@placeholder='Enter Moible number']")).sendKeys("8331827870");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Description']/../textarea[@placeholder='Enter description here....']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Description']/../textarea[@placeholder='Enter description here....']")).sendKeys("Festival Coupon");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//button[.='Update']")).click();
		Thread.sleep(2000);
		
		WebElement ErrorMessage64 = driver.findElement(By.xpath("//div[@aria-label='From Date and To Date cannot be less than current date']"));
		Thread.sleep(2000);
		try {
			if (ErrorMessage64.isDisplayed()) 
	        {
	        	w.takeScreenShot(driver, "n_add_Admin_Coupon_Page_Edit_Expired_Date_Test");
	            Thread.sleep(2000);
			} 
	        else 
			{
	        	System.out.println("Coupon Updated sucessfully");
			}
		} finally {
			driver.quit();
		}
	}
	

	//68
	
	@Test
	public void o_add_Admin_Coupon_Page_Edit_Less_Date_Test()throws Exception
	{
		//ErrorMessage65
	}
	
	//69
	
	@Test
	public void p_add_Admin_Coupon_Page_Edit_RMN_D_Test()throws Exception
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
		driver.findElement(By.xpath("//span[.='Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Admin Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[.='Edit'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Coupon Amount']/..//input[@placeholder='Enter Amount']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Coupon Amount']/..//input[@placeholder='Enter Amount']")).sendKeys("6000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='From Date']/../input[@formcontrolname='from_date']")).sendKeys("30/07/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='To Date']/../input[@formcontrolname='to_date']")).sendKeys("30/08/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Minimum Transaction Amount']/../input[@placeholder='Enter Amount']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Minimum Transaction Amount']/../input[@placeholder='Enter Amount']")).sendKeys("50");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='User registered mobile number']/../input[@placeholder='Enter Moible number']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Description']/../textarea[@placeholder='Enter description here....']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//button[.='Update']")).click();
		Thread.sleep(2000);
		
		WebElement SuccessMsg = driver.findElement(By.xpath("(//div[.=' Data updated successfully '])[2]"));
		Thread.sleep(2000);
		try {
			if (SuccessMsg.isDisplayed()) 
	        {
	        	w.takeScreenShot(driver, "p_add_Admin_Coupon_Page_Edit_RMN_D_Test");
	            Thread.sleep(1000);
			} 
	        else 
			{
	        	System.out.println("Coupon Updated sucessfully");
			}
		} finally {
			driver.quit();
		}
		
	}
	
	//70 - Element not Interactable 
	
	@Test
	public void q_add_Admin_Coupon_Page_Edit_Test()throws Exception
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
		driver.findElement(By.xpath("//span[.='Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Admin Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[.='Edit'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Coupon Amount']/..//input[@placeholder='Enter Amount']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Coupon Amount']/..//input[@placeholder='Enter Amount']")).sendKeys("6000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='From Date']/../input[@formcontrolname='from_date']")).sendKeys("30/05/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='To Date']/../input[@formcontrolname='to_date']")).sendKeys("30/06/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Minimum Transaction Amount']/../input[@placeholder='Enter Amount']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Minimum Transaction Amount']/../input[@placeholder='Enter Amount']")).sendKeys("50");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='User registered mobile number']/../input[@placeholder='Enter Moible number']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='User registered mobile number']/../input[@placeholder='Enter Moible number']")).sendKeys("8500298784");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Description']/../textarea[@placeholder='Enter description here....']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Description']/../textarea[@placeholder='Enter description here....']")).sendKeys("Gold");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/..//button[@aria-label='Close']")).click();
		Thread.sleep(2000);
		
		WebElement ErrorMessage67 = driver.findElement(By.xpath("//h4[.='Admin Coupon ']"));
		ErrorMessage67.click();
		Thread.sleep(1000);
	    try {
	    	if (ErrorMessage67.isDisplayed()) 
	        {
	        	w.takeScreenShot(driver, "q_add_Admin_Coupon_Page_Edit_Test");
	            Thread.sleep(1000);
			} 
	        else 
			{
	        	System.out.println("Coupon Closed sucessfully");
			}
		} finally {
			driver.quit();
		}
		
	}
	
	//71
	
	@Test
	public void r_add_Admin_Coupon_Page_View_Close_Button_Test()throws Exception
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
		driver.findElement(By.xpath("//span[.='Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Admin Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[.='Edit'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Coupon Amount']/..//input[@placeholder='Enter Amount']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Coupon Amount']/..//input[@placeholder='Enter Amount']")).sendKeys("6000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='From Date']/../input[@formcontrolname='from_date']")).sendKeys("30/07/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='To Date']/../input[@formcontrolname='to_date']")).sendKeys("30/08/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Minimum Transaction Amount']/../input[@placeholder='Enter Amount']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Minimum Transaction Amount']/../input[@placeholder='Enter Amount']")).sendKeys("50");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='User registered mobile number']/../input[@placeholder='Enter Moible number']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='User registered mobile number']/../input[@placeholder='Enter Moible number']")).sendKeys("8500298784");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Description']/../textarea[@placeholder='Enter description here....']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Description']/../textarea[@placeholder='Enter description here....']")).sendKeys("Gold Metal");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//button[.='Update']")).click();
		Thread.sleep(2000);
		
		WebElement ErrorMessage68 = driver.findElement(By.xpath("(//button[.='View'])[1]"));
		ErrorMessage68.click();
		Thread.sleep(2000);
		try {
			if (ErrorMessage68.isDisplayed()) 
	        {
	        	w.takeScreenShot(driver, "r_add_Admin_Coupon_Page_View_Close_Button_Test");
	            Thread.sleep(2000);
	        	
			} 
	        else 
			{
	        	System.out.println("Coupon Viewed sucessfully");
			}
		} finally {
			driver.quit();
		}
		
	}
	
	//72
	
	@Test
	public void s_add_Admin_Coupon_Page_View_Bootstrap_Button_Off_Test()throws Exception
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
		driver.findElement(By.xpath("//span[.='Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Admin Coupons']")).click();
		Thread.sleep(2000);
		
		WebElement ErrorMessage69 = driver.findElement(By.xpath("(//div[@class='mdc-switch__icons'])[1]"));
		ErrorMessage69.click();
		 Thread.sleep(2000);
			try {
				if (ErrorMessage69.isDisplayed()) 
		        {
		        	w.takeScreenShot(driver, "s_add_Admin_Coupon_Page_View_Bootstrap_Button_Off_Test");
		            Thread.sleep(2000);
		        	
				} 
		        else 
				{
		        	System.out.println("Coupon Viewed sucessfully");
				}
			} finally {
				driver.quit();
			}
			
	}
	
	
    //73
	
	@Test
	public void t_add_Admin_Coupon_Page_View_Bootstrap_Button_On_Test()throws Exception
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
		driver.findElement(By.xpath("//span[.='Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Admin Coupons']")).click();
		Thread.sleep(2000);
		
		WebElement ErrorMessage70 = driver.findElement(By.xpath("(//div[@class='mdc-switch__icons'])[1]"));
		ErrorMessage70.click();
		 Thread.sleep(2000);
			try {
				if (ErrorMessage70.isDisplayed()) 
		        {
		        	w.takeScreenShot(driver, "t_add_Admin_Coupon_Page_View_Bootstrap_Button_On_Test");
		            Thread.sleep(2000);
		        	
				} 
		        else 
				{
		        	System.out.println("Coupon Viewed sucessfully");
				}
			} finally {
				driver.quit();
			}
			
   }
	
}