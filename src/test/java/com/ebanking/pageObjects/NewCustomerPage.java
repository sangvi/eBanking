package com.ebanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCustomerPage {
WebDriver driver;
	
	public NewCustomerPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(linkText="New Customer") WebElement NewCustomerButton;
	@FindBy(name="name") WebElement CustomerName;
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]") WebElement maleRadio;
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]") WebElement femaleRadio;
	@FindBy(id="dob") WebElement dateOfBirth;
	@FindBy(name="addr") WebElement address;
	@FindBy(name="city") WebElement City;
	@FindBy(name="state") WebElement State;
	@FindBy(name="pinno") WebElement pinno;
	@FindBy(name="telephoneno") WebElement Mobile;
	@FindBy(name="emailid") WebElement Email;
	@FindBy(name="password") WebElement password;
	@FindBy(name="sub") WebElement submitButton;
	@FindBy(name="res") WebElement ResetButton;
	
	
	


	
	
	public void clickAddNewCustomer() {
		NewCustomerButton.click();
			
	}

	public void custName(String cname) {
		CustomerName.sendKeys(cname);
		
	}

	public void custgender(String cgender) {
		if(cgender.equalsIgnoreCase("male")) {
			
			maleRadio.click();
		}
		else if(cgender.equalsIgnoreCase("female")) {
			femaleRadio.click();
		}
	}

	public void custdob(String dob) {
		dateOfBirth.sendKeys(dob);
		
	}

	public void custaddress(String caddress) {
		address.sendKeys(caddress);
	}

	public void custcity(String ccity) {
		City.sendKeys(ccity);
	}

	public void custstate(String cstate) {
		State.sendKeys(cstate);
	}

	public void custpinno(String cpinno) {
		pinno.sendKeys(String.valueOf(cpinno));
	}

	public void custtelephoneno(String ctelephoneno) {
		Mobile.sendKeys(ctelephoneno);
	}

	public void custemailid(String cemailid) {
		Email.sendKeys(cemailid);
	}

	public void custpassword(String cpassword) {
		password.sendKeys(cpassword);
	}

	public void custsubmit() {
		submitButton.click();
	}
	
	





}

