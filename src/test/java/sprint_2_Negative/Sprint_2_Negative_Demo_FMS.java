package sprint_2_Negative;

import java.io.IOException;
import java.time.Duration;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import genericUtility.JavaUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.DashboardPage;
import objectRepository.Scheme_SchemesList_ActionInfoBtn_SchemeInfoPage;
import objectRepository.Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFaqPage;
import objectRepository.Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFeaturePage;
import objectRepository.Scheme_SchemesList_ActionInfoBtn_SchemeInfo_EditFaqPage;
import objectRepository.Scheme_SchemesList_ActionInfoBtn_SchemeInfo_EditFeaturePage;
import objectRepository.SchemesPage;
import objectRepository.Schemes_SchemeListPage;

public class Sprint_2_Negative_Demo_FMS {

	WebDriverUtility wUtil = new WebDriverUtility();
	JavaUtility jUtil = new JavaUtility();
	PropertyFileUtility pUtil = new PropertyFileUtility();
	
	
	@Test(groups = "sprint-2", priority = 1)
	public void a1_loginByGivingInvalidEmailErrorTest() throws Exception
	{	
		String URL = pUtil.readDataFromPropertyFile("url");
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().clearDriverCache().setup();
		WebDriverManager.chromedriver().clearResolutionCache().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumyaa123@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024");
		driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "a1_loginByGivingInvalidEmailErrorTest");
		try 
		{
			Thread.sleep(2000);
		} 
		finally 
		{
			driver.quit();
		}
		
	}
	
	@Test(groups = "sprint-2", priority = 2)
	public void a2_loginByGivingInvalidPasswordErrorTest() throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().clearDriverCache().setup();
		WebDriverManager.chromedriver().clearResolutionCache().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("abc123abc");
		driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "a2_loginByGivingInvalidPasswordErrorTest");
		try 
		{
			Thread.sleep(2000);
		} 
		finally 
		{
			driver.quit();
		}
	}
	
	
	@Test(groups = "sprint-2", priority = 3)
	public void a3_loginToFmsApplicationPassTest() throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
	    String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().clearDriverCache().setup();
		WebDriverManager.chromedriver().clearResolutionCache().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME);
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
		Thread.sleep(3000);
		wUtil.takeScreenShot(driver, "a3_loginToFmsApplicationPassTest");
		try 
		{
			Thread.sleep(2000);
		} 
		finally 
		{
			driver.quit();
		}
	}
	
	
	@Test(groups = "sprint-2", priority = 4)
	public void a4_clickOnEcommerceSchemesPageShouldOpenErrorTest() throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
	    String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().clearDriverCache().setup();
		WebDriverManager.chromedriver().clearResolutionCache().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(URL);
		driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME);
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
		Thread.sleep(10000);
		
		WebElement EcommerceLnk = driver.findElement(By.xpath("//span[.='Ecommerce']"));
		
		EcommerceLnk.click();
			
		Thread.sleep(1000);
		
		WebElement SchemesList = driver.findElement(By.xpath("//a[.='Scheme List']"));
		
		try
		{
			if(SchemesList.isDisplayed())
			{
				System.out.println("Schemes Page Opened");
			}
			else 
			{
				wUtil.takeScreenShot(driver, "a4_clickOnEcommerceSchemesPageShouldOpenErrorTest");
			}
		}
		finally 
		{
			driver.quit();
		}
	}
		
		@Test(groups = "sprint-2", priority = 5)
		public void a5_clickOnUserLinkSchemesPageShouldOpenErrorTest() throws Exception
		{
			String URL = pUtil.readDataFromPropertyFile("url");
			String USERNAME = pUtil.readDataFromPropertyFile("username");
		    String PASSWORD = pUtil.readDataFromPropertyFile("password");
			
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(URL);
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME);
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(PASSWORD);
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//span[.='Users']")).click();	
			Thread.sleep(1000);
			
			WebElement SchemesList = driver.findElement(By.xpath("//a[.='Scheme List']"));
			try
			{
				if(SchemesList.isDisplayed())
				{
					System.out.println("Schemes Page Opened");
					driver.quit();
				}
				else 
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "a5_clickOnUserLinkSchemesPageShouldOpenErrorTest");
					Thread.sleep(2000);
					driver.quit();
				}
			}
			finally 
			{
				driver.quit();
			}
			
		}
		
		
		@Test(groups = "sprint-2", priority = 6)
		public void a6_schemeClickOnAddSchemesAndAddSchemesPageShouldNotOpenErrorTest() throws Exception
		{
			String URL = pUtil.readDataFromPropertyFile("url");
			String USERNAME = pUtil.readDataFromPropertyFile("username");
		    String PASSWORD = pUtil.readDataFromPropertyFile("password");
			
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(URL);
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME);
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(PASSWORD);
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//span[.='Schemes']")).click();	
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[.='Scheme List']")).click();	
			Thread.sleep(1000);
			driver.findElement(By.xpath("//h6[.='Add Scheme']")).click();	
			Thread.sleep(1000);
			
			WebElement AddSchemePage = driver.findElement(By.xpath("//h1[.='Add Scheme']"));
			try
			{
				if(AddSchemePage.isDisplayed())
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "a6_schemeClickOnAddSchemesAndAddSchemesPageShouldNotOpenErrorTest");
					Thread.sleep(2000);
					driver.quit();
				}
				else 
				{
					System.out.println("Add Scheme Page is not displayed");
					driver.quit();
				}
			}
			finally 
			{
				driver.quit();
			}
		
	    }
		
		
		@Test(groups = "sprint-2", priority = 7)
		public void a7_schemeCreatingWithoutGivingCountryDrpDwnErrorTest() throws Exception
		{
			String URL = pUtil.readDataFromPropertyFile("url");
			String USERNAME = pUtil.readDataFromPropertyFile("username");
		    String PASSWORD = pUtil.readDataFromPropertyFile("password");
			
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(URL);
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME);
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(PASSWORD);
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(10000);
			
			DashboardPage dPage = new DashboardPage(driver);
			wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
			dPage.getSchemesDrpDwn().click();
		    
			Thread.sleep(2000);
			
			SchemesPage sPage = new SchemesPage(driver);
			sPage.getSchemesListLnk().click();
			
			Thread.sleep(2000);
			
			Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
			sslPage.getAddSchemeBtn().click();
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys("Scheme"+jUtil.getRandomNum());
			
			Thread.sleep(2000);
			
            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByVisibleText("MY GOLD", CalculationDrpDwn);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			WebElement ErrorMsg = driver.findElement(By.xpath("(//div[.=' Please Enter Country '])[2]"));
			
			try
			{
				if(ErrorMsg.isDisplayed())
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "a7_schemeCreatingWithoutGivingCountryDrpDwnErrorTest");
					Thread.sleep(2000);
					driver.quit();
				}
				else 
				{
					System.out.println("Scheme Not Created");
					driver.quit();
				}
			}
			finally 
			{
				driver.quit();
			}
		}
		
		
		@Test(groups = "sprint-2", priority = 8)
		public void a8_schemeCreatingWithoutGivingCalculationDrpDwnErrorTest() throws Exception
		{
			String URL = pUtil.readDataFromPropertyFile("url");
			String USERNAME = pUtil.readDataFromPropertyFile("username");
		    String PASSWORD = pUtil.readDataFromPropertyFile("password");
			
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(URL);
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME);
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(PASSWORD);
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(10000);
			
			DashboardPage dPage = new DashboardPage(driver);
			wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
			dPage.getSchemesDrpDwn().click();
		    
			Thread.sleep(2000);
			
			SchemesPage sPage = new SchemesPage(driver);
			sPage.getSchemesListLnk().click();
			
			Thread.sleep(2000);
			
			Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
			sslPage.getAddSchemeBtn().click();
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys("Scheme"+jUtil.getRandomNum());
			
			Thread.sleep(2000);
			
            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CountryDrpDwn, 7);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			WebElement ErrorElement = driver.findElement(By.xpath("(//div[.=' Please Enter scheme_calculation_type '])[2]"));
			
			try 
			{
				if(ErrorElement.isDisplayed())
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "a8_schemeCreatingWithoutGivingCalculationDrpDwnErrorTest");
					Thread.sleep(2000);
				}
				else 
				{
					System.out.println("Scheme Created");
				}
			} 
			finally 
			{
				driver.quit();
			}
		}
		
		
		@Test(groups = "sprint-2", priority = 9)
		public void a9_schemeCreatingWithoutGivingSchemeDescriptionErrorTest() throws Exception
		{
			String SchemeName = "Scheme"+jUtil.getHighestRandomNumber();
			
			String URL = pUtil.readDataFromPropertyFile("url");
			String USERNAME = pUtil.readDataFromPropertyFile("username");
		    String PASSWORD = pUtil.readDataFromPropertyFile("password");
			
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(URL);
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME);
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(PASSWORD);
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(10000);
			
			DashboardPage dPage = new DashboardPage(driver);
			wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
			dPage.getSchemesDrpDwn().click();
		    
			Thread.sleep(2000);
			
			SchemesPage sPage = new SchemesPage(driver);
			sPage.getSchemesListLnk().click();
			
			Thread.sleep(2000);
			
			Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
			sslPage.getAddSchemeBtn().click();
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys(SchemeName);
			
			Thread.sleep(2000);
			
            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CountryDrpDwn, 1);
			
            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			WebElement ErrorElement = driver.findElement(By.xpath("(//div[.=' please Enter description '])[2]"));
			
			try 
			{
				if(ErrorElement.isDisplayed())
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "a9_schemeCreatingWithoutGivingSchemeDescriptionErrorTest");
					Thread.sleep(2000);
				}
				else 
				{
					System.out.println("Scheme Created");
				}
			} 
			finally 
			{
				driver.quit();
			}
		}
		
		
		@Test(groups = "sprint-2", priority = 10)
		public void a10_schemeCreatingByGivingAllSchemeDetailsPassTest() throws Exception
		{
			String SchemeName = "Scheme"+jUtil.getHighestRandomNumber();
			
			String URL = pUtil.readDataFromPropertyFile("url");
			String USERNAME = pUtil.readDataFromPropertyFile("username");
		    String PASSWORD = pUtil.readDataFromPropertyFile("password");
			
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(URL);
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME);
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(PASSWORD);
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(10000);
			
			DashboardPage dPage = new DashboardPage(driver);
			wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
			dPage.getSchemesDrpDwn().click();
		    
			Thread.sleep(2000);
			
			SchemesPage sPage = new SchemesPage(driver);
			sPage.getSchemesListLnk().click();
			
			Thread.sleep(2000);
			
			Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
			sslPage.getAddSchemeBtn().click();
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys(SchemeName);
			
			Thread.sleep(2000);
			
            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CountryDrpDwn, 4);
			
            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			WebElement SuccessMsg = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='page-header']/following-sibling::div[@class='card-body']//td)[1]"));
			
			wUtil.waitForElementToBeVisible(driver, SuccessMsg);
			
			try 
			{
				if(SuccessMsg.isDisplayed())
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "a10_schemeCreatingByGivingAllSchemeDetailsPassTest");
					Thread.sleep(2000);
					driver.quit();
				}
				else 
				{
					System.out.println("Scheme Not Added");
					driver.quit();
				}
			} 
			finally 
			{
				driver.quit();
			}
			
			
		}
		
		
		@Test(groups = "sprint-2", priority = 11)
		public void a11_addingTenureListDetailsWithoutGivingAnyDetailsErrorTest() throws Exception
		{
			String SchemeName = "Scheme"+jUtil.getHighestRandomNumber();
			
			String URL = pUtil.readDataFromPropertyFile("url");
			String USERNAME = pUtil.readDataFromPropertyFile("username");
		    String PASSWORD = pUtil.readDataFromPropertyFile("password");
			
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(URL);
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME);
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(PASSWORD);
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(10000);
			
			DashboardPage dPage = new DashboardPage(driver);
			wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
			dPage.getSchemesDrpDwn().click();
		    
			Thread.sleep(2000);
			
			SchemesPage sPage = new SchemesPage(driver);
			sPage.getSchemesListLnk().click();
			
			Thread.sleep(2000);
			
			Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
			sslPage.getAddSchemeBtn().click();
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys(SchemeName);
			
			Thread.sleep(2000);
			
            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CountryDrpDwn, 9);
			
            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[1]")).click();
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//button[.='Add']")).click();
			
			WebElement ErrorMsg = driver.findElement(By.xpath("(//div[.=' Please Enter Tenure '])[2]"));
			
			try 
			{
				if(ErrorMsg.isDisplayed())
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "a11_addingTenureListDetailsWithoutGivingAnyDetailsErrorTest");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//div[.='Manage Tenures']//button[@aria-label='Close']")).click();
					Thread.sleep(2000);
				}
				else 
				{
					System.out.println("Tenure Added Successfully");
					Thread.sleep(2000);
				}
			} 
			finally 
			{
				driver.quit();
			}
		
		}
		
		
		@Test(groups = "sprint-2", priority = 12)
		public void a12_addingTenureListDetailsByGivingAllDetailsPassTest() throws Exception
		{
			String SchemeName = "Scheme"+jUtil.getHighestRandomNumber();
			
			String URL = pUtil.readDataFromPropertyFile("url");
			String USERNAME = pUtil.readDataFromPropertyFile("username");
		    String PASSWORD = pUtil.readDataFromPropertyFile("password");
			
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(URL);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(PASSWORD);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(10000);
			
			DashboardPage dPage = new DashboardPage(driver);
			wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
			dPage.getSchemesDrpDwn().click();
		    
			Thread.sleep(2000);
			
			SchemesPage sPage = new SchemesPage(driver);
			sPage.getSchemesListLnk().click();
			
			Thread.sleep(2000);
			
			Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
			sslPage.getAddSchemeBtn().click();
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys(SchemeName);
			
			Thread.sleep(2000);
			
            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CountryDrpDwn, 6);
			
            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
			
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[1]")).click();
			
			Thread.sleep(2000);
			
//			WebElement DeleteBtn = driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//button[@class='btn-sm btn-edit bg-danger mr-2']"));
//			
//			if(DeleteBtn.isDisplayed())
//			{
//				DeleteBtn.click();
//			}
//			else 
//			{
//				Thread.sleep(2000);
//			}
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//input[@placeholder='Enter tenure in months']")).sendKeys("12");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			WebElement SuccessMsg = driver.findElement(By.xpath("(//div[.=' Scheme Tenure Added Successfully '])[2]"));
			
			try 
			{
				if(SuccessMsg.isDisplayed())
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "a12_addingTenureListDetailsByGivingAllDetailsPassTest");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//div[.='Manage Tenures']//button[@aria-label='Close']")).click();
					Thread.sleep(2000);
				}
				else 
				{
					System.out.println("Tenure Not Added Successfully");
					Thread.sleep(2000);
				}
			} 
			finally 
			{
				driver.quit();
			}
		
		}
		
		
		@Test(groups = "sprint-2", priority = 13)
		public void a13_addingTenureAmountDetailsWithoutGivingAnyDetailsErrorTest() throws Exception
		{
			String SchemeName = "Scheme"+jUtil.getHighestRandomNumber();
			
			String URL = pUtil.readDataFromPropertyFile("url");
			String USERNAME = pUtil.readDataFromPropertyFile("username");
		    String PASSWORD = pUtil.readDataFromPropertyFile("password");
			
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(URL);
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME);
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(PASSWORD);
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(10000);
			
			DashboardPage dPage = new DashboardPage(driver);
			wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
			dPage.getSchemesDrpDwn().click();
		    
			Thread.sleep(2000);
			
			SchemesPage sPage = new SchemesPage(driver);
			sPage.getSchemesListLnk().click();
			
			Thread.sleep(2000);
			
			Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
			sslPage.getAddSchemeBtn().click();
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys(SchemeName);
			
			Thread.sleep(2000);
			
            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CountryDrpDwn, 6);
			
            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
			
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			WebElement TenureListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[1]"));
			TenureListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//input[@placeholder='Enter tenure in months']")).sendKeys("12");
			
            Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenures']//button[@aria-label='Close']")).click();
			
			Thread.sleep(2000);
			
			WebElement AmountListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]"));
			AmountListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(1000);
			
			WebElement ErrorElement = driver.findElement(By.xpath("//div[@aria-label='Please Enter Amount']"));
			
			try 
			{
				if(ErrorElement.isDisplayed())
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "a13_addingTenureAmountDetailsWithoutGivingAnyDetailsErrorTest");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//div[.='Manage Tenure Amount']//button[@aria-label='Close']")).click();
					Thread.sleep(2000);
				}
				else 
				{
					Thread.sleep(1000);
					System.out.println("Amount Not Added Successfully");
				}
			} 
			finally 
			{
				driver.quit();
			}
			
		
		}
		
		@Test(groups = "sprint-2", priority = 14)
		public void a14_addingTenureAmountDetailsByGivingAllPositiveDetailsPassTest() throws Exception
		{
			String SchemeName = "Scheme"+jUtil.getHighestRandomNumber();
			String Amt = "1000";
			
			String URL = pUtil.readDataFromPropertyFile("url");
			String USERNAME = pUtil.readDataFromPropertyFile("username");
		    String PASSWORD = pUtil.readDataFromPropertyFile("password");
			
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(URL);
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME);
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(PASSWORD);
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(10000);
			
			DashboardPage dPage = new DashboardPage(driver);
			wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
			dPage.getSchemesDrpDwn().click();
		    
			Thread.sleep(2000);
			
			SchemesPage sPage = new SchemesPage(driver);
			sPage.getSchemesListLnk().click();
			
			Thread.sleep(2000);
			
			Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
			sslPage.getAddSchemeBtn().click();
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys(SchemeName);
			
			Thread.sleep(2000);
			
            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CountryDrpDwn, 6);
			
            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
			
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			WebElement TenureListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[1]"));
			TenureListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//input[@placeholder='Enter tenure in months']")).sendKeys("12");
			
            Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenures']//button[@aria-label='Close']")).click();
			
			Thread.sleep(2000);
			
			WebElement AmountListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]"));
			AmountListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//input[@placeholder='Enter Amount']")).sendKeys(Amt);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.navigate().refresh();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]")).click();
			
			Thread.sleep(2000);
			
			WebElement AmountElement = driver.findElement(By.xpath("//h1[.='Manage Tenure Amount']/../following-sibling::div//th[.='Tenure in Amount']/../../following-sibling::tbody/tr/td"));
			String Amount = AmountElement.getText();
			
			try 
			{
				if(Amount.contains(Amt))
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "a14_addingTenureAmountDetailsByGivingAllPositiveDetailsPassTest");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//div[.='Manage Tenure Amount']//button[@aria-label='Close']")).click();
					Thread.sleep(2000);
				}
			} 
			finally 
			{
				driver.quit();
			}
		
		}
		
		
		@Test(groups = "sprint-2", priority = 15)
		public void a15_actionInfoSchemeContentAddingByGivingValidDataPassTest() throws Exception
		{
			String SchemeName = "Scheme"+jUtil.getHighestRandomNumber();
			String Amt = "1000";
			String Content = "Content";
			
			String URL = pUtil.readDataFromPropertyFile("url");
			String USERNAME = pUtil.readDataFromPropertyFile("username");
		    String PASSWORD = pUtil.readDataFromPropertyFile("password");
			
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(URL);
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME);
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(PASSWORD);
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(10000);
			
			DashboardPage dPage = new DashboardPage(driver);
			Thread.sleep(9000);
			dPage.getSchemesDrpDwn().click();
		    
			Thread.sleep(2000);
			
			SchemesPage sPage = new SchemesPage(driver);
			sPage.getSchemesListLnk().click();
			
			Thread.sleep(2000);
			
			Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
			sslPage.getAddSchemeBtn().click();
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys(SchemeName);
			
			Thread.sleep(2000);
			
            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CountryDrpDwn, 6);
			
            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
			
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			WebElement TenureListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[1]"));
			TenureListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//input[@placeholder='Enter tenure in months']")).sendKeys("12");
			
            Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenures']//button[@aria-label='Close']")).click();
			
			Thread.sleep(2000);
			
			WebElement AmountListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]"));
			AmountListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//input[@placeholder='Enter Amount']")).sendKeys(Amt);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.navigate().refresh();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]")).click();
			
			Thread.sleep(2000);
			
			WebElement CloseBtnElement = driver.findElement(By.xpath("//h1[.='Manage Tenure Amount']/following-sibling::button[@aria-label='Close']"));
			CloseBtnElement.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[3]")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//textarea[@formcontrolname='content']")).clear();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//textarea[@formcontrolname='content']")).sendKeys(Content);
			
            Thread.sleep(2000);
			
            try 
            {
            	WebElement AddBtn = driver.findElement(By.xpath("//textarea[@formcontrolname='content']/../following-sibling::div/button[.='Add']"));
    			
    			AddBtn.click();
			} 
            catch(Exception e) 
            {
            	WebElement UpdateBtn = driver.findElement(By.xpath("//b[.='Scheme Content']/../../following-sibling::form//button[.='Update']"));
            	
            	UpdateBtn.click();
			}
            
			
			Thread.sleep(2000);
			
			WebElement SuccessElement = driver.findElement(By.xpath("(//div[.=' Scheme Content Added Successfully '])[2]"));
			
			try 
			{
				if(SuccessElement.isDisplayed())
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "a15_actionInfoSchemeContentAddingByGivingValidDataPassTest");
					Thread.sleep(1000);
				}
			} 
			finally 
			{
				driver.quit();
			}
			
		
		}
		
		
		
		@Test(groups = "sprint-2", priority = 16)
		public void a16_actionInfoSchemeContentAddingWithoutGivingDataErrorTest() throws Exception
		{
			String SchemeName = "Scheme"+jUtil.getHighestRandomNumber();
			String Amt = "1000";
			
			String URL = pUtil.readDataFromPropertyFile("url");
			String USERNAME = pUtil.readDataFromPropertyFile("username");
		    String PASSWORD = pUtil.readDataFromPropertyFile("password");
			
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(URL);
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME);
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(PASSWORD);
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(10000);
			
			DashboardPage dPage = new DashboardPage(driver);
			wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
			dPage.getSchemesDrpDwn().click();
		    
			Thread.sleep(2000);
			
			SchemesPage sPage = new SchemesPage(driver);
			sPage.getSchemesListLnk().click();
			
			Thread.sleep(2000);
			
			Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
			sslPage.getAddSchemeBtn().click();
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys(SchemeName);
			
			Thread.sleep(2000);
			
            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CountryDrpDwn, 6);
			
            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
			
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			WebElement TenureListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[1]"));
			TenureListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//input[@placeholder='Enter tenure in months']")).sendKeys("12");
			
            Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenures']//button[@aria-label='Close']")).click();
			
			Thread.sleep(2000);
			
			WebElement AmountListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]"));
			AmountListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//input[@placeholder='Enter Amount']")).sendKeys(Amt);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.navigate().refresh();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]")).click();
			
			Thread.sleep(2000);
			
			WebElement CloseBtnElement = driver.findElement(By.xpath("//h1[.='Manage Tenure Amount']/following-sibling::button[@aria-label='Close']"));
			CloseBtnElement.click();
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[3]")).click();
						
			driver.findElement(By.xpath("//textarea[@formcontrolname='content']/../following-sibling::div/button[.='Add']")).click();
			
			WebElement ErrorElement = driver.findElement(By.xpath("(//div[.=' Please Enter content '])[2]"));
			
			try 
			{
				if(ErrorElement.isDisplayed())
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "a16_actionInfoSchemeContentAddingWithoutGivingDataErrorTest");
					Thread.sleep(1000);
				}
			} 
			finally 
			{
				driver.quit();
			}
			
			
		
		
		}
		
		
		@Test(groups = "sprint-2", priority = 17)
		public void a17_actionInfoSchemeTermsAndConditionsAddingWithoutGivingDataErrorTest() throws Exception
		{
			String SchemeName = "Scheme"+jUtil.getHighestRandomNumber();
			String Amt = "1000";
			String Content = "Content";
			
			String URL = pUtil.readDataFromPropertyFile("url");
			String USERNAME = pUtil.readDataFromPropertyFile("username");
		    String PASSWORD = pUtil.readDataFromPropertyFile("password");
			
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(URL);
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME);
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(PASSWORD);
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(10000);
			
			DashboardPage dPage = new DashboardPage(driver);
			wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
			dPage.getSchemesDrpDwn().click();
		    
			Thread.sleep(2000);
			
			SchemesPage sPage = new SchemesPage(driver);
			sPage.getSchemesListLnk().click();
			
			Thread.sleep(2000);
			
			Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
			sslPage.getAddSchemeBtn().click();
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys(SchemeName);
			
			Thread.sleep(2000);
			
            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CountryDrpDwn, 6);
			
            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
			
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			WebElement TenureListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[1]"));
			TenureListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//input[@placeholder='Enter tenure in months']")).sendKeys("12");
			
            Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenures']//button[@aria-label='Close']")).click();
			
			Thread.sleep(2000);
			
			WebElement AmountListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]"));
			AmountListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//input[@placeholder='Enter Amount']")).sendKeys(Amt);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.navigate().refresh();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]")).click();
			
			Thread.sleep(2000);
			
			WebElement CloseBtnElement = driver.findElement(By.xpath("//h1[.='Manage Tenure Amount']/following-sibling::button[@aria-label='Close']"));
			CloseBtnElement.click();
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[3]")).click();
						
            Thread.sleep(2000);
			
			driver.findElement(By.xpath("//textarea[@formcontrolname='content']")).sendKeys(Content);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//textarea[@formcontrolname='content']/../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(5000);
			
			wUtil.scrollPageDown(1);
			
			driver.findElement(By.xpath("//textarea[@formcontrolname='tc']")).clear();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//textarea[@formcontrolname='tc']/../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(1000);
			
			WebElement ErrorElement = driver.findElement(By.xpath("(//div [.=' Please Enter Terms & Conditions '])[2]"));
			
			try 
			{
				if(ErrorElement.isDisplayed())
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "a17_actionInfoSchemeTermsAndConditionsAddingWithoutGivingDataErrorTest");
					Thread.sleep(1000);
				}
			} 
			finally 
			{
				driver.quit();
			}
		
		
		}
		
		
		@Test(groups = "sprint-2", priority = 18)
		public void a18_actionInfoSchemeTermsAndConditionsAddingByGivingValidDataPassTest() throws Exception
		{
			String SchemeName = "Scheme"+jUtil.getHighestRandomNumber();
			String Amt = "1000";
			String Content = "Content";
			
			String URL = pUtil.readDataFromPropertyFile("url");
			String USERNAME = pUtil.readDataFromPropertyFile("username");
		    String PASSWORD = pUtil.readDataFromPropertyFile("password");
			
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(URL);
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME);
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(PASSWORD);
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(10000);
			
			DashboardPage dPage = new DashboardPage(driver);
			wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
			dPage.getSchemesDrpDwn().click();
		    
			Thread.sleep(2000);
			
			SchemesPage sPage = new SchemesPage(driver);
			sPage.getSchemesListLnk().click();
			
			Thread.sleep(2000);
			
			Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
			sslPage.getAddSchemeBtn().click();
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys(SchemeName);
			
			Thread.sleep(2000);
			
            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CountryDrpDwn, 6);
			
            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
			
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			WebElement TenureListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[1]"));
			TenureListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//input[@placeholder='Enter tenure in months']")).sendKeys("12");
			
            Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenures']//button[@aria-label='Close']")).click();
			
			Thread.sleep(2000);
			
			WebElement AmountListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]"));
			AmountListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//input[@placeholder='Enter Amount']")).sendKeys(Amt);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.navigate().refresh();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]")).click();
			
			Thread.sleep(2000);
			
			WebElement CloseBtnElement = driver.findElement(By.xpath("//h1[.='Manage Tenure Amount']/following-sibling::button[@aria-label='Close']"));
			CloseBtnElement.click();
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[3]")).click();
						
            Thread.sleep(2000);
			
			driver.findElement(By.xpath("//textarea[@formcontrolname='content']")).sendKeys(Content);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//textarea[@formcontrolname='content']/../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(5000);
			
		    driver.findElement(By.xpath("//textarea[@formcontrolname='tc']")).sendKeys("Terms and Conditions");
			
		    Thread.sleep(2000);
			
			driver.findElement(By.xpath("//textarea[@formcontrolname='tc']/../following-sibling::div/button[.='Add']")).click();
			
			WebElement SuccessElement = driver.findElement(By.xpath("(//div[.=' Scheme Terms&Conditions Added Successfully '])[2]"));
			
			Thread.sleep(1000);
			
			try 
			{
				if(SuccessElement.isDisplayed())
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "a18_actionInfoSchemeTermsAndConditionsAddingByGivingValidDataPassTest");
					Thread.sleep(2000);
				}
			} 
			finally 
			{
				driver.quit();
			}
			
		
		}
		
		
		@Test(groups = "sprint-2", priority = 19)
		public void a19_actionInfoSchemeFeatureAddingByGivingValidDataPassTest() throws Exception
		{
			String SchemeName = "Scheme"+jUtil.getHighestRandomNumber();
			String Amt = "1000";
			String Content = "Content";
			
			String URL = pUtil.readDataFromPropertyFile("url");
			String USERNAME = pUtil.readDataFromPropertyFile("username");
		    String PASSWORD = pUtil.readDataFromPropertyFile("password");
			
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(URL);
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME);
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(PASSWORD);
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(10000);
			
			DashboardPage dPage = new DashboardPage(driver);
			wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
			dPage.getSchemesDrpDwn().click();
		    
			Thread.sleep(2000);
			
			SchemesPage sPage = new SchemesPage(driver);
			sPage.getSchemesListLnk().click();
			
			Thread.sleep(2000);
			
			Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
			sslPage.getAddSchemeBtn().click();
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys(SchemeName);
			
			Thread.sleep(2000);
			
            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CountryDrpDwn, 6);
			
            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
			
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			WebElement TenureListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[1]"));
			TenureListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//input[@placeholder='Enter tenure in months']")).sendKeys("12");
			
            Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenures']//button[@aria-label='Close']")).click();
			
			Thread.sleep(2000);
			
			WebElement AmountListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]"));
			AmountListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//input[@placeholder='Enter Amount']")).sendKeys(Amt);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.navigate().refresh();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]")).click();
			
			Thread.sleep(2000);
			
			WebElement CloseBtnElement = driver.findElement(By.xpath("//h1[.='Manage Tenure Amount']/following-sibling::button[@aria-label='Close']"));
			CloseBtnElement.click();
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[3]")).click();
						
            Thread.sleep(2000);
			
			driver.findElement(By.xpath("//textarea[@formcontrolname='content']")).sendKeys(Content);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//textarea[@formcontrolname='content']/../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
		    driver.findElement(By.xpath("//textarea[@formcontrolname='tc']")).sendKeys("Terms and Conditions");
			
		    Thread.sleep(2000);
			
			driver.findElement(By.xpath("//textarea[@formcontrolname='tc']/../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			wUtil.scrollPageDown(1);
			
			driver.findElement(By.xpath("//h4[.='Schemes Features']/../following-sibling::div//h6[.='Add Feature']")).click();
			
            Thread.sleep(2000);
			
            Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFeaturePage ssasaPage = new Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFeaturePage(driver);
            
            ssasaPage.getEnterFeatureEdt().sendKeys("Gold Plus Plan");
            
            Thread.sleep(2000);
            
            ssasaPage.getEnterFeatureExplanationEdt().sendKeys("11+1");
            
			Thread.sleep(2000);
			
			ssasaPage.getAddBtn().click();
			
			WebElement SuccessElement = driver.findElement(By.xpath("(//div[.=' Scheme Features Added Successfully '])[2]"));
			
			Thread.sleep(1000);
			
			try 
			{
				if(SuccessElement.isDisplayed())
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "a19_actionInfoSchemeFeatureAddingByGivingValidDataPassTest");
					Thread.sleep(2000);
				}
			} 
			finally 
			{
				driver.quit();
			}
			
			
		}
		
		
		@Test(groups = "sprint-2", priority = 20)
		public void a20_actionInfoSchemeFeatureAddingWithoutGivingDataPageStaticErrorTest() throws Exception
		{
			String SchemeName = "Scheme"+jUtil.getHighestRandomNumber();
			String Amt = "1000";
			String Content = "Content";
			
			String URL = pUtil.readDataFromPropertyFile("url");
			String USERNAME = pUtil.readDataFromPropertyFile("username");
		    String PASSWORD = pUtil.readDataFromPropertyFile("password");
			
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(URL);
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME);
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(PASSWORD);
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(10000);
			
			DashboardPage dPage = new DashboardPage(driver);
			wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
			dPage.getSchemesDrpDwn().click();
		    
			Thread.sleep(2000);
			
			SchemesPage sPage = new SchemesPage(driver);
			sPage.getSchemesListLnk().click();
			
			Thread.sleep(2000);
			
			Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
			sslPage.getAddSchemeBtn().click();
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys(SchemeName);
			
			Thread.sleep(2000);
			
            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CountryDrpDwn, 6);
			
            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
			
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			WebElement TenureListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[1]"));
			TenureListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//input[@placeholder='Enter tenure in months']")).sendKeys("12");
			
            Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenures']//button[@aria-label='Close']")).click();
			
			Thread.sleep(2000);
			
			WebElement AmountListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]"));
			AmountListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//input[@placeholder='Enter Amount']")).sendKeys(Amt);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.navigate().refresh();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]")).click();
			
			Thread.sleep(2000);
			
			WebElement CloseBtnElement = driver.findElement(By.xpath("//h1[.='Manage Tenure Amount']/following-sibling::button[@aria-label='Close']"));
			CloseBtnElement.click();
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[3]")).click();
						
            Thread.sleep(2000);
			
			driver.findElement(By.xpath("//textarea[@formcontrolname='content']")).sendKeys(Content);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//textarea[@formcontrolname='content']/../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
		    driver.findElement(By.xpath("//textarea[@formcontrolname='tc']")).sendKeys("Terms and Conditions");
			
		    Thread.sleep(2000);
			
			driver.findElement(By.xpath("//textarea[@formcontrolname='tc']/../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			wUtil.scrollPageDown(1);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h4[.='Schemes Features']/../following-sibling::div//h6[.='Add Feature']")).click();
			
            Thread.sleep(2000);
			
            Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFeaturePage ssasaPage = new Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFeaturePage(driver);
			
//			ssasaPage.getAddBtn().click();
			
			String AddBtn = ssasaPage.getAddBtn().getText();
			
//			WebElement SuccessElement = driver.findElement(By.xpath("(//div[.=' Scheme Features Added Successfully '])[2]"));
//			
//			Thread.sleep(1000);
			try 
			{
				if(AddBtn.contains("Add"))
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "a20_actionInfoSchemeFeatureAddingWithoutGivingDataPageStaticErrorTest");
					Thread.sleep(2000);
				}
			} 
			finally 
			{
				driver.quit();
			}
			
			
		}
		
		
		@Test(groups = "sprint-2", priority = 21)
		public void a21_actionInfoSchemeFaqAddingByGivingValidDataPassTest() throws Exception
		{
			String SchemeName = "Scheme"+jUtil.getHighestRandomNumber();
			String Amt = "1000";
			String Content = "Content";
			
			String URL = pUtil.readDataFromPropertyFile("url");
			String USERNAME = pUtil.readDataFromPropertyFile("username");
		    String PASSWORD = pUtil.readDataFromPropertyFile("password");
			
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(URL);
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME);
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(PASSWORD);
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(10000);
			
			DashboardPage dPage = new DashboardPage(driver);
			wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
			dPage.getSchemesDrpDwn().click();
		    
			Thread.sleep(2000);
			
			SchemesPage sPage = new SchemesPage(driver);
			sPage.getSchemesListLnk().click();
			
			Thread.sleep(2000);
			
			Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
			sslPage.getAddSchemeBtn().click();
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys(SchemeName);
			
			Thread.sleep(2000);
			
            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CountryDrpDwn, 6);
			
            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
			
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			WebElement TenureListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[1]"));
			TenureListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//input[@placeholder='Enter tenure in months']")).sendKeys("12");
			
            Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenures']//button[@aria-label='Close']")).click();
			
			Thread.sleep(2000);
			
			WebElement AmountListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]"));
			AmountListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//input[@placeholder='Enter Amount']")).sendKeys(Amt);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.navigate().refresh();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]")).click();
			
			Thread.sleep(2000);
			
			WebElement CloseBtnElement = driver.findElement(By.xpath("//h1[.='Manage Tenure Amount']/following-sibling::button[@aria-label='Close']"));
			CloseBtnElement.click();
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[3]")).click();
						
            Thread.sleep(2000);
			
			driver.findElement(By.xpath("//textarea[@formcontrolname='content']")).sendKeys(Content);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//textarea[@formcontrolname='content']/../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
		    driver.findElement(By.xpath("//textarea[@formcontrolname='tc']")).sendKeys("Terms and Conditions");
			
		    Thread.sleep(2000);
			
			driver.findElement(By.xpath("//textarea[@formcontrolname='tc']/../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			wUtil.scrollPageDown(1);
			
			Thread.sleep(2000);
			
			Scheme_SchemesList_ActionInfoBtn_SchemeInfoPage ssasiPage = new Scheme_SchemesList_ActionInfoBtn_SchemeInfoPage(driver);
			
			ssasiPage.getAddFeatureBtn().click();
			
            Thread.sleep(2000);
              
            Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFeaturePage ssasaFeaturePage = new Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFeaturePage(driver);
            
            ssasaFeaturePage.getEnterFeatureEdt().sendKeys("Feature");
            
            Thread.sleep(2000);
            
            ssasaFeaturePage.getEnterFeatureExplanationEdt().sendKeys("Explanation");
            
            Thread.sleep(2000);
            
            ssasaFeaturePage.getAddBtn().click();
            
            Thread.sleep(2000);
            
            ssasiPage.getAddFaqBtn().click();
            
            Thread.sleep(2000);
            
            Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFaqPage ssasaPage = new Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFaqPage(driver);
            
			ssasaPage.getEnterFaqQuestionEdt().sendKeys("Question");
			
			Thread.sleep(2000);
			
			ssasaPage.getEnterFaqAnswerEdt().sendKeys("Answer");
			
			Thread.sleep(2000);
			
			ssasaPage.getAddBtn().click();
			
			Thread.sleep(2000);
						
			Thread.sleep(2000);
			
			WebElement SuccessElement = driver.findElement(By.xpath("(//div[.=' Scheme Faqs Added Successfully '])[2]"));
			
			Thread.sleep(1000);
			
			try 
			{
				if(SuccessElement.isDisplayed())
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "a21_actionInfoSchemeFaqAddingByGivingValidDataPassTest");
					Thread.sleep(2000);
				}
			} 
			finally 
			{
				driver.quit();
			}
			
		}
		
		
		@Test(groups = "sprint-2", priority = 22)
		public void a22_actionInfoSchemeFaqAddingWithoutGivingDataPageStaticErrorTest() throws Exception
		{
			String SchemeName = "Scheme"+jUtil.getHighestRandomNumber();
			String Amt = "1000";
			String Content = "Content";
			String TermsAndConditions = "Terms And Conditions";
			String Feature = "Feature";
			String Explanation = "Explanation";
			
			String URL = pUtil.readDataFromPropertyFile("url");
			String USERNAME = pUtil.readDataFromPropertyFile("username");
		    String PASSWORD = pUtil.readDataFromPropertyFile("password");
			
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(URL);
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME);
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(PASSWORD);
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(10000);
			
			DashboardPage dPage = new DashboardPage(driver);
			wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
			dPage.getSchemesDrpDwn().click();
		    
			Thread.sleep(2000);
			
			SchemesPage sPage = new SchemesPage(driver);
			sPage.getSchemesListLnk().click();
			
			Thread.sleep(2000);
			
			Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
			sslPage.getAddSchemeBtn().click();
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys(SchemeName);
			
			Thread.sleep(2000);
			
            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CountryDrpDwn, 6);
			
            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
			
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			WebElement TenureListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[1]"));
			TenureListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//input[@placeholder='Enter tenure in months']")).sendKeys("12");
			
            Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenures']//button[@aria-label='Close']")).click();
			
			Thread.sleep(2000);
			
			WebElement AmountListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]"));
			AmountListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//input[@placeholder='Enter Amount']")).sendKeys(Amt);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.navigate().refresh();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]")).click();
			
			Thread.sleep(2000);
			
			WebElement CloseBtnElement = driver.findElement(By.xpath("//h1[.='Manage Tenure Amount']/following-sibling::button[@aria-label='Close']"));
			CloseBtnElement.click();
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[3]")).click();
						
            Thread.sleep(2000);
			
            Scheme_SchemesList_ActionInfoBtn_SchemeInfoPage ssasiPage = new Scheme_SchemesList_ActionInfoBtn_SchemeInfoPage(driver);
			
			Thread.sleep(2000);
			
			ssasiPage.clearAndAddContent(Content);
			
			Thread.sleep(2000);
			
			ssasiPage.clearAndAddSchemeTermsAndConditions(driver, TermsAndConditions);
			
			Thread.sleep(2000);
			
			ssasiPage.getAddFeatureBtn().click();
			
			Thread.sleep(2000);
			
			Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFeaturePage ssasaFeaturePage = new Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFeaturePage(driver);
			ssasaFeaturePage.addFeature(Feature, Explanation);
			
			Thread.sleep(2000);
			
			ssasiPage.getAddFaqBtn().click();
			
			Thread.sleep(2000);
			
            Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFaqPage ssasaFaqPage = new Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFaqPage(driver);
            String FaqAddBtn = ssasaFaqPage.getAddBtn().getText();
			
			Thread.sleep(1000);
			try 
			{
				if(FaqAddBtn.contains("Add"))
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "a22_actionInfoSchemeFaqAddingWithoutGivingDataPageStaticErrorTest");
					Thread.sleep(2000);
				}
			} 
			finally 
			{
				driver.quit();
			}
			
		}
		
		
		@Test(groups = "sprint-2", priority = 23)
		public void a23_schemeCreatingWithoutGivingSchemeNameErrorTest() throws Exception
		{
			String URL = pUtil.readDataFromPropertyFile("url");
			String USERNAME = pUtil.readDataFromPropertyFile("username");
		    String PASSWORD = pUtil.readDataFromPropertyFile("password");
			
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(URL);
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME);
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(PASSWORD);
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(10000);
			
			DashboardPage dPage = new DashboardPage(driver);
			wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
			dPage.getSchemesDrpDwn().click();
		    
			Thread.sleep(2000);
			
			SchemesPage sPage = new SchemesPage(driver);
			sPage.getSchemesListLnk().click();
			
			Thread.sleep(2000);
			
			Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
			sslPage.getAddSchemeBtn().click();
			
			Thread.sleep(2000);
			
			WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CountryDrpDwn, 8);
			
			Thread.sleep(2000);
			
            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			WebElement ErrorElement = driver.findElement(By.xpath("(//div[.=' Please Enter title '])[2]"));
			
			try 
			{
				if(ErrorElement.isDisplayed())
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "a23_schemeCreatingWithoutGivingSchemeNameErrorTest");
					Thread.sleep(2000);
				}
			} 
			finally 
			{
				driver.quit();
			}
			
		}
		
		@Test(groups = "sprint-2", priority = 24)
		public void a24_loginWithoutGivingEmailAndPasswordErrorTest() throws Exception
		{
			String URL = pUtil.readDataFromPropertyFile("url");
			String USERNAME = pUtil.readDataFromPropertyFile("username");
		    String PASSWORD = pUtil.readDataFromPropertyFile("password");
			
		    WebDriverManager.chromedriver().setup();
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(URL);
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(1000);
			wUtil.takeScreenShot(driver, "a24_loginWithoutGivingEmailAndPasswordErrorTest");
			
			try 
			{
				Thread.sleep(2000);
			} 
			finally 
			{
				driver.quit();
			}
			
			
		}
		
		@Test(groups = "sprint-2", priority = 25)
		public void a25_loginWithoutGivingEmailErrorTest() throws IOException, InterruptedException
		{
			String URL = pUtil.readDataFromPropertyFile("url");
			String USERNAME = pUtil.readDataFromPropertyFile("username");
		    String PASSWORD = pUtil.readDataFromPropertyFile("password");
			
		    WebDriverManager.chromedriver().setup();
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(URL);
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(PASSWORD);
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(1000);
			wUtil.takeScreenShot(driver, "a25_loginWithoutGivingEmailErrorTest");
			
			try 
			{
				Thread.sleep(2000);
			} 
			finally 
			{
				driver.quit();
			}
			
			
		}
		
		@Test(groups = "sprint-2", priority = 26)
		public void a26_loginWithoutGivingPasswordErrorTest() throws Exception
		{
			String URL = pUtil.readDataFromPropertyFile("url");
			String USERNAME = pUtil.readDataFromPropertyFile("username");
		    String PASSWORD = pUtil.readDataFromPropertyFile("password");
			
		    WebDriverManager.chromedriver().setup();
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(URL);
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME);
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(1000);
			wUtil.takeScreenShot(driver, "a26_loginWithoutGivingPasswordErrorTest");
			
			try 
			{
				Thread.sleep(2000);
			} 
			finally 
			{
				driver.quit();
			}
			
			
			
		}
		
		@Test(groups = "sprint-2", priority = 27)
		public void a27_loginByGivingEmailAsPwdAndPasswordAsEmailErrorTest() throws Exception
		{
			String URL = pUtil.readDataFromPropertyFile("url");
			String USERNAME = pUtil.readDataFromPropertyFile("username");
		    String PASSWORD = pUtil.readDataFromPropertyFile("password");
			
		    WebDriverManager.chromedriver().setup();
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(URL);
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(PASSWORD);
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(USERNAME);
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(1000);
			wUtil.takeScreenShot(driver, "a27_loginByGivingEmailAsPwdAndPasswordAsEmailErrorTest");
			
			try 
			{
				Thread.sleep(2000);
			} 
			finally 
			{
				driver.quit();
			}
				
		}
		
		
		@Test(groups = "sprint-2", priority = 28)
		public void a28_schemeBootstrapBtnDisablingAndCheckingSchemeIsEnabledInUserPannelErrorTest() throws Exception
		{
			PropertyFileUtility pUtil = new PropertyFileUtility();
			String SchemeName = "Scheme"+jUtil.getHighestRandomNumber();
			
			String URL = pUtil.readDataFromPropertyFile("url");
			String USERNAME = pUtil.readDataFromPropertyFile("username");
		    String PASSWORD = pUtil.readDataFromPropertyFile("password");
			
			WebDriverManager.chromedriver().setup();
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(URL);
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME);
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(PASSWORD);
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			
			Thread.sleep(10000);
	        
	        driver.findElement(By.xpath("//span[.='Schemes']")).click();
	        
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//a[.='Scheme List']")).click();
	        
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//h6[.='Add Scheme']")).click();
	        
	        Thread.sleep(2000);
	        
            driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys(SchemeName);
			
			Thread.sleep(2000);
			
            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CountryDrpDwn, 4);
			
            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.get("http://stg.goldbox.gold/login");
			
			String MOBILENUMBER = pUtil.readDataFromPropertyFile("mobilenumber");
		    String OTP = pUtil.readDataFromPropertyFile("otp");
		    
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys(MOBILENUMBER , Keys.ENTER);
	        
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("(//input[@autocomplete='one-time-code'])[1]")).sendKeys(OTP);
		    
		    Thread.sleep(2000);
			
		    driver.findElement(By.xpath("//span[.='Schemes']")).click();
		    
		    Thread.sleep(2000);
		    
		    String AllSchemesPage = driver.findElement(By.xpath("//div[@class='card mt-3 p-4']")).getText();
		    
		    if(AllSchemesPage.contains(SchemeName))
		    
		    Thread.sleep(2000);
		    
		    WebElement AllSchemes = driver.findElement(By.xpath("//div[@class='row ng-star-inserted']"));
		    
		    String allSchemes = AllSchemes.getText();
		    
		    if(allSchemes.contains(SchemeName))
		    {
		    	System.out.println("Pass");
		    }
		    else 
		    {
				wUtil.takeScreenShot(driver, "a28_schemeBootstrapBtnDisablingAndCheckingSchemeIsEnabledInUserPannelErrorTest");
				Thread.sleep(2000);
			}
		    
		    try 
			{
		    	Thread.sleep(2000);
			} 
			finally 
			{
				driver.quit();
			}
		    	
		    
			
			
		}
		
		
		
		@Test(groups = "sprint-2", priority = 29)
		public void a29_schemeBootstrapBtnEnablingAndCheckingSchemeIsDisabledInUserPannelErrorTest() throws Exception
		{
			PropertyFileUtility pUtil = new PropertyFileUtility();
			String SchemeName = "Scheme"+jUtil.getHighestRandomNumber();
			
			String URL = pUtil.readDataFromPropertyFile("url");
			String USERNAME = pUtil.readDataFromPropertyFile("username");
		    String PASSWORD = pUtil.readDataFromPropertyFile("password");
			
		    WebDriverManager.chromedriver().setup();
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(URL);
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME);
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(PASSWORD);
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			
			Thread.sleep(10000);
	        
	        driver.findElement(By.xpath("//span[.='Schemes']")).click();
	        
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//a[.='Scheme List']")).click();
	        
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//h6[.='Add Scheme']")).click();
	        
	        Thread.sleep(2000);
	        
            driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys(SchemeName);
			
			Thread.sleep(2000);
			
            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CountryDrpDwn, 4);
			
            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
			
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			WebElement BootStrapBtn = driver.findElement(By.xpath("((//td[.='"+SchemeName+"']/..//td/button[.=' View ']/../following-sibling::td/button[.=' Info '])[1]/../following-sibling::td)[1]/following-sibling::td/button[.=' Edit ']/..//div[@class='mdc-switch__ripple']/following-sibling::div[@class='mdc-switch__icons']"));
			
			if(BootStrapBtn.isEnabled());
			{
				BootStrapBtn.click();
			}
			
			driver.get("http://stg.goldbox.gold/login");
			
			String MOBILENUMBER = pUtil.readDataFromPropertyFile("mobilenumber");
		    String OTP = pUtil.readDataFromPropertyFile("otp");
		    
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys(MOBILENUMBER , Keys.ENTER);
	        
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("(//input[@autocomplete='one-time-code'])[1]")).sendKeys(OTP);
		    
		    Thread.sleep(2000);
			
		    driver.findElement(By.xpath("//span[.='Schemes']")).click();
		    
		    Thread.sleep(2000);
		    
		    String AllSchemesPage = driver.findElement(By.xpath("//div[@class='card mt-3 p-4']")).getText();
		    
		    if(AllSchemesPage.contains(SchemeName))
		    
		    Thread.sleep(2000);
		    
		    WebElement AllSchemes = driver.findElement(By.xpath("//div[@class='row ng-star-inserted']"));
		    
		    String allSchemes = AllSchemes.getText();
		    
		    if(allSchemes.contains(SchemeName))
		    {
		    	wUtil.takeScreenShot(driver, "a29_schemeBootstrapBtnEnablingAndCheckingSchemeIsDisabledInUserPannelErrorTest");
		    	Thread.sleep(2000);
		    }
		    else 
		    {
		    	System.out.println("Fail");
			}
		    	
		    try 
			{
		    	Thread.sleep(2000);
			} 
			finally 
			{
				driver.quit();
			}
		    
		}
		
		
		@Test(groups = "sprint-2", priority = 30)
		public void a30_clickOnDashboardSchemePageShouldBeDisplayedErrorTest() throws Exception
		{
			String URL = pUtil.readDataFromPropertyFile("url");
			String USERNAME = pUtil.readDataFromPropertyFile("username");
		    String PASSWORD = pUtil.readDataFromPropertyFile("password");
		    
		    WebDriverManager.chromedriver().setup();
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(URL);
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME);
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(PASSWORD);
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			
			Thread.sleep(10000);
	        
            driver.findElement(By.xpath("//span[.='Users']")).click();
	        
	        Thread.sleep(2000);
	        
            driver.findElement(By.xpath("//a[.='Users List']")).click();
	        
	        Thread.sleep(2000);
			
	        driver.findElement(By.xpath("//span[.='Dashboard']")).click();
	        
	        Thread.sleep(2000);
	        
	        WebElement SchemesListElement = driver.findElement(By.xpath("//a[.='Scheme List']"));
	        
	        if(SchemesListElement.isDisplayed())
	        {
	        	System.out.println("Schemes List Element Page Displayed");
	        }
	        else
	        {
				wUtil.takeScreenShot(driver, "a30_clickOnDashboardSchemePageShouldBeDisplayedErrorTest");
			}
	        
	        try 
			{
	        	Thread.sleep(2000);
			} 
			finally 
			{
				driver.quit();
			}
	        
	        
		}
		
		
		@Test(groups = "sprint-2", priority = 31)
		public void a31_creatingSchemeWithoutGivingDataErrorTest() throws Exception
		{
			String URL = pUtil.readDataFromPropertyFile("url");
			String USERNAME = pUtil.readDataFromPropertyFile("username");
		    String PASSWORD = pUtil.readDataFromPropertyFile("password");
			
		    WebDriverManager.chromedriver().setup();
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(URL);
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME);
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(PASSWORD);
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(10000);
			
			DashboardPage dPage = new DashboardPage(driver);
			dPage.getSchemesDrpDwn().click();
		    
			Thread.sleep(2000);
			
			SchemesPage sPage = new SchemesPage(driver);
			sPage.getSchemesListLnk().click();
			
			Thread.sleep(2000);
			
			Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
			sslPage.getAddSchemeBtn().click();

			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			WebElement Error = driver.findElement(By.xpath("(//div[.=' Please Enter title '])[2]"));
			
			if (Error.isDisplayed()) 
			{
				wUtil.takeScreenShot(driver, "a31_creatingSchemeWithoutGivingDataErrorTest");
			}
			else 
			{
                System.out.println("Scheme Created Successfully");
			}
			
			try 
			{
				Thread.sleep(2000);
			} 
			finally 
			{
				driver.quit();
			}
			
		}
		
		
		@Test(groups = "sprint-2", priority = 32)
		public void a32_clickingOnPayNowBtnWithOutSelectingPaymentModeTest() throws Exception
		{			
		    WebDriverManager.chromedriver().setup();
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://stg.goldbox.gold/login");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("6309631698");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[.='Continue']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//input[@autocomplete='one-time-code'])[1]")).sendKeys("123456");
			
			Thread.sleep(10000);
	        
	        driver.findElement(By.xpath("//span[.='Schemes']")).click();
	        
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//button[.='Subscribe']")).click();
	        
	        Thread.sleep(3000);
            
        	WebElement SelectAmountDrpDwn = driver.findElement(By.xpath("//select[@id='amount']"));
	        
        	Select s = new Select(SelectAmountDrpDwn);
 		    s.selectByVisibleText("1000");
		    Thread.sleep(2000);
	        
			try 
			{
				WebElement LivePriceError = driver.findElement(By.xpath("(//div[.=' Gold live Price Issue '])[2]"));
				
				if(LivePriceError.isDisplayed())
				{
	 			   driver.quit(); 			   
				}
			} 
			catch (Exception e) 
			{
				Thread.sleep(1000);
			    
				WebElement MonthsDrpDwn = driver.findElement(By.xpath("//select[@formcontrolname='total_installments']"));
		        Select ss = new Select(MonthsDrpDwn);
		        ss.selectByVisibleText("12 Months");
		        
		        Thread.sleep(2000);
		        
		        wUtil.scrollPageDown(1);
		        
		        Thread.sleep(2000);
		        
		        WebElement TermsAndConditionsCheckBox = driver.findElement(By.xpath("//div[@class='form-group pt-2 d-block']/div/input[@type='checkbox']"));
		        TermsAndConditionsCheckBox.click();
		        
		        Thread.sleep(2000);
		        
		        driver.findElement(By.xpath("//button[text()=' Start Subscription ']")).click();
		        
		        Thread.sleep(2000);
		        
		        WebElement Frame = driver.findElement(By.xpath("//iframe[@class='razorpay-checkout-frame']"));
		        
		        driver.switchTo().frame(Frame);
		        Thread.sleep(2000);
				
		        driver.findElement(By.xpath("//input[@id='contact']")).sendKeys("6309631698",Keys.ENTER);
		        
		        Thread.sleep(2000);
		        
		        driver.findElement(By.xpath("//button[.='Pay Now']"));
		        
		        Thread.sleep(2000);
		        
				WebElement PayNowBtn = driver.findElement(By.xpath("//button[.='Pay Now']"));
				
				if (PayNowBtn.isDisplayed()) 
				{
					wUtil.takeScreenShot(driver, "a32_clickingOnPayNowBtnWithOutSelectingPaymentModeTest");
				}
				else  
				{
	                System.out.println("Scheme Created Successfully");
				}
				
			}
			
			try 
			{
				Thread.sleep(2000);
			} 
			finally 
			{
				driver.quit();
			}
			    
    		        
    				
	}
		
		@Test(groups = "sprint-2", priority = 33)
		public void a33_clickingOnUPIorQRAndClickOnUpiIdOrMobileNumberCheckBoxErrorTest() throws Exception
		{
			WebDriverManager.chromedriver().setup();
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://stg.goldbox.gold/login");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("6309631698");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[.='Continue']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//input[@autocomplete='one-time-code'])[1]")).sendKeys("123456");
			
			Thread.sleep(10000);
	        
	        driver.findElement(By.xpath("//span[.='Schemes']")).click();
	        
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//button[.='Subscribe']")).click();
	        
	        Thread.sleep(3000);
	        
	        WebElement SelectAmountDrpDwn = driver.findElement(By.xpath("//select[@id='amount']"));
	        
	        Select s = new Select(SelectAmountDrpDwn);
	        
	        s.selectByVisibleText("1000");
	        
	        Thread.sleep(2000);
	        
	        try 
	        {
	        	WebElement LivePriceError = driver.findElement(By.xpath("(//div[.=' Gold live Price Issue '])[2]"));
	    		if(LivePriceError.isDisplayed())
				{
	    			Thread.sleep(2000);
	    			driver.quit();
				}
	    		else 
	    		{
					Thread.sleep(100);
				}
			}
	        catch(Exception e)
	        {
				Thread.sleep(1000);
				WebElement MonthsDrpDwn = driver.findElement(By.xpath("//select[@formcontrolname='total_installments']"));
		        Select ss = new Select(MonthsDrpDwn);
		        ss.selectByVisibleText("12 Months");
		        
		        Thread.sleep(2000);
		        
		        wUtil.scrollPageDown(1);
		        
		        Thread.sleep(2000);
		        
		        WebElement TermsAndConditionsCheckBox = driver.findElement(By.xpath("//div[@class='form-group pt-2 d-block']/div/input[@type='checkbox']"));
		        TermsAndConditionsCheckBox.click();
		        
		        Thread.sleep(2000);
		        
		        driver.findElement(By.xpath("//button[text()=' Start Subscription ']")).click();
		        
		        Thread.sleep(2000);
		        
		        WebElement Frame = driver.findElement(By.xpath("//iframe[@class='razorpay-checkout-frame']"));
		        
		        driver.switchTo().frame(Frame);
		        Thread.sleep(2000);
				
		        driver.findElement(By.xpath("//input[@id='contact']")).sendKeys("6309631698",Keys.ENTER);
		        
		        Thread.sleep(2000);
		        
		        driver.findElement(By.xpath("//button[@method='upi']")).click();
		        
		        Thread.sleep(2000);
		      
		        driver.findElement(By.xpath("//div[text()='UPI ID/ Mobile Number']")).click();
		        
		        Thread.sleep(2000);
		        
		        driver.findElement(By.xpath("//button[.='Pay Now']")).click();
		        
		        Thread.sleep(2000);
		        
				WebElement UpiError = driver.findElement(By.xpath("//div[text()='Please enter a valid UPI ID/ Mobile Number']"));
				
				if (UpiError.isDisplayed()) 
				{
					wUtil.takeScreenShot(driver, "a33_clickingOnUPIorQRAndClickOnUpiIdOrMobileNumberCheckBoxErrorTest");
				}
				else  
				{
	                System.out.println("Pay Amount Page Moved To Next Page Successfully");
				}	
			}
	        try 
			{
				Thread.sleep(2000);
			} 
			finally 
			{
				driver.quit();
			}
    		        
		}
		
		@Test(groups = "sprint-2", priority = 34)
		public void a34_whileSubscribingSchemeClickOnTheFailureButtonInTheRazorPayPagePaymentShouldPassErrorTest() throws Exception
		{
			WebDriverManager.chromedriver().setup();
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://stg.goldbox.gold/login");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("6309631698");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[.='Continue']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//input[@autocomplete='one-time-code'])[1]")).sendKeys("123456");
			
			Thread.sleep(10000);
	        
	        driver.findElement(By.xpath("//span[.='Schemes']")).click();
	        
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//button[.='Subscribe']")).click();
	        
	        Thread.sleep(3000);
	        
	        WebElement SelectAmountDrpDwn = driver.findElement(By.xpath("//select[@id='amount']"));
	        
	        Thread.sleep(1000);
	        
	        Select s = new Select(SelectAmountDrpDwn);
	        
	        Thread.sleep(2000);
	        
	        s.selectByVisibleText("1000");
	        
	        Thread.sleep(2000);
	        
	        try 
	        {
	        	WebElement LivePriceError = driver.findElement(By.xpath("(//div[.=' Gold live Price Issue '])[2]"));
	    		if(LivePriceError.isDisplayed())
				{
	    			Thread.sleep(1000);
	    			driver.quit();
				}
	    		else 
	    		{
					Thread.sleep(100);
				}
			}
	        catch(Exception e)
	        {
				Thread.sleep(1000);
				WebElement MonthsDrpDwn = driver.findElement(By.xpath("//select[@formcontrolname='total_installments']"));
		        Select ss = new Select(MonthsDrpDwn);
		        ss.selectByVisibleText("12 Months");
		        
		        Thread.sleep(1000);
		        
		        wUtil.scrollPageDown(1);
		        
		        Thread.sleep(1000);
		        
		        WebElement TermsAndConditionsCheckBox = driver.findElement(By.xpath("//div[@class='form-group pt-2 d-block']/div/input[@type='checkbox']"));
		        TermsAndConditionsCheckBox.click();
		        
		        Thread.sleep(2000);
		        
		        driver.findElement(By.xpath("//button[text()=' Start Subscription ']")).click();
		        
		        Thread.sleep(2000);
		        
		        WebElement Frame = driver.findElement(By.xpath("//iframe[@class='razorpay-checkout-frame']"));
		        
		        driver.switchTo().frame(Frame);
		        Thread.sleep(2000);
				
		        driver.findElement(By.xpath("//input[@id='contact']")).sendKeys("6309631698",Keys.ENTER);
		        
		        Thread.sleep(2000);
		        
		        wUtil.scrollPageDown(1);
		        
		        Thread.sleep(1000);
		        
		        driver.findElement(By.xpath("//div[.='Netbanking']")).click();
		        
		        Thread.sleep(2000);
		        
		        driver.findElement(By.xpath("//div[.='ICICI']")).click();
		        
		        Thread.sleep(2000);
		        
		        String parentWindow = driver.getWindowHandle();
		        
		        driver.findElement(By.xpath("//button[.='Pay Now']")).click();
		        
		        Set<String> childWindow = driver.getWindowHandles();
		        
		        for(String childid : childWindow)
				{
					if(!childid.equals(parentWindow))
					{
						driver.switchTo().window(childid);
						driver.findElement(By.xpath("//button[.='Failure']")).click();
					}
				}
				
				Thread.sleep(2000);
				
				driver.switchTo().window(parentWindow);
				
				wUtil.takeScreenShot(driver, "a34_whileSubscribingSchemeClickOnTheFailureButtonInTheRazorPayPagePaymentShouldPassErrorTest");
		        
				Thread.sleep(2000);				
		        
	        }
	        
	        try 
			{
				Thread.sleep(2000);
			} 
			finally 
			{
				driver.quit();
			}
	        
		}
		
		
		@Test(groups = "sprint-2", priority = 35)
		public void a35_whileSubscribingSchemeClickOnTheSuccessButtonInTheRazorPayPagePaymentShouldFailErrorTest() throws Exception
		{
			WebDriverManager.chromedriver().setup();
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://stg.goldbox.gold/login");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("6309631698");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[.='Continue']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//input[@autocomplete='one-time-code'])[1]")).sendKeys("123456");
			
			Thread.sleep(10000);
	        
	        driver.findElement(By.xpath("//span[.='Schemes']")).click();
	        
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//button[.='Subscribe']")).click();
	        
	        Thread.sleep(3000);
	        
	        WebElement SelectAmountDrpDwn = driver.findElement(By.xpath("//select[@id='amount']"));
	        
	        Thread.sleep(1000);
	        
	        Select s = new Select(SelectAmountDrpDwn);
	        
	        Thread.sleep(2000);
	        
	        s.selectByVisibleText("1000");
	        
	        Thread.sleep(2000);
	        
	        try 
	        {
	        	WebElement LivePriceError = driver.findElement(By.xpath("(//div[.=' Gold live Price Issue '])[2]"));
	    		if(LivePriceError.isDisplayed())
				{
	    			Thread.sleep(1000);
	    			driver.quit();
				}
	    		else 
	    		{
					Thread.sleep(100);
				}
			}
	        catch(Exception e)
	        {
				Thread.sleep(1000);
				WebElement MonthsDrpDwn = driver.findElement(By.xpath("//select[@formcontrolname='total_installments']"));
		        Select ss = new Select(MonthsDrpDwn);
		        ss.selectByVisibleText("12 Months");
		        
		        Thread.sleep(1000);
		        
		        wUtil.scrollPageDown(1);
		        
		        Thread.sleep(1000);
		        
		        WebElement TermsAndConditionsCheckBox = driver.findElement(By.xpath("//div[@class='form-group pt-2 d-block']/div/input[@type='checkbox']"));
		        TermsAndConditionsCheckBox.click();
		        
		        Thread.sleep(2000);
		        
		        driver.findElement(By.xpath("//button[text()=' Start Subscription ']")).click();
		        
		        Thread.sleep(2000);
		        
		        WebElement Frame = driver.findElement(By.xpath("//iframe[@class='razorpay-checkout-frame']"));
		        
		        driver.switchTo().frame(Frame);
		        Thread.sleep(2000);
				
		        driver.findElement(By.xpath("//input[@id='contact']")).sendKeys("6309631698",Keys.ENTER);
		        
		        Thread.sleep(2000);
		        
		        wUtil.scrollPageDown(1);
		        
		        Thread.sleep(1000);
		        
		        driver.findElement(By.xpath("//div[.='Netbanking']")).click();
		        
		        Thread.sleep(2000);
		        
		        driver.findElement(By.xpath("//div[.='ICICI']")).click();
		        
		        Thread.sleep(2000);
		        
		        String parentWindow = driver.getWindowHandle();
		        
		        driver.findElement(By.xpath("//button[.='Pay Now']")).click();
		        
		        Set<String> childWindow = driver.getWindowHandles();
		        
		        for(String childid : childWindow)
				{
					if(!childid.equals(parentWindow))
					{
						driver.switchTo().window(childid);
						driver.findElement(By.xpath("//button[.='Success']")).click();
					}
				}
				
				Thread.sleep(2000);
				
				driver.switchTo().window(parentWindow);
				
				wUtil.takeScreenShot(driver, "a35_whileSubscribingSchemeClickOnTheSuccessButtonInTheRazorPayPagePaymentShouldFailErrorTest");
		        
				Thread.sleep(2000);				
		        
	        }
	        
	        try 
			{
				Thread.sleep(2000);
			} 
			finally 
			{
				driver.quit();
			}
	        
		}
		
		
		@Test(groups = "sprint-2", priority = 36)
		public void a36_loginWithoutByGiving10AlphabetsInMobileNumberTextFieldErrorTest() throws Exception
		{
			WebDriverManager.chromedriver().setup();
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://stg.goldbox.gold/login");
			driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
			Thread.sleep(1000);
			wUtil.takeScreenShot(driver, "a36_loginWithoutByGiving10AlphabetsInMobileNumberTextFieldErrorTest");
			Thread.sleep(2000);
//			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			try 
			{
				Thread.sleep(2000);
			} 
			finally 
			{
				driver.quit();
			}
			
		}
		
		@Test(groups = "sprint-2", priority = 37)
		public void a37_loginWithoutByGivingMoreThan10NumbersInMobileNumberInTextFieldErrorTest() throws IOException, InterruptedException
		{
			WebDriverManager.chromedriver().setup();
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://stg.goldbox.gold/login");
			driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("987654321987");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(1000);
			wUtil.takeScreenShot(driver, "a37_loginWithoutByGivingMoreThan10NumbersInMobileNumberInTextFieldErrorTest");
			
			try 
			{
				Thread.sleep(2000);
			} 
			finally 
			{
				driver.quit();
			}
		}
		
		@Test(groups = "sprint-2", priority = 38)
		public void a38_loginWithoutByGivingLessThan10NumbersInMobileNumberTextFieldErrorTest() throws IOException, InterruptedException
		{
			WebDriverManager.chromedriver().setup();
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://stg.goldbox.gold/login");
			driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("123456");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(1000);
			wUtil.takeScreenShot(driver, "a38_loginWithoutByGivingLessThan10NumbersInMobileNumberTextFieldErrorTest");
			
			try 
			{
				Thread.sleep(2000);
			} 
			finally 
			{
				driver.quit();
			}
		}
		
		
			@Test(groups = "sprint-2", priority = 39)
			public void a39_whileSubscribingSchemeClickOnTheStartSubscriptionButtonWithoutGivingAnyDetailsStaticErrorTest() throws Exception
			{
				WebDriverManager.chromedriver().setup();
				WebDriverManager.chromedriver().clearDriverCache().setup();
				WebDriverManager.chromedriver().clearResolutionCache().setup();
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("http://stg.goldbox.gold/login");
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("6309631698");
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//button[.='Continue']")).click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("(//input[@autocomplete='one-time-code'])[1]")).sendKeys("123456");
				
				Thread.sleep(10000);
		        
		        driver.findElement(By.xpath("//span[.='Schemes']")).click();
		        
		        Thread.sleep(2000);
		        
		        driver.findElement(By.xpath("//button[.='Subscribe']")).click();
		        
		        Thread.sleep(3000);
			    
		        try 
		        {
		        	driver.findElement(By.xpath("//button[text()=' Start Subscription ']")).click();
				} 
		        catch (Exception e) 
		        {
		        	Thread.sleep(1000);
				    
				    wUtil.takeScreenShot(driver, "a39_whileSubscribingSchemeClickOnTheStartSubscriptionButtonWithoutGivingAnyDetailsStaticErrorTest");
				    
				    Thread.sleep(1000);
				}
		        finally 
		        {
		        	Thread.sleep(1000);
		        	
					driver.quit();
				}
			    
			    
			
		}
			
			
			@Test(groups = "sprint-2",priority = 40)
			public void a40_actionInfoSchemeContentAddingByGivingValidDataAndClearingContentDataPassErrorTest() throws Exception
			{
				String SchemeName = "Scheme"+jUtil.getHighestRandomNumber();
				String Amt = "1000";
				String Content = "Content";
				
				String URL = pUtil.readDataFromPropertyFile("url");
				String USERNAME = pUtil.readDataFromPropertyFile("username");
			    String PASSWORD = pUtil.readDataFromPropertyFile("password");
				
			    WebDriverManager.chromedriver().setup();
				WebDriverManager.chromedriver().clearDriverCache().setup();
				WebDriverManager.chromedriver().clearResolutionCache().setup();
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get(URL);
				driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME);
				driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(PASSWORD);
				driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
				Thread.sleep(10000);
				
				DashboardPage dPage = new DashboardPage(driver);
				Thread.sleep(9000);
				dPage.getSchemesDrpDwn().click();
			    
				Thread.sleep(2000);
				
				SchemesPage sPage = new SchemesPage(driver);
				sPage.getSchemesListLnk().click();
				
				Thread.sleep(2000);
				
				Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
				sslPage.getAddSchemeBtn().click();
				
				driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys(SchemeName);
				
				Thread.sleep(2000);
				
	            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
				
				Thread.sleep(2000);
				
				wUtil.handleDropdownByIndex(CountryDrpDwn, 6);
				
	            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
				
				Thread.sleep(2000);
				
				wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
				
				Thread.sleep(4000);
				
				driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
				
				Thread.sleep(2000);
				
				WebElement TenureListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[1]"));
				TenureListInfoBtn.click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//input[@placeholder='Enter tenure in months']")).sendKeys("12");
				
	            Thread.sleep(2000);
				
				driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//button[.='Add']")).click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//div[.='Manage Tenures']//button[@aria-label='Close']")).click();
				
				Thread.sleep(2000);
				
				WebElement AmountListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]"));
				AmountListInfoBtn.click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//input[@placeholder='Enter Amount']")).sendKeys(Amt);
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//button[.='Add']")).click();
				
				Thread.sleep(2000);
				
				driver.navigate().refresh();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]")).click();
				
				Thread.sleep(2000);
				
				WebElement CloseBtnElement = driver.findElement(By.xpath("//h1[.='Manage Tenure Amount']/following-sibling::button[@aria-label='Close']"));
				CloseBtnElement.click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[3]")).click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//textarea[@formcontrolname='content']")).sendKeys(Content);
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//textarea[@formcontrolname='content']/../following-sibling::div/button[.='Add']")).click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//textarea[@formcontrolname='content']")).clear();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//b[.='Scheme Content']/../../following-sibling::form//button[.='Update']")).click();
				
	            Thread.sleep(2000);
				
	            WebElement SuccessElement = driver.findElement(By.xpath("(//div[.=' Scheme Content Details Updated Successfully '])[2]"));
				
				try 
				{
					if(SuccessElement.isDisplayed())
					{
						Thread.sleep(1000);
						wUtil.takeScreenShot(driver, "a40_actionInfoSchemeContentAddingByGivingValidDataAndClearingContentDataPassErrorTest");
						Thread.sleep(1000);
					}
				} 
				finally 
				{
					driver.quit();
				}
	            
			
			}
			
			
			@Test(groups = "sprint-2", priority = 41)
			public void a41_actionInfoSchemeTermsAndConditionsAddingByGivingValidDataAndClearingPassErrorTest() throws Exception
			{
				String SchemeName = "Scheme"+jUtil.getHighestRandomNumber();
				String Amt = "1000";
				String Content = "Content";
				
				String URL = pUtil.readDataFromPropertyFile("url");
				String USERNAME = pUtil.readDataFromPropertyFile("username");
			    String PASSWORD = pUtil.readDataFromPropertyFile("password");
				
			    WebDriverManager.chromedriver().setup();
				WebDriverManager.chromedriver().clearDriverCache().setup();
				WebDriverManager.chromedriver().clearResolutionCache().setup();
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get(URL);
				driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME);
				driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(PASSWORD);
				driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
				Thread.sleep(10000);
				
				DashboardPage dPage = new DashboardPage(driver);
				wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
				dPage.getSchemesDrpDwn().click();
			    
				Thread.sleep(2000);
				
				SchemesPage sPage = new SchemesPage(driver);
				sPage.getSchemesListLnk().click();
				
				Thread.sleep(2000);
				
				Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
				sslPage.getAddSchemeBtn().click();
				
				driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys(SchemeName);
				
				Thread.sleep(2000);
				
	            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
				
				Thread.sleep(2000);
				
				wUtil.handleDropdownByIndex(CountryDrpDwn, 6);
				
	            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
				
				Thread.sleep(2000);
				
				wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
				
				Thread.sleep(4000);
				
				driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
				
				Thread.sleep(2000);
				
				WebElement TenureListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[1]"));
				TenureListInfoBtn.click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//input[@placeholder='Enter tenure in months']")).sendKeys("12");
				
	            Thread.sleep(2000);
				
				driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//button[.='Add']")).click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//div[.='Manage Tenures']//button[@aria-label='Close']")).click();
				
				Thread.sleep(2000);
				
				WebElement AmountListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]"));
				AmountListInfoBtn.click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//input[@placeholder='Enter Amount']")).sendKeys(Amt);
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//button[.='Add']")).click();
				
				Thread.sleep(2000);
				
				driver.navigate().refresh();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]")).click();
				
				Thread.sleep(2000);
				
				WebElement CloseBtnElement = driver.findElement(By.xpath("//h1[.='Manage Tenure Amount']/following-sibling::button[@aria-label='Close']"));
				CloseBtnElement.click();
				
				driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[3]")).click();
							
	            Thread.sleep(2000);
				
				driver.findElement(By.xpath("//textarea[@formcontrolname='content']")).sendKeys(Content);
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//textarea[@formcontrolname='content']/../following-sibling::div/button[.='Add']")).click();
				
				Thread.sleep(5000);
				
			    driver.findElement(By.xpath("//textarea[@formcontrolname='tc']")).sendKeys("Terms and Conditions");
				
			    Thread.sleep(2000);
			    
			    driver.findElement(By.xpath("//textarea[@formcontrolname='tc']/../following-sibling::div/button[.='Add']")).click();
			    
			    Thread.sleep(2000);
			    
			    driver.findElement(By.xpath("//textarea[@formcontrolname='tc']")).clear();
			    
			    Thread.sleep(2000);
				
			    driver.findElement(By.xpath("//h4[.='Scheme Terms & Conditions']/../following-sibling::form//button[.='Update']")).click();
			  
			    
				WebElement SuccessElement = driver.findElement(By.xpath("(//div[.=' Scheme Tc Details Updated Successfully '])[2]"));
				
				Thread.sleep(1000);
				
				try 
				{
					if(SuccessElement.isDisplayed())
					{
						Thread.sleep(1000);
						wUtil.takeScreenShot(driver, "a41_actionInfoSchemeTermsAndConditionsAddingByGivingValidDataAndClearingPassErrorTest");
						Thread.sleep(2000);
					}
				} 
				finally 
				{
					driver.quit();
				}
				
			
			}
			
			
			@Test(groups = "sprint-2", priority = 42)
			public void a42_schemeCreatingByClearingAllSchemeDetailsPassErrorTest() throws Exception
			{
				String SchemeName = "Scheme"+jUtil.getHighestRandomNumber();
				
				String URL = pUtil.readDataFromPropertyFile("url");
				String USERNAME = pUtil.readDataFromPropertyFile("username");
			    String PASSWORD = pUtil.readDataFromPropertyFile("password");
			    
			    WebDriverManager.chromedriver().setup();
				WebDriverManager.chromedriver().clearDriverCache().setup();
				WebDriverManager.chromedriver().clearResolutionCache().setup();
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get(URL);
				driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME);
				driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(PASSWORD);
				driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
				Thread.sleep(10000);
				
				DashboardPage dPage = new DashboardPage(driver);
				wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
				dPage.getSchemesDrpDwn().click();
			    
				Thread.sleep(2000);
				
				SchemesPage sPage = new SchemesPage(driver);
				sPage.getSchemesListLnk().click();
				
				Thread.sleep(2000);
				
				Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
				sslPage.getAddSchemeBtn().click();            
				
				driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys(SchemeName);
				
				Thread.sleep(2000);
				
	            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
				
				Thread.sleep(2000);
				
				wUtil.handleDropdownByIndex(CountryDrpDwn, 4);
				
	            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
				
				Thread.sleep(2000);
				
				wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("((//td[.='"+SchemeName+"']/..//td/button[.=' View ']/../following-sibling::td/button[.=' Info '])[1]/../following-sibling::td)[1]/following-sibling::td/button[.=' Edit ']")).click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//h1[.='Edit Scheme']/../following-sibling::div//input[@placeholder='Enter Scheme Name']")).clear();
				
				Thread.sleep(2000);
				
				WebElement EditCountryDrpDwn = driver.findElement(By.xpath("//h1[.='Edit Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
				wUtil.handleDropdownByIndex(EditCountryDrpDwn, 0);
				Thread.sleep(2000);
				
				WebElement EditCalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Edit Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
				wUtil.handleDropdownByIndex(EditCalculationDrpDwn, 0);
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//h1[.='Edit Scheme']/../following-sibling::div//input[@formcontrolname='description']")).clear();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//h1[.='Edit Scheme']/../following-sibling::div//button[.='Update']")).click();
				
				Thread.sleep(2000);
				
				WebElement ErrorMsg = driver.findElement(By.xpath("(//div[.=' Please Enter Scheme Calculation Type '])[2]"));
				
				wUtil.waitForElementToBeVisible(driver, ErrorMsg);
				
				try 
				{
					if(ErrorMsg.isDisplayed())
					{
						Thread.sleep(1000);
						wUtil.takeScreenShot(driver, "a42_schemeCreatingByClearingAllSchemeDetailsPassErrorTest");
						Thread.sleep(2000);
					}
					else 
					{
						System.out.println("Scheme Added");
					}
				} 
				finally 
				{
					driver.quit();
				}
				
					
			}
			
			
			@Test(groups = "sprint-2")
			public void a43_actionInfoSchemeFeatureClearingAllDataClickOnUpdateBtnPassErrorTest() throws Exception
			{
				String SchemeName = "Scheme"+jUtil.getHighestRandomNumber();
				String Amt = "1000";
				String Content = "Content";
				String Feature = "Feature";
				String Explanation = "Explanation";
				
				String URL = pUtil.readDataFromPropertyFile("url");
				String USERNAME = pUtil.readDataFromPropertyFile("username");
			    String PASSWORD = pUtil.readDataFromPropertyFile("password");
				
			    WebDriverManager.chromedriver().setup();
				WebDriverManager.chromedriver().clearDriverCache().setup();
				WebDriverManager.chromedriver().clearResolutionCache().setup();
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get(URL);
				driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME);
				driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(PASSWORD);
				driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
				Thread.sleep(10000);
				
				DashboardPage dPage = new DashboardPage(driver);
				wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
				dPage.getSchemesDrpDwn().click();
			    
				Thread.sleep(2000);
				
				SchemesPage sPage = new SchemesPage(driver);
				sPage.getSchemesListLnk().click();
				
				Thread.sleep(2000);
				
				Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
				sslPage.getAddSchemeBtn().click();
				
				driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys(SchemeName);
				
				Thread.sleep(2000);
				
	            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
				
				Thread.sleep(2000);
				
				wUtil.handleDropdownByIndex(CountryDrpDwn, 6);
				
	            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
				
				Thread.sleep(2000);
				
				wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
				
				Thread.sleep(4000);
				
				driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[3]")).click();
							
	            Thread.sleep(2000);
			    
				wUtil.scrollPageDown(1);
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//h4[.='Schemes Features']/../following-sibling::div//h6[.='Add Feature']")).click();
				
	            Thread.sleep(2000);
				
	            Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFeaturePage ssasaPage = new Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFeaturePage(driver);
				ssasaPage.addFeature(Feature, Explanation);
	            
	            Thread.sleep(2000);
				
	            Scheme_SchemesList_ActionInfoBtn_SchemeInfoPage sslaisiPage = new Scheme_SchemesList_ActionInfoBtn_SchemeInfoPage(driver);
	            sslaisiPage.clickOnEditFeatureBtn(driver, Feature);
	            
	            Scheme_SchemesList_ActionInfoBtn_SchemeInfo_EditFeaturePage sslaisiefPage = new Scheme_SchemesList_ActionInfoBtn_SchemeInfo_EditFeaturePage(driver);
	            sslaisiefPage.clearingDataWhileEditingSchemeFeature();
				
                WebElement ErrorMsg = driver.findElement(By.xpath("(//div[.=' Scheme Features Details Updated Successfully '])[2]"));
				
				wUtil.waitForElementToBeVisible(driver, ErrorMsg);
	            			
				Thread.sleep(1000);
				
				try 
				{
					if(ErrorMsg.isDisplayed())
					{
						Thread.sleep(1000);
						wUtil.takeScreenShot(driver, "a43_actionInfoSchemeFeatureClearingAllDataClickOnUpdateBtnStaticErrorTest");
						Thread.sleep(2000);
					}
				} 
				finally 
				{
					driver.quit();
				}
			}
			
			
			@Test(groups = "sprint-2", priority = 44)
			public void a44_actionInfoSchemeFaqAddingByGivingValidDataAndRemovingWhileEditingPassErrorTest() throws Exception
			{
				String SchemeName = "Scheme"+jUtil.getHighestRandomNumber();
				String Amt = "1000";
				String Content = "Content";
				String FaqQuestion = "FaqQuestion";
				String FaqAnswer = "FaqAnswer";
				
				String URL = pUtil.readDataFromPropertyFile("url");
				String USERNAME = pUtil.readDataFromPropertyFile("username");
			    String PASSWORD = pUtil.readDataFromPropertyFile("password");
				
			    WebDriverManager.chromedriver().setup();
				WebDriverManager.chromedriver().clearDriverCache().setup();
				WebDriverManager.chromedriver().clearResolutionCache().setup();
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get(URL);
				driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME);
				driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(PASSWORD);
				driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
				Thread.sleep(10000);
				
				DashboardPage dPage = new DashboardPage(driver);
				wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
				dPage.getSchemesDrpDwn().click();
			    
				Thread.sleep(2000);
				
				SchemesPage sPage = new SchemesPage(driver);
				sPage.getSchemesListLnk().click();
				
				Thread.sleep(2000);
				
				Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
				sslPage.getAddSchemeBtn().click();
				
				driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys(SchemeName);
				
				Thread.sleep(2000);
				
	            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
				
				Thread.sleep(2000);
				
				wUtil.handleDropdownByIndex(CountryDrpDwn, 6);
				
	            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
				
				Thread.sleep(2000);
				
				wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
				
				Thread.sleep(4000);
				
				driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
				
				Thread.sleep(2000);
				
				WebElement TenureListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[1]"));
				TenureListInfoBtn.click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//input[@placeholder='Enter tenure in months']")).sendKeys("12");
				
	            Thread.sleep(2000);
				
				driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//button[.='Add']")).click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//div[.='Manage Tenures']//button[@aria-label='Close']")).click();
				
				Thread.sleep(2000);
				
				WebElement AmountListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]"));
				AmountListInfoBtn.click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//input[@placeholder='Enter Amount']")).sendKeys(Amt);
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//button[.='Add']")).click();
				
				Thread.sleep(2000);
				
				driver.navigate().refresh();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]")).click();
				
				Thread.sleep(2000);
				
				WebElement CloseBtnElement = driver.findElement(By.xpath("//h1[.='Manage Tenure Amount']/following-sibling::button[@aria-label='Close']"));
				CloseBtnElement.click();
				
				driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[3]")).click();
							
	            Thread.sleep(2000);
				
				driver.findElement(By.xpath("//textarea[@formcontrolname='content']")).sendKeys(Content);
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//textarea[@formcontrolname='content']/../following-sibling::div/button[.='Add']")).click();
				
				Thread.sleep(2000);
				
			    driver.findElement(By.xpath("//textarea[@formcontrolname='tc']")).sendKeys("Terms and Conditions");
				
			    Thread.sleep(2000);
				
				driver.findElement(By.xpath("//textarea[@formcontrolname='tc']/../following-sibling::div/button[.='Add']")).click();
				
				Thread.sleep(2000);
				
				wUtil.scrollPageDown(1);
				
				Thread.sleep(2000);
				
				Scheme_SchemesList_ActionInfoBtn_SchemeInfoPage ssasiPage = new Scheme_SchemesList_ActionInfoBtn_SchemeInfoPage(driver);
				
				ssasiPage.getAddFeatureBtn().click();
				
	            Thread.sleep(2000);
	              
	            Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFeaturePage ssasaFeaturePage = new Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFeaturePage(driver);
	            
	            ssasaFeaturePage.getEnterFeatureEdt().sendKeys("Feature");
	            
	            Thread.sleep(2000);
	            
	            ssasaFeaturePage.getEnterFeatureExplanationEdt().sendKeys("Explanation");
	            
	            Thread.sleep(2000);
	            
	            ssasaFeaturePage.getAddBtn().click();
	            
	            Thread.sleep(2000);
	            
	            ssasiPage.getAddFaqBtn().click();
	            
	            Thread.sleep(2000);
	            
	            Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFaqPage ssasaPage = new Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFaqPage(driver);
	            
				ssasaPage.addFaq(FaqQuestion, FaqAnswer);
							
				Thread.sleep(2000);
				
				ssasiPage.getFaqEditBtn().click();
				
				Thread.sleep(2000);
				
				Scheme_SchemesList_ActionInfoBtn_SchemeInfo_EditFaqPage ssasefPage = new Scheme_SchemesList_ActionInfoBtn_SchemeInfo_EditFaqPage(driver);
				ssasefPage.clearingDataWhileEditingSchemeFaq();
				
				WebElement SuccessElement = driver.findElement(By.xpath("(//div[.=' Scheme Faqs Details Updated Successfully '])[2]"));
				
				Thread.sleep(1000);
				
				try 
				{
					if(SuccessElement.isDisplayed())
					{
						Thread.sleep(1000);
						wUtil.takeScreenShot(driver, "a44_actionInfoSchemeFaqAddingByGivingValidDataAndRemovingWhileEditingStaticErrorTest");
						Thread.sleep(2000);
					}
				} 
				finally 
				{
					driver.quit();
				}
				
					
		}
			
	}

		
