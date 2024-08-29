package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ecommerce_ProductsListPage {
    
	//Rule-1 :- Find Web-Elements using FindBy Annotations
	
    @FindBy(xpath="//input[@placeholder='Search...']")private WebElement SearchEdt;
    
    @FindBy(xpath="//button[@data-bs-target='#addproduct']")private WebElement AddProductBtn;
    
    @FindBy(xpath="(//button[.=' Info '])[1]")private WebElement WeightSizeInfoBtn;
    
    @FindBy(xpath="(//button[.=' View '])[1]")private WebElement StonesViewBtn;
    
    @FindBy(xpath="(//button[.=' View '])[2]")private WebElement DescriptionViewBtn;
    
    @FindBy(xpath="(//button[.=' Edit '])[1]")private WebElement ActionEditBtn;
    
    @FindBy(xpath="(//div[@class='mdc-switch__icons'])[1]")private WebElement ActionEnableDisableBootStrapBtn;
    
    @FindBy(xpath = "(//button[@class='btn-sm btn-edit bg-danger'])[1]")private WebElement DeleteBtn;
    
    @FindBy(xpath="//a[text()=' Next ']")private WebElement NextPageLnk;
    
    @FindBy(xpath="//span[text()=' Prev ']")private WebElement PreviousPageLnk;
	
  
	//Rule-3:Create a constructor to initilise these elements
    
	public Ecommerce_ProductsListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	//Rule-4 :- Provide getters to access these variables

	public WebElement getSearchEdt() {
		return SearchEdt;
	}


	public WebElement getAddProductBtn() {
		return AddProductBtn;
	}


	public WebElement getWeightSizeInfoBtn() {
		return WeightSizeInfoBtn;
	}


	public WebElement getStonesViewBtn() {
		return StonesViewBtn;
	}


	public WebElement getDescriptionViewBtn() {
		return DescriptionViewBtn;
	}


	public WebElement getActionEditBtn() {
		return ActionEditBtn;
	}

	
	public WebElement getDeleteBtn() {
		return DeleteBtn;
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
	
	public void clickOnParticularProductWeightInfoBtn(WebDriver driver, String ProductName)
	{
		WeightSizeInfoBtn.click();
	//	driver.findElement(By.xpath("(//td[.='"+ProductName+"']/following-sibling::td/button[.=' Info '])[1]")).click();
	}
	
	public void clickOnParticularProductStonesViewBtn(WebDriver driver, String ProductName)
	{
		StonesViewBtn.click();
	//	driver.findElement(By.xpath("((//td[.='"+ProductName+"']/following-sibling::td/button[.=' Info '])[1]/../following-sibling::td/button[.=' View '])[1]")).click();
	}
	
	public void clickOnParticularProductDescriptionViewBtn(WebDriver driver, String ProductName)
	{
		DescriptionViewBtn.click();
	//	driver.findElement(By.xpath("((//td[.='"+ProductName+"']/following-sibling::td/button[.=' Info '])[1]/../following-sibling::td/button[.=' View '])[1]/../following-sibling::td/button[.=' View ']")).click();
	}
	
	public void clickOnParticularProductActionEdtBtn(WebDriver driver, String ProductName)
	{
		ActionEditBtn.click();
	//	driver.findElement(By.xpath("((//td[.='"+ProductName+"']/following-sibling::td/button[.=' Info '])[1]/../following-sibling::td/button[.=' View '])[1]/../following-sibling::td/button[.=' View ']/../following-sibling::td/button")).click();
	}
	
	public void clickOnParticularProductBootStrapBtn(WebDriver driver, String EditProductName)
	{
		ActionEnableDisableBootStrapBtn.click();
	//	driver.findElement(By.xpath("((//td[.='"+EditProductName+"']/following-sibling::td/button[.=' Info '])[1]/../following-sibling::td/button[.=' View '])[1]/../following-sibling::td/button[.=' View ']/../following-sibling::td/button/..//div[@class='mdc-switch__icons']")).click();
	}
	
	public void clickOnParticularProductDeleteBtn(WebDriver driver, String ProductName)
	{
		DeleteBtn.click();
	//	driver.findElement(By.xpath("((//td[.='"+ProductName+"']/following-sibling::td/button[.=' Info '])[1]/../following-sibling::td/button[.=' View '])[1]/../following-sibling::td/button[.=' View ']/../following-sibling::td//button[@class='btn-sm btn-edit bg-danger']")).click();
	}
	
	
	
}
