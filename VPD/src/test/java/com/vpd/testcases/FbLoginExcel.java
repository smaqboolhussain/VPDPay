package com.vpd.testcases;

import org.testng.annotations.Test;

import com.vpd.Locators.BaseClass;
import com.vpd.utility.ExcelDataProvider;

public class FbLoginExcel extends BaseClass { 


		@Test
		public static void loginApp() throws Exception 
		{
			Thread.sleep(5000);
			ExcelDataProvider.setExcelFile("Facebook");
			setUp(ExcelDataProvider.getCellData(1, 0),ExcelDataProvider.getCellData(1, 1));
			
			

 }
}
