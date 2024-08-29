package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TradingPage {

		//Finding WebElements by using @FindBy Annotation
		
		@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement SearchEdt;
		
		@FindBy(xpath ="//button[.='Export to Excel']") private WebElement ExportToExcelBtn;
		
		@FindBy(xpath ="//a[text()=' Next ']") private WebElement Nextlnk;
		
		@FindBy(xpath ="//span[text()=' Prev ']") private WebElement PrevLnk;
		
		@FindBy(xpath ="//input[@class='mdc-checkbox__native-control']") private WebElement CheckBoxBtn;
		
		//Create a constructor to initilise these elements
		
		public TradingPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		//Provide getters to access these variables
		
		public WebElement getSearchEdt() {
			return SearchEdt;
		}

		public WebElement getExportToExcelBtn() {
			return ExportToExcelBtn;
		}

		public WebElement getNextlnk() {
			return Nextlnk;
		}

		public WebElement getPrevLnk() {
			return PrevLnk;
		}

		public WebElement getCheckBoxBtn() {
			return CheckBoxBtn;
		}
		
		//Business Libraries
		
		public void TradingPage(WebDriver driver)throws InterruptedException
		{
			Thread.sleep(2000);
			SearchEdt.sendKeys(null);
			Thread.sleep(2000);
			ExportToExcelBtn.click();
			Thread.sleep(2000);
			Nextlnk.click();
			Thread.sleep(2000);
			PrevLnk.click();
			Thread.sleep(2000);
			CheckBoxBtn.click();
				
		}
	
}
