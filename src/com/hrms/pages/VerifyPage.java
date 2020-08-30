package com.hrms.pages;

import org.testng.Reporter;

import com.hrms.utils.BaseClass;

public class VerifyPage extends BaseClass{

//verify--Fun
public static void verifyTitle(String title) {
	//		Act.res		    compare	Exp.Result	
		if(driver.getTitle().equals(title)) {
			Reporter.log("Title Matched");
		}
	else {
		Reporter.log("Title Not Matched & expected title is :"+driver.getTitle());
	}
		
	}
}
