package com.testNG.practice;

import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations3 {

	@BeforeSuite
	public void launchApp() {
		System.out.println("Launch the Application");
	}
	
	@BeforeSuite
	public void loginTest() {
		System.out.println("Login in to Application");
	}
	
	@AfterSuite
	public void logout() {
		System.out.println("Logging out from Application");
	}
	@AfterSuite
	public void closeBrowser() {
		System.out.println("Close the Browser window");
	}
	@Test
	public void clearCache() {
		System.out.println("Clear Cache");
	}
	
	
}
