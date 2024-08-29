package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransactionsPage {

		// Rule-1 :-Finding WebElements Using @FindBy Annotations

		@FindBy(xpath ="//a[@class='btn btn-filter']") private WebElement FilterBtn;

		@FindBy(xpath="//input[@placeholder='Search...']")private WebElement SearchEdt;
	    
	    @FindBy(xpath="//button[.='Export to Excel']")private WebElement ExportToExcelBtn;
	    
	    @FindBy(xpath="//input[@type='checkbox']")private WebElement ShowAllCheckBox;
	    
	    @FindBy(xpath="//a[text()=' Next ']")private WebElement NextPageLnk;
	    
	    @FindBy(xpath="//span[text()=' Prev ']")private WebElement PreviousPageLnk;

		//Rule-2:Create a constructor to initilise these elements
	    
		public TransactionsPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
			
		//Rule-3:Provide getters to access these variables
	    
		public WebElement getSearchEdt() {
			return SearchEdt;
		}

		public WebElement getExportToExcelBtn() {
			return ExportToExcelBtn;
		}

		public WebElement getShowAllCheckBox() {
			return ShowAllCheckBox;
		}

		public WebElement getNextPageLnk() {
			return NextPageLnk;
		}

		public WebElement getPreviousPageLnk() {
			return PreviousPageLnk;
		}

	    public WebElement getFilterBtn() {
			return FilterBtn;
		}
			
		//Rule-4 :- Create Business Library
		
		public void TransactionsPagee(WebDriver driver , String SearchValue )throws InterruptedException
		{
			Thread.sleep(2000);
			FilterBtn.click();
			Thread.sleep(2000);
			SearchEdt.sendKeys(SearchValue);
			Thread.sleep(2000);
			ExportToExcelBtn.click();
			Thread.sleep(2000);
			ShowAllCheckBox.click();
			Thread.sleep(2000);
			NextPageLnk.click();
			Thread.sleep(2000);
			PreviousPageLnk.click();
			
		}
			
	
}
