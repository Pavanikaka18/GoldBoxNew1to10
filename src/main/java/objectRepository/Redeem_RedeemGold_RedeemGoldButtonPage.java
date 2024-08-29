package objectRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Redeem_RedeemGold_RedeemGoldButtonPage {

	//Finding WebElements Using @FindBy Annotations
	
	  @FindBy(xpath ="//button[@aria-label='Close']") private WebElement CloseBtn;
	  
	  @FindBy(xpath ="//input[@placeholder='Enter Payment Id']") private WebElement PaymentIdEdt;
	  
	  @FindBy(xpath ="//input[@placeholder='Enter GST']") private WebElement GstEdt;
	   
	  @FindBy(xpath ="//button[.='Add Image']") private WebElement AddImageBtn;
	  	  
	  @FindBy(xpath ="//input[@class='enter-input']") private WebElement AddImageLnk;

      @FindBy(xpath ="//button[.='Upload']") private WebElement UploadBtn;
	  
	//Create a constructor to initilise these elements
	    
		public Redeem_RedeemGold_RedeemGoldButtonPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
		
	//Provide getters to access these variables
	  
		public WebElement getCloseBtn() {
			return CloseBtn;
		}

		public WebElement getPaymentIdEdt() {
			return PaymentIdEdt;
		}

		public WebElement getGstEdt() {
			return GstEdt;
		}

		public WebElement getAddImageLnk() {
			return AddImageLnk;
		}
		  
	    public WebElement getAddImageBtn() {
		return AddImageBtn;
     	}

		public WebElement getUploadBtn() {
			return UploadBtn;
		}

	//Business Libraries
		
	    public void Users_RedeemGoldUsersPage_m(WebDriver driver, String ImagePaths)throws InterruptedException
			{
				Thread.sleep(2000);
				CloseBtn.click();
				Thread.sleep(2000);
				PaymentIdEdt.click();
				Thread.sleep(2000);
				GstEdt.click();
				Thread.sleep(2000);
				AddImageBtn.click();
				Thread.sleep(2000);
				AddImageLnk.sendKeys(ImagePaths);
				Thread.sleep(2000);
				UploadBtn.click();
				
			} 
}