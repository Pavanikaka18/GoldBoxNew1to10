package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Schemes_SchemeListPage {

	//Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//input[@placeholder='Search...']")private WebElement SearchEdt;
    
    @FindBy(xpath="//h6[text()='Add Scheme']")private WebElement AddSchemeBtn;
    
    @FindBy(xpath="//td[.='Festive Plan']/..//td/button[.=' View ']")private WebElement DescriptionViewBtn;
    
    @FindBy(xpath="(//td[.='Festive Plan']/..//td/button[.=' View ']/../following-sibling::td/button[.=' Info '])[1]")private WebElement TenureListInfoBtn;
    
    @FindBy(xpath="(//td[.='Festive Plan']/..//button[.=' Info '])[2]")private WebElement AmountListInfoBtn;
                   
    @FindBy(xpath="((//td[.='Abc3386710']/..//td/button[.=' View ']/../following-sibling::td/button[.=' Info '])[1]/../following-sibling::td)[1]/following-sibling::td/button[.=' Info ']")private WebElement ActionInfoBtn;
    
    @FindBy(xpath="((//td[.='Festive Plan']/..//td/button[.=' View ']/../following-sibling::td/button[.=' Info '])[1]/../following-sibling::td)[1]/following-sibling::td/button[.=' Edit ']")private WebElement ActionEdtBtn;
    
    @FindBy(xpath="((//td[.='abc3235464']/..//td/button[.=' View ']/../following-sibling::td/button[.=' Info '])[1]/../following-sibling::td)[1]/following-sibling::td/button[.=' Edit ']/..//div[@class='mdc-switch__ripple']/following-sibling::div[@class='mdc-switch__icons']")private WebElement SchemeEnableDisableBootstrapBtn;
    
    @FindBy(xpath="//a[text()=' Next ']")private WebElement NextPageBtn;
    
    @FindBy(xpath="//span[text()=' Prev ']")private WebElement PrevPageBtn;

    
	//Rule-3:Create a constructor to initilise these elements
    
	public Schemes_SchemeListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}    

	//Rule-4:Provide getters to access these variables

	public WebElement getSearchEdt() {
		return SearchEdt;
	}


	public WebElement getAddSchemeBtn() {
		return AddSchemeBtn;
	}


	public WebElement getDescriptionViewBtn() {
		return DescriptionViewBtn;
	}


	public WebElement getTenureListInfoBtn() {
		return TenureListInfoBtn;
	}


	public WebElement getAmountListInfoBtn() {
		return AmountListInfoBtn;
	}


	public WebElement getActionInfoBtn() {
		return ActionInfoBtn;
	}


	public WebElement getActionEdtBtn() {
		return ActionEdtBtn;
	}


	public WebElement getSchemeEnableDisableBootstrapBtn() {
		return SchemeEnableDisableBootstrapBtn;
	}

	public WebElement getNextPageBtn() {
		return NextPageBtn;
	}

	public WebElement getPrevPageBtn() {
		return PrevPageBtn;
	}
	
	
	//Business Libraries
    
	public void clickOnSchemeDescriptionViewBtn(WebDriver driver, String SchemeTitle) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[.='"+SchemeTitle+"']/..//td/button[.=' View ']")).click();
	}
	
	public void clickOnSchemeTenureInfoBtn(WebDriver driver, String SchemeTitle) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//td[.='"+SchemeTitle+"']/..//td/button[.=' View ']/../following-sibling::td/button[.=' Info '])[1]")).click();
	}
	
	public void clickOnSchemeEnableDisableBtn(WebDriver driver, String SchemeTitle) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//div[@class='mdc-switch__icons']")).click();
	}
	
	public void clickOnSchemeTenureAmountInfoBtn(WebDriver driver, String SchemeTitle) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//td[.='"+SchemeTitle+"']/..//button[.=' Info '])[2]")).click();	
	}
	
	public void clickOnParticularSchemeEditButton(WebDriver driver, String SchemeTitle) throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("((//td[.='"+SchemeTitle+"']/..//td/button[.=' View ']/../following-sibling::td/button[.=' Info '])[1]/../following-sibling::td)[1]/following-sibling::td/button[.=' Edit ']")).click();
	}
	
	public void clickOnActionInfoButton(WebDriver driver, String SchemeTitle) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("((//td[.='"+SchemeTitle+"']/..//td/button[.=' View ']/../following-sibling::td/button[.=' Info '])[1]/../following-sibling::td)[1]/following-sibling::td/button[.=' Info ']")).click();
	}
	
}
