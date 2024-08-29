package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_OtpListPage {
	
	//Finding WebElements by using @FindBy Annotation
	
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement SearchEdt;
	
	@FindBy(xpath ="//a[text()=' Next ']") private WebElement NextPageLnk;
	
	@FindBy(xpath ="//a[text()=' Prev ']") private WebElement PreviousPageLnk;
	
	//Create a constructor to initilise these elements
	
	public Settings_OtpListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Provide getters to access these variables
	
	public WebElement getSearchEdt() {
		return SearchEdt;
	}

	public WebElement getNextPageLnk() {
		return NextPageLnk;
	}

	public WebElement getPreviousPageLnk() {
		return PreviousPageLnk;
	}
	
	//Business Libraries
	
	public void Settings_OtpListPage_b(WebDriver driver)throws InterruptedException
	{
		Thread.sleep(2000);
		SearchEdt.click();
		Thread.sleep(2000);
		NextPageLnk.click();
		Thread.sleep(2000);
		PreviousPageLnk.click();
	}
}