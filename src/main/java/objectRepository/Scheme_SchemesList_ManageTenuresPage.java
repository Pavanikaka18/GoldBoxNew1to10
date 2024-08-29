package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scheme_SchemesList_ManageTenuresPage {

	//Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//input[@placeholder='Enter tenure in months']")private WebElement TenureMonthsEdt;
    
    @FindBy(xpath="//input[@placeholder='Enter tenure in months']/../../following-sibling::div//button[.='Add']")private WebElement AddBtn;
    
    @FindBy(xpath="//div[.='Manage Tenures']/button[@aria-label='Close']")private WebElement CloseBtn;
    
    
    //Below element have to make dynamic for particular tenure months delete
    
    @FindBy(xpath="//td[.='12']/..//button[@class='btn-sm btn-edit bg-danger mr-2']")private WebElement ActionDeleteBtn;
    
    @FindBy(xpath="//i[@class='fas fa-trash-alt']/../..//div[@class='mdc-switch__ripple']")private WebElement ActionEnableDisbleBtn;
    
  
	//Rule-3:Create a constructor to initilise these elements

	public Scheme_SchemesList_ManageTenuresPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Rule-4:Provide getters to access these variables

	public WebElement getTenureMonthsEdt() {
		return TenureMonthsEdt;
	}

	public WebElement getAddBtn() {
		return AddBtn;
	}

	public WebElement getCloseBtn() {
		return CloseBtn;
	}
	
	public WebElement getActionDeleteBtn() {
		return ActionDeleteBtn;
	}

	public WebElement getActionEnableDisbleBtn() {
		return ActionEnableDisbleBtn;
	}
	
	//Business Libraries
	
	public void addingTenure(String Months) throws Exception
	{
		Thread.sleep(2000);
		TenureMonthsEdt.sendKeys(Months);
		Thread.sleep(2000);
		AddBtn.click();
		Thread.sleep(2000);
		CloseBtn.click();
		Thread.sleep(2000);
	}
	
	public void deleteTenure(WebDriver driver, String Months) throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[.='"+Months+"']/..//button[@class='btn-sm btn-edit bg-danger mr-2']")).click();
		Thread.sleep(2000);
		TenureMonthsEdt.sendKeys(Months);
		Thread.sleep(2000);
		AddBtn.click();
		Thread.sleep(2000);
		CloseBtn.click();
		Thread.sleep(2000);
		
	}
	
	
	
	
}
