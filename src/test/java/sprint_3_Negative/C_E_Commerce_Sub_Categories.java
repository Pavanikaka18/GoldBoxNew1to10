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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import genericUtility.ExcelFileUtility;
import genericUtility.JavaUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class C_E_Commerce_Sub_Categories{

	ExcelFileUtility eUtil = new ExcelFileUtility();
	WebDriverUtility w = new WebDriverUtility();
	PropertyFileUtility pUtil = new PropertyFileUtility();
	JavaUtility jUtil = new JavaUtility();
	
	
	String SubCategoryName = "Flower Bangles"+jUtil.getRandomNum();
	//16TC
	
	@Test(groups = "Sprint-3", priority = 1)
	public void a_ClickOnSubcategoriesLinkSubCategoryPageShoultNotDisplayErrorTest()throws Exception
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
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(2000);
        WebElement SubCategoryListPage = driver.findElement(By.xpath("//h4[.='SubCategory List']"));
        
        try {
        	if (SubCategoryListPage.isDisplayed())
            {
    			w.takeScreenShot(driver, "a_ClickOnSubcategoriesLinkSubCategoryPageShoultNotDisplayErrorTest");
    			Thread.sleep(2000);
    		} 
            else
            {
                System.out.println("Subcategories page is Not displayed");
    		}
		} finally {
			driver.quit();
		}
		
	}
	
	//17TC
	
	@Test(groups = "Sprint-3", priority = 2)
	public void b_SubCategory_SearchEdit_SearchedInvalidCategoryShouldDisplayErrorTest() throws Exception
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
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("StoneJewllery");
        Thread.sleep(2000);
        WebElement NoRecordsFound = driver.findElement(By.xpath("//h5[.='No records found']"));
		
        try 
        {
        	if(NoRecordsFound.isDisplayed())
        	{
        		w.takeScreenShot(driver, "b_SubCategory_SearchEdit_SearchedInvalidCategoryShouldDisplayErrorTest");
        		Thread.sleep(2000);
        	}
		} 
        finally 
        {
			driver.quit();
		}
		
	}
	
	//18TC
	
	@Test(groups = "Sprint-3", priority = 3)
	public void c_addingSubCategoryNullErrorTest() throws Exception
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
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[.='Add SubCategory ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add']")).click();
        Thread.sleep(2000);
        WebElement Error = driver.findElement(By.xpath("(//div[.=' Image is required '])[2]"));
        
        try {
        	if (Error.isDisplayed())
            {
    			w.takeScreenShot(driver,"c_addingSubCategoryNullErrorTest" );
    			Thread.sleep(2000);
    		} 
            else 
            {
                System.out.println("Added SubCategory Successfully");
    		}
		} finally {
			driver.quit();
		}
        
        
	}

	//19TC
	
	@Test(groups = "Sprint-3", priority = 4)
	public void d_addingSubCategoryByGivingOnlyCategoryNameErrorTest()throws Exception
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
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add SubCategory ']")).click();
        Thread.sleep(2000);
        
        WebElement SubCategoryCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add SubCategory']/../following-sibling::div//select[@placeholder='Select Category']"));

        // Create a Select object from the dropdown element
        Select SubCategoryCategoryNameDrpDwn = new Select(SubCategoryCategoryNameyDrpDwnElement);

        // Select an option by visible text
        SubCategoryCategoryNameDrpDwn.selectByVisibleText("Neck");
        
        driver.findElement(By.xpath("//button[.='Add']")).click();
        Thread.sleep(2000);
        
        WebElement Error = driver.findElement(By.xpath("(//div[.=' Image is required '])[2]"));
        
        try 
        {
        	if(Error.isDisplayed())
            {
    			w.takeScreenShot(driver,"d_addingSubCategoryByGivingOnlyCategoryNameErrorTest" );
    			Thread.sleep(2000);
    		} 
            else 
            {
                System.out.println("SubCategory Added Successfully");
    		}
		} 
        finally 
        {
			driver.quit();
		}
        
	}
	
	//20TC
	
	@Test(groups = "Sprint-3", priority = 5)
	public void e_Adding_SubCategoryByGiving2ValuesErrorTest()throws Exception
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
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add SubCategory ']")).click();
        Thread.sleep(2000);
        
        WebElement SubCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add SubCategory']/../following-sibling::div//select[@placeholder='Select Category']"));

        // Create a Select object from the dropdown element
        Select SubCategoryNameDrpDwn = new Select(SubCategoryNameyDrpDwnElement);

        // Select an option by visible text
        SubCategoryNameDrpDwn.selectByVisibleText("Neck");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add SubCategory']/../following-sibling::div//input[@placeholder='Enter SubCategory Name']")).sendKeys("Flower Bangles");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[.='Add']")).click();
        Thread.sleep(2000);
        
        WebElement Error = driver.findElement(By.xpath("(//div[.=' Image is required '])[2]"));
        
        try 
        {
        	if (Error.isDisplayed())
            {
    			w.takeScreenShot(driver,"e_Adding_SubCategoryByGiving2ValuesErrorTest" );
    			Thread.sleep(2000);
    		} 
            else 
            {
                System.out.println("SubCategory Added Successfully");
    		}
		} 
        finally 
        {
			driver.quit();
		}
        
	}

	
	@Test(groups = "Sprint-3", priority = 6)
	public void f_Adding_SubCategoryByGivingValidDetailsPassTest()throws Exception
	{
		Robot r = new Robot();
		
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
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add SubCategory ']")).click();
        Thread.sleep(2000);
        
        WebElement CategoryNameDrpDwn = driver.findElement(By.xpath("//h1[.='Add SubCategory']/../following-sibling::div//select[@placeholder='Select Category']"));
        Select SubCategoryNameDrpDwn = new Select(CategoryNameDrpDwn);
        SubCategoryNameDrpDwn.selectByVisibleText("Neck");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add SubCategory']/../following-sibling::div//input[@placeholder='Enter SubCategory Name']")).sendKeys(SubCategoryName);
        Thread.sleep(2000);
        WebElement SelectTypeDrpDwn = driver.findElement(By.xpath("//select[@placeholder='Select Type']"));
        Select SelectType = new Select(SelectTypeDrpDwn);
        SelectType.selectByVisibleText("Gold");
        
        WebElement chooseFile = driver.findElement(By.xpath("//input[@formcontrolname='image_uri']"));
        w.clickOnChooseFileOption(driver, chooseFile, ImagePath);
        
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.delay(2000);
//        StringSelection ss = new StringSelection("C:\\Users\\vikra\\OneDrive\\Desktop\\One Drive Folder\\OneDrive\\Pictures\\Saved Pictures\\Necklace.jpg");
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.keyPress(KeyEvent.VK_V);
//        r.keyRelease(KeyEvent.VK_CONTROL);
//        r.keyRelease(KeyEvent.VK_V);
//        r.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add']")).click();
        
        WebElement Success = driver.findElement(By.xpath("(//div[.=' Subcategory Added Successfully '])[2]"));
        
        try 
        {
			if(Success.isDisplayed())
			{
				w.takeScreenShot(driver, "f_Adding_SubCategoryByGivingValidDetailsPassTest");
			}
		} 
        finally 
        {
			driver.quit();
		}
        
        
	}
	
	
	//21TC
	
	@Test(groups = "Sprint-3", priority = 7)
	public void g_SubCategoryEditButtonErrorTest()throws Exception
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
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//th[.='Action']/ancestor::table//button[.=' Edit '])[1]")).click();
        Thread.sleep(2000);
        
        WebElement UpdateSubCategoryPage = driver.findElement(By.xpath("//h1[.='Update SubCategory']"));
        
        try {
        	if(UpdateSubCategoryPage.isDisplayed())
            {
    			w.takeScreenShot(driver, "g_SubCategoryEditButtonErrorTest");
    			Thread.sleep(2000);
    		} 
            else 
            {
               System.out.println("Update Category Page is not Opened Successfully");
    		}
		} finally {
			driver.quit();
		}
        
	}
	
	
	//22TC
	
	@Test(groups = "Sprint-3", priority = 8)
	public void h_updatingWithoutPassingDetailsErrorTest() throws Exception
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
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//th[.='Action']/ancestor::table//button[.=' Edit '])[1]")).click();
        Thread.sleep(2000);
        WebElement CategoryNameDrpDwn = driver.findElement(By.xpath("//h1[.='Update SubCategory']/../following-sibling::div//select[@formcontrolname='cid']"));
        Select CategoryDrpDwn = new Select(CategoryNameDrpDwn);
        CategoryDrpDwn.selectByVisibleText("Select Category");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update SubCategory']/../following-sibling::div//input[@placeholder='Enter SubCategory Name']")).clear();
        Thread.sleep(2000);
        WebElement SelectTypeDrpDwn = driver.findElement(By.xpath("//h1[.='Update SubCategory']/../following-sibling::div//select[@formcontrolname='type']"));
        Select SelectType = new Select(SelectTypeDrpDwn);
        SelectType.selectByVisibleText("Select Type");
        driver.findElement(By.xpath("//h1[.='Update SubCategory']/../following-sibling::div//button[.='Update']")).click();
        Thread.sleep(2000);
        
        try 
        {
        	WebElement TypeError = driver.findElement(By.xpath("(//div[.=' Please Enter Type '])[2]"));
            
        	if (TypeError.isDisplayed())
            {
    			w.takeScreenShot(driver, "h_updatingWithoutPassingDetailsErrorTest");
    			Thread.sleep(2000);
    		} 
            else 
            {
               System.out.println("Category Updated Successfully");
    		}
		} 
        catch (Exception e) 
        {
        	WebElement CategoryNameError = driver.findElement(By.xpath("(//div[.=' Please Enter Sub Category Name '])[2]"));
        	
        	if (CategoryNameError.isDisplayed())
            {
    			w.takeScreenShot(driver, "g_updatingWithoutPassingDetailsErrorTest");
    			Thread.sleep(2000);
    		} 
            else 
            {
               System.out.println("Category Updated Successfully");
    		}
		}
        finally 
        {
			driver.quit();
		}
        
        
	}
	
	//23TC
	
	@Test(groups = "Sprint-3", priority = 9)
	public void i_updatingByGivingOnlyCategoryNameErrorTest()throws Exception
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
        Thread.sleep(15000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//td[.='Neck']/following-sibling::td//button[.=' Edit '])[1]")).click();
        Thread.sleep(2000);
        
        WebElement SelectCategoryNameDrpDwnElement = driver.findElement(By.xpath("//h1[.='Update SubCategory']/../following-sibling::div//select[@class='enter-input ng-untouched ng-pristine ng-valid']"));
        Select CategoryNameDrpDwn = new Select(SelectCategoryNameDrpDwnElement);
        CategoryNameDrpDwn.selectByVisibleText("Neck");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update SubCategory']/../following-sibling::div//input[@formcontrolname='subcatname']")).clear();
        Thread.sleep(2000);
        WebElement TypeDrpDwn = driver.findElement(By.xpath("//h1[.='Update SubCategory']/../following-sibling::div//select[@formcontrolname='type']"));
        Select Type = new Select(TypeDrpDwn);
        Type.selectByVisibleText("Select Type");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update SubCategory']/../following-sibling::div//button[.='Update']")).click();
        Thread.sleep(2000);
        WebElement Error = driver.findElement(By.xpath("(//div[.=' Please Enter Type '])[2]"));
        
        try {
        	if (Error.isDisplayed()) 
            {
    			w.takeScreenShot(driver, "i_updatingByGivingOnlyCategoryNameErrorTest");
    			Thread.sleep(2000);		
    		} 
            else 
            {
                 System.out.println("Update Successfully");
    		}
		} finally {
			driver.quit();
		}
       
	}
	
	//24TC
	
	@Test(groups = "Sprint-3", priority = 10)
	public void j_updatingSubCategoryByPassing2ValuesErrorTest()throws Exception
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
        Thread.sleep(12000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//td[.='Neck']/following-sibling::td//button[.=' Edit '])[1]")).click();
        Thread.sleep(2000);
        
        WebElement UpdateSubCategoryCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Update SubCategory']/../following-sibling::div//select[@class='enter-input ng-untouched ng-pristine ng-valid']"));

        // Create a Select object from the dropdown element
        Select UpdateSubCategoryNameDrpDwn = new Select(UpdateSubCategoryCategoryNameyDrpDwnElement);

        // Select an option by visible text
        UpdateSubCategoryNameDrpDwn.selectByVisibleText("Neck");
        
        Thread.sleep(2000);
        WebElement SubCategoryNameEdt = driver.findElement(By.xpath("//h1[.='Update SubCategory']/../following-sibling::div//input[@placeholder='Enter SubCategory Name']"));
        SubCategoryNameEdt.clear();
        SubCategoryNameEdt.sendKeys("Gold Bangles");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update SubCategory']/../following-sibling::div//button[.='Update']")).click();
        Thread.sleep(1000);
        WebElement Error = driver.findElement(By.xpath("(//div[.=' Please Enter Type '])[2]"));
        Thread.sleep(1000);
        
        try {
        	if(Error.isDisplayed()) 
            {
    			w.takeScreenShot(driver, "j_updatingSubCategoryByPassing2ValuesErrorTest");
    			Thread.sleep(1000);
    		} 
            else 
            {
                 System.out.println("Update Successfully");
    		}
		} finally {
			driver.quit();
		}
        
	}
	
	//25TC
	
	@Test(groups = "Sprint-3", priority = 11)
	public void k_subCategoryBootStrapButtonErrorTest() throws Exception
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
        Thread.sleep(15000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//td[.='Neck']/following-sibling::td//button[.=' Edit '])[1]/..//div[@class='mdc-form-field']")).click();
        Thread.sleep(2000);
        
        WebElement SuccessMsg = driver.findElement(By.xpath("(//div[.=' Sub Category Updated Successfully '])[2]"));
        
        try {
        	if(SuccessMsg.isDisplayed()) 
            {
    			w.takeScreenShot(driver, "k_subCategoryBootStrapButtonErrorTest");
    			Thread.sleep(2000);
    		} 
            else 
            {
                System.out.println("Not Updated");
    		}
		} finally {
			driver.quit();
		}
        
		
		
	}
	
	//26TC
	
	@Test(groups = "Sprint-3", priority = 12)
	public void l_subCategoryDeleteButtonErrorTest()throws Exception
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
        Thread.sleep(15000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("(//td[.='Neck']/following-sibling::td//button[.=' Edit '])[1]/..//button[@class='btn-sm btn-edit bg-danger']")).click();
        Thread.sleep(2000);
        
        WebElement DeleteButton = driver.findElement(By.xpath("//a[.='Sub Category']"));
        
        try {
        	if(DeleteButton.isDisplayed()) 
            {
    			w.takeScreenShot(driver, "l_subCategoryDeleteButtonErrorTest");
    			Thread.sleep(2000);
    		} 
            else 
            {
                System.out.println("Switched On Successfully");
    		}
		} finally {
			driver.quit();
		}
        
	}
	
	//27TC
	
	@Test(groups = "Sprint-3", priority = 13)
	public void m_closingAddSubCategoryPageErrorTest()throws Exception
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
        Thread.sleep(15000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add SubCategory ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add SubCategory']/..//button[@aria-label='Close']")).click();
        Thread.sleep(2000);
        
        WebElement AddSubCategoryPage = driver.findElement(By.xpath("//h1[.='Add SubCategory']"));
        
        try {
        	if(AddSubCategoryPage.isDisplayed()) 
            {
        		System.out.println("Add Sub Category Page is not Closed");
    		} 
            else 
            {
            	Thread.sleep(1000);
            	w.takeScreenShot(driver, "m_closingAddSubCategoryPageErrorTest");
    		}
		} finally {
			driver.quit();
		}
        
       
        
	}
}