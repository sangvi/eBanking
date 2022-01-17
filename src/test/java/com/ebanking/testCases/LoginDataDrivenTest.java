package com.ebanking.testCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ebanking.pageObjects.LoginPage;
import com.ebanking.utilities.XLUtils;

public class LoginDataDrivenTest extends BaseClass{
@Test(dataProvider="TestData")
public void loginAppWithData(String username, String password) throws IOException {
	
	LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
	loginpage.login(username,password);
	if(isAlertPresent()==true) {
		
		driver.switchTo().alert();
		captureScreen(driver, "loginDataDrivenTest");
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		
		Assert.assertTrue(false);
	}
	else {
		
			loginpage.logout();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(true);
			
			
			
			
		
	}
	
}



@DataProvider(name="TestData")
String[][] getData() throws IOException{
	String xcelpath=System.getProperty("user.dir")+"\\src\\test\\java\\com\\ebanking\\testData\\LoginData.xlsx";
	int rowcount=XLUtils.getRowCount(xcelpath, "Sheet1");
	int columncount=XLUtils.getCellCount(xcelpath, "Sheet1", 1);
	String[][] array=new String[rowcount][columncount];
	
	for(int i=1;i<rowcount;i++) {
		for(int j=0;j<columncount;j++) {
			array[i-1][j]=XLUtils.getCellData(xcelpath, "Sheet1", i, j);
			
		}
	}
	return array;
}
	
}
