package sprint_1_Positive;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.User_BaseClass;

@Listeners(genericUtility.UserListnersImplementationClass.class)
public class bSprint_1_LoginLogout_Demo_User extends User_BaseClass {

	@Test(priority = 2,groups = "sprint-1")
	public void loginLogoutUserTest()
	{
		
	}
	
}
