package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Schemes_SchemeUsersPage {

	//Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//input[@placeholder='Search...']")private WebElement SearchEdt;
    
    @FindBy(xpath="//td[.='naresh']/following-sibling::td[.='GOLD PLUS PLAN']/following-sibling::td[.='12']/following-sibling::td[.='₹300.00']/following-sibling::td[.='₹24,000.00']/following-sibling::td[.='Jan 8, 2024'] /following-sibling::td/button[.=' Info ']")private WebElement ActionInfoBtn;
    
    @FindBy(xpath="//a[text()=' Next ']")private WebElement NextPageBtn;
    
    @FindBy(xpath="//span[text()=' Prev ']")private WebElement PrevPageBtn;
    
	//Rule-3:Create a constructor to initilise elements
    
	public Schemes_SchemeUsersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Rule-4:Provide getters to access these variables

	public WebElement getSearchEdt() {
		return SearchEdt;
	}

	public WebElement getActionInfoBtn() {
		return ActionInfoBtn;
	}

	public WebElement getNextPageBtn() {
		return NextPageBtn;
	}

	public WebElement getPrevPageBtn() {
		return PrevPageBtn;
	}
	
	//Create Business Libraries

}
