package com.vpd.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.vpd.Locators.AdminLogInpage;
import com.vpd.Locators.BaseClass;

public class AdminLogIn extends BaseClass { 
	WebDriver driver;
	
	@Test
public void loginApp()
{
	
		AdminLogInpage Loginpage=PageFactory.initElements(driver, AdminLogInpage.class);
		
		Loginpage.loginToAdmin("VPDADMIN", "Venkat@123");


}

}
