package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Users_UserList_AllUsersPage {

	//Finding WebElements Using @FindBy Annotations

	@FindBy(xpath="//input[@placeholder='Search...']")private WebElement SearchEdt;
	
	//Based on user id it should perform action we have to make it dynamic use this xpath
	//td[.='3142']/following-sibling::td/button[.='View']
	@FindBy(xpath="(//button[.='View'])[1]")private WebElement RefferedUserViewBtn;
	
	//Based on user id it should perform action we have to make it dynamic use this xpath
	//td[.='3114']/following-sibling::td/button[.='Info']
    @FindBy(xpath="(//button[.='Info'])[1]")private WebElement InfoBtn;
    
    //Based on user id it should perform action we have to make it dynamic use this xpath
    //td[.='2556']/following-sibling::td/button[.='Info']/..//div[@class='mdc-switch__icons']
    @FindBy(xpath="//div[@class='mdc-switch__icons']")private WebElement EnableDisableBootStrapBtn;
    
    @FindBy(xpath="//a[text()=' Next ']")private WebElement NextPageBtn;
    
    @FindBy(xpath="//a[text()=' Prev ']")private WebElement PreviousPageBtn;
	
  
	//Rule-3:Create a constructor to initilise these elements
    
	public Users_UserList_AllUsersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Rule-4:Provide getters to access these variables

	public WebElement getSearchEdt() {
		return SearchEdt;
	}

	
	public WebElement getRefferedUserViewBtn() {
		return RefferedUserViewBtn;
	}

	
	public WebElement getInfoBtn() {
		return InfoBtn;
	}


	public WebElement getEnableDisableBootStrapBtn() {
		return EnableDisableBootStrapBtn;
	}


	public WebElement getNextPageBtn() {
		return NextPageBtn;
	}


	public WebElement getPreviousPageBtn() {
		return PreviousPageBtn;
	}

	
	//Business Libraries
	
	public void clickOnReferredUserViewBtn(WebDriver driver, String UserId) throws Exception
	{
		for(;;)
		{
			try {
				driver.findElement(By.xpath("//td[.='"+UserId+"']/following-sibling::td/button[.='View']")).click();
				break;
			} catch (Exception e) {
				NextPageBtn.click();
				Thread.sleep(3000);
			}
		}
	}
	
	
	public void clickOnActionsInfoBtn(WebDriver driver, String UserId) throws Exception
	{
		for(;;)
		{
			try {
				driver.findElement(By.xpath("//td[.='"+UserId+"']/following-sibling::td/button[.='Info']")).click();
				break;
			} catch (Exception e) {
				NextPageBtn.click();
				Thread.sleep(3000);
			}
		}
	}
	
	
	public void clickOnActionsBootStrapBtn(WebDriver driver, String UserId) throws Exception
	{
		for(;;)
		{
			try {
				driver.findElement(By.xpath("//td[.='"+UserId+"']/following-sibling::td/button[.='Info']/..//div[@class='mdc-switch__icons']")).click();
				break;
			} catch (Exception e) {
				NextPageBtn.click();
				Thread.sleep(3000);
			}
		}
		
	}
	
	//Based on user id it should perform action we have to make it dynamic by taking xpath
    //@FindBy(xpath="//td[.='2556']/following-sibling::td/button[.='Info']/..//div[@class='mdc-switch__ripple']")private WebElement EnableDisableBootStrapBtn ;
	
}
