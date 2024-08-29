package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZSchemes_SchemesListPage
{

	//Finding WebElements Using @FindBy Annotations
	
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement SchemeListSearchEdt;
	@FindBy(xpath ="//h6[.='Add Scheme']") private WebElement AddSchemeBtn;
	@FindBy(xpath ="(//button[.=' View '])[1]") private WebElement SchemeListViewBtn;
	@FindBy(xpath ="(//button[.=' Edit '])[1]") private WebElement SchemeListEditBtn;
	@FindBy(xpath ="(//button[.=' Info '])[1]") private WebElement TenureListInfoBtn;
	@FindBy(xpath ="(//button[.=' Info '])[2]") private WebElement AmountListInfoBtn;


	// Create a constructor to initilise these elements
    
	public ZSchemes_SchemesListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	// Provide getters to access these variables

	public WebElement getSchemeListViewBtn() {
		return SchemeListViewBtn;
	}

	public WebElement getSchemeListEditBtn() {
		return SchemeListEditBtn;
	}

	public WebElement getSchemeListSearchEdt() {
		return SchemeListSearchEdt;
	}

	public WebElement getAddSchemeBtn() {
		return AddSchemeBtn;
	}
	
	public WebElement getTenureListInfoBtn() {
		return TenureListInfoBtn;
	}

	public WebElement getAmountListInfoBtn() {
		return AmountListInfoBtn;
	}

	//Business Libraries
	
	public void ZSchemes_SchemesListPage() throws InterruptedException
	{

	Thread.sleep(2000);
	SchemeListSearchEdt.click();
	Thread.sleep(2000);
	AddSchemeBtn.click();
	Thread.sleep(2000);
	SchemeListViewBtn.click();
	Thread.sleep(2000);
	SchemeListEditBtn.click();
	Thread.sleep(2000);
	TenureListInfoBtn.click();
	Thread.sleep(2000);
	AmountListInfoBtn.click();
	Thread.sleep(2000);
	

	}
	
}