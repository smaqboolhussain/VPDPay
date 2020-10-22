package com.vpd.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.vpd.Locators.BaseClass;
import com.vpd.Locators.LogInLocators;
import com.vpd.utility.ExcelDataProvider;


public class VpdLoginThrowExcel extends BaseClass {

	@Test
	public static void loginApp() throws Exception 
	{
		Thread.sleep(5000);
		ExcelDataProvider.setExcelFile("Login");
		setUp(ExcelDataProvider.getCellData(1, 0),ExcelDataProvider.getCellData(1, 1));
		
		
}
}
