package com.vpd.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInLocators {

	
	public static WebElement SignIn(WebDriver driver)
    {
	WebElement SignIn = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-width-120 btn-lg']"));
	return SignIn;
    }
	public static WebElement UserName (WebDriver driver, String FieldName)
	{
		WebElement UserName = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]"));
	    return UserName;
	}
	public static WebElement Password (WebDriver driver, String FieldName)
	{
	WebElement Password = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]"));
    return Password;
}
	public static WebElement Loginbutton (WebDriver driver)
	{
	WebElement Loginbutton = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/input[3]"));
    return Loginbutton;
}

}

