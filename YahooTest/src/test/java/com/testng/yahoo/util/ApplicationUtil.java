package com.testng.yahoo.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.testng.yahoo.pageobjects.YahooHomepage;

public class ApplicationUtil {
	
	
	public static YahooHomepage getUrl(WebDriver driver,String url)
	{
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(189, TimeUnit.SECONDS);
		return new PageFactory().initElements(driver, YahooHomepage.class);
		
		
		
	}

}
