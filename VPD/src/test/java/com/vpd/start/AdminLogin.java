package com.vpd.start;

import org.testng.annotations.Test;

import com.vpd.Locators.BaseClass;
import com.vpd.utility.ExcelDataProvider;



	public class AdminLogin extends BaseClass {
		
		@Test
		public static void loginadminuser() throws Exception
		{
			logger=report.createTest("login to VPDADMIN");
			ExcelDataProvider.setExcelFile("Login");
			logger.info("Starting Application");
			setUp(ExcelDataProvider.getCellData(1,0),ExcelDataProvider.getCellData(1, 1));
			logger.pass("Login success");
			
			
		}
		

	}