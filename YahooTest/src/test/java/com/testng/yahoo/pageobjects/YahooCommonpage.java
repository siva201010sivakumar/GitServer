package com.testng.yahoo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YahooCommonpage {
	
	
	protected WebDriver driver;
	
	public YahooCommonpage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void getPageTitle()
	{
		
		this.getPageTitle();
	}
	
	public void enterText(WebElement element,String input)
	{
		
		element.sendKeys(input);
	}
	

}
