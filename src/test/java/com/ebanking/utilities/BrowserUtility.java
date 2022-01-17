package com.ebanking.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserUtility {

	
	
	public static WebDriver startAppliction(WebDriver driver,String url, String browserName) {
		
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse\\ebanking\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\eclipse\\ebanking\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Dell\\eclipse\\ebanking\\Drivers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		
		else if(browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Dell\\eclipse\\ebanking\\Drivers\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		
		else {
			System.out.println("Browser invalid");
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS).pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(url);
		
		
		return driver;
	}
	
	public static void tearDown(WebDriver driver) {
		driver.close();
	}
	
	
}
