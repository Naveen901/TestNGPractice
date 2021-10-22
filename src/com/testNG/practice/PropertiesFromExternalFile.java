package com.testNG.practice;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFromExternalFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//This will scan data from file
		Properties prop=new Properties();
		//This will load file to prop object
		FileInputStream fis=new FileInputStream("C:\\Users\\Naveen B\\eclipse-workspace\\TestNGPractice\\src\\TestData.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("uname"));
		System.out.println(prop.getProperty("pword"));
		//to change the property value at runtime
		prop.setProperty("url", "http://rahulshettyacademy.com");
		System.out.println(prop.getProperty("url"));
		//to write the data into file
		FileOutputStream fos=new FileOutputStream("C:\\\\Users\\\\Naveen B\\\\eclipse-workspace\\\\TestNGPractice\\\\src\\\\TestData.properties");
		prop.store(fos, null);
	}

}
