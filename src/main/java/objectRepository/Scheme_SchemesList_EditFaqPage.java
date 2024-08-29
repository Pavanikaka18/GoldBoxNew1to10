package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scheme_SchemesList_EditFaqPage {

	//Rule-1: Finding WebElements Using @FindBy Annotations
    
    @FindBy(xpath="//h1[.='Edit FAQ']/following-sibling::button[@aria-label='Close']")private WebElement CloseBtn;
			
    @FindBy(xpath="//h1[.='Edit FAQ']/../following-sibling::div//input[@placeholder='Enter FAQ Question']")private WebElement EnterFaqQuestionEdt;
		    
    @FindBy(xpath="//h1[.='Edit FAQ']/../following-sibling::div//input[@placeholder='Enter FAQ Answer ']")private WebElement EnterFaqAnswerEdt ;
		    
    @FindBy(xpath="//h1[.='Edit FAQ']/../following-sibling::div//button[.='Update']")private WebElement UpdateBtn;
		    
		    
    //Rule-2:Create a constructor to initilise these elements
		    
	public Scheme_SchemesList_EditFaqPage(WebDriver driver)
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


	public WebElement getUpdateBtn() {
		return UpdateBtn;
	}

			
	//Rule-4: Business Libraries

	public void editFaq(String EditFaqQuestion, String EditFaqAnswer) throws Exception
	{
		Thread.sleep(2000);
		EnterFaqQuestionEdt.clear();
		Thread.sleep(2000);
		EnterFaqQuestionEdt.sendKeys(EditFaqQuestion);
		Thread.sleep(2000);
		EnterFaqAnswerEdt.clear();
		Thread.sleep(2000);
		EnterFaqAnswerEdt.sendKeys(EditFaqAnswer);
		Thread.sleep(2000);
		UpdateBtn.click();
		Thread.sleep(2000);
	}
	
}
