package com.ebanking.utilities;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class ConfigDataProvider {

	
	Properties pro;
	
	public ConfigDataProvider() {
		File src=new File("C:\\Users\\Dell\\eclipse\\ebanking\\Configuration\\config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Not able to load config file>>>>>"+e.getMessage());
		}
		
	
			
		}
	public String getDataFromConfig(String keytosearch) {
		
		return pro.getProperty(keytosearch);
		
	}
}
