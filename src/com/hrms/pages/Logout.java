package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utils.BaseClass;

public class Logout extends BaseClass{

//Objects 
	static By link_logout= By.linkText("Logout");

//fun
	public static void logout() throws Exception {
		driver.findElement(link_logout).click();
		Reporter.log("Logged out");
		Thread.sleep(3000);
	}
	
	
	
}
