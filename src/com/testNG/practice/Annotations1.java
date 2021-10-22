package com.testNG.practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Annotations1 {

	@BeforeMethod
	public void memberNewMembership() {
		System.out.println("New Membership");
	}
	@AfterMethod
	public void memberExistingMember() {
		System.out.println("Existing Member");
	}
	@Parameters({"URL","userid","pwd"})
	@Test(groups = {"Smoke"})
	public void memberFarmerLandDetails(String url, String userid, String password) {
		System.out.println("FarmerLandDetails");
		System.out.println("URL : "+url);
		System.out.println(userid);
		System.out.println(password);
	}
	@Test(groups= {"Smoke"})
	public void memberShare() {
		System.out.println("Share Details");
	}
	@Test(groups= {"Smoke"}, dependsOnMethods= {"memberShare"})
	public void ncl() {
		System.out.println("ncl");
	}
}
