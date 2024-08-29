package objectRepository;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.WebDriverUtility;

public class Banners_MainBanners_AddMainBannersPage {

	//Rule-1 :- Finding WebElements Using @FindBy Annotations

	@FindBy(xpath="//h1[.='Add Main Banners']/following-sibling::button[@aria-label='Close']")private WebElement CloseBtn;
	
    @FindBy(xpath="//h1[.='Add Main Banners']/../following-sibling::div//input[@placeholder='Enter From Date']")private WebElement FromDateEdt;
    
    @FindBy(xpath="//h1[.='Add Main Banners']/../following-sibling::div//input[@placeholder='Enter TO Date']")private WebElement ToDateEdt;
    
    @FindBy(xpath="//h1[.='Add Main Banners']/../following-sibling::div//input[@formcontrolname='image_uri']")private WebElement UploadBannerImgEdt;
	
    @FindBy(xpath="//h1[.='Add Main Banners']/../following-sibling::div//input[@formcontrolname='image_uri']/../following-sibling::div/input[@formcontrolname='sequence']")private WebElement SequenceEdt;
    
    @FindBy(xpath="//button[.='Add']")private WebElement AddBtn;
    
  
  
	//Rule-2:- Create a constructor to initilise these elements
    
	public Banners_MainBanners_AddMainBannersPage(WebDriver driver)
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


	public WebElement getUploadBannerImgEdt() {
		return UploadBannerImgEdt;
	}



	public WebElement getSequenceEdt() {
		return SequenceEdt;
	}



	public WebElement getAddBtn() {
		return AddBtn;
	}
	

	// Rule-4 :- Create Business Library
	
	public void addingMainBanner(WebDriver driver, String FromDate, String ToDate, String Sequence) throws Exception
	{
		WebDriverUtility wUtil = new WebDriverUtility();
		String ImagePath = "C:\\Users\\Admin\\Pictures\\Saved Pictures\\Screenshot (34).png";
		Robot r = new Robot();
		
		Thread.sleep(2000);
		FromDateEdt.sendKeys(FromDate);
		Thread.sleep(2000);
		ToDateEdt.sendKeys(ToDate);
		Thread.sleep(2000);
		wUtil.clickOnChooseFileOption(driver, UploadBannerImgEdt, ImagePath);
//		r.keyPress(KeyEvent.VK_CONTROL);
//	    r.delay(2000);
//	    Thread.sleep(2000);
//	    StringSelection ss = new StringSelection("C:\\Users\\vikra\\OneDrive\\Desktop\\One Drive Folder\\OneDrive\\Pictures\\Saved Pictures\\Necklace.jpg");
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//	    r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_V);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_V);
//		r.keyPress(KeyEvent.VK_ENTER);
		
		SequenceEdt.sendKeys(Sequence);
		AddBtn.click();
	}
	
	
//	public void updateMainBanner(WebDriver driver) throws Exception
//	{
//        WebDriverUtility wUtil = new WebDriverUtility();
//		
//		Robot r = new Robot();
//		
//		FromDateEdt.sendKeys("16012024");
//		ToDateEdt.sendKeys("20012024");
//		
//		wUtil.clickOnChooseFileOption(driver, UploadBannerImgEdt);
//		
//		r.keyPress(KeyEvent.VK_CONTROL);
//	    r.delay(1000);
//	    StringSelection ss = new StringSelection("C:\\Users\\admin\\OneDrive\\Pictures\\bangles 1.jpg");
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//	    r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_V);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_V);
//		r.keyPress(KeyEvent.VK_ENTER);
//		
//		SequenceEdt.sendKeys("10");
//		AddBtn.click();
//	}
	
}
/*
 
            WebElement element = driver.findElement(By.xpath("//input[@type='file']"));
			
			WebDriverUtility wUtil = new WebDriverUtility();
			wUtil.clickOnChooseFileOption(driver, element);
			
	        r.keyPress(KeyEvent.VK_CONTROL);
	        r.delay(1000);
	        StringSelection ss = new StringSelection("C:\\Users\\admin\\Desktop\\Loyalty\\Images\\Images1");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			r.keyPress(KeyEvent.VK_ENTER);
			
			driver.findElement(By.xpath("//button[@type='submit']")).click(); 
  
 */
