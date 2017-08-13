package com.testng.yahoo.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CommonUtil {
	
	
	public static String getpropertyValue(String filename,String propertyName) throws IOException
	{
		FileInputStream fs=new FileInputStream(".\\Config\\"+filename+".properties");
		Properties p=new Properties();
		p.load(fs);
		return p.getProperty(propertyName);
		
	}

}
