package objectRepository;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;

public class Banners_EcomBanners_AddEcomBannersPage {

	//Rule-1 :- Finding WebElements Using @FindBy Annotations

	@FindBy(xpath="//h1[.='Add Splash Banners']/following-sibling::button[@aria-label='Close']")private WebElement CloseBtn;
	
    @FindBy(xpath="//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='Enter From Date']")private WebElement FromDateEdt;
    
    @FindBy(xpath="//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='Enter TO Date']")private WebElement ToDateEdt;
    
    @FindBy(xpath="//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='Enter TO Date']/../following-sibling::div/input[@formcontrolname='image_uri']")private WebElement BannerImgViewBtn;
	
    @FindBy(xpath="//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='Enter TO Date']/../following-sibling::div/input[@formcontrolname='image_uri']/../following-sibling::div/input[@formcontrolname='sequence']")private WebElement SequenceEdt;
    
    @FindBy(xpath="//button[.='Add']")private WebElement AddBtn;
    
  
    
	//Rule-2:- Create a constructor to initilise these elements
    
	public Banners_EcomBanners_AddEcomBannersPage(WebDriver driver)
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


	public WebElement getBannerImgViewBtn() {
		return BannerImgViewBtn;
	}



	public WebElement getSequenceEdt() {
		return SequenceEdt;
	}



	public WebElement getAddBtn() {
		return AddBtn;
	}
	

	// Rule-4 :- Create Business Library
	
	public void addingEcomBanner(WebDriver driver, String IssuedDate, String ExpireDate, String SequenceNo) throws Exception
	{
		WebDriverUtility wUtil = new WebDriverUtility();
		String ImagePath = "C:\\Users\\Admin\\Pictures\\Saved Pictures\\Screenshot (34).png"
				+ "";
		
		Robot r = new Robot();
		
		FromDateEdt.sendKeys(IssuedDate);
		Thread.sleep(2000);
		ToDateEdt.sendKeys(ExpireDate);
		Thread.sleep(2000);
		wUtil.clickOnChooseFileOption(driver, BannerImgViewBtn, ImagePath);
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_CONTROL);
//	    r.delay(1000);
//	    StringSelection ss = new StringSelection("C:\\Users\\vikra\\OneDrive\\Desktop\\One Drive Folder\\OneDrive\\Pictures\\Saved Pictures\\download.jpg");
//      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//	    r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_V);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_V);
//		r.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		SequenceEdt.sendKeys(SequenceNo);
		Thread.sleep(2000);
		AddBtn.click();
		
	}
	
}
/*
 
 
  
 */
