package com.testng.yahoo.YahooTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.ApplicationCache;
import com.testng.yahoo.pageobjects.YahooHomepage;
import com.testng.yahoo.util.ApplicationUtil;
import com.testng.yahoo.util.CommonUtil;
import com.testng.yahoo.util.OpenBrowser;

public class YahooTestRunner {

	@AfterSuite
	public void aftersuite()
	{
		System.out.println("Execution is ended");
	}
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Execution is started");
	}
	

	

	
	WebDriver driver;
	YahooHomepage yh;
	@Parameters({"browsername","appurl"})
	@BeforeMethod()
	public void preConditions(@Optional("Firefox")String bn,@Optional("https://in.yahoo.com/?p=us")String url)
	{
		//open the browser
		driver=OpenBrowser.getBrowser(bn);
	 	//open the url
		yh=ApplicationUtil.getUrl(driver, url);
		
	}
	
	@AfterMethod
	public void postConditions()
	{
		yh.closeBrowser();
	}
	
	
	@Test
	public void searchText() throws IOException
	{
		
	
		//get the expected value from yahoodata.properties file
		String expected_Value=CommonUtil.getpropertyValue("yahoodata", "expectedvalue");
		//get all values from the String[] array of table values
		String[] output=yh.SearchPattern(CommonUtil.getpropertyValue("yahoodata", "searchtext"));
		
		for(String compare:output)
		{
			if(compare.equalsIgnoreCase(expected_Value))
			{Assert.assertEquals(compare, expected_Value);}
		}
		
		
		
		
	}
	/*@Test
	public void searchText2() throws IOException
	{
		
	
		//get the expected value from yahoodata.properties file
		String expected_Value=CommonUtil.getpropertyValue("yahoodata", "expectedvalue");
		//get all values from the String[] array of table values
		String[] output=yh.SearchPattern(CommonUtil.getpropertyValue("yahoodata", "searchtext"));
		
		for(String compare:output)
		{
			if(compare.equalsIgnoreCase(expected_Value))
			{Assert.assertEquals(compare, expected_Value);}
		}
		
		
		
		
	}*/
	/*@Test
	
	public void searchText3() throws IOException
	{
		
	
		//get the expected value from yahoodata.properties file
		String expected_Value=CommonUtil.getpropertyValue("yahoodata", "expectedvalue");
		//get all values from the String[] array of table values
		String[] output=yh.SearchPattern(CommonUtil.getpropertyValue("yahoodata", "searchtext"));
		
		for(String compare:output)
		{
			if(compare.equalsIgnoreCase(expected_Value))
			{Assert.assertEquals(compare, expected_Value);}
		}
		
		
		
		
	}*/
	
}
