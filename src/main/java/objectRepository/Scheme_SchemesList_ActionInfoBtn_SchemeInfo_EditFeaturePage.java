package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scheme_SchemesList_ActionInfoBtn_SchemeInfo_EditFeaturePage {

	//Rule-1: Finding WebElements Using @FindBy Annotations
    
		@FindBy(xpath="//h1[.='Edit Feature']/following-sibling::button[@aria-label='Close']")private WebElement CloseBtn;
		
	    @FindBy(xpath="//h1[.='Edit Feature']/../following-sibling::div//input[@placeholder='Enter Feature']")private WebElement EnterFeatureEdt;
	    
	    @FindBy(xpath="//h1[.='Edit Feature']/../following-sibling::div//input[@placeholder='Enter Feature Explanation']")private WebElement EnterFeatureExplanationEdt ;
	    
	    @FindBy(xpath="//h1[.='Edit Feature']/../following-sibling::div//button[.='Update']")private WebElement UpdateBtn;
	    
	    
		//Rule-2:Create a constructor to initilise these elements
	    
		public Scheme_SchemesList_ActionInfoBtn_SchemeInfo_EditFeaturePage(WebDriver driver)
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


		public WebElement getUpdateBtn() {
			return UpdateBtn;
		}

		
		//Rule-4: Business Libraries
        
		public void editingSchemeFeature(String EditFeature, String EditExplanation) throws Exception
		{
			Thread.sleep(2000);
			EnterFeatureEdt.clear();
			Thread.sleep(2000);
			EnterFeatureEdt.sendKeys(EditFeature);
			Thread.sleep(2000);
			EnterFeatureExplanationEdt.clear();
			Thread.sleep(2000);
			EnterFeatureExplanationEdt.sendKeys(EditExplanation);
			Thread.sleep(2000);
			UpdateBtn.click();
			Thread.sleep(2000);
		}
		
		public void clearingDataWhileEditingSchemeFeature() throws Exception
		{
			Thread.sleep(2000);
			EnterFeatureEdt.clear();
			Thread.sleep(2000);
			EnterFeatureExplanationEdt.clear();
			Thread.sleep(2000);
			UpdateBtn.click();
			Thread.sleep(2000);
		}
	
}
