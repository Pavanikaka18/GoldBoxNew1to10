package sprint_1_Positive;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.FMS_BaseClass;
import genericUtility.PropertyFileUtility;
import genericUtility.User_BaseClass;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(genericUtility.ListnersImplementationClass.class)
public class aSprint_1_LoginAndLogout_Demo_FMS extends FMS_BaseClass {

	WebDriverUtility wUtil = new WebDriverUtility();
	
//	@Test
	public void loginLogoutTest() throws InterruptedException, IOException
	{
		PropertyFileUtility pUtil = new PropertyFileUtility();
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://stg-fms.goldbox.gold/signin");
		Thread.sleep(2000); // http://stg-fms-goldbox.goldsikka.com/dashboard
		driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(PASSWORD);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
		Thread.sleep(5000);
		WebElement UserProfile = driver.findElement(By.xpath("//span[@class='user-name']"));
		UserProfile.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Logout ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Yes, Logout!']")).click();
		driver.quit();
		
	}
	
	@Test(priority = 1, groups = "sprint-1")
	public void loginLogoutFmsTest()
	{
		
	}
	
}
