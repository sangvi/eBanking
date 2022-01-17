package com.ebanking.pageObjects;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import com.ebanking.testCases.*;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage {

	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	
	}
	
	@FindBy(name="uid") WebElement userName;
	
	@FindBy(name="password") WebElement password;
	
	@FindBy(name="btnLogin") WebElement login;
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/marquee") WebElement message;
	@FindBy(linkText ="Log out") WebElement logoutButton;
	
	
	public void login(String username,String pass) {
		userName.sendKeys(username);
		password.sendKeys(pass);
		login.click();
	}
	
	public void logout()
	{
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("scroll(0,400)");
		logoutButton.click();
	}
	
}
