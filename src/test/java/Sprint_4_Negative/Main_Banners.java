
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

public class Main_Banners {
	
	WebDriverUtility w = new WebDriverUtility();
	PropertyFileUtility pUtil = new PropertyFileUtility();
	ExcelFileUtility eUtil = new ExcelFileUtility();
	
	//1
	
	@Test	
	public void  a_main_Banner_Module_redirection_Test() throws Exception
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
        driver.findElement(By.xpath("//a[.='Main Banners']")).click();
        Thread.sleep(2000);
        
        WebElement MainBannersPage = driver.findElement(By.xpath("//h4[.='Main Banners']"));
        Thread.sleep(2000);
        try {
        if (MainBannersPage.isDisplayed()) 
        {
        	w.takeScreenShot(driver, "a_main_Banner_Module_redirection_Test");
            Thread.sleep(2000);
		} 
        else 
		{
        	System.out.println("Splash Banners sucessfully Displayed");
		}
        }
        finally
        {
        	driver.quit();
		}
	
	}

	//2
	
	@Test 
	public void b_main_Banner_Add_Button_Test()throws Exception
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
        driver.findElement(By.xpath("//a[.='Main Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.=' Add Main Banners ']")).click();
        Thread.sleep(2000);
        
        WebElement AddMainBannersPage = driver.findElement(By.xpath("//h1[.='Add Main Banners']"));
        Thread.sleep(2000);
        try {
        	if (AddMainBannersPage.isDisplayed()) 
            {
            	w.takeScreenShot(driver, "b_main_Banner_Add_Button_Test");
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
        
     //3
	
	@Test
	public void c_add_Main_Banner_page_Date_Test()throws Exception
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
        driver.findElement(By.xpath("//a[.='Main Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.=' Add Main Banners ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Main Banners']/../following-sibling::div//input[@placeholder='Enter From Date']")).sendKeys("19-04-2024");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Main Banners']/../following-sibling::div//input[@placeholder='Enter TO Date']")).sendKeys("29-04-2024");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add']")).click();
        Thread.sleep(2000);
        
        WebElement ErrorMessage2 = driver.findElement(By.xpath("//div[@aria-label='Banner image is required']"));
        Thread.sleep(2000);
        try {if (ErrorMessage2.isDisplayed()) 
        {
        	w.takeScreenShot(driver, "c_add_Main_Banner_page_Date_Test");
            Thread.sleep(1000);
		} 
        else 
		{
        	System.out.println("Main Banners added sucessfully ");
		}
		} finally
        {
			driver.quit();
		} 
			
	}
	
	//4
	
	@Test
	public void d_add_Main_Banner_page_Image_Test() throws Exception
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
        driver.findElement(By.xpath("//a[.='Main Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.=' Add Main Banners ']")).click();
        Thread.sleep(2000);
        
        Robot r = new Robot();
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        
        WebElement ChooseFileBtn = driver.findElement(By.xpath("//h1[.='Add Main Banners']/../following-sibling::div//input[@placeholder='No File Chosen']"));
        Thread.sleep(3000);
        
        WebDriverUtility wUtil = new WebDriverUtility();
        wUtil.clickOnChooseFileOption(driver, ChooseFileBtn,ImagePath);
        
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.delay(2000);
//        StringSelection ss = new StringSelection("C:\\Users\\vikra\\OneDrive\\Desktop\\One Drive Folder\\OneDrive\\Pictures\\Saved Pictures\\Ringggggggggggg.png");
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.keyPress(KeyEvent.VK_V);
//        r.keyRelease(KeyEvent.VK_CONTROL);
//        r.keyRelease(KeyEvent.VK_V);
//        r.keyPress(KeyEvent.VK_ENTER);
        
        driver.findElement(By.xpath("//button[.='Add']")).click();
        Thread.sleep(1000);
        WebElement ErrorMessage3 = driver.findElement(By.xpath("(//div[.=' Please Enter Sequence '])[2]"));
        Thread.sleep(1000);
        
        try
        {
        	if
        	(ErrorMessage3.isDisplayed()) 
        {
        	w.takeScreenShot(driver, "d_add_Main_Banner_page_Image_Test");
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
	
      //5 - Banner Image is Required - no such element: Unable to locate element 
	
	@Test
	public void e_add_Main_Banner_page_Date_Image_Test()throws Exception
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
        driver.findElement(By.xpath("//a[.='Main Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.=' Add Main Banners ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Main Banners']/../following-sibling::div//input[@placeholder='Enter From Date']")).sendKeys("19-04-2024");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Main Banners']/../following-sibling::div//input[@placeholder='Enter TO Date']")).sendKeys("29-04-2024");
        Thread.sleep(2000);
        
        Robot r = new Robot();
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        
        WebElement ChooseFileBtn = driver.findElement(By.xpath("//h1[.='Add Main Banners']/../following-sibling::div//input[@placeholder='No File Chosen']"));
        Thread.sleep(3000);
        
        WebDriverUtility wUtil = new WebDriverUtility();
        wUtil.clickOnChooseFileOption(driver, ChooseFileBtn, ImagePath);
        
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.delay(2000);
//        StringSelection ss = new StringSelection("C:\\Users\\vikra\\OneDrive\\Desktop\\One Drive Folder\\OneDrive\\Pictures\\Saved Pictures\\Ringggggggggggg.png");
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.keyPress(KeyEvent.VK_V);
//        r.keyRelease(KeyEvent.VK_CONTROL);
//        r.keyRelease(KeyEvent.VK_V);
//        r.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add']")).click();
        Thread.sleep(1000);
        
        WebElement ErrorMessage4 = driver.findElement(By.xpath("(//div[.=' Please Enter Sequence '])[2]"));
        Thread.sleep(1000);
        try {
        	if (ErrorMessage4.isDisplayed()) 
            {
            	w.takeScreenShot(driver, "e_add_Main_Banner_page_Date_Image_Test");
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
	
	//6
	
	@Test
	public void f_add_Main_Banner_page_Sequence_Test() throws Exception
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
        driver.findElement(By.xpath("//a[.='Main Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.=' Add Main Banners ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Main Banners']/../following-sibling::div//input[@placeholder='Enter Sequence']")).sendKeys("1");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[.='Add']")).click();
        Thread.sleep(2000);
        
        WebElement ErrorMessage5 = driver.findElement(By.xpath("//div[@aria-label='Banner image is required']"));
        Thread.sleep(2000);
        try {
        	 if (ErrorMessage5.isDisplayed()) 
             {
             	w.takeScreenShot(driver, "f_add_Main_Banner_page_Sequence_Test");
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
	
	//7 - Banner Added successfully
	
	@Test
	public void g_add_Main_Banner_page_Expired_Date_Image_Sequence_Test()throws Exception
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
        driver.findElement(By.xpath("//a[.='Main Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.=' Add Main Banners ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Main Banners']/../following-sibling::div//input[@placeholder='Enter From Date']")).sendKeys("05-01-2024");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Main Banners']/../following-sibling::div//input[@placeholder='Enter TO Date']")).sendKeys("11-02-2024");
        Thread.sleep(2000);
        
        Robot r = new Robot();
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        
        WebElement ChooseFileBtn = driver.findElement(By.xpath("//h1[.='Add Main Banners']/../following-sibling::div//input[@placeholder='No File Chosen']"));
        Thread.sleep(3000);
        
        WebDriverUtility wUtil = new WebDriverUtility();
        wUtil.clickOnChooseFileOption(driver, ChooseFileBtn, ImagePath);
        
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.delay(2000);
//        StringSelection ss = new StringSelection("C:\\Users\\vikra\\OneDrive\\Desktop\\One Drive Folder\\OneDrive\\Pictures\\Saved Pictures\\Ringggggggggggg.png");
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.keyPress(KeyEvent.VK_V);
//        r.keyRelease(KeyEvent.VK_CONTROL);
//        r.keyRelease(KeyEvent.VK_V);
//        r.keyPress(KeyEvent.VK_ENTER);
        
        driver.findElement(By.xpath("//h1[.='Add Main Banners']/../following-sibling::div//input[@placeholder='Enter Sequence']")).sendKeys("1");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[.='Add']")).click();
        Thread.sleep(2000);
        
        WebElement ErrorMessage6 = driver.findElement(By.xpath("//div[@aria-label='Main Banner Added Successfully']"));
        Thread.sleep(2000);
        try {
        	if (ErrorMessage6.isDisplayed()) 
            {
            	w.takeScreenShot(driver, "g_add_Main_Banner_page_Expired_Date_Image_Sequence_Test");
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
	
	//8 
    
	@Test
    public void h_add_Main_Banner_page_Date_Image_Sequence_CloseBtn_Test() throws Exception
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
        driver.findElement(By.xpath("//a[.='Main Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.=' Add Main Banners ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Main Banners']/../following-sibling::div//input[@placeholder='Enter From Date']")).sendKeys("04-05-2024");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Main Banners']/../following-sibling::div//input[@placeholder='Enter TO Date']")).sendKeys("04-06-2024");
        Thread.sleep(2000);
        
        Robot r = new Robot();
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        
        WebElement ChooseFileBtn = driver.findElement(By.xpath("//h1[.='Add Main Banners']/../following-sibling::div//input[@placeholder='No File Chosen']"));
        Thread.sleep(3000);
        
        WebDriverUtility wUtil = new WebDriverUtility();
        wUtil.clickOnChooseFileOption(driver, ChooseFileBtn, ImagePath);
        
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.delay(2000);
//        StringSelection ss = new StringSelection("C:\\Users\\vikra\\OneDrive\\Desktop\\One Drive Folder\\OneDrive\\Pictures\\Saved Pictures\\Ringggggggggggg.png");
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.keyPress(KeyEvent.VK_V);
//        r.keyRelease(KeyEvent.VK_CONTROL);
//        r.keyRelease(KeyEvent.VK_V);
//        r.keyPress(KeyEvent.VK_ENTER);
        
        driver.findElement(By.xpath("//h1[.='Add Main Banners']/../following-sibling::div//input[@placeholder='Enter Sequence']")).sendKeys("1");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Main Banners']/..//button[@aria-label='Close']")).click();
        Thread.sleep(2000);
        WebElement MainBannerPage = driver.findElement(By.xpath("//h4[.='Main Banners']"));
        Thread.sleep(1000);
        try {
        	if (MainBannerPage.isDisplayed()) 
            {
            	w.takeScreenShot(driver, "h_add_Main_Banner_page_Date_Image_Sequence_CloseBtn_Test");
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
	
	//9
	
	@Test
      public void i_add_Main_Banner_page_Date_Image_Sequence_WrongDate_Test()throws Exception
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
        driver.findElement(By.xpath("//a[.='Main Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.=' Add Main Banners ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Main Banners']/../following-sibling::div//input[@placeholder='Enter From Date']")).sendKeys("04-02-2024");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Main Banners']/../following-sibling::div//input[@placeholder='Enter TO Date']")).sendKeys("01-01-2024");
        Thread.sleep(2000);
        
        Robot r = new Robot();
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        
        WebElement ChooseFileBtn = driver.findElement(By.xpath("//h1[.='Add Main Banners']/../following-sibling::div//input[@placeholder='No File Chosen']"));
        Thread.sleep(3000);
        
        WebDriverUtility wUtil = new WebDriverUtility();
        wUtil.clickOnChooseFileOption(driver, ChooseFileBtn, ImagePath);
        
        r.keyPress(KeyEvent.VK_CONTROL);
        r.delay(2000);
        StringSelection ss = new StringSelection("C:\\Users\\vikra\\OneDrive\\Desktop\\One Drive Folder\\OneDrive\\Pictures\\Saved Pictures\\Ringggggggggggg.png");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        r.keyPress(KeyEvent.VK_ENTER);
        
        driver.findElement(By.xpath("//h1[.='Add Main Banners']/../following-sibling::div//input[@placeholder='Enter Sequence']")).sendKeys("1");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add']")).click();
        Thread.sleep(2000);
        
        WebElement ErrorMessage8 = driver.findElement(By.xpath("//div[@aria-label='From Date cannot be greater than To Date']"));
        Thread.sleep(2000);
        try {
        	if (ErrorMessage8.isDisplayed()) 
            {
            	w.takeScreenShot(driver, "i_add_Main_Banner_page_Date_Image_Sequence_WrongDate_Test");
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
	
	//10 - Main Banner Details Updated Successfully
	
	
	@Test
	public void j_Edit_button_in_main_banner_page_Test()throws Exception
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
        driver.findElement(By.xpath("//a[.='Main Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[.=' Edit '])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Banner']/../following-sibling::div//input[@placeholder='Enter From Date']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Banner']/../following-sibling::div//input[@placeholder='Enter From Date']")).sendKeys("4-01-2024");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Banner']/../following-sibling::div//input[@placeholder='Enter To Date']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Banner']/../following-sibling::div//input[@placeholder='Enter To Date']")).sendKeys("3-02-2024");
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
//        StringSelection ss = new StringSelection("C:\\Users\\vikra\\OneDrive\\Desktop\\One Drive Folder\\OneDrive\\Pictures\\Saved Pictures\\Ringggggggggggg.png");
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.keyPress(KeyEvent.VK_V);
//        r.keyRelease(KeyEvent.VK_CONTROL);
//        r.keyRelease(KeyEvent.VK_V);
//        r.keyPress(KeyEvent.VK_ENTER);
      
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h1[.='Update Banner']/../following-sibling::div//input[@placeholder='Enter Sequence']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Banner']/../following-sibling::div//button[.='Update']")).click();
        Thread.sleep(2000);
        
        WebElement ErrorMessage9 = driver.findElement(By.xpath("//div[@aria-label='Main Banner Details Updated Successfully']"));
        Thread.sleep(2000);
        try {
        	if (ErrorMessage9.isDisplayed()) 
            {
            	w.takeScreenShot(driver, "j_Edit_button_in_main_banner_page_Test");
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
	
	//11 -  element click intercepted is not clickable
	
	@Test
	public void k_bootstrap_button_off_for_specific_Main_banner_Test() throws Exception
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
        driver.findElement(By.xpath("//a[.='Main Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='mdc-switch__icons'])[1]")).click();
        Thread.sleep(2000);
        WebElement UpdateMsg = driver.findElement(By.xpath("(//div[.=' Main Banner Status Updated Successfully. '])[2]"));
        Thread.sleep(1000);
        try {
			if(UpdateMsg.isDisplayed())
			{
				w.takeScreenShot(driver, "k_bootstrap_button_off_for_specific_Main_banner_Test");
			}
		} finally {
			driver.close();
		}
        
	}
	
	//12 - element click intercepted is not clickable
	
	@Test
	public void l_bootstrap_button_on_for_specific_Main_banner_UpTest()throws Exception
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
        driver.findElement(By.xpath("//a[.='Main Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='mdc-switch__icons'])[1]")).click();
        Thread.sleep(2000);
        WebElement ErrorMessage11 = driver.findElement(By.xpath("(//div[.=' Main Banner Status Updated Successfully. '])[2]"));
        Thread.sleep(1000);
        try {
        	 if (ErrorMessage11.isDisplayed()) 
             {
             	w.takeScreenShot(driver, "l_bootstrap_button_on_for_specific_Main_banner_UpTest");
                Thread.sleep(2000);
     		 } 
             else 
     		{
             	System.out.println("Main Banners is Displaying sucessfully ");
     		}
		} finally {
			driver.quit();
		}
	
 }
	
}