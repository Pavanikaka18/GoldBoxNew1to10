package Sprint_4_Negative;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Coupon_List {
	
	WebDriverUtility w = new WebDriverUtility();
	PropertyFileUtility pUtil = new PropertyFileUtility();
	
	//37
	
	@Test
	public void a_add_Coupon_Test()throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(7000);
		driver.findElement(By.xpath("//span[.='Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Coupons List']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Add Coupon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//button[.='Add']")).click();
		Thread.sleep(2000);
		
		WebElement ErrorMessage34 = driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//input[@placeholder='Enter Amount']/../div[.='Amount is required']"));
		Thread.sleep(2000);
		try {
			if (ErrorMessage34.isDisplayed()) 
	        {
	        	w.takeScreenShot(driver, "a_add_Coupon_Test");
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
	
	//38
	
	@Test
	public void b_add_Coupon_Page_Amount_Test()throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(7000);
		driver.findElement(By.xpath("//span[.='Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Coupons List']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Add Coupon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Coupon Amount']/..//input[@placeholder='Enter Amount']")).sendKeys("5000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//button[.='Add']")).click();
		Thread.sleep(2000);
		
		WebElement ErrorMessage35 = driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//input[@formcontrolname='from_date']/../div[.='From_date is required']"));
		Thread.sleep(1000);
		try {
			if (ErrorMessage35.isDisplayed()) 
	        {
	        	w.takeScreenShot(driver, "b_add_Coupon_Page_Amount_Test");
	            Thread.sleep(1000);
			} 
	        else 
			{
	        	System.out.println("Coupon Added sucessfully");
			}
		} finally {
			driver.quit();
		}
		
	}
	
	//39
	
	@Test
	public void c_add_Coupon_Page_Date_Test() throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(7000);
		driver.findElement(By.xpath("//span[.='Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Coupons List']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Add Coupon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='From Date']/..//input[@formcontrolname='from_date']")).sendKeys("4/15/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='To Date']/../input[@formcontrolname='to_date']")).sendKeys("4/20/2024");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//button[.='Add']")).click();
		Thread.sleep(2000);
		
		WebElement ErrorMessage36 = driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//input[@placeholder='Enter Amount']/../div[.='Amount is required']"));
		Thread.sleep(1000);
		try {
			if (ErrorMessage36.isDisplayed()) 
	        {
	        	w.takeScreenShot(driver, "c_add_Coupon_Page_Date_Test");
	            Thread.sleep(1000);
			} 
	        else 
			{
	        	System.out.println("Coupon Added sucessfully");
			}
		} finally {
			driver.quit();
		}
		
	}
	
	//40
	
	@Test
	public void d_add_Coupon_Page_Descripion_Missing_Test()throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(7000);
		driver.findElement(By.xpath("//span[.='Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Coupons List']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Add Coupon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Coupon Amount']/..//input[@placeholder='Enter Amount']")).sendKeys("5000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='From Date']/..//input[@formcontrolname='from_date']")).sendKeys("4/15/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='To Date']/../input[@formcontrolname='to_date']")).sendKeys("4/20/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Minimum Transaction Amount']/../input[@formcontrolname='minimum_transaction_amount']")).sendKeys("500");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//button[.='Add']")).click();
		Thread.sleep(2000);
		
		WebElement ErrorMessage37 = driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Description']/../div[.='description is required']"));
		Thread.sleep(1000);
		try {
			if (ErrorMessage37.isDisplayed()) 
	        {
	        	w.takeScreenShot(driver, "d_add_Coupon_Page_Descripion_Missing_Test");
	            Thread.sleep(1000);
			} 
	        else 
			{
	        	System.out.println("Coupon Added sucessfully");
			}
		} finally {
			driver.quit();
		}
		
	}
	
	//41
	
	@Test
	public void e_add_Coupon_Page_Close_Button_Test()throws Exception
	{
		
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(7000);
		driver.findElement(By.xpath("//span[.='Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Coupons List']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Add Coupon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Coupon Amount']/..//input[@placeholder='Enter Amount']")).sendKeys("5000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='From Date']/..//input[@formcontrolname='from_date']")).sendKeys("4/15/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='To Date']/../input[@formcontrolname='to_date']")).sendKeys("4/20/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Minimum Transaction Amount']/../input[@formcontrolname='minimum_transaction_amount']")).sendKeys("500");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Description']/../textarea[@placeholder='Enter description here....']")).sendKeys("Festival Coupon");
		Thread.sleep(2000);
		
		WebElement ErrorMessage38 = driver.findElement(By.xpath("//h1[.='Add coupon']/..//button[@aria-label='Close']"));
		Thread.sleep(1000);
		try {
			if (ErrorMessage38.isDisplayed()) 
	        {
	        	w.takeScreenShot(driver, "e_add_Coupon_Page_Close_Button_Test");
	            Thread.sleep(1000);
			} 
	        else 
			{
	        	System.out.println("Coupon Added sucessfully");
			}
		} finally {
			driver.quit();	
		}
		
	}
	
	//42
	
	@Test
	public void f_add_Coupon_Page_Minimum_Amount_Less_Test()throws Exception
	{
		
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(7000);
		driver.findElement(By.xpath("//span[.='Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Coupons List']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Add Coupon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Coupon Amount']/..//input[@placeholder='Enter Amount']")).sendKeys("5000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='From Date']/..//input[@formcontrolname='from_date']")).sendKeys("4/15/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='To Date']/../input[@formcontrolname='to_date']")).sendKeys("4/20/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Minimum Transaction Amount']/../input[@formcontrolname='minimum_transaction_amount']")).sendKeys("50");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Description']/../textarea[@placeholder='Enter description here....']")).sendKeys("Festival Coupon");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//button[.='Add']")).click();
		Thread.sleep(2000);
		
		WebElement ErrorMessage39 = driver.findElement(By.xpath("//div[@aria-label='Minimum Transaction Amount should be greater than Amount.']"));
		Thread.sleep(1000);
		try {
			if (ErrorMessage39.isDisplayed()) 
	        {
	        	w.takeScreenShot(driver, "f_add_Coupon_Page_Minimum_Amount_Less_Test");
	            Thread.sleep(1000);
			} 
	        else 
			{
	        	System.out.println("Coupon Added sucessfully");
			}
		} finally {
			driver.quit();
		}
		
	}
	
	//43
	
	@Test
	public void g_add_Coupon_Page_Wrong_Date_Test()throws Exception
	{
		
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(7000);
		driver.findElement(By.xpath("//span[.='Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Coupons List']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Add Coupon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Coupon Amount']/..//input[@placeholder='Enter Amount']")).sendKeys("5000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='From Date']/..//input[@formcontrolname='from_date']")).sendKeys("4/05/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='To Date']/../input[@formcontrolname='to_date']")).sendKeys("4/01/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Minimum Transaction Amount']/../input[@formcontrolname='minimum_transaction_amount']")).sendKeys("6000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Description']/../textarea[@placeholder='Enter description here....']")).sendKeys("Festival Coupon");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//button[.='Add']")).click();
		Thread.sleep(2000);
		
		WebElement ErrorMessage40 = driver.findElement(By.xpath("//div[@aria-label='From Date and To Date cannot be less than current date']"));
		Thread.sleep(1000);
		try {
			if (ErrorMessage40.isDisplayed()) 
	        {
	        	w.takeScreenShot(driver, "g_add_Coupon_Page_Wrong_Date_Test");
	            Thread.sleep(1000);
	        	
			} 
	        else 
			{
	        	System.out.println("Coupon Added sucessfully");
			}
		} finally {
			driver.quit();
		}
		
	}
	
	//44
	
	@Test
	public void h_add_Coupon_Page_Minimum_Amount_Equal_Test()throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(7000);
		driver.findElement(By.xpath("//span[.='Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Coupons List']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Add Coupon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Coupon Amount']/..//input[@placeholder='Enter Amount']")).sendKeys("500");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='From Date']/..//input[@formcontrolname='from_date']")).sendKeys("4/05/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='To Date']/../input[@formcontrolname='to_date']")).sendKeys("4/01/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Minimum Transaction Amount']/../input[@formcontrolname='minimum_transaction_amount']")).sendKeys("500");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//label[.='Description']/../textarea[@placeholder='Enter description here....']")).sendKeys("Festival Coupon");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add coupon']/../following-sibling::div//button[.='Add']")).click();
		Thread.sleep(2000);
		
		WebElement ErrorMessage41 = driver.findElement(By.xpath("//div[@aria-label='Minimum Transaction Amount should be greater than Amount.']"));
		Thread.sleep(1000);
		try {
			if (ErrorMessage41.isDisplayed()) 
	        {
	        	w.takeScreenShot(driver, "h_add_Coupon_Page_Minimum_Amount_Equal_Test");
	            Thread.sleep(1000);
			} 
	        else 
			{
	        	System.out.println("Coupon Added sucessfully");
			}
		} finally {
			driver.quit();
		}
		
	}
	
	//45
	
	@Test
	public void i_coupon_List_search_Feild_Test()throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(7000);
		driver.findElement(By.xpath("//span[.='Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Coupons List']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("KP1128YK");;
		WebElement ErrorMessage42 = driver.findElement(By.xpath("//h5[.='No records found']"));
		Thread.sleep(2000);
		try {
			if (ErrorMessage42.isDisplayed()) 
	        {
	        	w.takeScreenShot(driver, "i_coupon_List_search_Feild_Test");
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
	
	//46
	
	@Test
	public void j_coupon_List_Edit_Amount_Test()throws Exception
	{
		
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(7000);
		driver.findElement(By.xpath("//span[.='Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Coupons List']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[.='Edit'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Coupon Amount']/../input[@placeholder='Enter Amount']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='From Date']/../input[@formcontrolname='from_date']")).sendKeys("4/15/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='To Date']/../input[@formcontrolname='to_date']")).sendKeys("4/18/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Minimum Transaction Amount']/../input[@placeholder='Enter Amount']")).sendKeys("500");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Description']/../textarea[@placeholder='Enter description here....']")).sendKeys("Festival Coupon");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//button[.='Update']")).click();;
		Thread.sleep(2000);
		
		WebElement ErrorMessage43 = driver.findElement(By.xpath("//div[@aria-label='Data updated successfully']"));
		Thread.sleep(1000);
		try {
			if (ErrorMessage43.isDisplayed()) 
	        {
	        	w.takeScreenShot(driver, "j_coupon_List_Edit_Amount_Test");
	            Thread.sleep(1000);
	        	
			} 
	        else 
			{
	        	System.out.println("Coupon Added sucessfully");
			}
		} finally {
			driver.quit();
		}
			
		
	}
	
	//47
	
	@Test
    public void k_coupon_List_Edit_Wrong_Date_Test()throws Exception
    {
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(7000);
		driver.findElement(By.xpath("//span[.='Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Coupons List']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[.='Edit'])[1]")).click();
		Thread.sleep(2000);
		WebElement CouponAmtEdt = driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Coupon Amount']/../input[@placeholder='Enter Amount']"));
		CouponAmtEdt.clear();
		CouponAmtEdt.sendKeys("5000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='From Date']/../input[@formcontrolname='from_date']")).sendKeys("4/05/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='To Date']/../input[@formcontrolname='to_date']")).sendKeys("4/02/2024");
		Thread.sleep(2000);
		WebElement MinTransactionAmtEdt = driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Minimum Transaction Amount']/../input[@placeholder='Enter Amount']"));
		MinTransactionAmtEdt.clear();
		MinTransactionAmtEdt.sendKeys("500");
		Thread.sleep(2000);
		WebElement DescriptionEdt = driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Description']/../textarea[@placeholder='Enter description here....']"));
		DescriptionEdt.clear();
		DescriptionEdt.sendKeys("Festival Coupon");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//button[.='Update']")).click();;
		Thread.sleep(2000);
		
		WebElement ErrorMessage44 = driver.findElement(By.xpath("//div[@aria-label='From Date and To Date cannot be less than current date']"));
		Thread.sleep(1000);
		try {
			if (ErrorMessage44.isDisplayed()) 
	        {
	        	w.takeScreenShot(driver, "k_coupon_List_Edit_Wrong_Date_Test");
	            Thread.sleep(1000);
	        	
			} 
	        else 
			{
	        	System.out.println("Coupon Added sucessfully");
			}
		} finally {
			driver.quit();
		}
		
    }
	
	//48
	
	@Test
	
	public void l_coupon_List_Edit_Expired_Date_Test()throws Exception
	{
		
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(7000);
		driver.findElement(By.xpath("//span[.='Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Coupons List']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[.='Edit'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Coupon Amount']/../input[@placeholder='Enter Amount']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Coupon Amount']/../input[@placeholder='Enter Amount']")).sendKeys("5000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='From Date']/../input[@formcontrolname='from_date']")).sendKeys("4/01/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='To Date']/../input[@formcontrolname='to_date']")).sendKeys("4/02/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Minimum Transaction Amount']/../input[@placeholder='Enter Amount']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Minimum Transaction Amount']/../input[@placeholder='Enter Amount']")).sendKeys("500");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Description']/../textarea[@placeholder='Enter description here....']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Description']/../textarea[@placeholder='Enter description here....']")).sendKeys("Festival Coupon");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//button[.='Update']")).click();;
		Thread.sleep(2000);
		
		WebElement ErrorMessage45 = driver.findElement(By.xpath("//div[@aria-label='From Date and To Date cannot be less than current date']"));
		Thread.sleep(1000);
		try {
			if (ErrorMessage45.isDisplayed()) 
	        {
	        	w.takeScreenShot(driver, "l_coupon_List_Edit_Expired_Date_Test");
	            Thread.sleep(1000);
	        	
			} 
	        else 
			{
	        	System.out.println("Coupon Added sucessfully");
			}
		} finally {
			driver.quit();
		}
		
	}
	
	//49
	
	@Test
    public void m_coupon_List_Edit_Description_Feild_Empty_Test()throws Exception
    {
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(7000);
		driver.findElement(By.xpath("//span[.='Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Coupons List']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[.='Edit'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Coupon Amount']/../input[@placeholder='Enter Amount']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Coupon Amount']/../input[@placeholder='Enter Amount']")).sendKeys("5000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='From Date']/../input[@formcontrolname='from_date']")).sendKeys("4/07/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='To Date']/../input[@formcontrolname='to_date']")).sendKeys("4/08/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Minimum Transaction Amount']/../input[@placeholder='Enter Amount']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Minimum Transaction Amount']/../input[@placeholder='Enter Amount']")).sendKeys("500");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Description']/../textarea[@placeholder='Enter description here....']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//button[.='Update']")).click();;
		Thread.sleep(2000);
		
		WebElement ErrorMessage46 = driver.findElement(By.xpath("//div[@aria-label='Data updated successfully']"));
		Thread.sleep(1000);
		try {
			if (ErrorMessage46.isDisplayed()) 
	        {
	        	w.takeScreenShot(driver, "m_coupon_List_Edit_Description_Feild_Empty_Test");
	            Thread.sleep(1000);
	        	
			} 
	        else 
			{
	        	System.out.println("Coupon Added sucessfully");
			}
		} finally {
			driver.quit();
		}
			
    }
	
	//50
	
	@Test
	public void n_coupon_List_Edit_Coupon_with_Original_Data_Test()throws Exception
	{
		//ErrorMessage47
	}
	
	//51
	
	@Test
	public void o_coupon_List_Edit_Description_Feild_New_Data_Test() throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(7000);
		driver.findElement(By.xpath("//span[.='Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Coupons List']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[.='Edit'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Coupon Amount']/../input[@placeholder='Enter Amount']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Coupon Amount']/../input[@placeholder='Enter Amount']")).sendKeys("5000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='From Date']/../input[@formcontrolname='from_date']")).sendKeys("4/07/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='To Date']/../input[@formcontrolname='to_date']")).sendKeys("4/08/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Minimum Transaction Amount']/../input[@placeholder='Enter Amount']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Minimum Transaction Amount']/../input[@placeholder='Enter Amount']")).sendKeys("500");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Description']/../textarea[@placeholder='Enter description here....']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//label[.='Description']/../textarea[@placeholder='Enter description here....']")).sendKeys("Loyality Coupon");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Edit coupon']/../following-sibling::div//button[.='Update']")).click();;
		Thread.sleep(2000);
        
        WebElement SuccessMsg = driver.findElement(By.xpath("(//div[.=' Data updated successfully '])[2]"));
		Thread.sleep(1000);
		try {
			if (SuccessMsg.isDisplayed()) 
	        {
	        	w.takeScreenShot(driver, "o_coupon_List_Edit_Description_Feild_New_Data_Test");
	            Thread.sleep(1000);
			} 
	        else 
			{
	        	System.out.println("Coupon Viewed sucessfully");
			}
		} finally {
			driver.quit();
		}
		
	}
	
	//52 - Click Intercepted
	
	@Test
	public void p_coupon_List_Bootstrap_Button_Off_Test() throws Exception
	{
		
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(7000);
		driver.findElement(By.xpath("//span[.='Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Coupons List']")).click();
		Thread.sleep(2000);
		
		 WebElement ErrorMessage49 = driver.findElement(By.xpath("(//div[@class='mdc-switch__icons'])[1]"));
		 ErrorMessage49.click();
		 Thread.sleep(1000);
			try {
				if (ErrorMessage49.isDisplayed()) 
		        {
		        	w.takeScreenShot(driver, "p_coupon_List_Bootstrap_Button_Off_Test");
		            Thread.sleep(1000);
		        	
				} 
		        else 
				{
		        	System.out.println("Coupon Offed sucessfully");
				}
			} finally {
				driver.quit();
			}
			
	}
	
	//53
	
	@Test
	public void q_coupon_List_Bootstrap_Button_On_Test() throws Exception
	{
		
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(7000);
		driver.findElement(By.xpath("//span[.='Coupons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Coupons List']")).click();
		Thread.sleep(2000);
		
		 WebElement ErrorMessage50 = driver.findElement(By.xpath("(//div[@class='mdc-switch__icons'])[1]"));
		 ErrorMessage50.click();
		 Thread.sleep(1000);
			try {
				if (ErrorMessage50.isDisplayed()) 
		        {
		        	w.takeScreenShot(driver, "q_coupon_List_Bootstrap_Button_On_Test");
		            Thread.sleep(1000);
				} 
		        else 
				{
		        	System.out.println("Coupon Added sucessfully");
				}
			} finally {
				driver.quit();
			}
			
	}
}