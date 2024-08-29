package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EcommercePage {

	//Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//a[text()='Category']")private WebElement CategoryLnk;
    
    @FindBy(xpath="//a[text()='Sub Category']")private WebElement SubCategoryLnk;
    
    @FindBy(xpath="//a[text()='Products']")private WebElement ProductsLnk;
	
    @FindBy(xpath="//a[text()='Brands']")private WebElement BrandsLnk;
    
    @FindBy(xpath="//a[text()='Ecommerce Orders']")private WebElement EcommerceOrdersLnk;
    
    @FindBy(xpath="//a[.='Ecom-Transactions']")private WebElement EcomTransactionsLnk;
  
	//Rule-3:Create a constructor to initilise these elements
    
	public EcommercePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Rule-4:Provide getters to access these variables

	public WebElement getCategoryLnk() {
		return CategoryLnk;
	}

	public WebElement getSubCategoryLnk() {
		return SubCategoryLnk;
	}

	public WebElement getProductsLnk() {
		return ProductsLnk;
	}

	public WebElement getBrandsLnk() {
		return BrandsLnk;
	}

	public WebElement getEcommerceOrdersLnk() {
		return EcommerceOrdersLnk;
	}

	public WebElement getEcomTransactionsLnk() {
		return EcomTransactionsLnk;
	}
	
	
	
	//Business Libraries
	
	
	
}
