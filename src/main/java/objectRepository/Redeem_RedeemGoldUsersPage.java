package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v116.v116CdpInfo;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Redeem_RedeemGoldUsersPage {
	
	//Finding WebElements Using @FindBy Annotations
	
		@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement SearchEdt;
		
		@FindBy(xpath ="//button[.='Export to Excel']") private WebElement ExportToExcelLnk;
		
		@FindBy(xpath ="//a[@id='filter_search']") private WebElement FilterBtn;
		
		@FindBy(xpath ="(//button[.='View'])[1]") private WebElement ViewBtn;
		
		@FindBy(xpath ="(//button[.='Redeem Gold'])[1]") private WebElement ReedemGoldBtn;
		
		@FindBy(xpath ="//a[text()=' Prev ']") private WebElement PrevBtn;
		
		@FindBy(xpath ="//a[text()=' Next ']") private WebElement NextBtn;
		
		@FindBy(xpath ="//input[@class='mdc-checkbox__native-control']") private WebElement ShowAllCheckBox;
		  
     //Create a constructor to initilise these elements
		    
			public Redeem_RedeemGoldUsersPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}

	 //Provide getters to access these variables

			public WebElement getSearchEdt() {
				return SearchEdt;
			}

			public WebElement getExportToExcelLnk() {
				return ExportToExcelLnk;
			}
			
			public WebElement getViewBtn() {
				return ViewBtn;
			}

			public WebElement getReedemGoldBtn() {
				return ReedemGoldBtn;
			}

			public WebElement getFilterBtn() {
				return FilterBtn;
			}

			public WebElement getPrevBtn() {
				return PrevBtn;
			}

			public WebElement getNextBtn() {
				return NextBtn;
			}

			public WebElement getShowAllCheckBox() {
				return ShowAllCheckBox;
			}

      //Business Libraries
			
			public void Users_RedeemGoldUsersPage_m(WebDriver driver)throws InterruptedException
			{
				Thread.sleep(2000);
				SearchEdt.click();
				Thread.sleep(2000);
				ExportToExcelLnk.click();
				Thread.sleep(2000);
				ViewBtn.click();
				Thread.sleep(2000);
				ReedemGoldBtn.click();
				Thread.sleep(2000);
				FilterBtn.click();
				Thread.sleep(2000);
				PrevBtn.click();
				Thread.sleep(2000);
				NextBtn.click();
				Thread.sleep(2000);
				ShowAllCheckBox.click();
			
			}
			
}