package com.ebanking.testCases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ebanking.pageObjects.*;

public class NewCustomerTest extends BaseClass{

	
	@Test
	public void loginAppAddNewCust() throws IOException {
		LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
		loginpage.login(config.getDataFromConfig("username"), config.getDataFromConfig("password"));
		
			NewCustomerPage newcustomer=PageFactory.initElements(driver, NewCustomerPage.class);
			newcustomer.clickAddNewCustomer();
			newcustomer.custName(config.getDataFromConfig("CustomerName"));
			newcustomer.custgender(config.getDataFromConfig("radio"));
			
			newcustomer.custdob(config.getDataFromConfig("dateOfBirth"));
			newcustomer.custaddress(config.getDataFromConfig("address"));
			newcustomer.custcity(config.getDataFromConfig("city"));
			newcustomer.custstate(config.getDataFromConfig("state"));
			newcustomer.custpinno(config.getDataFromConfig("pinno"));
			newcustomer.custtelephoneno(config.getDataFromConfig("mobile"));
			newcustomer.custemailid(randomestring()+"@gmail.com");
			
			newcustomer.custpassword(config.getDataFromConfig("custpassword"));
			newcustomer.custsubmit();
			
			
			
			boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
			
			if(res==true)
			{
				Assert.assertTrue(true);
				
				
			}
			else
			{
				
				captureScreen(driver,"addNewCustomer");
				Assert.assertTrue(false);
			}
			//Assert.assertTrue(true);
		}
		/*else {
			captureScreen(driver, "LoginTest");
			Assert.assertTrue(false);
		}*/
		
		
		
	}
	
	
	
	
	
