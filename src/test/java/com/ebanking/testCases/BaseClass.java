package com.ebanking.testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.ebanking.utilities.*;

public class BaseClass {
	public WebDriver driver;
	public ConfigDataProvider config;
	
	
	
	@BeforeClass
	public void setup() {
		config=new ConfigDataProvider();
		
		driver=BrowserUtility.startAppliction(driver, config.getDataFromConfig("url"), config.getDataFromConfig("browserName"));
		
	}
	
	
	@AfterClass
	public void tearDown() {
		BrowserUtility.tearDown(driver);
	}
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "\\Screenshots\\" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	public boolean isAlertPresent() {
		try {
		driver.switchTo().alert();
		return true;
		}
		catch(Exception e) {
			return false;
		}
		
	}
	public String randomestring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
	}
 
}
