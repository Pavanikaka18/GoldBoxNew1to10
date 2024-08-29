package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateUserStatusPage {

	//Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//input[@formcontrolname='terminate_reason']")private WebElement ReasonEdt;
  
    @FindBy(xpath="//button[.='Submit']")private WebElement SubmitBtn;
    
    //@FindBy(xpath="(//div[.=' User Details Terminated Sucessfully '])[2]")private WebElement TerminateMsg;
    
    @FindBy(xpath="//div[@aria-label='User Details Terminated Sucessfully']")private WebElement TerminateMsg;
    
    
	//Rule-3:Create a constructor to initilise these elements
    
	public UpdateUserStatusPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Rule-4:Provide getters to access these variables
    
	public WebElement getReasonEdt() {
		return ReasonEdt;
	}
	
	public WebElement getSubmitBtn() {
		return SubmitBtn;
	}

	public WebElement getTerminateMsg() {
		return TerminateMsg;
	}
    
	//Business Libraries

	public void givingReason(String Reason) throws Exception
	{
		Thread.sleep(2000);
		ReasonEdt.sendKeys(Reason);
		Thread.sleep(2000);
		SubmitBtn.click();
		Thread.sleep(2000);
		if(TerminateMsg.isDisplayed())
		{
			System.out.println(TerminateMsg.getText());
		}
		else
		{
			System.out.println("User Not Terminated");
		}
		
	}
}
