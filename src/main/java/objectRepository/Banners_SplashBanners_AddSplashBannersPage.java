package objectRepository;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.WebDriverUtility;

public class Banners_SplashBanners_AddSplashBannersPage {

	//Rule-1 :- Finding WebElements Using @FindBy Annotations

		@FindBy(xpath="//h1[.='Add Splash Banners']/following-sibling::button[@aria-label='Close']")private WebElement CloseBtn;
		
	    @FindBy(xpath="//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='Enter From Date']")private WebElement FromDateEdt;
	    
	    @FindBy(xpath="//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='Enter TO Date']")private WebElement ToDateEdt;
	    
	    @FindBy(xpath="//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='Enter TO Date']/../following-sibling::div/input[@formcontrolname='screen_uri']")private WebElement BannerImgEdt;
		
	    @FindBy(xpath="//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='Enter TO Date']/../following-sibling::div/input[@formcontrolname='screen_uri']/../following-sibling::div/input[@formcontrolname='sequence']")private WebElement SequenceEdt;
	    
	    @FindBy(xpath="//button[.='Add']")private WebElement AddBtn;
	    
	  
	  
		//Rule-2:- Create a constructor to initilise these elements
	    
		public Banners_SplashBanners_AddSplashBannersPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		
		//Rule-3:- Provide getters to access these variables
	    
		public WebElement getCloseBtn() {
			return CloseBtn;
		}


		public WebElement getFromDateEdt() {
			return FromDateEdt;
		}


		public WebElement getToDateEdt() {
			return ToDateEdt;
		}


		public WebElement getBannerImgEdt() {
			return BannerImgEdt;
		}


		public WebElement getSequenceEdt() {
			return SequenceEdt;
		}


		public WebElement getAddBtn() {
			return AddBtn;
		}

		// Rule-4 :- Create Business Library
		
		public void addingSplashBanner(WebDriver driver, String FromDate, String ToDate, String Sequence) throws Exception
		{
			WebDriverUtility wUtil = new WebDriverUtility();
			String ImagePath = "C:\\Users\\Admin\\Pictures\\Saved Pictures\\Screenshot (34).png";
			Robot r = new Robot();
			
			Thread.sleep(2000);
			FromDateEdt.sendKeys(FromDate);
			Thread.sleep(2000);
			ToDateEdt.sendKeys(ToDate);
			Thread.sleep(2000);
			wUtil.clickOnChooseFileOption(driver, BannerImgEdt, ImagePath);
//			r.keyPress(KeyEvent.VK_CONTROL);
//			Thread.sleep(2000);
//		    StringSelection ss = new StringSelection("C:\\Users\\vikra\\OneDrive\\Desktop\\One Drive Folder\\OneDrive\\Pictures\\Saved Pictures\\Ringggggggggggg.png");
//	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//		    r.keyPress(KeyEvent.VK_CONTROL);
//			r.keyPress(KeyEvent.VK_V);
//			r.keyRelease(KeyEvent.VK_CONTROL);
//			r.keyRelease(KeyEvent.VK_V);
//			r.keyPress(KeyEvent.VK_ENTER);
			SequenceEdt.sendKeys(Sequence);
			AddBtn.click();
		}


		
	
}
