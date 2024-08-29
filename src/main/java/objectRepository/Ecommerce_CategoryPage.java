package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Ecommerce_CategoryPage {

    @FindBy(xpath="//input[@placeholder='Search...']")private WebElement SearchEdt;
    
    @FindBy(xpath="//button[@data-bs-target='#addcategory']")private WebElement AddCategoryBtn;
    
    @FindBy(xpath="//td[.='bangle']/../td/button[.=' Edit ']")private WebElement ActionEditBtn;
    
    @FindBy(xpath="//td[.='Chains9723313']/../td//img[@class='table-img']/../following-sibling::td//button[.=' Edit ']/..//button[@class='mdc-switch mdc-switch--selected mdc-switch--checked']")private WebElement ActionEnableDisableBootStrapBtn;
    
    @FindBy(xpath="//td[.='Chains437288']/../td//img[@class='table-img']/../following-sibling::td//button[.=' Edit ']/..//button/../../../button[@class='btn-sm btn-edit bg-danger']")private WebElement ActionDeleteBtn;
    
    @FindBy(xpath="(//div[.=' Category Updated Successfully '])[2]")private WebElement UpdateMsg;
    
    @FindBy(xpath="(//div[.=' Successfully Deleted '])[2]")private WebElement DeleteMsg;
    
    @FindBy(xpath="//a[text()=' Next ']")private WebElement NextPageBtn;
    
    @FindBy(xpath="//span[text()=' Prev ']")private WebElement PrevPageBtn;
	 
    
	//Rule-3:Create a constructor to initilise these elements
    
	public Ecommerce_CategoryPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	//Rule-4:Provide getters to access these variables

	public WebElement getSearchEdt() {
		return SearchEdt;
	}


	public WebElement getAddCategoryBtn() {
		return AddCategoryBtn;
	}


	public WebElement getActionEditBtn() {
		return ActionEditBtn;
	}


	public WebElement getActionEnableDisableBootStrapBtn() {
		return ActionEnableDisableBootStrapBtn;
	}
    
	
	public WebElement getActionDeleteBtn() {
		return ActionDeleteBtn;
	}


	public WebElement getNextPageBtn() {
		return NextPageBtn;
	}


	public WebElement getPrevPageBtn() {
		return PrevPageBtn;
	}
	
	
	//Business Libraries
	
	public void clickOnParticularCategoryEditBtn(WebDriver driver, String CategoryName)
	{
		driver.findElement(By.xpath("//td[.='"+CategoryName+"']/../td/button[.=' Edit ']")).click();
	}
	
	public void clickOnParticularCategoryBootStrapBtnToDisableParticularCategory(WebDriver driver, String EditCategoryName) throws Exception
	{
		driver.findElement(By.xpath("//td[.='"+EditCategoryName+"']/../td//img[@class='table-img']/../following-sibling::td//button[.=' Edit ']/..//div[@class='mdc-switch__icons']")).click();
		Thread.sleep(2000);
		if(UpdateMsg.isDisplayed())
		{
			System.out.println("Category Disabled Successfully");
		}
		else
		{
			System.out.println("Category Not Disabled");
			Assert.fail();
		}
		Thread.sleep(3000);
	}
	
	public void clickOnParticularCategoryBootStrapBtnToEnableParticularCategory(WebDriver driver, String EditCategoryName) throws Exception
	{
		driver.findElement(By.xpath("//td[.='"+EditCategoryName+"']/../td//img[@class='table-img']/../following-sibling::td//button[.=' Edit ']/..//div[@class='mdc-switch__icons']")).click();
		Thread.sleep(2000);
		if(UpdateMsg.isDisplayed())
		{
			System.out.println("Category Enabled Successfully");
		}
		else
		{
			System.out.println("Category Not Enabled");
			Assert.fail();
		}
		Thread.sleep(3000);
	}
	
	public void clickOnParticularCategoryDeleteBtn(WebDriver driver, String EditCategoryName) throws Exception
	{
		driver.findElement(By.xpath("(//td[contains(.,'"+EditCategoryName+"')])[1]/../td//img[@class='table-img']/../following-sibling::td//button[.=' Edit ']/..//button/../../../button[@class='btn-sm btn-edit bg-danger']")).click();
		Thread.sleep(2000);
		if(DeleteMsg.isDisplayed())
		{
			System.out.println("Category Deleted Successfully");
		}
		else
		{
			System.out.println("Category Not Deleted");
		}
		Thread.sleep(3000);
	}
	
	
}
