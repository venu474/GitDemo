package com.hrms.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class BaseClass {
//1.WebDriver main object to be defined in this class.
//2. To get access for Web Driver main object, this class(BaseClass.java) to be inherited

//static-->No need to create object
public static WebDriver driver;

	public static void openApplcation() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venu\\Desktop\\TJobFormalities\\softwares\\selenium-java-3.141.59\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		//prints in html reports
		Reporter.log("Application opened...");
		System.out.println("Application got opened");
		System.out.println("Application got opened2");
		System.out.println("Application got opened3");
		System.out.println("Application got opened4");
		//ajgsaj
		System.out.println("I am trying to change from");
		System.out.println("GitDrmo/develop branch");
		System.out.println("But no change happened at GitX/master");
		
	}
	
	public static void closeApplicatin() {
		driver.close();
		Reporter.log("Application got Closed...");
		System.out.println("Application got closed");
		System.out.println("Application got closed2");
		System.out.println("Application got closed3");
		System.out.println("Application got closed4");
	}
	
}
