package sprint_3_Negative;

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
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.ExcelFileUtility;
import genericUtility.FMS_BaseClass;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class B_E_Commerce_Categories {
	
	ExcelFileUtility eUtil = new ExcelFileUtility();
	WebDriverUtility w = new WebDriverUtility();
	PropertyFileUtility pUtil = new PropertyFileUtility();
	
	 //3TC
	 
	 @Test(groups = "Sprint-3", priority = 1)
     public void a_clickOnECommercelink_ECommerceDrpDwnShouldNotDropOptionsErrorTest()throws Exception
     {
		 String URL = pUtil.readDataFromPropertyFile("url");
	     String USERNAME = pUtil.readDataFromPropertyFile("username");
		 String PASSWORD = pUtil.readDataFromPropertyFile("password");
		 
		 WebDriverManager.chromedriver().setup();
		 WebDriverManager.chromedriver().clearDriverCache().setup();
		 WebDriverManager.chromedriver().clearResolutionCache().setup();
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		 driver.get(URL);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
	     Thread.sleep(5000);
         driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
         Thread.sleep(2000);
         WebElement Category = driver.findElement(By.xpath("//a[.='Category']"));
         Thread.sleep(2000);
         try 
         {
        	if (Category.isDisplayed()) 
            {
        		w.takeScreenShot(driver, "a_clickOnECommercelink_ECommerceDrpDwnShouldNotDropOptionsErrorTest");
            }
        	else 
            {
                System.out.println("Ecommerce is not Dropping Elements");
    		}
		 } 
         finally 
         {
        	driver.quit();
         }
        
    }
	
	//4TC
	
	@Test(groups = "Sprint-3", priority = 2)
	public void b_clickOnCategoriesLinkCategoryListPageShouldNotDisplayErrorTest()throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().clearDriverCache().setup();
		WebDriverManager.chromedriver().clearResolutionCache().setup();
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
	    Thread.sleep(3000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Category']")).click();
        Thread.sleep(2000);
        WebElement CategoryListPage = driver.findElement(By.xpath("//h4[.='Category List']"));
        Thread.sleep(2000);
        
        try 
        {
        	if (CategoryListPage.isDisplayed()) 
            {
    			 w.takeScreenShot(driver, "b_clickOnCategoriesLinkCategoryListPageShouldNotDisplayErrorTest");
    		} 
            else 
            {
                 System.out.println("Categorory List Page is not Displayed");
    		}
		} 
        finally 
        {
        	driver.quit();
		}
       
	}
	
	//5TC
	
	@Test(groups = "Sprint-3", priority = 3)
	public void c_searchForAcategoryWhichIsNotAvailableInCategoryListPageErrorTest()throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().clearDriverCache().setup();
		WebDriverManager.chromedriver().clearResolutionCache().setup();
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
	    Thread.sleep(5000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Category']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("StoneJewllery");
		
        WebElement NoRecordsFindError = driver.findElement(By.xpath("//h5[.='No records found']"));
        try 
        {
			if (NoRecordsFindError.isDisplayed()) 
			{
				w.takeScreenShot(driver, "c_searchForAcategoryWhichIsNotAvailableInCategoryListPageErrorTest");
			} 
			else 
			{
                System.out.println("Searched Category Displayed");
			}
		} 
        finally 
        {
        	driver.quit();
		}
        
		
	}
	
	//6Th
	@Test(groups = "Sprint-3", priority = 4)
	public void d_clickOnCategoryLinkCategoryListPageShouldNotDisplayErrorTest()throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().clearDriverCache().setup();
		WebDriverManager.chromedriver().clearResolutionCache().setup();
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
	    Thread.sleep(5000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Category']")).click();
        Thread.sleep(2000);
        WebElement CategoryListPage = driver.findElement(By.xpath("//h4[.='Category List']"));
        Thread.sleep(2000);
        
        try 
        {
        	if (CategoryListPage.isDisplayed()) 
            {
            	w.takeScreenShot(driver, "d_clickOnCategoryLinkCategoryListPageShouldNotDisplayErrorTest");
    		} 
            else
            {
                System.out.println("Category list Page is Opened");
    		}
		}
        finally 
        {
        	driver.quit();
		}
		
		
	}
	
	//7Th
	@Test(groups = "Sprint-3", priority = 5)
	public void e_addingCategoryByGivingNullValuesErrorTest()throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().clearDriverCache().setup();
		WebDriverManager.chromedriver().clearResolutionCache().setup();
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
	    Thread.sleep(5000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add']")).click();
        Thread.sleep(2000);
        WebElement ErrorMsg = driver.findElement(By.xpath("(//div[.=' All fields are required '])[2]"));
        
        try
        {
        	if (ErrorMsg.isDisplayed()) 
            {
        		w.takeScreenShot(driver, "e_addingCategoryByGivingNullValuesErrorTest");
    		} 
            else
            {
                System.out.println("Category is added");
    		}
		} 
        finally 
        {
        	driver.quit();
		}
		
	}
	
	//8Th
	@Test(groups = "Sprint-3", priority = 6)
	public void f_addingCategoryByGivingOnlyNameErrorTest()throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().clearDriverCache().setup();
		WebDriverManager.chromedriver().clearResolutionCache().setup();
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
	    Thread.sleep(5000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[@class='modal-title fs-5']/../following-sibling::div//input[@placeholder='Enter Category Name']")).sendKeys("Bangles");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add']")).click();
        Thread.sleep(2000);
        WebElement Error = driver.findElement(By.xpath("(//div[.=' All fields are required '])[2]"));
        
        try 
        {
        	if (Error.isDisplayed())
            {
        		w.takeScreenShot(driver, "f_addingCategoryByGivingOnlyNameErrorTest");
    		} 
            else 
            {
            	System.out.println("Category Added Successfully");
    		}
		} 
        finally 
        {
        	driver.quit();
		}
        
	}
	
	//9TC
	
	@Test(groups = "Sprint-3", priority = 7)
	public void g_addingCategoryByGivingOnlyImageErrorTest()throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		String ImagePath = eUtil.readDataFromExcel("ImagePath", 0, 1);
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().clearDriverCache().setup();
		WebDriverManager.chromedriver().clearResolutionCache().setup();
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
	    Thread.sleep(20000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Category']")).click();
        Thread.sleep(2000);
        
        Robot r = new Robot();
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
	    WebElement ChooseFileBtn = driver.findElement(By.xpath("(//h1[@class='modal-title fs-5']/../following-sibling::div//input[@placeholder='No File Chosen'])[1]"));
		
	    WebDriverUtility wUtil = new WebDriverUtility();
        wUtil.clickOnChooseFileOption(driver, ChooseFileBtn, ImagePath);
        
//        r.keyPress(KeyEvent.VK_CONTROL);
//        Thread.sleep(2000);
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
        WebElement Error = driver.findElement(By.xpath("(//div[.=' All fields are required '])[2]"));
        
        try 
        {
        	if (Error.isDisplayed())
            {
        		w.takeScreenShot(driver, "g_addingCategoryByGivingOnlyImageErrorTest");
    		} 
            else 
            {
            	System.out.println("Category Added Successfully");
    		}
		} 
        finally 
        {
        	driver.quit();
		}
	}
	
	//10TC
	
	@Test(groups = "Sprint-3", priority = 8)
	public void h_clickOnCloseBtnCategoryPageShouldNotCloseTest()throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().clearDriverCache().setup();
		WebDriverManager.chromedriver().clearResolutionCache().setup();
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Category']")).click();
        Thread.sleep(2000);
        WebElement CloseBtn = driver.findElement(By.xpath("(//button[@aria-label='Close'])[1]"));
        CloseBtn.click();
        
        try 
        {
        	if (CloseBtn.isDisplayed())
            {
    			System.out.println("Add Category Page Is Not Closed");
    		} 
            else 
            {
            	w.takeScreenShot(driver, "h_clickOnCloseBtnCategoryPageShouldNotClose");
    		}
		} 
        finally 
        {
        	driver.quit();
		}
        
	}
	
	@Test(groups = "Sprint-3", priority = 9)
	public void i_addingCategoryByGivingValidDetailsPassTest()throws Exception
	{
		Robot r = new Robot();
		
		String ImagePath = eUtil.readDataFromExcel("ImagePath", 0, 1);
		
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().clearDriverCache().setup();
		WebDriverManager.chromedriver().clearResolutionCache().setup();
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
	    Thread.sleep(15000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Category']/../following-sibling::div//input[@placeholder='Enter Category Name']")).sendKeys("Gold Chains");
        Thread.sleep(2000);
        WebElement ChooseFile = driver.findElement(By.xpath("//h1[.='Add Category']/../following-sibling::div//input[@formcontrolname='image']"));
        Thread.sleep(2000);
        
        w.clickOnChooseFileOption(driver, ChooseFile, ImagePath);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.delay(2000);
        StringSelection ss = new StringSelection("C:\\Users\\vikra\\OneDrive\\Desktop\\One Drive Folder\\OneDrive\\Pictures\\Saved Pictures\\download.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        r.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);        
        driver.findElement(By.xpath("//button[.='Add']")).click();
        Thread.sleep(2000);
        WebElement SuccessMsg = driver.findElement(By.xpath("(//div[.=' Category Added Successfully '])[2]"));
        
        try 
        {
        	if (SuccessMsg.isDisplayed())
            {
    			w.takeScreenShot(driver, "i_addingCategoryByGivingValidDetailsPassTest");
    		} 
            else 
            {
            	System.out.println("Category Added Successfully");
    		}
		} 
        finally 
        {
        	driver.quit();
		}
	}
	
	//11TC
	
	@Test(groups = "Sprint-3", priority = 10)
	public void j_clickOnParticularCategoryEditButtonUpdatePageShouldNotOpenErrorTest()throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().clearDriverCache().setup();
		WebDriverManager.chromedriver().clearResolutionCache().setup();
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(15000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[.='Gold Chains']/..//td[@class='my-td']/following-sibling::td//button[.=' Edit ']")).click();
        Thread.sleep(2000);
        WebElement UpdateCategoryPage = driver.findElement(By.xpath("//h1[.='Update Category']"));
        
		try 
		{
			if (UpdateCategoryPage.isDisplayed()) 
			{
				w.takeScreenShot(driver, "j_clickOnParticularCategoryEditButtonUpdatePageShouldNotOpenErrorTest");
			} 
			else 
			{
	            System.out.println("Category Update Page is Opened");
			}
		} 
		finally 
		{
			driver.quit();
		}
		
	}
	
	//12TC
	
	@Test(groups = "Sprint-3", priority = 11)
	public void k_updatingCategoryByGivingOnlyImagePassErrorTest()throws Exception
	{
		String ImagePath = eUtil.readDataFromExcel("ImagePath", 0, 1);
		
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().clearDriverCache().setup();
		WebDriverManager.chromedriver().clearResolutionCache().setup();
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(15000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[.='Gold Chains']/..//td[@class='my-td']/following-sibling::td//button[.=' Edit ']")).click();
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Category']/../following-sibling::div//input[@placeholder='Enter Category Name']")).clear();
        
        Thread.sleep(2000);
        Robot r = new Robot();
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
		
        WebElement ChooseFileBtn = driver.findElement(By.xpath("(//h1[@class='modal-title fs-5']/../following-sibling::div//input[@placeholder='No File Chosen'])[2]"));
		
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
		
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[.='Update']")).click();
        
        
        try 
        {
            WebElement SuccessMsg = driver.findElement(By.xpath("(//div[.=' Category Updated Successfully '])[2]"));
//          WebElement Error = driver.findElement(By.xpath("(//div[.=' Please Enter Category Name '])[2]"));
            
        	if (SuccessMsg.isDisplayed())
            {
        		w.takeScreenShot(driver, "k_updatingCategoryByGivingOnlyImagePassErrorTest");
    		} 
//          else if(Error.isDisplayed())
//          {
//            	Assert.fail();
//			}
            else 
            {
				System.out.println("Category Updated with Only Image");
			}
		}
        finally 
        {
        	driver.quit();
		}
        
	}
        
        //13TC
        
         @Test(groups = "Sprint-3", priority = 12)
         public void l_clickOnCloseBtnUpdateCategoryPageShouldNotCloseErrorTest()throws Exception
         {
        	String URL = pUtil.readDataFromPropertyFile("url");
     		String USERNAME = pUtil.readDataFromPropertyFile("username");
     		String PASSWORD = pUtil.readDataFromPropertyFile("password");
     		
     		WebDriverManager.chromedriver().setup();
     		WebDriverManager.chromedriver().clearDriverCache().setup();
    		WebDriverManager.chromedriver().clearResolutionCache().setup();
     		WebDriverManager.chromedriver().setup();
     	    WebDriver driver = new ChromeDriver();
     	    driver.manage().window().maximize();
     	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
     	    driver.get(URL);
     	    Thread.sleep(2000);
     	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
            Thread.sleep(5000);
            driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[.='Category']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//td[.='Gold Chains']/..//td[@class='my-td']/following-sibling::td//button[.=' Edit ']")).click();
            Thread.sleep(2000);            
            driver.findElement(By.xpath("(//h1[@class='modal-title fs-5']/..//button[@aria-label='Close'])[2]")).click();
            Thread.sleep(2000);
            WebElement UpdateCategory = driver.findElement(By.xpath("//h1[.='Update Category']"));
            try 
            {
            	if (UpdateCategory.isDisplayed()) 
                {
            		System.out.println("Update Category Page is not Closed");
    			} 
                else 
                {
                	w.takeScreenShot(driver, "l_clickOnCloseBtnUpdateCategoryPageShouldNotCloseErrorTest");
    			}
			} 
            finally 
            {
            	driver.quit();
			}
            
	}
        
        //14TC
        
        @Test(groups = "Sprint-3", priority = 13)
        public void m_clickOnCategoriesBootStrapButtonStatusShouldNotUpdateTest()throws Exception
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
            driver.findElement(By.xpath("//a[.='Category']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//td[.='Gold Chains']/..//td[@class='my-td']/following-sibling::td//button[.=' Edit ']/..//div//div[@class='mdc-switch__icons']")).click();
            Thread.sleep(2000);
            WebElement UpdateMsg = driver.findElement(By.xpath("(//div[.=' Category Updated Successfully '])[2]"));
        	
            try 
            {
            	if (UpdateMsg.isDisplayed()) 
                {
    				w.takeScreenShot(driver, "m_clickOnCategoriesBootStrapButtonStatusShouldNotUpdateTest");
    			} 
                else 
                {
                    System.out.println("Category Status Updated Successfylly");
    			}
			} 
            finally 
            {
            	driver.quit();
			}
        	
        	
        }
        
        //15TC
        
        @Test(groups = "Sprint-3", priority = 14)
        public void n_clickOnParticularCategoryDeleteButtonCategoryShouldNotDeleteTest()throws Exception
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
            driver.findElement(By.xpath("//a[.='Category']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//td[.='Gold Chains']/..//td[@class='my-td']/following-sibling::td//button[.=' Edit ']/..//button[@class='btn-sm btn-edit bg-danger']")).click();
            Thread.sleep(2000);
            WebElement SuccessMsg = driver.findElement(By.xpath("(//div[.=' Successfully Deleted '])[2]"));
            
            try 
            {
            	if(SuccessMsg.isDisplayed()) 
                {
    				w.takeScreenShot(driver, "n_clickOnParticularCategoryDeleteButtonCategoryShouldNotDeleteTest");
    				Thread.sleep(2000);
    			} 
                else
                {
                    System.out.println("Category Deleted Successfully");
    			}
			} 
            finally 
            {
            	driver.quit();
			}
            
        	
        }
  
        
}
