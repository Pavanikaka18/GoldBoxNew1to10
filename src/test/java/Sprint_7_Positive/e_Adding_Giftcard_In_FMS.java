package Sprint_7_Positive;

import org.testng.annotations.Test;

import genericUtility.FMS_BaseClass;
import genericUtility.JavaUtility;
import objectRepository.DashboardPage;
import objectRepository.GiftCard_AddGiftCardPage;
import objectRepository.GiftCardsPage;
import objectRepository.GiftCards_AllGiftCardsPage;

public class e_Adding_Giftcard_In_FMS extends FMS_BaseClass {

	static JavaUtility jUtil = new JavaUtility();
	static int RanNum = jUtil.getRandomNum();
	public static String Amount = Integer.toString(RanNum);
	
	@Test
	public void a_addingGiftCardInFmsTest() throws Exception
	{
		
//		String Amount = Integer.toString(RanNum);
		System.out.println("1:"+Amount);
		
		String SecretKey = "JawyvLMBWlr7HflOw", Quantity = "1";
		
		Thread.sleep(20000);
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getGiftCardsDrpDwn().click();
		
		Thread.sleep(2000);
		GiftCardsPage gcPage = new GiftCardsPage(driver);
		gcPage.getAllGiftCardsLnk().click();
		
		GiftCards_AllGiftCardsPage gcagcPage = new GiftCards_AllGiftCardsPage(driver);
		
		Thread.sleep(2000);
		gcagcPage.getAddGiftCardBtn().click();
		
		Thread.sleep(2000);
		GiftCard_AddGiftCardPage gagcPage = new GiftCard_AddGiftCardPage(driver);
		gagcPage.addingGiftcard(Amount, SecretKey, Quantity);
		
		System.out.println("2:"+Amount);
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
	}
	
	
	
}