package com.ebanking.testCases;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



import com.ebanking.pageObjects.*;

public class LoginTest extends BaseClass{
	
	
	 
	
	
	@Test
	public void loginApp() throws IOException {
		LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
		loginpage.login(config.getDataFromConfig("username"), config.getDataFromConfig("password"));
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
		}
		else {
			captureScreen(driver, "LoginTest");
			Assert.assertTrue(false);
		}
	}
	
	
	
	
	
}
