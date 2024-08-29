package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Users_UserKycPage {

	//Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//input[@placeholder='Search...']")private WebElement SearchEdt;
    
    //Here UserName is Going to make dynamic because based on username we are going to perform action
    //(//td[.='kondalu ra menu']/..//td/div/button[.='View'])[1]
    @FindBy(xpath="(//button[.='View'])[1]")private WebElement AadharImgViewBtn;
    
    //Here UserName is Going to make dynamic because based on username we are going to perform action
    //(//td[.='kondalu ra menu']/..//td/div/button[.='View'])[2]
    @FindBy(xpath="(//button[.='View'])[2]")private WebElement PanImgViewBtn;
    
    @FindBy(xpath="(//span[.='Inactive'])[1]")private WebElement StatusDrpDwn;
	
    @FindBy(xpath="//a[text()=' Next ']")private WebElement NextPageBtn;
    
    @FindBy(xpath="//a[text()=' Prev ']")private WebElement PreviousPageBtn;
    
	//Rule-3:Create a constructor to initilise these elements
    
	public Users_UserKycPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Rule-4:Provide getters to access these variables

	public WebElement getSearchEdt() {
		return SearchEdt;
	}

	public WebElement getAadharImgViewBtn() {
		return AadharImgViewBtn;
	}

	public WebElement getPanImgViewBtn() {
		return PanImgViewBtn;
	}

	public WebElement getStatusDrpDwn() {
		return StatusDrpDwn;
	}
	
	public WebElement getNextPageBtn() {
		return NextPageBtn;
	}

	public WebElement getPreviousPageBtn() {
		return PreviousPageBtn;
	}
    
	//Business Libraries
	
	
	//Here UserName is Going to make dynamic because based on username we are going to perform action
    // @FindBy(xpath="(//td[.='kondalu ra menu']/..//td/div/button[.='View'])[1]")private WebElement AadharImgViewBtn;
    
    // @FindBy(xpath="(//td[.='kondalu ra menu']/..//td/div/button[.='View'])[2]")private WebElement PanImgViewBtn;
    
    // @FindBy(xpath="(//td[.='kondalu ra menu']/..//td/div/button[.='View'])[1]/../../following-sibling::td//div[@class='mdc-switch__ripple']")private WebElement StatusBootStrapBtn;

	
	
}
