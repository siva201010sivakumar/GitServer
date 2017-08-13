package com.testng.yahoo.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

	
		public static WebDriver getBrowser(String bro)
		{
			if(bro.equalsIgnoreCase("chrome"))
			{
				
				System.setProperty("webdriver.chrome.driver", ".\\AllBrowsers\\chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
				return driver;
			}
			else if(bro.equalsIgnoreCase("firefox"))
			{
				
				System.setProperty("webdriver.gecko.driver", ".\\AllBrowsers\\geckodriver.exe");
				FirefoxDriver driver=new FirefoxDriver();
				return driver;
			}
			else 
				return null;
			
		}
}
