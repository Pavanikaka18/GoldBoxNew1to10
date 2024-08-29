package Sprint_7_Positive;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass_Matrika;
import genericUtility.WebDriverUtility;

@Listeners(genericUtility.ListnersImplementationClass.class)
public class f_CheckingGiftCardInMatrika extends BaseClass_Matrika {

	WebDriverUtility wUtil = new WebDriverUtility();
	
	@Test
	public void b_checkingGiftCardInMatrikaTest()
	{
		String Amount = e_Adding_Giftcard_In_FMS.Amount;
		System.out.println("Adding Amount :"+Amount);
		WebElement GiftcardsEle = driver.findElement(By.xpath("//h2[.=' Giftcards ']"));
		wUtil.waitForElementToBeClickable(driver, GiftcardsEle);
		GiftcardsEle.click();
		List<WebElement> AllGiftCards = driver.findElements(By.xpath("//p[.='Gift Card']/following-sibling::div"));
		
		for(WebElement allGiftCards : AllGiftCards)
		{
			String Amountt = allGiftCards.getText();
			
			if(Amountt.contains(Amount))
			{
				System.out.println("Editing Amount :"+Amountt);
				System.out.println("Giftcard Added Successfully");
				break;
			}
		}
		
		
	}
	
}
