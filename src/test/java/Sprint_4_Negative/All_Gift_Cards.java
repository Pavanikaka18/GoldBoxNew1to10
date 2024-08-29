package Sprint_4_Negative;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class All_Gift_Cards {
	
	WebDriverUtility w = new WebDriverUtility();
	PropertyFileUtility pUtil = new PropertyFileUtility();
	
	//74
	
	@Test
	public void a_add_Gift_Card_Page_Add_Button_Test()throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[.='Gift Cards']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='All Gift cards']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Gift Card']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Gift Card']/../following-sibling::div//button[.='Add']")).click();
        Thread.sleep(2000);
     
        WebElement ErrorMessage71 = driver.findElement(By.xpath("//h1[.='Add Gift Card']/../following-sibling::div//label[.='Secret Key']/..//div[@class='invalid-feedback ng-star-inserted']"));
		Thread.sleep(2000);
			try {
				if (ErrorMessage71.isDisplayed()) 
		        {
		        	w.takeScreenShot(driver, "a_add_Gift_Card_Page_Add_Button_Test");
		            Thread.sleep(2000);
		        	
				} 
		        else 
				{
		        	System.out.println("Gift Card Added sucessfully");
				}
			} finally {
				driver.quit();
			}
			
	}
	
	//75
	
	@Test
	public void b_add_Gift_Card_Page_Merchant_Test()throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[.='Gift Cards']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='All Gift cards']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Gift Card']")).click();
        Thread.sleep(2000);
		
        WebElement MerchantDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Gift Card']/ancestor::div//select[@formcontrolname='merchant_id']"));

        // Create a Select object from the dropdown element
        Select MerchantDrpDwn = new Select(MerchantDrpDwnElement);
        
        // Select an option by visible text
        MerchantDrpDwn.selectByVisibleText("amazon");
		
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Gift Card']/../following-sibling::div//button[.='Add']")).click();
        Thread.sleep(2000);
     
        WebElement ErrorMessage72 = driver.findElement(By.xpath("//h1[.='Add Gift Card']/../following-sibling::div//label[.='Amount']/..//input[@placeholder='Please enter amount']"));
		Thread.sleep(2000);
			try {
				if (ErrorMessage72.isDisplayed()) 
		        {
		        	w.takeScreenShot(driver, "b_add_Gift_Card_Page_Merchant_Test");
		            Thread.sleep(2000);
				} 
		        else 
				{
		        	System.out.println("Gift Card Added sucessfully");
				}
			} finally {
				driver.quit();
			}
			
	}
	
	//76
	
	@Test
	public void c_add_Gift_Card_Page_Merchant_Amount_Test()throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[.='Gift Cards']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='All Gift cards']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Gift Card']")).click();
        Thread.sleep(2000);
		
        WebElement MerchantDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Gift Card']/../following-sibling::div//label[.='Merchant']/..//select[@formcontrolname='merchant_id']"));

        // Create a Select object from the dropdown element
        Select MerchantDrpDwn = new Select(MerchantDrpDwnElement);
        
        // Select an option by visible text
        MerchantDrpDwn.selectByVisibleText("amazon");
		
        driver.findElement(By.xpath("//h1[.='Add Gift Card']/../following-sibling::div//label[.='Amount']/..//input[@placeholder='Please enter amount']")).sendKeys("2000");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Gift Card']/../following-sibling::div//button[.='Add']")).click();
        Thread.sleep(2000);
     
        WebElement ErrorMessage73 = driver.findElement(By.xpath("//h1[.='Add Gift Card']/../following-sibling::div//label[.='Secret Key']/..//div[@class='invalid-feedback ng-star-inserted']"));
		Thread.sleep(2000);
			try {
				if (ErrorMessage73.isDisplayed()) 
		        {
		        	w.takeScreenShot(driver, "c_add_Gift_Card_Page_Merchant_Amount_Test");
		            Thread.sleep(2000);
		        	
				} 
		        else 
				{
		        	System.out.println("Gift Card Added sucessfully");
				}
			} finally {
				driver.quit();
			}
			
	}
	
	//77
	
	@Test
	public void d_add_Gift_Card_Page_Merchant_Amount_Secret_Key_Test()throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[.='Gift Cards']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='All Gift cards']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Gift Card']")).click();
        Thread.sleep(2000);
		
        WebElement MerchantDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Gift Card']/../following-sibling::div//label[.='Merchant']/..//select[@formcontrolname='merchant_id']"));

        // Create a Select object from the dropdown element
        Select MerchantDrpDwn = new Select(MerchantDrpDwnElement);
        
        // Select an option by visible text
        MerchantDrpDwn.selectByVisibleText("amazon");
		
        driver.findElement(By.xpath("//h1[.='Add Gift Card']/../following-sibling::div//label[.='Amount']/..//input[@placeholder='Please enter amount']")).sendKeys("2000");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Gift Card']/../following-sibling::div//label[.='Secret Key']/..//input[@placeholder='Please enter secret key']")).sendKeys("JawyvLMBWlr7HflOw");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Gift Card']/../following-sibling::div//button[.='Add']")).click();
        Thread.sleep(2000);
        
        WebElement ErrorMessage74 = driver.findElement(By.xpath("//h1[.='Add Gift Card']/../following-sibling::div//label[.='Quantity']/..//div[@class='invalid-feedback ng-star-inserted']"));
		Thread.sleep(2000);
			try {
				if (ErrorMessage74.isDisplayed()) 
		        {
		        	w.takeScreenShot(driver, "d_add_Gift_Card_Page_Merchant_Amount_Secret_Key_Test");
		            Thread.sleep(2000);
		        	
				} 
		        else 
				{
		        	System.out.println("Gift Card Added sucessfully");
				}
			} finally {
				driver.quit();
			}
			
	}
	
	//78
	
	@Test
	public void e_add_Gift_Card_Page_Valid_Secret_Key_Test()throws Exception
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
        driver.findElement(By.xpath("//span[.='Gift Cards']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='All Gift cards']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Gift Card']")).click();
        Thread.sleep(2000);
		
        WebElement MerchantDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Gift Card']/../following-sibling::div//label[.='Merchant']/..//select[@formcontrolname='merchant_id']"));

        // Create a Select object from the dropdown element
        Select MerchantDrpDwn = new Select(MerchantDrpDwnElement);
        
        // Select an option by visible text
        MerchantDrpDwn.selectByVisibleText("amazon");
		
        driver.findElement(By.xpath("//h1[.='Add Gift Card']/../following-sibling::div//label[.='Amount']/..//input[@placeholder='Please enter amount']")).sendKeys("2000");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Gift Card']/../following-sibling::div//label[.='Secret Key']/..//input[@placeholder='Please enter secret key']")).sendKeys("Matrikagiftcards");
        Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add Gift Card']/../following-sibling::div//label[.='Quantity']/..//input[@placeholder='Please enter quantity']")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add Gift Card']/../following-sibling::div//button[.='Add']")).click();
        Thread.sleep(2000);
        
        WebElement ErrorMessage75 = driver.findElement(By.xpath("//button[.='Add']"));
		Thread.sleep(1000);
			try {
				if (ErrorMessage75.isDisplayed()) 
		        {
		        	w.takeScreenShot(driver, "e_add_Gift_Card_Page_Valid_Secret_Key_Test");
		            Thread.sleep(1000);
				} 
		        else 
				{
		        	System.out.println("Gift Card Added sucessfully");
				}
			} finally {
				driver.quit();
			}
			
	}
	
	//79
	
	@Test
	public void f_add_Gift_Card_Page_Close_button_Test()throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[.='Gift Cards']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='All Gift cards']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Gift Card']")).click();
        Thread.sleep(2000);
		
        WebElement MerchantDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Gift Card']/../following-sibling::div//label[.='Merchant']/..//select[@formcontrolname='merchant_id']"));

        // Create a Select object from the dropdown element
        Select MerchantDrpDwn = new Select(MerchantDrpDwnElement);
        
        // Select an option by visible text
        MerchantDrpDwn.selectByVisibleText("amazon");
		
        driver.findElement(By.xpath("//h1[.='Add Gift Card']/../following-sibling::div//label[.='Amount']/..//input[@placeholder='Please enter amount']")).sendKeys("2000");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Gift Card']/../following-sibling::div//label[.='Secret Key']/..//input[@placeholder='Please enter secret key']")).sendKeys("Matrikagiftcards ");
        Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add Gift Card']/../following-sibling::div//label[.='Quantity']/..//input[@placeholder='Please enter quantity']")).sendKeys("1");	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add Gift Card']/..//button[@aria-label='Close']")).click();
		Thread.sleep(1000);
        WebElement ErrorMessage76 = driver.findElement(By.xpath("//h4[.='All Gift Cards']/ancestor::div[@class='card-header']//button[.='Add Gift Card']"));
        Thread.sleep(1000);
        
			try {
				if (ErrorMessage76.isDisplayed()) 
		        {
		        	w.takeScreenShot(driver, "f_add_Gift_Card_Page_Close_button_Test");
		            Thread.sleep(2000);
				} 
		        else 
				{
		        	System.out.println("Gift Card Added sucessfully");
				}
			} finally {
				driver.quit();
			}
			
	}
	
	//80
	
	@Test
	public void g_add_Gift_Card_Page_Search_Feild_Test()throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[.='Gift Cards']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='All Gift cards']")).click();
        Thread.sleep(2000);
        
        WebElement ErrorMessage77 = driver.findElement(By.xpath("//input[@placeholder='Search...']"));
        ErrorMessage77.sendKeys("Goldbox");
        Thread.sleep(2000);
			try {
				if (ErrorMessage77.isDisplayed()) 
		        {
		        	w.takeScreenShot(driver, "g_add_Gift_Card_Page_Search_Feild_Test");
		            Thread.sleep(2000);
		        	
				} 
		        else 
				{
		        	System.out.println("Gift Card Founded sucessfully");
				}
			} finally {
				driver.quit();
			}
			
	}

}