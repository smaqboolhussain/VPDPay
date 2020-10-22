package com.vpd.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class HelperClass {
	public static String captureScreenshot(WebDriver driver)
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String screenshotpath=System.getProperty("user.dir")+"/Screenshots/VPD_"+getCurrenDateTime()+".png";
		try 
		{
			FileHandler.copy(src, new File(screenshotpath));
			System.out.println("screenshot captured");
			
		}catch (IOException e) {
			System.out.println("unable to captured the screenshot"+e.getMessage());
		}
		return screenshotpath;
		
	}
       public static String getCurrenDateTime()
       {
    	   DateFormat customeFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
    	   Date currentDate = new Date();
    	   return customeFormat.format(currentDate);
      }
}
