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

public class Banners_SplashBanners_UpdateSplashBannersPage {

	// Rule-1 :-Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//h1[.='Update Banner']/../button[@class='btn-close']")private WebElement CloseBtn;
    
    @FindBy(xpath="//h1[.='Update Banner']/../..//input[@formcontrolname='fromdate']")private WebElement FromDateEdt;
    
    @FindBy(xpath="//h1[.='Update Banner']/../..//input[@formcontrolname='fromdate']/../..//input[@formcontrolname='todate']")private WebElement ToDateEdt;
	
    @FindBy(xpath="//h1[.='Update Banner']/../..//input[@formcontrolname='fromdate']/../..//input[@formcontrolname='todate']/../following-sibling::div//input[@formcontrolname='screen_uri']")private WebElement ChooseFileInput;
    
    @FindBy(xpath="//h1[.='Update Banner']/../..//input[@formcontrolname='fromdate']/../..//input[@formcontrolname='todate']/../following-sibling::div/input[@placeholder='Enter Sequence']")private WebElement SequenceEdt;
    
    @FindBy(xpath="//button[.='Update']")private WebElement UpdateBtn;
    
    
	//Rule-2:Create a constructor to initilise these elements
    
	public Banners_SplashBanners_UpdateSplashBannersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Rule-3:Provide getters to access these variables
    
	
	public WebElement getCloseBtn() {
		return CloseBtn;
	}

    
	public WebElement getFromDateEdt() {
		return FromDateEdt;
	}


	public WebElement getToDateEdt() {
		return ToDateEdt;
	}


	public WebElement getChooseFileInput() {
		return ChooseFileInput;
	}


	public WebElement getSequenceEdt() {
		return SequenceEdt;
	}


	public WebElement getUpdateBtn() {
		return UpdateBtn;
	}
	
	
    
	//Rule-4 :- Create Business Library
	
    public void updateSplashBanner(WebDriver driver, String EditFromDate, String EditToDate, String EditSequence) throws Exception
    {
    	WebDriverUtility wUtil = new WebDriverUtility();
    	String ImagePath = "C:\\Users\\Admin\\Pictures\\Saved Pictures\\Screenshot (34).png";
    	Robot r = new Robot();
    	
    	Thread.sleep(2000);
    	FromDateEdt.sendKeys(EditFromDate);
    	Thread.sleep(2000);
    	ToDateEdt.sendKeys(EditToDate);
    	Thread.sleep(2000);
        wUtil.clickOnChooseFileOption(driver, ChooseFileInput, ImagePath);
//		r.keyPress(KeyEvent.VK_CONTROL);
//	    Thread.sleep(2000);
//	    StringSelection ss = new StringSelection("C:\\Users\\vikra\\OneDrive\\Desktop\\One Drive Folder\\OneDrive\\Pictures\\Saved Pictures\\download.jpg");
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//	    r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_V);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_V);
//		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		SequenceEdt.clear();
		Thread.sleep(2000);
		SequenceEdt.sendKeys(EditSequence);
		Thread.sleep(2000);
		UpdateBtn.click();
    }
	
}
