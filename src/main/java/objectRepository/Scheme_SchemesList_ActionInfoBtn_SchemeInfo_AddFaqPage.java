package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFaqPage {

	    //Rule-1: Finding WebElements Using @FindBy Annotations
    
		@FindBy(xpath="//h1[.='Add FAQ']/following-sibling::button[@aria-label='Close']")private WebElement CloseBtn;
		
	    @FindBy(xpath="//h1[.='Add FAQ']/../following-sibling::div//input[@placeholder='Enter FAQ Question']")private WebElement EnterFaqQuestionEdt;
	    
	    @FindBy(xpath="//h1[.='Add FAQ']/../following-sibling::div//input[@placeholder='Enter FAQ Answer ']")private WebElement EnterFaqAnswerEdt ;
	    
	    @FindBy(xpath="//h1[.='Add FAQ']/../following-sibling::div//button[.='Add']")private WebElement AddBtn;
	    
	    
		//Rule-2:Create a constructor to initilise these elements
	    
		public Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFaqPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
	    
		
		//Rule-3:Provide getters to access these variables
	    
		public WebElement getCloseBtn() {
			return CloseBtn;
		}

        
		public WebElement getEnterFaqQuestionEdt() {
			return EnterFaqQuestionEdt;
		}


		public WebElement getEnterFaqAnswerEdt() {
			return EnterFaqAnswerEdt;
		}


		public WebElement getAddBtn() {
			return AddBtn;
		}

		
		//Rule-4: Business Libraries

		public void addFaq(String FaqQuestion, String FaqAnswer) throws Exception
		{
			Thread.sleep(2000);
			EnterFaqQuestionEdt.sendKeys(FaqQuestion);
			Thread.sleep(2000);
			EnterFaqAnswerEdt.sendKeys(FaqAnswer);
			Thread.sleep(2000);
			AddBtn.click();
			Thread.sleep(2000);
		}
}
