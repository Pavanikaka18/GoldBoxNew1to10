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
import org.testng.annotations.Test;

import genericUtility.ExcelFileUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Ecom_Banners {
	
	WebDriverUtility w = new WebDriverUtility();
	PropertyFileUtility pUtil = new PropertyFileUtility();
	ExcelFileUtility eUtil = new ExcelFileUtility();
	
	//25
	
	@Test
	public void a_Ecom_Banner_Module_redirection_Test()throws Exception
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
        driver.findElement(By.xpath("//a[.='Ecom Banners']")).click();
        Thread.sleep(2000);
        
        WebElement EcomBannersPage = driver.findElement(By.xpath("//h4[.='Ecom Banners']"));
        Thread.sleep(1000);
        try {
        	if (EcomBannersPage.isDisplayed()) 
            {
        		w.takeScreenShot(driver, "a_Ecom_Banner_Module_redirection_Test");
                Thread.sleep(1000);
    		} 
            else 
    		{
            	System.out.println("Splash banner Page Displayed");
    		}
		} finally {
			driver.quit();
		}
       
	}
	
	//26
	
	@Test
    public void b_Ecom_Banner_Add_Button_Test()throws Exception
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
        Thread.sleep(7000);
		
        driver.findElement(By.xpath("//span[.='Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Ecom Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Ecom Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add']")).click();
        Thread.sleep(2000);
        
        WebElement ErrorMessage23 = driver.findElement(By.xpath("(//input[@placeholder='Enter Sequence'])[1]"));
        Thread.sleep(1000);
        try {
        	if (ErrorMessage23.isDisplayed()) 
            {
            	w.takeScreenShot(driver, "b_Ecom_Banner_Add_Button_Test");
                Thread.sleep(1000);
    		} 
            else 
    		{
            	System.out.println("Ecom Banners added sucessfully ");
    		}
		} finally {
			driver.quit();
		}
        
    }
    
	//27
	
	@Test
	public void c_Ecom_Splash_Banner_page_Date_Test()throws Exception
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
		
        driver.findElement(By.xpath("//span[.='Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Ecom Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Ecom Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='Enter From Date']")).sendKeys("19-04-2024");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='Enter TO Date']")).sendKeys("29-04-2024");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add']")).click();
        Thread.sleep(2000);
		
        WebElement ErrorMessage24 = driver.findElement(By.xpath("(//input[@placeholder='Enter Sequence'])[1]"));
        Thread.sleep(1000);
        try {
        	if (ErrorMessage24.isDisplayed()) 
            {
            	w.takeScreenShot(driver, "c_Ecom_Splash_Banner_page_Date_Test");
                Thread.sleep(1000);
    		} 
            else 
    		{
            	System.out.println("Ecom Banners added sucessfully ");
    		}
    		
		} finally {
			driver.quit();
		}
       
	}
	
	//28
	
	@Test
	public void d_add_Ecom_Banner_page_Image_Test() throws Exception
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
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(7000);
		
        driver.findElement(By.xpath("//span[.='Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Ecom Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Ecom Banners']")).click();
        Thread.sleep(2000);
        
        Robot r = new Robot();
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        
        WebElement ChooseFileBtn = driver.findElement(By.xpath("//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='No File Chosen']"));
        Thread.sleep(2000);
        
        WebDriverUtility wUtil = new WebDriverUtility();
        wUtil.clickOnChooseFileOption(driver, ChooseFileBtn,ImagePath);
        
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.delay(2000);
//        StringSelection ss = new StringSelection("C:\\Users\\vikra\\OneDrive\\Desktop\\One Drive Folder\\OneDrive\\Pictures\\Saved Pictures\\download.jpg");
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.keyPress(KeyEvent.VK_V);
//        r.keyRelease(KeyEvent.VK_CONTROL);
//        r.keyRelease(KeyEvent.VK_V);
//        r.keyPress(KeyEvent.VK_ENTER);
        
        driver.findElement(By.xpath("//button[.='Add']")).click();
        Thread.sleep(2000);
		
        WebElement ErrorMessage25 = driver.findElement(By.xpath("(//input[@placeholder='Enter Sequence'])[1]"));
        Thread.sleep(1000);
        try {
        	if (ErrorMessage25.isDisplayed()) 
            {
            	w.takeScreenShot(driver, "d_add_Ecom_Banner_page_Image_Test");
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
	
	//29
	
	@Test
	public void e_add_Ecom_Banner_page_Date_Image_Test()throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		String ImagePath= eUtil.readDataFromExcel("imagepath", 0, 1);
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(7000);
		
        driver.findElement(By.xpath("//span[.='Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Ecom Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Ecom Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='Enter From Date']")).sendKeys("19-04-2024");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='Enter TO Date']")).sendKeys("29-04-2024");
        Thread.sleep(2000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        WebElement ChooseFileBtn = driver.findElement(By.xpath("//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='No File Chosen']"));
        Thread.sleep(2000);
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
        driver.findElement(By.xpath("//button[.='Add']")).click();
        Thread.sleep(2000);
		
        WebElement ErrorMessage26 = driver.findElement(By.xpath("(//input[@placeholder='Enter Sequence'])[1]"));
        Thread.sleep(1000);
        try {
        	if (ErrorMessage26.isDisplayed()) 
            {
            	w.takeScreenShot(driver, "e_add_Ecom_Banner_page_Date_Image_Test");
                Thread.sleep(1000);
    		} 
            else 
    		{
            	System.out.println("Ecom Banners added sucessfully ");
    		}
		} finally {
			driver.quit();	
		}
       
	}

	//30
	
	@Test
	public void f_add_Ecom_Banner_page_Sequence_Test()throws Exception
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
        driver.findElement(By.xpath("//span[.='Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Ecom Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Ecom Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='Enter Sequence']")).sendKeys("1");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add']")).click();
        Thread.sleep(2000);
        
        WebElement ErrorMessage27 = driver.findElement(By.xpath("(//input[@placeholder='Enter From Date'])[1]"));
        Thread.sleep(1000);
        try {
        	if (ErrorMessage27.isDisplayed()) 
            {
            	w.takeScreenShot(driver, "f_add_Ecom_Banner_page_Sequence_Test");
                Thread.sleep(1000);
    		} 
            else 
    		{
            	System.out.println("Ecom Banners added sucessfully ");
    		}
		} finally {
			driver.quit();
		}
        
	}

	//31 - Banner Added Successfully
	
	@Test
	public void g_add_Ecom_Banner_page_Date_Image_Sequence_WrngData_Test()throws Exception
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
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Ecom Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Ecom Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='Enter From Date']")).sendKeys("19-01-2024");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='Enter TO Date']")).sendKeys("25-02-2024");
        Thread.sleep(2000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        WebElement ChooseFileBtn = driver.findElement(By.xpath("//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='No File Chosen']"));
        Thread.sleep(2000);
        WebDriverUtility wUtil = new WebDriverUtility();
        wUtil.clickOnChooseFileOption(driver, ChooseFileBtn,ImagePath);
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
		
        WebElement ErrorMessage28 = driver.findElement(By.xpath("//div[@aria-label=' Ecommerce Banner Added Successfully']"));
        Thread.sleep(1000);
        try {
        	if (ErrorMessage28.isDisplayed()) 
            {
            	w.takeScreenShot(driver, "g_add_Ecom_Banner_page_Date_Image_Sequence_WrngData_Test");
                Thread.sleep(1000);
    		} 
            else 
    		{
            	System.out.println("Ecom Banners added sucessfully ");
    		}
		} finally {
			driver.quit();
		}
       
	}
	
	//32 Missing Close Button
	
	@Test
	public void h_add_Ecom_Banner_page_Date_Image_Sequence_CloseBtn_Test()throws Exception
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
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Ecom Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Ecom Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='Enter From Date']")).sendKeys("19-04-2024");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='Enter TO Date']")).sendKeys("25-04-2024");
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
        driver.findElement(By.xpath("//h1[.='Add Splash Banners']/..//button[@aria-label='Close']")).click();
        Thread.sleep(2000);
		
        WebElement ErrorMessage29 = driver.findElement(By.xpath("//h4[.='Ecom Banners']"));
        Thread.sleep(1000);
        try {
        	if (ErrorMessage29.isDisplayed()) 
            {
            	w.takeScreenShot(driver, "h_add_Ecom_Banner_page_Date_Image_Sequence_CloseBtn_Test");
                Thread.sleep(1000);
    		} 
            else 
    		{
            	System.out.println("Ecom Banners added sucessfully ");
    		}
		} finally {
			driver.quit();	
		}
        
	}
	
	//33
	
	@Test
	public void i_add_Ecom_Banner_page_Date_Image_Sequence_WrongDate_Test() throws Exception
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
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Ecom Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Ecom Banners']")).click();
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
        
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.delay(2000);
//        StringSelection ss = new StringSelection("C:\\Users\\vikra\\OneDrive\\Desktop\\One Drive Folder\\OneDrive\\Pictures\\Saved Pictures\\Ringggggggggggg.png");
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
        WebElement ErrorMessage30 = driver.findElement(By.xpath("//div[@aria-label='From Date cannot be greater than To Date']"));
        Thread.sleep(1000);
        try {
        	if (ErrorMessage30.isDisplayed()) 
            {
            	w.takeScreenShot(driver, "i_add_Ecom_Banner_page_Date_Image_Sequence_WrongDate_Test");
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
	
	//34
	
	@Test
	public void j_Edit_button_in_Ecom_banner_page_Test() throws Exception
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
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Ecom Banners']")).click();
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
//        StringSelection ss = new StringSelection("C:\\Users\\vikra\\OneDrive\\Desktop\\One Drive Folder\\OneDrive\\Pictures\\Saved Pictures\\Ringggggggggggg.png");
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
        
        WebElement ErrorMessage31 = driver.findElement(By.xpath("//DIV[@aria-label='Ecom Banner Details Updated Successfully']"));
        Thread.sleep(1000);
        try {
        	if (ErrorMessage31.isDisplayed()) 
            {
             	w.takeScreenShot(driver, "j_Edit_button_in_Ecom_banner_page_Test");
                Thread.sleep(1000);
     		} 
             else 
     		{
             	System.out.println("Main Banners Updated sucessfully ");
     		}
		} finally {
			driver.quit();
		}
       
	}
	
	//35
	
	@Test
     public void k_bootstrap_button_off_for_specific_Ecom_banner_Up_Test()throws Exception
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
        driver.findElement(By.xpath("//span[.='Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Ecom Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='mdc-switch__icons'])[1]")).click();
        Thread.sleep(2000);
        WebElement UpdateMsg = driver.findElement(By.xpath("(//div[.='  Ecom Banner Status Updated Successfully. '])[2]"));
        Thread.sleep(1000);
        try {
        	 if (UpdateMsg.isDisplayed()) 
             {
             	 w.takeScreenShot(driver, "k_bootstrap_button_off_for_specific_Ecom_banner_Up_Test");
                 Thread.sleep(1000);
     		 } 
             else 
     		 {
             	 System.out.println("Ecom Banners is Displaying sucessfully ");
     		 }
		} finally {
			driver.quit();
		}
        
     }
	
	//36
	
	@Test
	public void l_bootstrap_button_On_for_specific_Ecom_banner_Test() throws Exception
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
        
        driver.findElement(By.xpath("//span[.='Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Ecom Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='mdc-switch__icons'])[1]")).click();
        WebElement UpdateMsg = driver.findElement(By.xpath("(//div[.='  Ecom Banner Status Updated Successfully. '])[2]"));
        Thread.sleep(1000);
        try {
        	if (UpdateMsg.isDisplayed()) 
            {
            	w.takeScreenShot(driver, "l_bootstrap_button_On_for_specific_Ecom_banner_Test");
                Thread.sleep(1000);
    		} 
            else 
    		{
            	System.out.println("Bootstrap Button is not clickable");
    		}
		} finally {
			driver.quit();
		}
       
	}
 }