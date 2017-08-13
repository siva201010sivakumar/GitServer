package com.testng.yahoo.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YahooHomepage extends YahooCommonpage {

	public YahooHomepage(WebDriver driver) {
		super(driver);
		
	}
	
	public void getHomePageTitle()
	{
		
		super.getPageTitle();
	}
	
	
	public void closeBrowser()
	{
		//driver.close();
		driver.quit();
	
		
	}
	
	public  String[] SearchPattern(String input)
	{
		WebDriverWait ww=new WebDriverWait(driver, 180);
		WebElement ele_textBox=ww.until(ExpectedConditions.presenceOfElementLocated(By.id("UHSearchBox")));
		this.enterText(ele_textBox, input);
		List<WebElement> dropList=ww.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@class='Hover P(0) M(0)']/li")));
		String[] textvalue=new String[dropList.size()];
		int i=0;
		
		return textvalue;
		
	}
	public void cickonSearched()
	{
		
	}
	

}
