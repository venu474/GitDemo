package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utils.BaseClass;

public class Login extends BaseClass{

//Objects
	 static By txt_loginname = By.name("txtUserName"); //name of the web element 
	 static By txt_password = By.xpath("//input[@name='txtPassword']");
	 static By btn_login = By.name("Submit");

//Functions
	 public static void login(String userName, String password) throws Exception {
		//extend Login class from BaseClass to work with "driver" obj
		 driver.findElement(txt_loginname).sendKeys(userName);//this is because we have already written the By statement in order to work Objs and functions individually
		 driver.findElement(txt_password).sendKeys(password);
		 driver.findElement(btn_login).click();
		 Reporter.log("Login Completed");
		 Thread.sleep(4000);
	 }

}
