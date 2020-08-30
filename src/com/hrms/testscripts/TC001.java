package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.pages.Login;
import com.hrms.pages.Logout;
import com.hrms.pages.VerifyPage;
import com.hrms.utils.BaseClass;

public class TC001 {
//we are working with testNG not main()

@Test
public static void tc001() throws Exception{
	//Test case steps
	BaseClass.openApplcation();
	VerifyPage.verifyTitle("OrangeHRM");
	Login.login("admin", "admin");//bcz we added thread.sleep()
	VerifyPage.verifyTitle("OrangeHRM");
	Logout.logout();
	BaseClass.closeApplicatin();
}
	

}
