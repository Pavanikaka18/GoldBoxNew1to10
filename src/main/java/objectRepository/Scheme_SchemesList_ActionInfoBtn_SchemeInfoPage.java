package objectRepository;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scheme_SchemesList_ActionInfoBtn_SchemeInfoPage {

	//Rule-1 : Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//textarea[@formcontrolname='content']")private WebElement ContentEdt;
    
    @FindBy(xpath="//textarea[@formcontrolname='content']/../following-sibling::div/button[.='Add']")private WebElement ContentAddBtn;
    
    @FindBy(xpath="//textarea[@formcontrolname='tc']")private WebElement SchemeTermsAndConditionEdt ;
    
    @FindBy(xpath="//textarea[@formcontrolname='tc']/../following-sibling::div/button[.='Add']")private WebElement SchemeTermsAndConditionAddBtn ;
    
    @FindBy(xpath="//h4[.='Scheme Terms & Conditions']/../following-sibling::form//button[.='Update']")private WebElement SchemeTermsAndConditionUpdateBtn ;
    
    @FindBy(xpath="//h6[@data-bs-target='#addfeature']")private WebElement AddFeatureBtn;
    
    //th[.='Feature']/../../following-sibling::tbody//td[.='Feature']/following-sibling::td/button[.=' Edit ']
    @FindBy(xpath="(//div[@class='page-title'])[4]/../..//td[.='EditedFeature']/following-sibling::td/button[.=' Edit ']")private WebElement FeatureEditBtn;
    
    @FindBy(xpath="//th[.='Feature']/../../following-sibling::tbody//td[.='Feature']/following-sibling::td/button[.=' Delete ']")private WebElement FeatureDeleteBtn;
    
    @FindBy(xpath="//th[.='Feature']/../../../following-sibling::div//span[text()=' Prev ']")private WebElement FeaturePrevPageBtn;
    
    @FindBy(xpath="//th[.='Feature']/../../../following-sibling::div//span[text()=' Next ']")private WebElement FeatureNextPageBtn;
    
    @FindBy(xpath="//h6[@data-bs-target='#addfaq']")private WebElement AddFaqBtn;
    
    @FindBy(xpath="(//div[@class='page-title'])[5]/../following-sibling::div//th[.='Action']/../../following-sibling::tbody//button[.=' Edit ']")private WebElement FaqEditBtn;
    
    @FindBy(xpath="(//div[@class='page-title'])[5]/../following-sibling::div//th[.='Action']/../../following-sibling::tbody//button[.=' Delete ']")private WebElement FaqDeleteBtn;
    
    @FindBy(xpath="//th[.='Question']/../../../following-sibling::div//span[text()=' Prev ']")private WebElement FaqPrevPrevBtn;
    
    @FindBy(xpath="//th[.='Question']/../../../following-sibling::div//span[text()=' Next ']")private WebElement FaqNextPageBtn;
    
    
	//Rule-2:Create a constructor to initilise these elements

	public Scheme_SchemesList_ActionInfoBtn_SchemeInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Rule-3:Provide getters to access these variables

	public WebElement getContentEdt() {
		return ContentEdt;
	}


	public WebElement getContentAddBtn() {
		return ContentAddBtn;
	}


	public WebElement getSchemeTermsAndConditionEdt() {
		return SchemeTermsAndConditionEdt;
	}


	public WebElement getSchemeTermsAndConditionAddBtn() {
		return SchemeTermsAndConditionAddBtn;
	}
    
	
	public WebElement getSchemeTermsAndConditionUpdateBtn() {
		return SchemeTermsAndConditionUpdateBtn;
	}


	public WebElement getAddFeatureBtn() {
		return AddFeatureBtn;
	}


	public WebElement getFeatureEditBtn() {
		return FeatureEditBtn;
	}


	public WebElement getFeatureDeleteBtn() {
		return FeatureDeleteBtn;
	}


	public WebElement getFeaturePrevPageBtn() {
		return FeaturePrevPageBtn;
	}


	public WebElement getFeatureNextPageBtn() {
		return FeatureNextPageBtn;
	}


	public WebElement getAddFaqBtn() {
		return AddFaqBtn;
	}


	public WebElement getFaqEditBtn() {
		return FaqEditBtn;
	}


	public WebElement getFaqDeleteBtn() {
		return FaqDeleteBtn;
	}


	public WebElement getFaqPrevPrevBtn() {
		return FaqPrevPrevBtn;
	}


	public WebElement getFaqNextPageBtn() {
		return FaqNextPageBtn;
	}
	
	
	//Business Libraries
	
    public void addContent(String Content) throws Exception
    {
    	Thread.sleep(3000);
    	ContentEdt.sendKeys(Content);
    	Thread.sleep(3000);
    	ContentAddBtn.click();
    	Thread.sleep(3000);
    }
    
    public void clearAndAddContent(String Content) throws Exception
    {
    	Thread.sleep(2000);
    	ContentEdt.clear();
    	Thread.sleep(2000);
    	ContentEdt.sendKeys(Content);
    	Thread.sleep(2000);
    	ContentAddBtn.click();
    	Thread.sleep(2000);
    }
    
    public void addSchemeTermsAndConditions(WebDriver driver, String TermsAndConditions) throws Exception
    {
    	Thread.sleep(3000);
    	SchemeTermsAndConditionEdt.sendKeys(TermsAndConditions);
    	Thread.sleep(3000);
    	Robot r = new Robot();
    	r.keyPress(KeyEvent.VK_PAGE_DOWN);
    	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
    	Thread.sleep(2000);
    	SchemeTermsAndConditionAddBtn.click();
    	Thread.sleep(2000);
    }
    
    public void clearSchemeTermsAndConditions(WebDriver driver, String TermsAndConditions) throws Exception
    {
    	Thread.sleep(2000);
    	SchemeTermsAndConditionEdt.clear();
    	Thread.sleep(2000);
    	Robot r = new Robot();
    	r.keyPress(KeyEvent.VK_PAGE_DOWN);
    	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
    	Thread.sleep(2000);
    	SchemeTermsAndConditionUpdateBtn.click();
    	Thread.sleep(2000);
    }
    
    public void clearAndAddSchemeTermsAndConditions(WebDriver driver, String TermsAndConditions) throws Exception
    {
    	Thread.sleep(2000);
    	SchemeTermsAndConditionEdt.clear();
    	Thread.sleep(2000);
    	SchemeTermsAndConditionEdt.sendKeys(TermsAndConditions);
    	Thread.sleep(2000);
    	Robot r = new Robot();
    	r.keyPress(KeyEvent.VK_PAGE_DOWN);
    	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
    	Thread.sleep(2000);
    	SchemeTermsAndConditionAddBtn.click();
    	Thread.sleep(2000);
    }
    
    public void clickOnEditFeatureBtn(WebDriver driver, String Feature) throws InterruptedException
    {
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("(//div[@class='page-title'])[4]/../..//td[.='"+Feature+"']/following-sibling::td/button[.=' Edit ']")).click();
    }
    
    public void clickOnDeleteFeature(WebDriver driver, String EditFeature) throws Exception
    {
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("(//div[@class='page-title'])[4]/../..//td[.='"+EditFeature+"']/following-sibling::td/button[.=' Delete ']")).click();
    }
    
    public void clickOnEditFaqBtn(WebDriver driver, String EditFaqQuestion) throws Exception
    {
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("(//div[@class='page-title'])[5]/../following-sibling::div//td[.='"+EditFaqQuestion+"']/..//button[.=' Edit ']")).click();
    }
	
    public void clickOnDeleteFaqBtn(WebDriver driver, String EditFaqQuestion) throws Exception
    {
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("(//div[@class='page-title'])[5]/../following-sibling::div//td[.='"+EditFaqQuestion+"']/..//button[.=' Delete ']")).click();
    }
}
