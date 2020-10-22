package com.vpd.utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.internal.TestResult;

import com.aventstack.extentreports.MediaEntityBuilder;

public class BrowserFactory {
	public static WebDriver startApplication(WebDriver driver,String browserName,String appURL)
	{
	//Browser Launch
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.geco.driver", "./Drivers/gecodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("IE"))
		{
			
		}
		else
		{
			System.out.println("Sorry, we do not support this browser");
		}
	
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
		
		
	}
	
	public static void quitBrowser(WebDriver driver)
	{
		driver.quit();
	}




}











