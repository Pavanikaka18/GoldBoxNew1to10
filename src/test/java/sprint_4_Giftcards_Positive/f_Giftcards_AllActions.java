package sprint_4_Giftcards_Positive;

import org.testng.annotations.Test;

import genericUtility.FMS_BaseClass;
import objectRepository.DashboardPage;
import objectRepository.GiftCard_AddGiftCardPage;
import objectRepository.GiftCardsPage;
import objectRepository.GiftCards_AllGiftCardsPage;

public class f_Giftcards_AllActions extends FMS_BaseClass {

	@Test
	public void giftCardAllActionsTest() throws Exception
	{
		String SearchValue = "Xyz";
		String Amount = "200", SecretKey = "JawyvLMBWlr7HflOw", Quantity = "1";
		
		Thread.sleep(2000);
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getGiftCardsDrpDwn().click();
		
		Thread.sleep(2000);
		GiftCardsPage gcPage = new GiftCardsPage(driver);
		gcPage.getAllGiftCardsLnk().click();
		
		Thread.sleep(2000);
		GiftCards_AllGiftCardsPage gcagcPage = new GiftCards_AllGiftCardsPage(driver);
		gcagcPage.searchGiftCard(SearchValue);
		
		Thread.sleep(2000);
		gcagcPage.getAddGiftCardBtn().click();
		
		Thread.sleep(2000);
		GiftCard_AddGiftCardPage gagcPage = new GiftCard_AddGiftCardPage(driver);
		gagcPage.addingGiftcard(Amount, SecretKey, Quantity);
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		gcagcPage.getAddGiftCardBtn().click();
		
		Thread.sleep(2000);
		gagcPage.getCloseBtn().click();
		
		Thread.sleep(2000);
		gcagcPage.getBuyUsersBtn().click();
		
		Thread.sleep(2000);
		dbPage.getGiftCardsDrpDwn().click();
		
		Thread.sleep(2000);
		gcPage.getAllGiftCardsLnk().click();
		
    	Thread.sleep(2000);
    	gcagcPage.getGiftCardUsedUsersBtn().click();
    	
    	Thread.sleep(2000);
		gcPage.getAllGiftCardsLnk().click();
    	
		
		
	}
	
}
