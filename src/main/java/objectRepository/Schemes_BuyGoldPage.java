package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Schemes_BuyGoldPage {

	//Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//input[@placeholder='Search...']")private WebElement SearchEdt;
    
    @FindBy(xpath="//button[.='Add Content']")private WebElement AddContentBtn;
    
    @FindBy(xpath="((//td[.='Features']/following-sibling::td/button)[1]")private WebElement ContentViewBtn;
    
    @FindBy(xpath="((//td[.='Features']/following-sibling::td/button)[1]/../following-sibling::td/button)[1]")private WebElement ExplanationViewBtn;
    
    @FindBy(xpath="((//td[.='Features']/following-sibling::td/button)[1]/../following-sibling::td/button)[1]/../following-sibling::td/button[.=' Edit ']")private WebElement ActionEditBtn;
    
    @FindBy(xpath="((//td[.='Features']/following-sibling::td/button)[1]/../following-sibling::td/button)[1]/../following-sibling::td/button[.=' Edit ']/..//div[@class='mdc-switch__ripple']")private WebElement ActionEnableDisableBootstrapBtn;
    
    @FindBy(xpath="//a[text()=' Next ']")private WebElement NextPageLnk;
    
    @FindBy(xpath="//a[text()=' Prev ']")private WebElement PreviousPageLnk;
    
    
	//Rule-3:Create a constructor to initilise these elements
    
	public Schemes_BuyGoldPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    

	//Rule-4:Provide getters to access these variables

	public WebElement getSearchEdt() {
		return SearchEdt;
	}


	public WebElement getAddContentBtn() {
		return AddContentBtn;
	}


	public WebElement getContentViewBtn() {
		return ContentViewBtn;
	}


	public WebElement getExplanationViewBtn() {
		return ExplanationViewBtn;
	}


	public WebElement getActionEditBtn() {
		return ActionEditBtn;
	}


	public WebElement getActionEnableDisableBootstrapBtn() {
		return ActionEnableDisableBootstrapBtn;
	}


	public WebElement getNextPageLnk() {
		return NextPageLnk;
	}


	public WebElement getPreviousPageLnk() {
		return PreviousPageLnk;
	}    
	
	//Business Libraries
	
}
