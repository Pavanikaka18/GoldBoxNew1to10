package sprint_3_Negative;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.ExcelFileUtility;
import genericUtility.JavaUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class E_E_Commerce_Brands {
	ExcelFileUtility eUtil = new ExcelFileUtility();
	
	WebDriverUtility w = new WebDriverUtility();
	PropertyFileUtility pUtil = new PropertyFileUtility();
	
	//59TC
	
	@Test(groups = "Sprint-3", priority = 1)
	public void a_addingBrandsByGivingNullValuesErrorTest()throws Exception
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
        driver.findElement(By.xpath("//a[.='Brands']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Brand']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Brand']/../following-sibling::div//button[.='Add']")).click();
        Thread.sleep(2000);
        
        WebElement Error = driver.findElement(By.xpath("(//div[.=' All fields are required '])[2]"));
        Thread.sleep(2000);
        
        try 
        {
        	if (Error.isDisplayed())
            {
    			w.takeScreenShot(driver, "a_addingBrandsByPassingNullValuesErrorTest");
    			Thread.sleep(2000);
    		}
		} 
        finally 
        {
        	driver.quit();
		}
		
	}
	
	//60TC
	
	@Test(groups = "Sprint-3", priority = 2)
	public void b_addingBrandByGivingOnlyBrandNameTest()throws Exception
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
        driver.findElement(By.xpath("//a[.='Brands']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Brand']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Brand']/../following-sibling::div//input[@formcontrolname='name']")).sendKeys("abc");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Brand']/../following-sibling::div//button[.='Add']")).click();
        Thread.sleep(2000);
        WebElement ErrorMsg = driver.findElement(By.xpath("(//div[.=' All fields are required '])[2]"));
        
        try 
        {
        	if (ErrorMsg.isDisplayed())
            {
    			w.takeScreenShot(driver, "b_addingBrandByGivingOnlyBrandNameTest");
    			Thread.sleep(2000);
    		}
        	else
        	{
        		System.out.println("Brand Added Auccessfully");
			}
		}
        finally 
        {
        	driver.quit();
		}
		
	}
	
	//61TC
	
	@Test(groups = "Sprint-3", priority = 3)
	public void c_addingBrandByGivingOnlyBrandImageTest()throws Exception
	{
		String ImagePath = eUtil.readDataFromExcel("ImagePath", 0, 1);
		
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
        driver.findElement(By.xpath("//a[.='Brands']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Brand']")).click();
        Thread.sleep(2000);
        
        Robot r = new Robot();
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        
        WebElement ChooseFileBtn = driver.findElement(By.xpath("//h1[.='Add Brand']/../following-sibling::div//input[@formcontrolname='image']"));
        Thread.sleep(2000);
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
//		
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Brand']/../following-sibling::div//button[.='Add']")).click();
        Thread.sleep(2000);
        
        WebElement ErrorMsg = driver.findElement(By.xpath("(//div[.=' All fields are required '])[2]"));
        
        try 
        {
        	if(ErrorMsg.isDisplayed())
            {
    			w.takeScreenShot(driver, "c_addingBrandByGivingOnlyBrandImageTest");
    			Thread.sleep(2000);
    		}
        	else
        	{
        		System.out.println("Brand Added Auccessfully");
			}
		} 
        finally 
        {
        	driver.quit();
		}
        
	     
	}
	
	//62TC
	
	@Test(groups = "Sprint-3", priority = 4)
	public void d_brandsSearchFeildPassingValueWhichIsNotThereTest()throws Exception
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
        driver.findElement(By.xpath("//a[.='Brands']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("Matrikaaaaaaaa");
        
        WebElement NoRecords = driver.findElement(By.xpath("//h5[.='No records found']"));
        
        try 
        {
        	if(NoRecords.isDisplayed()) 
    		{
    			w.takeScreenShot(driver, "d_brandsSearchFeildPassingValueWhichIsNotThereTest");
    			Thread.sleep(2000);
    		}
        	else 
        	{
        		System.out.println("Searched Element Found");
			}
		}
        finally 
        {
        	driver.quit();
		}
		
		
	}
	
	//63TC
	
	@Test(groups = "Sprint-3", priority = 5)
	public void e_brandAddingAndEditingItByRemovingBrandNameButUpdatingSuccessfullyErrorTest()throws Exception
	{
		JavaUtility jUtil = new JavaUtility();
		
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		String ImagePath = eUtil.readDataFromExcel("ImagePath", 1, 1);
		String BrandName = "Abcd"+jUtil.getRandomNum();
		
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
        driver.findElement(By.xpath("//a[.='Brands']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Brand']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Brand']/../following-sibling::div//input[@formcontrolname='name']")).sendKeys(BrandName);
        Thread.sleep(2000);
        
        Robot r = new Robot();
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        
        driver.findElement(By.xpath("//option[.='Brand']")).click();
        Thread.sleep(2000);
        
        WebElement ChooseFileBtn = driver.findElement(By.xpath("//h1[.='Add Brand']/../following-sibling::div//input[@formcontrolname='image']"));
        Thread.sleep(2000);
        
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
        driver.findElement(By.xpath("//h1[.='Add Brand']/../following-sibling::div//button[.='Add']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[.='"+BrandName+"']/..//td//button[.=' Edit ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Brand']/../following-sibling::div//input[@formcontrolname='name']")).clear();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//td//button[.=' Edit '])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Brand']/../following-sibling::div//input[@formcontrolname='name']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Brand']/../following-sibling::div//button[.='Update']")).click();
        Thread.sleep(2000);
        
        try 
        {
        	WebElement SuccessMsg = driver.findElement(By.xpath("(//div[.=' Brand Updated Successfully '])[2]"));
//        	WebElement ErrorMsg = driver.findElement(By.xpath("(//div[.=' Please Enter brand Name '])[2]"));
        	if (SuccessMsg.isDisplayed())
            {
    			w.takeScreenShot(driver, "e_brandAddingAndEditingItByRemovingBrandNameButUpdatingSuccessfullyErrorTest");
    			Thread.sleep(2000);
    		}        	
//        	else if(ErrorMsg.isDisplayed())
//        	{        		
//        		w.takeScreenShot(driver, "e_brandAddingAndEditingItByRemovingBrandNameTest");
//    			Thread.sleep(2000);
//			}
        	else 
        	{
        		System.out.println("Brand Added Auccessfully");
			}
		} 
        finally 
        {
        	driver.quit();
		}
        
	}
	
	//65TC
	
	@Test(groups = "Sprint-3", priority = 6)
	public void f_TurningOffbrandsBootStrapButtonAndCheckingTheSameBrandDisplayingInProductsPageBrandDrpDwnListErrorTest()throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		String ImagePath = eUtil.readDataFromExcel("ImagePath", 0, 1);
		
		JavaUtility jUtil = new JavaUtility();
		String BrandName = "Abcd"+jUtil.getRandomNum();
		
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
        driver.findElement(By.xpath("//a[.='Brands']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Brand']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Brand']/../following-sibling::div//input[@formcontrolname='name']")).sendKeys(BrandName);
        Thread.sleep(2000);
        
        Robot r = new Robot();
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        
        driver.findElement(By.xpath("//option[.='Brand']")).click();
        Thread.sleep(2000);
        
        WebElement ChooseFileBtn = driver.findElement(By.xpath("//h1[.='Add Brand']/../following-sibling::div//input[@formcontrolname='image']"));
        Thread.sleep(2000);
        
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
		
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Brand']/../following-sibling::div//button[.='Add']")).click();
        Thread.sleep(4000);
		driver.findElement(By.xpath("//td[.='"+BrandName+"']/..//td//button[.=' Edit ']/..//div[@class='mdc-switch__handle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Products']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Add Product']")).click();
		Thread.sleep(2000);
		WebElement BrandDrpDwn = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='brandname']"));
		BrandDrpDwn.click();
		Thread.sleep(2000);	
		
		try 
		{
			Select s = new Select(BrandDrpDwn);
			s.selectByVisibleText(BrandName);
			Thread.sleep(2000);
		} 
		catch (Exception e) 
		{
			w.takeScreenShot(driver, "f_TurningOffbrandsBootStrapButtonAndCheckingTheSameBrandDisplayingInProductsPageBrandDrpDwnListErrorTest");
		}
		finally 
		{
			driver.quit();
		}
		
		
	}
}