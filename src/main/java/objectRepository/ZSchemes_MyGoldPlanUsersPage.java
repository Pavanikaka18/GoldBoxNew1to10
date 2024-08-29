package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZSchemes_MyGoldPlanUsersPage
{

	//Finding WebElements Using @FindBy Annotations
	
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement MyGoldPlanSearchEdt;
	@FindBy(xpath ="//button[.='All Users']") private WebElement AllUsersBtn;
	@FindBy(xpath ="//button[.='Daily Users']") private WebElement DailyUsersBtn;
	@FindBy(xpath ="//button[.='Weekly Users']") private WebElement WeeklyUsersBtn;
	@FindBy(xpath ="//button[.='Monthly Users']") private WebElement MonthlyUsersBtn;
	@FindBy(xpath ="(//button[.=' Info '])[1]") private WebElement InfoBtn;

	// Create a constructor to initilise these elements
    
	public ZSchemes_MyGoldPlanUsersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    
	// Provide getters to access these variables

	public WebElement getMyGoldPlanSearchEdt() {
		return MyGoldPlanSearchEdt;
	}

	public WebElement getAllUsersBtn() {
		return AllUsersBtn;
	}

	public WebElement getDailyUsersBtn() {
		return DailyUsersBtn;
	}

	public WebElement getWeeklyUsersBtn() {
		return WeeklyUsersBtn;
	}

	public WebElement getMonthlyUsersBtn() {
		return MonthlyUsersBtn;
	}

	public WebElement getInfoBtn() {
		return InfoBtn;
	}

	//Business Libraries
	
	public void ZSchemes() throws InterruptedException
	{

	Thread.sleep(2000);	
	MyGoldPlanSearchEdt.sendKeys(null);
	Thread.sleep(2000);
	AllUsersBtn.click();
	Thread.sleep(2000);	
	DailyUsersBtn.click();
	Thread.sleep(2000);	
	WeeklyUsersBtn.click();
	Thread.sleep(2000);	
	MonthlyUsersBtn.click();
	Thread.sleep(2000);	
	InfoBtn.click();
	Thread.sleep(2000);	
	
	}
	
}