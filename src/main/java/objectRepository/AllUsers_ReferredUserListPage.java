package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllUsers_ReferredUserListPage {

	    //Finding WebElements Using @FindBy Annotations

		@FindBy(xpath="//input[@placeholder='Search...']")private WebElement SearchEdt;
		
		
		//Rule-3:Create a constructor to initilise these elements
	    
		public AllUsers_ReferredUserListPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		//Rule-4:Provide getters to access these variables

		public WebElement getSearchEdt() {
			return SearchEdt;
		}

		
		//Business Libraries

	
}
