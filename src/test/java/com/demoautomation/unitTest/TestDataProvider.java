package com.demoautomation.unitTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demoautomation.factory.ConfigDataProvider;
import com.demoautomation.factory.DataProviderFactory;
import com.demoautomation.factory.ExcelDataProvider;

public class TestDataProvider 
{
	
	//@Test
	public void testExcel()
	{
		ExcelDataProvider excel=new ExcelDataProvider();
		String data=excel.getData("Login", 0, 0);
		Assert.assertEquals(data,"admin");
	}


	public void testConfig()
	{
		ConfigDataProvider config=new ConfigDataProvider();
		Assert.assertEquals(config.getData("Name"), "Selenium");
	}
	
	
	
	@Test
	public void testExcelNew()
	{
		Assert.assertEquals(DataProviderFactory.getExcel().getData("Login", 0, 0),"admin");
	}
	
	@Test
	public void testConfigNew()
	{
		Assert.assertEquals(DataProviderFactory.getConfig().getData("Name"), "Selenium");
	}

}
