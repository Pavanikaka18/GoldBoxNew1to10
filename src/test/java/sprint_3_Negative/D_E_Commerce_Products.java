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
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.ExcelFileUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class D_E_Commerce_Products {
	
	ExcelFileUtility eUtil = new ExcelFileUtility();
	WebDriverUtility w = new WebDriverUtility();
	PropertyFileUtility pUtil = new PropertyFileUtility();
	
	//28TC
	
	@Test(groups = "Sprint-3", priority = 1)
	public void a_ClickOnproductsLinkProductListPageShouldNotDisplayErrorTest() throws Exception
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
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        
        WebElement ProductListPage = driver.findElement(By.xpath("//h4[.='Product List']"));
        
        try {
        	if (ProductListPage.isDisplayed()) 
            {
               w.takeScreenShot(driver, "a_ClickOnproductsLinkProductListPageShouldNotDisplayErrorTest");
               Thread.sleep(2000);
    		} 
            else 
    		{
                 System.out.println("ProductsLnk Page is not Displayed");
    		}
		} finally {
			driver.quit();
		}
        
    
	}
	
	//29TC
	
	@Test(groups = "Sprint-3", priority = 2)
	public void b_searchEditFeildProductTest() throws Exception
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
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        
        WebElement SearchEdt = driver.findElement(By.xpath("//input[@placeholder='Search...']"));
		
        SearchEdt.sendKeys("Necklace");
        
        try {
        	if (SearchEdt.isDisplayed())
            {
    			w.takeScreenShot(driver, "b_searchEditFeildProductTest");
    			Thread.sleep(2000);
    		} 
            else 
            {
                System.out.println("Successfully Searched ");
    		}
		} finally {
			driver.quit();
		}
        
	}
	
	//30TC
	
	@Test(groups = "Sprint-3", priority = 3)
	public void c_addingProductNullTest() throws Exception
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
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//button[.='Add']")).click();
        Thread.sleep(2000);
        WebElement Error = driver.findElement(By.xpath("(//div[.=' Image is required '])[2]"));
        
        try {
        	if (Error.isDisplayed()) 
            {
    			w.takeScreenShot(driver, "c_addingProductNullTest");
    			Thread.sleep(2000);
    		} 
            else 
            {
                System.out.println("Product added Successfully");
    		}
		} finally {
			driver.quit();
		}
        
		
	}
	
	//31TC
	
	@Test(groups = "Sprint-3", priority = 4)
	public void d_productsGivingOnlyCategoryNameTest() throws Exception
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
        Thread.sleep(20000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product']")).click();
        Thread.sleep(2000);
        
        WebElement ProductsCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']"));
        Select ProductsCategoryNameDrpDwn = new Select(ProductsCategoryNameyDrpDwnElement);
        ProductsCategoryNameDrpDwn.selectByVisibleText("Neck");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//button[.='Add']")).click();
        Thread.sleep(2000);
        WebElement Error = driver.findElement(By.xpath("(//div[.=' Image is required '])[2]"));
        
        try {
        	if (Error.isDisplayed())
            {
    			w.takeScreenShot(driver, "d_productsGivingOnlyCategoryNameTest");
    			Thread.sleep(2000);
    		} 
            else 
            {
                 System.out.println("Product added Successfully");
    		}
		} finally {
			driver.quit();
		}
        
        
	}
	
	//32TC
	
	@Test(groups = "Sprint-3", priority = 5)
	public void e_addingProductsByPassing2ValuesTest()throws Exception
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
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product']")).click();
        Thread.sleep(2000);
        
        WebElement ProductsCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsCategoryNameDrpDwn = new Select(ProductsCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsCategoryNameDrpDwn.selectByVisibleText("Neck");
        
        Thread.sleep(2000);
        
        WebElement ProductsSubCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='subcategoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsSubCategoryNameDrpDwn = new Select(ProductsSubCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsSubCategoryNameDrpDwn.selectByIndex(1);
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//button[.='Add']")).click();
        Thread.sleep(2000);
        
        WebElement Error = driver.findElement(By.xpath("(//div[.=' Image is required '])[2]"));
        
        try 
        {
        	if (Error.isDisplayed())
            {
    			w.takeScreenShot(driver, "e_addingProductsByPassing2ValuesTest");
    			Thread.sleep(1000);
    		} 
            else 
            {
                 System.out.println("Product added Successfully");
    		}
		} 
        finally 
        {
			driver.quit();
		}
        
		
	}
	
	//33TC
	
	@Test(groups = "Sprint-3", priority = 6)
	public void f_addingProductsByPassing3ValuesTest() throws Exception
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
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product']")).click();
        Thread.sleep(2000);
        
        WebElement ProductsCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsCategoryNameDrpDwn = new Select(ProductsCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsCategoryNameDrpDwn.selectByVisibleText("Neck");
        
        Thread.sleep(2000);
        
        WebElement ProductsSubCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='subcategoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsSubCategoryNameDrpDwn = new Select(ProductsSubCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsSubCategoryNameDrpDwn.selectByIndex(1);
        
        Thread.sleep(2000);
        
        WebElement ProductsBrandNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='brandname']"));

        // Create a Select object from the dropdown element
        Select ProductsBrandNameDrpDwn = new Select(ProductsBrandNameyDrpDwnElement);

        // Select an option by visible text
        ProductsBrandNameDrpDwn.selectByIndex(1);
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//button[.='Add']")).click();
        Thread.sleep(2000);
        
        WebElement Error = driver.findElement(By.xpath("(//div[.=' Image is required '])[2]"));
        
        try {
        	if (Error.isDisplayed())
            {
    			w.takeScreenShot(driver, "f_addingProductsByPassing3ValuesTest");
    			Thread.sleep(2000);
    		} 
            else 
            {
                 System.out.println("Product added Successfully");
    		}
		} finally {
			driver.quit();
		}
        
        
		
	}
	
	//34TC
	
	 @Test(groups = "Sprint-3", priority = 7)
	 public void g_addingProductsByPassing4ValuesTest()throws Exception
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
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product']")).click();
        Thread.sleep(2000);
        
        WebElement ProductsCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsCategoryNameDrpDwn = new Select(ProductsCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsCategoryNameDrpDwn.selectByVisibleText("Neck");
        
        Thread.sleep(2000);
        
        WebElement ProductsSubCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='subcategoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsSubCategoryNameDrpDwn = new Select(ProductsSubCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsSubCategoryNameDrpDwn.selectByIndex(1);
        
        Thread.sleep(2000);
        
        WebElement ProductsBrandNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='brandname']"));

        // Create a Select object from the dropdown element
        Select ProductsBrandNameDrpDwn = new Select(ProductsBrandNameyDrpDwnElement);

        // Select an option by visible text
        ProductsBrandNameDrpDwn.selectByIndex(1);
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='productname']")).sendKeys("Bangles001");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//button[.='Add']")).click();
        Thread.sleep(2000);
        
        WebElement Error = driver.findElement(By.xpath("(//div[.=' Image is required '])[2]"));
        
        try 
        {
        	if(Error.isDisplayed())
            {
    			w.takeScreenShot(driver, "g_addingProductsByPassing4ValuesTest");
    			Thread.sleep(2000);
    		} 
            else 
            {
                 System.out.println("Product added Successfully");
    		}
		} 
        finally 
        {
			driver.quit();
		}
        
		
	 }
	
	//35TC
	
	@Test(groups = "Sprint-3", priority = 8)
	public void h_addingProductsByPassing5ValuesTest() throws Exception
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
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product']")).click();
        Thread.sleep(2000);
        
        WebElement ProductsCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsCategoryNameDrpDwn = new Select(ProductsCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsCategoryNameDrpDwn.selectByVisibleText("Neck");
        
        Thread.sleep(2000);
        
        WebElement ProductsSubCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='subcategoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsSubCategoryNameDrpDwn = new Select(ProductsSubCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsSubCategoryNameDrpDwn.selectByIndex(1);
        
        Thread.sleep(2000);
        
        WebElement ProductsBrandNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='brandname']"));

        // Create a Select object from the dropdown element
        Select ProductsBrandNameDrpDwn = new Select(ProductsBrandNameyDrpDwnElement);

        // Select an option by visible text
        ProductsBrandNameDrpDwn.selectByIndex(1);
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='productname']")).sendKeys("Bangles001");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='va']")).sendKeys("10");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//button[.='Add']")).click();
        Thread.sleep(2000);
        
        WebElement Error = driver.findElement(By.xpath("(//div[.=' Image is required '])[2]"));
        
        try {
        	if (Error.isDisplayed())
            {
    			w.takeScreenShot(driver, "h_addingProductsByPassing5ValuesTest");
    			Thread.sleep(2000);
    		} 
            else 
            {
                 System.out.println("Product added Successfully");
    		}
		} finally {
			driver.quit();
		}
        
        
        
        
		
	}
	
	//36TC
	
	@Test(groups = "Sprint-3", priority = 9)
	public void i_addingProductsByPassing6ValuesTest() throws Exception
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
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product']")).click();
        Thread.sleep(2000);
        
        WebElement ProductsCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsCategoryNameDrpDwn = new Select(ProductsCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsCategoryNameDrpDwn.selectByVisibleText("Neck");
        
        Thread.sleep(2000);
        
        WebElement ProductsSubCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='subcategoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsSubCategoryNameDrpDwn = new Select(ProductsSubCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsSubCategoryNameDrpDwn.selectByIndex(1);
        
        Thread.sleep(2000);
        
        WebElement ProductsBrandNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='brandname']"));

        // Create a Select object from the dropdown element
        Select ProductsBrandNameDrpDwn = new Select(ProductsBrandNameyDrpDwnElement);

        // Select an option by visible text
        ProductsBrandNameDrpDwn.selectByIndex(1);
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='productname']")).sendKeys("Bangles001");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='va']")).sendKeys("10");
        Thread.sleep(2000);
        
//        WebElement ProductsSelectCaratyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='carat']"));
//
//        // Create a Select object from the dropdown element
//        Select ProductsSelectCaratDrpDwn = new Select(ProductsSelectCaratyDrpDwnElement);

        // Select an option by visible text
 //      ProductsSelectCaratDrpDwn.selectByVisibleText("24 carat");
        
    //    Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//button[.='Add']")).click();
        Thread.sleep(2000);
        
        WebElement Error = driver.findElement(By.xpath("(//div[.=' Image is required '])[2]"));
        
        try {
        	if (Error.isDisplayed())
            {
    			w.takeScreenShot(driver, "i_addingProductsByPassing6ValuesTest");
    			Thread.sleep(2000);
    		} 
            else 
            {
                 System.out.println("Product added Successfully");
    		}
		} finally {
			driver.quit();
		}
        
        
	
	}
	
	//37TC
	
	@Test(groups = "Sprint-3", priority = 10)
	public void j_addingProductsByPassing7ValuesTest() throws Exception
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
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product']")).click();
        Thread.sleep(2000);
        
        WebElement ProductsCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsCategoryNameDrpDwn = new Select(ProductsCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsCategoryNameDrpDwn.selectByVisibleText("Neck");
        
        Thread.sleep(2000);
        
        WebElement ProductsSubCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='subcategoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsSubCategoryNameDrpDwn = new Select(ProductsSubCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsSubCategoryNameDrpDwn.selectByIndex(1);
        
        Thread.sleep(2000);
        
        WebElement ProductsBrandNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='brandname']"));

        // Create a Select object from the dropdown element
        Select ProductsBrandNameDrpDwn = new Select(ProductsBrandNameyDrpDwnElement);

        // Select an option by visible text
        ProductsBrandNameDrpDwn.selectByIndex(1);
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='productname']")).sendKeys("Bangles001");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='va']")).sendKeys("10");
        Thread.sleep(2000);
        
//        WebElement ProductsSelectCaratDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='carat']"));
//
//        // Create a Select object from the dropdown element
//        Select ProductsSelectCaratDrpDwn = new Select(ProductsSelectCaratDrpDwnElement);
//
//        // Select an option by visible text
//        ProductsSelectCaratDrpDwn.selectByVisibleText("24 carat");
//        
//        Thread.sleep(2000);
        
        WebElement ProductsSelectTypeDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='type']"));

        // Create a Select object from the dropdown element
        Select ProductsSelectTypeDrpDwn = new Select(ProductsSelectTypeDrpDwnElement);

        // Select an option by visible text
        ProductsSelectTypeDrpDwn.selectByVisibleText("Gold");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//button[.='Add']")).click();
        Thread.sleep(2000);
        
        WebElement Error = driver.findElement(By.xpath("(//div[.=' Image is required '])[2]"));
        
        try {
        	if (Error.isDisplayed())
            {
    			w.takeScreenShot(driver, "j_addingProductsByPassing7ValuesTest");
    			Thread.sleep(2000);
    		} 
            else 
            {
                 System.out.println("Product added Successfully");
    		}
		} finally {
			driver.quit();
		}
        
        

	}
	
	//38TC
	
	@Test(groups = "Sprint-3", priority = 11)
	public void k_addingProductsByPassing8ValuesTest()throws Exception
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
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product']")).click();
        Thread.sleep(2000);
        
        WebElement ProductsCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsCategoryNameDrpDwn = new Select(ProductsCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsCategoryNameDrpDwn.selectByVisibleText("Neck");
        
        Thread.sleep(2000);
        
        WebElement ProductsSubCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='subcategoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsSubCategoryNameDrpDwn = new Select(ProductsSubCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsSubCategoryNameDrpDwn.selectByIndex(1);
        
        Thread.sleep(2000);
        
        WebElement ProductsBrandNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='brandname']"));

        // Create a Select object from the dropdown element
        Select ProductsBrandNameDrpDwn = new Select(ProductsBrandNameyDrpDwnElement);

        // Select an option by visible text
        ProductsBrandNameDrpDwn.selectByIndex(1);
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='productname']")).sendKeys("Bangles001");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='va']")).sendKeys("10");
        Thread.sleep(2000);
        
//        WebElement ProductsSelectCaratDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='carat']"));
//
//        // Create a Select object from the dropdown element
//        Select ProductsSelectCaratDrpDwn = new Select(ProductsSelectCaratDrpDwnElement);
//
//        // Select an option by visible text
//        ProductsSelectCaratDrpDwn.selectByVisibleText("24 carat");
//        
//        Thread.sleep(2000);
        
        WebElement ProductsSelectTypeDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='type']"));

        // Create a Select object from the dropdown element
        Select ProductsSelectTypeDrpDwn = new Select(ProductsSelectTypeDrpDwnElement);

        // Select an option by visible text
        ProductsSelectTypeDrpDwn.selectByVisibleText("Gold");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='price']")).sendKeys("120000");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//button[.='Add']")).click();
        Thread.sleep(2000);
        
        WebElement Error = driver.findElement(By.xpath("(//div[.=' Image is required '])[2]"));
        
        try {
        	if (Error.isDisplayed())
            {
    			w.takeScreenShot(driver, "k_addingProductsByPassing8ValuesTest");
    			Thread.sleep(2000);
    		} 
            else 
            {
                 System.out.println("Product added Successfully");
    		}
		} finally {
			driver.quit();
		}
        
		
	}
	
	//39TC
	
	@Test(groups = "Sprint-3", priority = 12)
	public void l_addingProductsByPassing9ValuesTest() throws Exception
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
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product']")).click();
        Thread.sleep(2000);
        
        WebElement ProductsCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsCategoryNameDrpDwn = new Select(ProductsCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsCategoryNameDrpDwn.selectByVisibleText("Neck");
        
        Thread.sleep(2000);
        
        WebElement ProductsSubCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='subcategoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsSubCategoryNameDrpDwn = new Select(ProductsSubCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsSubCategoryNameDrpDwn.selectByIndex(1);
        
        Thread.sleep(2000);
        
        WebElement ProductsBrandNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='brandname']"));

        // Create a Select object from the dropdown element
        Select ProductsBrandNameDrpDwn = new Select(ProductsBrandNameyDrpDwnElement);

        // Select an option by visible text
        ProductsBrandNameDrpDwn.selectByIndex(1);
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='productname']")).sendKeys("Bangles001");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='va']")).sendKeys("10");
        Thread.sleep(2000);
        
//        WebElement ProductsSelectCaratDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='carat']"));
//
//        // Create a Select object from the dropdown element
//        Select ProductsSelectCaratDrpDwn = new Select(ProductsSelectCaratDrpDwnElement);
//
//        // Select an option by visible text
//        ProductsSelectCaratDrpDwn.selectByVisibleText("24 carat");
//        
//        Thread.sleep(2000);
        
        WebElement ProductsSelectTypeDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='type']"));

        // Create a Select object from the dropdown element
        Select ProductsSelectTypeDrpDwn = new Select(ProductsSelectTypeDrpDwnElement);

        // Select an option by visible text
        ProductsSelectTypeDrpDwn.selectByVisibleText("Gold");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='price']")).sendKeys("120000");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='sizes']")).sendKeys("15");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//button[.='Add']")).click();
        Thread.sleep(2000);
        
        WebElement Error = driver.findElement(By.xpath("(//div[.=' Image is required '])[2]"));
        
        try {
        	if(Error.isDisplayed())
            {
    			w.takeScreenShot(driver, "l_addingProductsByPassing9ValuesTest");
    			Thread.sleep(2000);
    		} 
            else 
            {
                 System.out.println("Product added Successfully");
    		}
		} finally {
			driver.quit();
		}
        
		
	}
	
	//40TC
	
	@Test(groups = "Sprint-3", priority = 13)
	public void m_addingProductsByPassing10ValuesTest() throws Exception
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
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product']")).click();
        Thread.sleep(2000);
        
        WebElement ProductsCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsCategoryNameDrpDwn = new Select(ProductsCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsCategoryNameDrpDwn.selectByVisibleText("Neck");
        
        Thread.sleep(2000);
        
        WebElement ProductsSubCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='subcategoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsSubCategoryNameDrpDwn = new Select(ProductsSubCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsSubCategoryNameDrpDwn.selectByIndex(1);
        
        Thread.sleep(2000);
        
        WebElement ProductsBrandNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='brandname']"));

        // Create a Select object from the dropdown element
        Select ProductsBrandNameDrpDwn = new Select(ProductsBrandNameyDrpDwnElement);

        // Select an option by visible text
        ProductsBrandNameDrpDwn.selectByIndex(1);
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='productname']")).sendKeys("Bangles001");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='va']")).sendKeys("10");
        Thread.sleep(2000);
        
//        WebElement ProductsSelectCaratDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='carat']"));
//
//        // Create a Select object from the dropdown element
//        Select ProductsSelectCaratDrpDwn = new Select(ProductsSelectCaratDrpDwnElement);
//
//        // Select an option by visible text
//        ProductsSelectCaratDrpDwn.selectByVisibleText("24 carat");
//        
//        Thread.sleep(2000);
        
        WebElement ProductsSelectTypeDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='type']"));

        // Create a Select object from the dropdown element
        Select ProductsSelectTypeDrpDwn = new Select(ProductsSelectTypeDrpDwnElement);

        // Select an option by visible text
        ProductsSelectTypeDrpDwn.selectByVisibleText("Gold");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='price']")).sendKeys("120000");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='sizes']")).sendKeys("15");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='weight']")).sendKeys("20");
        Thread.sleep(2000);
		
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//button[.='Add']")).click();
        Thread.sleep(2000);
        
        WebElement Error = driver.findElement(By.xpath("(//div[.=' Image is required '])[2]"));
        
        try {
        	if(Error.isDisplayed())
            {
    			w.takeScreenShot(driver, "m_addingProductsByPassing10ValuesTest");
    			Thread.sleep(2000);
    		} 
            else 
            {
                 System.out.println("Product added Successfully");
    		}
		} finally {
			driver.quit();
		}
        
        
		
	}
	
	//41TC
	
	@Test(groups = "Sprint-3", priority = 14)
	public void n_addingProductsByPassing11ValuesTest() throws Exception
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
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product']")).click();
        Thread.sleep(2000);
        
        WebElement ProductsCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsCategoryNameDrpDwn = new Select(ProductsCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsCategoryNameDrpDwn.selectByVisibleText("Neck");
        
        Thread.sleep(2000);
        
        WebElement ProductsSubCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='subcategoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsSubCategoryNameDrpDwn = new Select(ProductsSubCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsSubCategoryNameDrpDwn.selectByIndex(1);
        
        Thread.sleep(2000);
        
        WebElement ProductsBrandNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='brandname']"));

        // Create a Select object from the dropdown element
        Select ProductsBrandNameDrpDwn = new Select(ProductsBrandNameyDrpDwnElement);

        // Select an option by visible text
        ProductsBrandNameDrpDwn.selectByIndex(1);
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='productname']")).sendKeys("Bangles001");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='va']")).sendKeys("10");
        Thread.sleep(2000);
//        
//        WebElement ProductsSelectCaratDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='carat']"));
//
//        // Create a Select object from the dropdown element
//        Select ProductsSelectCaratDrpDwn = new Select(ProductsSelectCaratDrpDwnElement);
//
//        // Select an option by visible text
//        ProductsSelectCaratDrpDwn.selectByVisibleText("24 carat");
//        
//        Thread.sleep(2000);
        
        WebElement ProductsSelectTypeDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='type']"));

        // Create a Select object from the dropdown element
        Select ProductsSelectTypeDrpDwn = new Select(ProductsSelectTypeDrpDwnElement);

        // Select an option by visible text
        ProductsSelectTypeDrpDwn.selectByVisibleText("Gold");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='price']")).sendKeys("120000");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='sizes']")).sendKeys("15");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='weight']")).sendKeys("20");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//textarea[@formcontrolname='description']")).sendKeys("Excellent Designed Bangles");
        Thread.sleep(2000);
		
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//button[.='Add']")).click();
        Thread.sleep(2000);
        
        WebElement Error = driver.findElement(By.xpath("(//div[.=' Image is required '])[2]"));
        
        try {
        	if (Error.isDisplayed())
            {
    			w.takeScreenShot(driver, "n_addingProductsByPassing11ValuesTest");
    			Thread.sleep(2000);
    		} 
            else 
            {
                 System.out.println("Product added Successfully");
    		}
		} finally {
			driver.quit();
		}
        
        
		
	}
	
	//42TC
	
	@Test(groups = "Sprint-3", priority = 15)
	public void o_addingProductsByPassing12ValuesPassTest()throws Exception
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
        Thread.sleep(15000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product']")).click();
        Thread.sleep(2000);
        
        WebElement ProductsCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsCategoryNameDrpDwn = new Select(ProductsCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsCategoryNameDrpDwn.selectByVisibleText("Neck");
        
        Thread.sleep(2000);
        
        WebElement ProductsSubCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='subcategoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsSubCategoryNameDrpDwn = new Select(ProductsSubCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsSubCategoryNameDrpDwn.selectByIndex(1);
        
        Thread.sleep(2000);
        
        WebElement ProductsBrandNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='brandname']"));

        // Create a Select object from the dropdown element
        Select ProductsBrandNameDrpDwn = new Select(ProductsBrandNameyDrpDwnElement);

        // Select an option by visible text
        ProductsBrandNameDrpDwn.selectByIndex(1);
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='productname']")).sendKeys("Bangles001");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='va']")).sendKeys("10");
        Thread.sleep(2000);
        
//        WebElement ProductsSelectCaratDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='carat']"));
//
//        // Create a Select object from the dropdown element
//        Select ProductsSelectCaratDrpDwn = new Select(ProductsSelectCaratDrpDwnElement);
//
//        // Select an option by visible text
//        ProductsSelectCaratDrpDwn.selectByVisibleText("24 carat");
//        
//        Thread.sleep(2000);
        
        WebElement ProductsSelectTypeDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='type']"));
        
        Select ProductsSelectTypeDrpDwn = new Select(ProductsSelectTypeDrpDwnElement);
        
        ProductsSelectTypeDrpDwn.selectByVisibleText("Gold");
        
        Thread.sleep(2000);
        
        WebElement IsShownDrpDwn = driver.findElement(By.xpath("(//select[@formcontrolname='isshown'])[1]"));
        
        Select IsShown = new Select(IsShownDrpDwn);
        
        IsShown.selectByVisibleText("Gold Box");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='price']")).sendKeys("120000");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='sizes']")).sendKeys("15");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='weight']")).sendKeys("20");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//textarea[@formcontrolname='description']")).sendKeys("Excellent Designed Bangles");
        Thread.sleep(2000);
		
        Robot r = new Robot();
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        
        WebElement ChooseFileBtn = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='image']"));
        Thread.sleep(2000);
        
        WebDriverUtility wUtil = new WebDriverUtility();
        wUtil.clickOnChooseFileOption(driver, ChooseFileBtn,ImagePath);
        
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.delay(2000);
//        StringSelection ss = new StringSelection("C:\\Users\\vikra\\OneDrive\\Desktop\\One Drive Folder\\OneDrive\\Pictures\\Saved Pictures\\Necklace.jpg");
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.keyPress(KeyEvent.VK_V);
//        r.keyRelease(KeyEvent.VK_CONTROL);
//        r.keyRelease(KeyEvent.VK_V);
//        r.keyPress(KeyEvent.VK_ENTER);
//        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//button[.='Add']")).click();
        Thread.sleep(2000);
        
        WebElement SuccessMsg = driver.findElement(By.xpath("(//div[.=' Product Added Successfully '])[2]"));
        
        try {
        	if (SuccessMsg.isDisplayed())
            {
    			w.takeScreenShot(driver, "o_addingProductsByPassing12ValuesTest");
    			Thread.sleep(1000);
    		} 
            else 
            {
                 System.out.println("Product not added");
    		}
		} finally {
			driver.quit();
		}
        
        
	}
	
	//43TC
	
	@Test(groups = "Sprint-3", priority = 16)
	public void p_addProductsPageCloseTest() throws Exception
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
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//h1[.='Add Product Details']/..//button[@aria-label='Close']")).click();
        Thread.sleep(2000);
        
        WebElement AddProductDetailsPage = driver.findElement(By.xpath("//h1[.='Add Product Details']"));
        
        try {
        	if(AddProductDetailsPage.isDisplayed())
            {
        		System.out.println("Add Product Details Page is opened");
    		} 
            else 
            {
            	w.takeScreenShot(driver, "p_addProductsPageCloseTest");
    			Thread.sleep(2000);
    		}
		} finally {
			driver.quit();
		}
        
        
        
	}
	
	//44TC
	
	@Test(groups = "Sprint-3", priority = 17)
	public void q_productsWeight_SizePageTest() throws Exception
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
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("(//button[.=' Info '])[1]")).click();
        Thread.sleep(2000);
        
        WebElement ProductSizesPage = driver.findElement(By.xpath("//h4[.='Product Sizes']"));
        
        try {
        	if (ProductSizesPage.isDisplayed())
            {
    			w.takeScreenShot(driver, "q_productsWeight_SizePageTest");
    			Thread.sleep(2000);
    		} 
            else 
            {
                System.out.println("Product Sizes Page is not Displaying");
    		}
		} finally {
			driver.quit();
		}
		
		
	}
	
	
	@Test(groups = "Sprint-3", priority = 18)
	public void r_productsWeight_AddingProductSizePassTest() throws Exception
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
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[.=' Info '])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product Sizes']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Size']/../following-sibling::div//input[@placeholder='Enter Product Size']")).sendKeys("7");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Size']/../following-sibling::div//input[@placeholder=' Enter Product Weight']")).sendKeys("5");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Size']/../following-sibling::div/button[.='Add']")).click();
        Thread.sleep(2000);
        WebElement ProductSizesPage = driver.findElement(By.xpath("//h4[.='Product Sizes']"));
        
        try {
        	if (ProductSizesPage.isDisplayed())
            {
    			w.takeScreenShot(driver, "r_productsWeight_AddingProductSizePassTest");
    			Thread.sleep(2000);
    		} 
            else 
            {
                System.out.println("Product Sizes Page is not Displaying");
    		}
		} finally {
			driver.quit();
		}
		
		
	}
	
	
	
	//45TC
	
	@Test(groups = "Sprint-3", priority = 19)
	public void s_UpdateProductSizesPageShouldNotDisplayErrorTest()throws Exception
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
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[.=' Info '])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[.=' Edit '])[1]")).click();
        Thread.sleep(2000);
        
        WebElement UpdateProductSizesPage = driver.findElement(By.xpath("//h1[.='Update Product Sizes']"));
        
        try {
        	if (UpdateProductSizesPage.isDisplayed())
            {
    			w.takeScreenShot(driver, "s_UpdateProductSizesPageShouldNotDisplayErrorTest");
    			Thread.sleep(2000);
    		} 
            else 
            {
                System.out.println("Update Product Sizes is not Displaying");
    		}
		} finally {
			driver.quit();
		}
		
		
		
	}
	
	//46TC
	
	@Test(groups = "Sprint-3", priority = 20)
	public void t_productsWeight_SizePageEditPage_clearingDetailsPassTest()throws Exception
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
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[.=' Info '])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[.=' Edit '])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Product Sizes']/../following-sibling::div//input[@placeholder='Enter Product Size']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Product Sizes']/../following-sibling::div//input[@placeholder='Enter Product Weight']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Product Sizes']/../following-sibling::div//button[.='Update']")).click();
        Thread.sleep(2000);
                        
        try 
        {
        	WebElement Success = driver.findElement(By.xpath("(//div[.='  Product Size Updated Successfully '])[2]"));
        	
        	if(Success.isDisplayed())
            {
    			w.takeScreenShot(driver, "t_productsWeight_SizePageEditPage_clearingDetailsPassTest");
    			Thread.sleep(2000);
    		} 
            else 
            {
                System.out.println("Product Size is not Updated Successfully");
    		}
		} 
        catch (Exception e) 
        {
            WebElement Error = driver.findElement(By.xpath("(//div[.=' Please Enter Size '])[2]"));
        	
        	if(Error.isDisplayed())
            {
    			w.takeScreenShot(driver, "s_productsWeight_SizePageEditPage_clearingDetailsTest");
    			Thread.sleep(2000);
    		} 
            else 
            {
                System.out.println("Product Size Updated Successfully");
    		}
		}
        finally 
        {
			driver.quit();
		}
		
		
	}
	
	//47TC
	
	@Test(groups = "Sprint-3", priority = 21)
	public void u_productsWeight_SizePageEditPage_ClosingTest() throws Exception
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
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[.=' Info '])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[.=' Edit '])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Product Sizes']/..//button[@aria-label='Close']")).click();
        Thread.sleep(2000);
        
        WebElement UpdateProductSizesPage = driver.findElement(By.xpath("//h1[.='Update Product Sizes']"));
        
        try {
        	if(UpdateProductSizesPage.isDisplayed())
            {
        		System.out.println("Update Product Sizes Page Not Closed");
    		} 
            else 
            {
            	w.takeScreenShot(driver, "u_productsWeight_SizePageEditPage_ClosingTest");
    			Thread.sleep(2000);
    		}
		} finally {
			driver.quit();
		}
		
		
	}
	
	
	//48TC
	
	@Test(groups = "Sprint-3", priority = 22)
	public void v_productsWeight_SizePageEditPage_BootStrapButtonTest() throws Exception
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
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("(//button[.=' Info '])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='mdc-switch__icons'])[1]")).click();
        Thread.sleep(2000);
        
        WebElement Success = driver.findElement(By.xpath("(//div[.='  Product Size Updated Successfully '])[2]"));
        
        try {
        	if (Success.isDisplayed())
            {
    			w.takeScreenShot(driver, "v_productsWeight_SizePageEditPage_BootStrapButtonTest");
    			Thread.sleep(2000);
    		}
            else
            {
                System.out.println("Product Size updated Successfully");
    		}
		} finally {
			driver.quit();
		}
        
		
	}
	
	//49TC
	
	@Test(groups = "Sprint-3", priority = 23)
	public void w_productsWeight_SizePageEditPage_DeleteButtonTest() throws Exception
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
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("(//button[.=' Info '])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[@class='btn-sm btn-edit bg-danger'])[1]")).click();
        Thread.sleep(2000);
        
        WebElement Success = driver.findElement(By.xpath("(//div[.=' Successfully Deleted '])[2]"));
        
        try {
        	if (Success.isDisplayed()) 
            {
    			w.takeScreenShot(driver, "w_productsWeight_SizePageEditPage_DeleteButtonTest");
    			Thread.sleep(2000);
    		} 
            else 
            {
               System.out.println("Product Deleted Successfully");
    		}
		} finally {
			driver.quit();
		}
		
		
		
	}
	
	//50TC
	
	@Test(groups = "Sprint-3", priority = 24)
	public void x_product_StonePage_Adding_NullTest() throws Exception
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
        Thread.sleep(20000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//th[.='Stones']/ancestor::thead/following-sibling::tbody//button[.=' View '])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product Stone ']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//h1[.='Add Product Stone']/../following-sibling::div//button[.='Add']")).click();
        Thread.sleep(2000);
        
        WebElement Error = driver.findElement(By.xpath("(//div[.=' Please Enter Stone Name '])[2]"));
        
        try {
        	if (Error.isDisplayed()) 
            {
    			w.takeScreenShot(driver, "x_product_StonePage_Adding_NullTest");
    			Thread.sleep(2000);
    		}
            else 
            {
                System.out.println("Added Successfully");
    		}
		} finally {
			driver.quit();
		}
        
		
	}
	
	//51TC
	
	@Test(groups = "Sprint-3", priority = 25)
	public void y_product_StonePage_Adding_StoneNameTest() throws Exception
	{
		WebDriverUtility wu=new WebDriverUtility();
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
        Thread.sleep(20000);
        wu.waitUntilPageLoad(driver);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//th[.='Stones']/ancestor::thead/following-sibling::tbody//button[.=' View '])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product Stone ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Stone']/../following-sibling::div//input[@formcontrolname='stonename']")).sendKeys("Diamond");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//h1[.='Add Product Stone']/../following-sibling::div//button[.='Add']")).click();
        Thread.sleep(2000);
        
        WebElement Error = driver.findElement(By.xpath("(//div[.=' Please Enter Colour '])[2]"));
        		
        try {
        	if(Error.isDisplayed()) 
            {
    			w.takeScreenShot(driver, "y_product_StonePage_Adding_StoneNameTest");
    			Thread.sleep(2000);
    		}
            else 
            {
                System.out.println("Added Successfully");
    		}
		} finally {
			driver.quit();
		}
   
	}
	
	//52TC
	
	@Test(groups = "Sprint-3", priority = 26)
	public void z_product_StonePage_Adding_StoneColourTest()throws Exception
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
        Thread.sleep(20000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//th[.='Stones']/ancestor::thead/following-sibling::tbody//button[.=' View '])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product Stone ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Stone']/../following-sibling::div//input[@formcontrolname='colour']")).sendKeys("White");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//h1[.='Add Product Stone']/../following-sibling::div//button[.='Add']")).click();
        Thread.sleep(2000);
        
        WebElement Error = driver.findElement(By.xpath("(//div[.=' Please Enter Stone Name '])[2]"));
        
        try {
        	if (Error.isDisplayed()) 
            {
    			w.takeScreenShot(driver, "z_product_StonePage_Adding_StoneColourTest");
    			Thread.sleep(2000);
    		}
            else 
            {
                System.out.println("Added Successfully");
    		}
		} finally {
			driver.quit();
		}
		
	}
	
	//53TC
	
	@Test(groups = "Sprint-3", priority = 27)
	public void z27_product_StonePage_Adding_StonePriceTest() throws Exception
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
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//th[.='Stones']/ancestor::thead/following-sibling::tbody//button[.=' View '])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product Stone ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Stone']/../following-sibling::div//input[@formcontrolname='stoneprice']")).sendKeys("10000");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Stone']/../following-sibling::div//button[.='Add']")).click();
        Thread.sleep(2000);
        
        WebElement Error = driver.findElement(By.xpath("(//div[.=' Please Enter Stone Name '])[2]"));
        
        try {
        	if(Error.isDisplayed()) 
            {
    			w.takeScreenShot(driver, "z27_product_StonePage_Adding_StonePriceTest");
    			Thread.sleep(2000);
    		}
            else 
            {
                System.out.println("Added Successfully");
    		}
		} finally {
			driver.quit();
		}
   
	
	}
	
	//54TC
	
	@Test(groups = "Sprint-3", priority = 28)
	public void z28_product_StonePage_Adding_StoneDetails_SuccessfullyTest() throws Exception
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
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//th[.='Stones']/ancestor::thead/following-sibling::tbody//button[.=' View '])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product Stone ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Stone']/../following-sibling::div//input[@formcontrolname='stonename']")).sendKeys("Diamond");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Stone']/../following-sibling::div//input[@formcontrolname='colour']")).sendKeys("White");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Stone']/../following-sibling::div//input[@formcontrolname='stoneprice']")).sendKeys("10000");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Stone']/../following-sibling::div//input[@formcontrolname='noofstones']")).sendKeys("10");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Stone']/../following-sibling::div//button[.='Add']")).click();
        
        try 
        {
//        	WebElement Error = driver.findElement(By.xpath("(//div[.=' Stone Name & Price is Already Existed With This Product '])[2]"));
        	WebElement Success = driver.findElement(By.xpath("(//div[.=' Product Stone Added Successfully '])[2]"));
        	
//        	if(Error.isDisplayed())
//        	{
//        		Thread.sleep(2000);
//        		driver.findElement(By.xpath("//h1[.='Add Product Stone']/following-sibling::button[@aria-label='Close']")).click();
//        		Thread.sleep(2000);
//        		driver.findElement(By.xpath("//h4[.='Product Stones']/../../..//button[@class='btn-sm btn-edit bg-danger']")).click();
//        		Thread.sleep(2000);
//        		driver.findElement(By.xpath("//button[.='Add Product Stone ']")).click();
//                Thread.sleep(2000);
//                driver.findElement(By.xpath("//h1[.='Add Product Stone']/../following-sibling::div//input[@formcontrolname='stonename']")).sendKeys("Diamond");
//                Thread.sleep(2000);
//                driver.findElement(By.xpath("//h1[.='Add Product Stone']/../following-sibling::div//input[@formcontrolname='colour']")).sendKeys("White");
//                Thread.sleep(2000);
//                driver.findElement(By.xpath("//h1[.='Add Product Stone']/../following-sibling::div//input[@formcontrolname='stoneprice']")).sendKeys("10000");
//                Thread.sleep(2000);
//                driver.findElement(By.xpath("//h1[.='Add Product Stone']/../following-sibling::div//input[@formcontrolname='noofstones']")).sendKeys("10");
//                Thread.sleep(2000);
//                driver.findElement(By.xpath("//h1[.='Add Product Stone']/../following-sibling::div//button[.='Add']")).click();
//                Thread.sleep(2000);
//        	}
        	if(Success.isDisplayed())
        	{
        		w.takeScreenShot(driver, "z28_product_StonePage_Adding_StoneDetails_SuccessfullyTest");
        	    Thread.sleep(2000);
    		}
        	else 
        	{
    			System.out.println("Product Stone Not Added");
    		}
        	
        } 
        catch (Exception e) 
        {
        	Thread.sleep(2000);
		}
        finally 
        {
			driver.quit();
		}
        
                
	}
	
	

	//55TC
	
	@Test(groups = "Sprint-3", priority = 29)
	public void z29_product_StonePage_Adding_StoneDetails_ClearingItHasToFailButPassTest() throws Exception
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
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//th[.='Stones']/ancestor::thead/following-sibling::tbody//button[.=' View '])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[.='Diamond']/..//td[.='White']/..//td[.='₹10,000.00']/..//button[.=' Edit ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Product Stone']/../following-sibling::div//input[@formcontrolname='stonename']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Product Stone']/../following-sibling::div//input[@formcontrolname='colour']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Product Stone']/../following-sibling::div//input[@formcontrolname='stoneprice']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Product Stone']/../following-sibling::div//input[@formcontrolname='noofstones']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Product Stone']/../following-sibling::div//button[.='Update']")).click();
        Thread.sleep(2000);
        
        WebElement Success = driver.findElement(By.xpath("(//div[.='  Product Stone Updated Successfully '])[2]"));
        
	    try {
	    	if (Success.isDisplayed())
		    {
				w.takeScreenShot(driver, "z29_product_StonePage_Adding_StoneDetails_ClearingItHasToFailButPassTest");
				Thread.sleep(2000);
			} 
		    else 
		    {
	            System.out.println("Stones Details are Not Cleared");
			}
		} 
	    finally 
	    {
			driver.quit();
		}
	    
	    
	}

	//upto here done	
	
	//56TC
	
	@Test(groups = "Sprint-3", priority = 30)
	public void z30_productPageActionEditButton_ClearingData3Test() throws Exception
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
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[.=' Edit '])[1]")).click();
        Thread.sleep(2000);
        
        WebElement UpdateProductsCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Update Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']"));

        // Create a Select object from the dropdown element
        Select UpdateProductsCategoryNameDrpDwn = new Select(UpdateProductsCategoryNameyDrpDwnElement);

        // Select an option by visible text
        UpdateProductsCategoryNameDrpDwn.selectByVisibleText("Select Category");
        
        Thread.sleep(2000);
        
        WebElement UpdateProductsSUbCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Update Product Details']/../following-sibling::div//select[@formcontrolname='subcategoryname']"));

        // Create a Select object from the dropdown element
        Select UpdateProductsSubCategoryNameDrpDwn = new Select(UpdateProductsSUbCategoryNameyDrpDwnElement);

        // Select an option by visible text
        UpdateProductsSubCategoryNameDrpDwn.selectByVisibleText("Select SubCategory");
        
        Thread.sleep(2000);

        WebElement UpdateProductsBrandNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Update Product Details']/../following-sibling::div//select[@formcontrolname='brandname']"));

        // Create a Select object from the dropdown element
        Select UpdateProductsBrandNameDrpDwn = new Select(UpdateProductsBrandNameyDrpDwnElement);

        // Select an option by visible text
        UpdateProductsBrandNameDrpDwn.selectByVisibleText("Select Brand");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Product Details']/../following-sibling::div//button[.='Update']")).click();
        Thread.sleep(2000);
        WebElement Error = driver.findElement(By.xpath("(//div[.=' Please Enter Category ID '])[2]"));
        
        try {
        	if (Error.isDisplayed())
    	    {
    			w.takeScreenShot(driver, "z30_productPageActionEditButton_ClearingData3Test");
    			Thread.sleep(2000);
    		} 	
    	    else 
    	    {
                System.out.println("Updated Successfully");
    		}
		} finally {
			driver.quit();
		}
	    
	}
	
	//57TC
	
	@Test(groups = "Sprint-3", priority = 31)
	public void z31_productPageActionButton_ClearingData6PassTest()throws Exception
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
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[.=' Edit '])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Product Details']/../following-sibling::div//input[@formcontrolname='productname']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Product Details']/../following-sibling::div//input[@formcontrolname='va']")).clear();
        Thread.sleep(2000);
        
//        WebElement UpdateProductsSelectCaratDrpDwnElement = driver.findElement(By.xpath("//h1[.='Update Product Details']/../following-sibling::div//select[@formcontrolname='carat']"));
//
//        // Create a Select object from the dropdown element
//        Select UpdateProductsSelectCaratDrpDwn = new Select(UpdateProductsSelectCaratDrpDwnElement);
//
//        // Select an option by visible text
//        UpdateProductsSelectCaratDrpDwn.selectByVisibleText("Select Carat");
//        
//        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Product Details']/../following-sibling::div//button[.='Update']")).click();
        Thread.sleep(1000);
        WebElement Error = driver.findElement(By.xpath("//div[.=' Product Details Updated Successfully ']"));
        Thread.sleep(1000);
        
        try {
        	if(Error.isDisplayed())
    	    {
    			w.takeScreenShot(driver, "z31_productPageActionButton_ClearingData6PassTest");
    			Thread.sleep(1000);
    		} 
    	    else 
    	    {
                System.out.println("Updated Successfully");
    		}
		} finally {
			driver.quit();
		}
	    
	    
           
	}
	
	//58TC
	
	@Test(groups = "Sprint-3", priority = 32)
	public void z32_productPageActionButton_ClearingData8Test() throws Exception
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
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[.=' Edit '])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Product Details']/../following-sibling::div//input[@formcontrolname='price']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Product Details']/../following-sibling::div//textarea[@formcontrolname='description']")).clear();
        Thread.sleep(2000);
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Product Details']/../following-sibling::div//button[.='Update']")).click();
        
        WebElement Error = driver.findElement(By.xpath("//h1[.='Update Product Details']/../following-sibling::div//button[.='Update']"));
        
        try {
        	if(Error.isDisplayed())
    	    {
    			w.takeScreenShot(driver, "z32_productPageActionButton_ClearingData8Test");
    			Thread.sleep(2000);
    		} 
    	    else 
    	    {
                System.out.println("Updated Successfully");
    		}
		} finally {
			driver.quit();
		}
	    
		
	}
	
}