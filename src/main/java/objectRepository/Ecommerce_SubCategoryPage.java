package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Ecommerce_SubCategoryPage {

    @FindBy(xpath="//input[@placeholder='Search...']")private WebElement SearchEdt;
    
    @FindBy(xpath="//button[@data-bs-target='#addsubcat']")private WebElement AddSubCategoryBtn;
    
    @FindBy(xpath="//td[.='earrings']/following-sibling::td[.='a']/following-sibling::td[.='Gold']/following-sibling::td/button[.=' Edit ']")private WebElement ActionEditBtn;
    
    @FindBy(xpath="//td[.='bangle']/following-sibling::td[.='Rose Gold Bangle']/../td/button[.=' Edit ']/..//div[@class='mdc-switch__ripple']")private WebElement ActionEnableDisableBootStrapBtn;
    
    @FindBy(xpath ="//td[.='Gold Chains']/following-sibling::td[.='Gods Idol chains']/..//button[@class='btn-sm btn-edit bg-danger']")private WebElement DeleteBtn;
    
    @FindBy(xpath="(//div[.=' Sub Category Updated Successfully '])[2]")private WebElement UpdateMsg;
    
    @FindBy(xpath="(//div[.=' Successfully Deleted '])[2]")private WebElement DeleteMsg;
    
    @FindBy(xpath="//a[text()=' Next ']")private WebElement NextPageLnk;
    
    @FindBy(xpath="//span[text()=' Prev ']")private WebElement PreviousPageLnk;
	
  
	//Rule-3:Create a constructor to initilise these elements
    
	public Ecommerce_SubCategoryPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	//Rule-4:Provide getters to access these variables
	
	public WebElement getSearchEdt() {
		return SearchEdt;
	}


	public WebElement getAddSubCategoryBtn() {
		return AddSubCategoryBtn;
	}


	public WebElement getActionEditBtn() {
		return ActionEditBtn;
	}


	public WebElement getActionEnableDisableBootStrapBtn() {
		return ActionEnableDisableBootStrapBtn;
	}


	public WebElement getNextPageLnk() {
		return NextPageLnk;
	}


	public WebElement getPreviousPageLnk() {
		return PreviousPageLnk;
	}
	
	//Create Business Library
	
	public void clickOnParticularEditBtn(WebDriver driver, String CategoryName) throws Exception
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[.='"+CategoryName+"']/following-sibling::td/button[.=' Edit ']")).click();
	}
	
	public void clickOnParticularSubCategoryBootstrapBtnToDisableParticularSubCategory(WebDriver driver, String EditSubCategoryName) throws Exception
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[.='"+EditSubCategoryName+"']/following-sibling::td//div[@class='mdc-switch__icons']")).click();
		Thread.sleep(2000);
		if(UpdateMsg.isDisplayed())
		{
			System.out.println("SubCategory Disabled Successfully");
		}
		else
		{
			System.out.println("SubCategory Not Updated");
			Assert.fail();
		}
		Thread.sleep(3000);
	}
	
	public void clickOnParticularSubCategoryBootstrapBtnToEnableParticularSubCategory(WebDriver driver, String EditSubCategoryName) throws Exception
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[.='"+EditSubCategoryName+"']/following-sibling::td//div[@class='mdc-switch__icons']")).click();
		Thread.sleep(2000);
		if(UpdateMsg.isDisplayed())
		{
			System.out.println("SubCategory Enabled Successfully");
		}
		else
		{
			System.out.println("SubCategory Not Updated");
			Assert.fail();
		}
		Thread.sleep(3000);
	}
	
	public void clickOnParticularCategoryDeleteBtn(WebDriver driver, String CategoryName) throws Exception
	{
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//td[contains(.,'"+CategoryName+"')])[1]/following-sibling::td//button[@class='btn-sm btn-edit bg-danger']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//td/following-sibling::td//button[@class='btn-sm btn-edit bg-danger'])[1]")).click();
		Thread.sleep(2000);

		if(DeleteMsg.isDisplayed())
		{
			System.out.println("Category Deleted Successfully");
		}
		else
		{
			System.out.println("Category Not Deleted");
			Assert.fail();
		}
		Thread.sleep(3000);
	}
	public void clickOnParticularSubCategoryDeleteBtn(WebDriver driver, String SubCategoryName) throws Exception
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//td[contains(.,'"+SubCategoryName+"')])[1]/following-sibling::td//button[@class='btn-sm btn-edit bg-danger']")).click();
		Thread.sleep(2000);
		if(DeleteMsg.isDisplayed())
		{
			System.out.println("SubCategory Deleted Successfully");
		}
		else
		{
			System.out.println("SubCategory Not Deleted");
			Assert.fail();
		}
		Thread.sleep(3000);
	}
	
}
