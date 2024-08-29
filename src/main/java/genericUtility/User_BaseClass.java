package genericUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.LoginPage;

public class User_BaseClass {

	public JavaUtility jUtility=new JavaUtility();
	public WebDriverUtility wUtility=new WebDriverUtility();
	public ExcelFileUtility eUtility=new ExcelFileUtility();
	public PropertyFileUtility pUtility=new PropertyFileUtility();
	
	public WebDriver driver = null;
	public static WebDriver sDriver;
	
	    @BeforeSuite(alwaysRun = true)
		public void bsConfig()
		{
			System.out.println("---Database Connection Successfully---");
		}
		
	    @BeforeClass (groups={"sprint-1","Sprint-2"})
		public void bcConfig() throws Exception
		{  
			String BROWSER = pUtility.readDataFromPropertyFile("browser");
			String URL = pUtility.readDataFromPropertyFile("urll");
			
			if(BROWSER.equalsIgnoreCase("Chrome"))
			{
				ChromeOptions options=new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver(options);
				System.out.println("Chrome Browser Launched Successfully");
			}
			else if(BROWSER.equalsIgnoreCase("Firefox"))
			{
				FirefoxOptions options = new FirefoxOptions();

		        // Create a FirefoxProfile to manage preferences
		        FirefoxProfile profile = new FirefoxProfile();

		        // Set a preference to allow or deny location access (false to deny)
		        profile.setPreference("geo.prompt.testing", true);
		        profile.setPreference("geo.prompt.testing.allow", false);

		        // Assign the profile to the FirefoxOptions
		        options.setProfile(profile);

			    
			    WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver(options); 
				System.out.println("Firefox Browser Launched Successfully");
			}
			else if(BROWSER.equalsIgnoreCase("Edge"))
			{
				EdgeOptions options = new EdgeOptions();
		        options.addArguments("--disable-settings-window");
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver(options);
				System.out.println("Edge Browser Launched Successfully");
			}
			else 
			{
				System.out.println("Invalid Browser");
			}
			sDriver = driver;   //To Take ScreenShot
			wUtility.maximizeTheWindow(driver);
			wUtility.waitUntilPageLoad(driver);
			driver.get(URL);
		}
		
	@BeforeMethod(groups={"sprint-1","Sprint-2"})
		public void bmConfig() throws Exception, Exception
		{
		    String MOBILENUMBER = pUtility.readDataFromPropertyFile("mobileNumber");
		    String OTP = pUtility.readDataFromPropertyFile("otp");
		    
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys(MOBILENUMBER , Keys.ENTER);
	        
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("(//input[@autocomplete='one-time-code'])[1]")).sendKeys(OTP);
		    Thread.sleep(6000);
			System.out.println("---Login successfully---");
		}
        
	@AfterMethod(groups={"sprint-1","Sprint-2"})
		public void amConfig() throws Exception
		{
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//span[@title='Logout']")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//button[.='Ok']")).click();
		    Thread.sleep(3000);
		    System.out.println("Logout Successfully");
		}
        
	@AfterClass(groups={"sprint-1","Sprint-2"})
		public void acConfig() throws InterruptedException
		{
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			Thread.sleep(1000);
		}
		finally {
			driver.quit();
			System.out.println("Browser Closed Successfully");
		}
		}
        
	@AfterSuite(groups={"sprint-1","Sprint-2"})
		public void asConfig()
		{
		   System.out.println("---Database Closed Successful---");
		}
	
}
