package com.vpd.Locators;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.model.Log;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.vpd.utility.BrowserFactory;
import com.vpd.utility.ConfigDataProvider;
import com.vpd.utility.Constans;
import com.vpd.utility.ExcelDataProvider;
import com.vpd.utility.HelperClass;

public class BaseClass {
	
	public static WebDriver driver;
	public static ExcelDataProvider excel;
	public static ExtentReports report;
	public static ExtentTest logger;
	
	  public static WebDriver getDriverInstance() {  
		  return driver;
	  }
	  
      @BeforeSuite
      public void setUpSuite() {
    	  excel=new ExcelDataProvider();                                             //("./Reports/vpd_"+".html")
    	  ExtentHtmlReporter extent=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/VPD_"+HelperClass.getCurrenDateTime()+".html"));
    	  report=new ExtentReports();
    	  report.attachReporter(extent);
      }
	  
	  
	  
	  @BeforeTest
       public static WebDriver InitilizeBrowser12() {
    	   //String url = Constants>.URL;
    	   driver = BrowserFactory.startApplication(driver, "Chrome",Constans.URL);
    	   driver.manage().window().maximize();
    	   return driver;
       }
     public static void setUp(String p_UserName, String p_password) throws Exception 
     {
    	 Thread.sleep(5000);
    	 LogInLocators.SignIn(driver).click();
    	 Thread.sleep(5000);
    	 LogInLocators.UserName(driver, "username").sendKeys(p_UserName);
    	 Thread.sleep(5000);
    	 LogInLocators.Password(driver, "password").sendKeys(p_password);
    	 Thread.sleep(5000);
    	 LogInLocators.Loginbutton(driver).click();
    	 
     }
	
       
  
    @AfterTest
	public void teardown()
	{
		BrowserFactory.quitBrowser(driver);
	}

	@AfterMethod
	public void tearDownMethod(ITestResult result) throws IOException //ITestResult is suppate interface
	{
		if (result.getStatus()==ITestResult.FAILURE) 
		{
			
			logger.fail("Test Failed ", MediaEntityBuilder.createScreenCaptureFromPath(HelperClass.captureScreenshot(driver)).build());
			
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		
		{
			logger.pass("Test passed ", MediaEntityBuilder.createScreenCaptureFromPath(HelperClass.captureScreenshot(driver)).build());

		}
		
		report.flush();
	}
}
