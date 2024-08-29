package Sprint_4_Negative;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.ExcelFileUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Splash_Banners {
	
	WebDriverUtility w = new WebDriverUtility();
	PropertyFileUtility pUtil = new PropertyFileUtility();
	ExcelFileUtility eUtil = new ExcelFileUtility();	
	//13
	
	@Test
	public void a_splash_Banner_Module_redirection_Test()throws Exception
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
		
        driver.findElement(By.xpath("//span[.='Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Splash Banners']")).click();
        Thread.sleep(2000);
        
        WebElement SplashBannersPage = driver.findElement(By.xpath("//h4[.='Splash Banners']"));
        Thread.sleep(2000);
        try {
        	if (SplashBannersPage.isDisplayed()) 
            {
        		w.takeScreenShot(driver, "a_splash_Banner_Module_redirection_Test");
                Thread.sleep(2000);
     		} 
             else 
     		{
            	 System.out.println("Main Banners sucessfully Displayed");
     		}
		} finally {
			driver.quit();
		}
        
	}

	//14
	
	@Test
	public void b_splash_Banner_Add_Button_Test()throws Exception
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
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[.='Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Splash Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Splash Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add']")).click();
        Thread.sleep(2000);
        
        WebElement ErrorMessage12 = driver.findElement(By.xpath("//div[@aria-label='Banner image is required']"));
        Thread.sleep(2000);
        try {
        	if (ErrorMessage12.isDisplayed()) 
            {
            	w.takeScreenShot(driver, "b_splash_Banner_Add_Button_Test");
                Thread.sleep(2000);
    		} 
            else 
    		{
            	System.out.println("Splash Banners added sucessfully ");
    		}
		} finally {
			driver.quit();
		}
        
	}
	
	//15
	
	@Test
	public void c_add_Splash_Banner_page_Date_Test()throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Splash Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Splash Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='Enter From Date']")).sendKeys("19-04-2024");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='Enter TO Date']")).sendKeys("29-04-2024");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add']")).click();
        Thread.sleep(2000);
        
        WebElement ErrorMessage13 = driver.findElement(By.xpath("//div[@aria-label='Banner image is required']"));
        Thread.sleep(2000);
        try {
        	if (ErrorMessage13.isDisplayed()) 
            {
            	w.takeScreenShot(driver, "c_add_Splash_Banner_page_Date_Test");
                Thread.sleep(2000);
            	
    		} 
            else 
    		{
            	System.out.println("Splash Banners added sucessfully ");
    		}
		} finally {
			driver.quit();
		}
      
	}
	
	//16
	
	@Test
	public void d_add_Splash_Banner_page_Image_Test() throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		String ImagePath = eUtil.readDataFromExcel("ImagePath", 0, 1);
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(5000);
		
        driver.findElement(By.xpath("//span[.='Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Splash Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Splash Banners']")).click();
        Thread.sleep(2000);
        
        Robot r = new Robot();
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        
        WebElement ChooseFileBtn = driver.findElement(By.xpath("//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='No File Chosen']"));
        Thread.sleep(3000);
        
        WebDriverUtility wUtil = new WebDriverUtility();
        wUtil.clickOnChooseFileOption(driver, ChooseFileBtn, ImagePath);
        
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.delay(2000);
//        StringSelection ss = new StringSelection("C:\\Users\\vikra\\OneDrive\\Desktop\\One Drive Folder\\OneDrive\\Pictures\\Saved Pictures\\download.jpg");
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.keyPress(KeyEvent.VK_V);
//        r.keyRelease(KeyEvent.VK_CONTROL);
//        r.keyRelease(KeyEvent.VK_V);
//        r.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add']")).click();
        Thread.sleep(2000);
		
        WebElement ErrorMessage14 = driver.findElement(By.xpath("(//div[.=' Please Enter Sequence '])[2]"));
        Thread.sleep(1000);
        try {
        	if (ErrorMessage14.isDisplayed()) 
            {
            	w.takeScreenShot(driver, "d_add_Splash_Banner_page_Image_Test");
                Thread.sleep(2000);
    		} 
            else 
    		{
            	System.out.println("Main Banners added sucessfully ");
    		}
		} finally {
			driver.quit();
		}
        
	}
	
	//17
	
	@Test
	public void e_add_Splash_Banner_page_Date_Image_Test() throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		String ImagePath = eUtil.readDataFromExcel("ImagePath", 0, 1);
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(5000);
		
        driver.findElement(By.xpath("//span[.='Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Splash Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Splash Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='Enter From Date']")).sendKeys("19-04-2024");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='Enter TO Date']")).sendKeys("29-04-2024");
        Thread.sleep(2000);
		
        Robot r = new Robot();
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        
        WebElement ChooseFileBtn = driver.findElement(By.xpath("//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='No File Chosen']"));
        Thread.sleep(3000);
        
        WebDriverUtility wUtil = new WebDriverUtility();
        wUtil.clickOnChooseFileOption(driver, ChooseFileBtn, ImagePath);
        
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.delay(2000);
//        StringSelection ss = new StringSelection("C:\\Users\\vikra\\OneDrive\\Desktop\\One Drive Folder\\OneDrive\\Pictures\\Saved Pictures\\download.jpg");
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.keyPress(KeyEvent.VK_V);
//        r.keyRelease(KeyEvent.VK_CONTROL);
//        r.keyRelease(KeyEvent.VK_V);
//        r.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add']")).click();
        Thread.sleep(2000);
		
        WebElement ErrorMessage15 = driver.findElement(By.xpath("(//div[.=' Please Enter Sequence '])[2]"));
        Thread.sleep(1000);
        try {
        	if (ErrorMessage15.isDisplayed()) 
            {
            	w.takeScreenShot(driver, "e_add_Splash_Banner_page_Date_Image_Test");
                Thread.sleep(1000);
    		} 
            else 
    		{
            	System.out.println("Main Banners added sucessfully ");
    		}
		} finally {
			driver.quit();
		}
        
	}
	
	//18
	
	@Test
	public void f_add_Splash_Banner_page_Sequence_Test() throws Exception
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
        
        driver.findElement(By.xpath("//span[.='Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Splash Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Splash Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='Enter Sequence']")).sendKeys("1");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[.='Add']")).click();
        Thread.sleep(2000);
        
        WebElement ErrorMessage16 = driver.findElement(By.xpath("//div[@aria-label='Banner image is required']"));
        Thread.sleep(2000);
        try {
        	if (ErrorMessage16.isDisplayed()) 
            {
            	w.takeScreenShot(driver, "f_add_Splash_Banner_page_Sequence_Test");
                Thread.sleep(2000);
            	
    		} 
            else 
    		{
            	System.out.println("Main Banners added sucessfully ");
    		}
    		
		} finally {
			driver.quit();
		}
        
	}
	
	//19
	
	@Test
	public void g_add_Splash_Banner_page_Date_Image_Sequence_WrngData_Test()throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		String ImagePath = eUtil.readDataFromExcel("ImagePath", 0, 1);
		
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(5000);
		
        driver.findElement(By.xpath("//span[.='Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Splash Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Splash Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='Enter From Date']")).sendKeys("19-01-2024");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='Enter TO Date']")).sendKeys("28-02-2024");
        Thread.sleep(2000);
		
        Robot r = new Robot();
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        
        WebElement ChooseFileBtn = driver.findElement(By.xpath("//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='No File Chosen']"));
        Thread.sleep(3000);
        
        WebDriverUtility wUtil = new WebDriverUtility();
        wUtil.clickOnChooseFileOption(driver, ChooseFileBtn, ImagePath);
        
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.delay(2000);
//        StringSelection ss = new StringSelection("C:\\Users\\vikra\\OneDrive\\Desktop\\One Drive Folder\\OneDrive\\Pictures\\Saved Pictures\\download.jpg");
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.keyPress(KeyEvent.VK_V);
//        r.keyRelease(KeyEvent.VK_CONTROL);
//        r.keyRelease(KeyEvent.VK_V);
//        r.keyPress(KeyEvent.VK_ENTER);
		
        driver.findElement(By.xpath("//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='Enter Sequence']")).sendKeys("1");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[.='Add']")).click();
        Thread.sleep(2000);
		
        WebElement ErrorMessage17 = driver.findElement(By.xpath("//div[@aria-label='splash bannner added successfully']"));
        Thread.sleep(2000);
        try {
        	if (ErrorMessage17.isDisplayed()) 
            {
            	w.takeScreenShot(driver, "g_add_Splash_Banner_page_Date_Image_Sequence_WrngData_Test");
                Thread.sleep(2000);
    		} 
            else 
    		{
            	System.out.println("Main Banners added sucessfully ");
    		}
		} finally {
			driver.quit();
		}
       
	}
	
	//20
	
	@Test
	public void h_add_Splash_Banner_page_Date_Image_Sequence_CloseBtn_Test() throws Exception
	{
		
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		String ImagePath = eUtil.readDataFromExcel("ImagePath", 0, 1);
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(5000);
		
        driver.findElement(By.xpath("//span[.='Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Splash Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Splash Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='Enter From Date']")).sendKeys("19-04-2024");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='Enter TO Date']")).sendKeys("29-04-2024");
        Thread.sleep(2000);
		
        Robot r = new Robot();
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        
        WebElement ChooseFileBtn = driver.findElement(By.xpath("//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='No File Chosen']"));
        Thread.sleep(3000);
        
        WebDriverUtility wUtil = new WebDriverUtility();
        wUtil.clickOnChooseFileOption(driver, ChooseFileBtn, ImagePath);
        
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.delay(2000);
//        StringSelection ss = new StringSelection("C:\\Users\\vikra\\OneDrive\\Desktop\\One Drive Folder\\OneDrive\\Pictures\\Saved Pictures\\download.jpg");
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.keyPress(KeyEvent.VK_V);
//        r.keyRelease(KeyEvent.VK_CONTROL);
//        r.keyRelease(KeyEvent.VK_V);
//        r.keyPress(KeyEvent.VK_ENTER);
		
        driver.findElement(By.xpath("//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='Enter Sequence']")).sendKeys("1");
        Thread.sleep(2000);
		
        WebElement ErrorMessage18 = driver.findElement(By.xpath("//h1[.='Add Splash Banners']/..//button[@aria-label='Close']"));
        Thread.sleep(2000);
        try {
        	if (ErrorMessage18.isDisplayed()) 
            {
            	w.takeScreenShot(driver, "h_add_Splash_Banner_page_Date_Image_Sequence_CloseBtn_Test");
                Thread.sleep(2000);
            	
    		} 
            else 
    		{
            	System.out.println("Main Banners added sucessfully ");
    		}
		} finally {
			driver.quit();
		}
        
	}
	
	//21
	
	@Test
	public void i_add_Splash_Banner_page_Date_Image_Sequence_WrongDate_Test() throws Exception
	{
		
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		String ImagePath = eUtil.readDataFromExcel("ImagePath", 0, 1);
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(5000);
		
        driver.findElement(By.xpath("//span[.='Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Splash Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Splash Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='Enter From Date']")).sendKeys("19-02-2024");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='Enter TO Date']")).sendKeys("29-01-2024");
        Thread.sleep(2000);
		
        Robot r = new Robot();
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        
        WebElement ChooseFileBtn = driver.findElement(By.xpath("//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='No File Chosen']"));
        Thread.sleep(3000);
        
        WebDriverUtility wUtil = new WebDriverUtility();
        wUtil.clickOnChooseFileOption(driver, ChooseFileBtn, ImagePath);
        
        r.keyPress(KeyEvent.VK_CONTROL);
        r.delay(2000);
        StringSelection ss = new StringSelection("C:\\Users\\vikra\\OneDrive\\Desktop\\One Drive Folder\\OneDrive\\Pictures\\Saved Pictures\\download.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        r.keyPress(KeyEvent.VK_ENTER);
		
        driver.findElement(By.xpath("//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='Enter Sequence']")).sendKeys("1");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[.='Add']")).click();
        Thread.sleep(2000);
		
        WebElement ErrorMessage19 = driver.findElement(By.xpath("//div[@aria-label='From Date cannot be greater than To Date']"));
        Thread.sleep(2000);
        try {
        	if (ErrorMessage19.isDisplayed()) 
            {
            	w.takeScreenShot(driver, "i_add_Splash_Banner_page_Date_Image_Sequence_WrongDate_Test");
                Thread.sleep(2000);
            	
    		} 
            else 
    		{
            	System.out.println("Main Banners added sucessfully ");
    		}
		} 
        finally 
        {
			driver.quit();
		}
       
		
	}
	
	//22 - Pop Up Is Taking too long to respond
	
	@Test
	public void j_Edit_button_in_Splash_banner_page_Test() throws Exception
	{
		
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String ImagePath = eUtil.readDataFromExcel("ImagePath", 0, 1);String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//span[.='Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Splash Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[.=' Edit '])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Banner']/../following-sibling::div//input[@placeholder='Enter From Date']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Banner']/../following-sibling::div//input[@placeholder='Enter From Date']")).sendKeys("4-05-2024");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Banner']/../following-sibling::div//input[@placeholder='Enter To Date']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Banner']/../following-sibling::div//input[@placeholder='Enter To Date']")).sendKeys("3-06-2024");
        Thread.sleep(2000);
        
        Robot r = new Robot();
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        
        WebElement ChooseFileBtn = driver.findElement(By.xpath("//h1[.='Update Banner']/../following-sibling::div//input[@placeholder='No File Chosen']"));
        Thread.sleep(3000);
        
        WebDriverUtility wUtil = new WebDriverUtility();
        wUtil.clickOnChooseFileOption(driver, ChooseFileBtn, ImagePath);
        
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.delay(2000);
//        StringSelection ss = new StringSelection("C:\\Users\\vikra\\OneDrive\\Desktop\\One Drive Folder\\OneDrive\\Pictures\\Saved Pictures\\download.jpg");
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.keyPress(KeyEvent.VK_V);
//        r.keyRelease(KeyEvent.VK_CONTROL);
//        r.keyRelease(KeyEvent.VK_V);
//        r.keyPress(KeyEvent.VK_ENTER);
        
        driver.findElement(By.xpath("//h1[.='Update Banner']/../following-sibling::div//input[@placeholder='Enter Sequence']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Banner']/../following-sibling::div//button[.='Update']")).click();
        Thread.sleep(2000);
        
        WebElement ErrorMessage20 = driver.findElement(By.xpath("//div[@aria-label='Splash Screen Details Updated Successfully']"));
        Thread.sleep(2000);
        try {
        	if (ErrorMessage20.isDisplayed()) 
            {
            	w.takeScreenShot(driver, "j_Edit_button_in_Splash_banner_page_Test");
                Thread.sleep(2000);
            	
    		} 
            else 
    		{
            	System.out.println("Main Banners Updated sucessfully ");
    		}
		} finally {
			driver.quit();
		}
		
	}
	
	//23
	
	@Test
	public void k_bootstrap_button_off_for_specific_Splash_banner_Test() throws Exception
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
		
        driver.findElement(By.xpath("//span[.='Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Splash Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='mdc-switch__icons'])[1]")).click();
        Thread.sleep(2000);
        WebElement UpdateMsg = driver.findElement(By.xpath("(//div[.=' SplashScreen Updated Successfully. '])[2]"));
        Thread.sleep(1000);
        try {
        	if (UpdateMsg.isDisplayed()) 
            {
            	w.takeScreenShot(driver, "k_bootstrap_button_off_for_specific_Splash_banner_Test");
                Thread.sleep(1000);
    		} 
            else 
    		{
            	System.out.println("Spalsh Banners is disabled sucessfully ");
    		}
		} finally {
			driver.quit();
		}
       
	}
	
	//24
	
	
	@Test
	public void l_bootstrap_button_On_for_specific_Splash_banner_Up() throws Exception
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
		
        driver.findElement(By.xpath("//span[.='Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Splash Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='mdc-switch__icons'])[1]")).click();
        Thread.sleep(2000);
        WebElement UpdateMsg = driver.findElement(By.xpath("(//div[.=' SplashScreen Updated Successfully. '])[2]"));
        Thread.sleep(1000);
        try {
        	if (UpdateMsg.isDisplayed()) 
            {
            	w.takeScreenShot(driver, "l_bootstrap_button_On_for_specific_Splash_banner_Up");
                Thread.sleep(1000);
    		} 
            else 
    		{
            	System.out.println("Splash Banners Enabled sucessfully ");
    		}
		} 
        finally {
			driver.quit();
		}
        
	}
}