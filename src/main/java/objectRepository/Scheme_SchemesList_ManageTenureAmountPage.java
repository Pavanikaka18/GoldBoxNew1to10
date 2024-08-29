package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scheme_SchemesList_ManageTenureAmountPage {  

	//Rule-1 : Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//h1[.='Manage Tenure Amount']/following-sibling::button[@aria-label='Close']")private WebElement CloseBtn;
    
    @FindBy(xpath="//h1[.='Manage Tenure Amount']/../following-sibling::div//input[@placeholder='Enter Amount']")private WebElement EnterAmountEdt;
    
    @FindBy(xpath="//h1[.='Manage Tenure Amount']/../following-sibling::div//button[.='Add']")private WebElement AddBtn ;
    
    @FindBy(xpath="//th[.='Tenure in Amount']/../../following-sibling::tbody//td[.='1000']/..//div[@class='mdc-switch__icons']")private WebElement TenureAmountBootstrapBtn ;
    
    @FindBy(xpath="//th[.='Tenure in Amount']/../../following-sibling::tbody//td[.='1000']/..//button[@class='btn-sm btn-edit bg-danger mr-2']")private WebElement ActionDeleteBtn ;
  
    
	//Rule-2:Create a constructor to initilise these elements

	public Scheme_SchemesList_ManageTenureAmountPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Rule-3:Provide getters to access these variables

	public WebElement getCloseBtn() {
		return CloseBtn;
	}


	public WebElement getEnterAmountEdt() {
		return EnterAmountEdt;
	}


	public WebElement getAddBtn() {
		return AddBtn;
	}
	
	
	public WebElement getTenureAmountBootstrapBtn() {
		return TenureAmountBootstrapBtn;
	}


	public WebElement getActionDeleteBtn() {
		return ActionDeleteBtn;
	}
	
	//Business Libraries


	public void addAmount(String Amount) throws Exception
	{
		Thread.sleep(3000);
		EnterAmountEdt.sendKeys(Amount);
		Thread.sleep(3000);
		AddBtn.click();
		Thread.sleep(2000);
	}
	
	public void tenureAmountEnablingAndDisabling(WebDriver driver, String Amount) throws Exception
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//th[.='Tenure in Amount']/../../following-sibling::tbody//td[.='"+Amount+"']/..//div[@class='mdc-switch__icons']")).click();
		Thread.sleep(3000);
		TenureAmountBootstrapBtn.click();
		Thread.sleep(3000);
	}
	
	public void tenureAmountDeleting(WebDriver driver, String Amount) throws Exception
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//th[.='Tenure in Amount']/../../following-sibling::tbody//td[.='"+Amount+"']/..//button[@class='btn-sm btn-edit bg-danger mr-2']")).click();
		Thread.sleep(3000);
		EnterAmountEdt.sendKeys(Amount);
		Thread.sleep(3000);
		AddBtn.click();
		Thread.sleep(3000);
	}
	
	
}
