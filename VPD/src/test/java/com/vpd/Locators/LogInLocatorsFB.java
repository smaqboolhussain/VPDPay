package com.vpd.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInLocatorsFB {
	
	//public static WebElement SignIn(WebDriver driver)
    //{
	//WebElement SignIn = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-width-120 btn-lg']"));
	//return SignIn;
    //}
	public static WebElement UserName (WebDriver driver, String FieldName)
	{
		WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
	    return UserName;
	}
	public static WebElement Password (WebDriver driver, String FieldName)
	{
	WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
    return Password;
    }
	public static WebElement Loginbutton (WebDriver driver)
	{
	WebElement Loginbutton = driver.findElement(By.xpath("//button[@id='u_0_i']"));
    return Loginbutton;
    }
}
