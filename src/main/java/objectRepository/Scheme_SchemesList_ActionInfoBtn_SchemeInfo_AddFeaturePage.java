package objectRepository;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFeaturePage {

	//Rule-1: Finding WebElements Using @FindBy Annotations
    
	@FindBy(xpath="//h1[.='Add Feature']/following-sibling::button[@aria-label='Close']")private WebElement CloseBtn;
	
    @FindBy(xpath="//h1[.='Add Feature']/../following-sibling::div//input[@placeholder='Enter Feature']")private WebElement EnterFeatureEdt;
    
    @FindBy(xpath="//h1[.='Add Feature']/../following-sibling::div//input[@placeholder='Enter Feature Explanation']")private WebElement EnterFeatureExplanationEdt ;
    
    @FindBy(xpath="//h1[.='Add Feature']/../following-sibling::div//button[.='Add']")private WebElement AddBtn;
    
    
	//Rule-2:Create a constructor to initilise these elements
    
	public Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFeaturePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    
	
	//Rule-3:Provide getters to access these variables
    
	public WebElement getCloseBtn() {
		return CloseBtn;
	}


	public WebElement getEnterFeatureEdt() {
		return EnterFeatureEdt;
	}


	public WebElement getEnterFeatureExplanationEdt() {
		return EnterFeatureExplanationEdt;
	}


	public WebElement getAddBtn() {
		return AddBtn;
	}

	
	//Rule-4: Business Libraries
	
	public void addFeature(String Feature, String Explanation) throws Exception
	{
		Thread.sleep(3000);
		EnterFeatureEdt.sendKeys(Feature);
		Thread.sleep(3000);
		EnterFeatureExplanationEdt.sendKeys(Explanation);
		Thread.sleep(3000);
		AddBtn.click();
		Thread.sleep(3000);
	}
}
