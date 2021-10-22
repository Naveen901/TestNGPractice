package com.testNG.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Annotations2 {

	@Test(groups= {"Smoke"},priority=0)
	public void agriShortTermLoans() {
		System.out.println("Short Term Loans");
	}
	@Test(groups= {"Smoke"},priority=1,enabled=false)
	public void agriMediumTermLoans() {
		System.out.println("Medium Term Loans");
	}
	@Test(groups= {"Smoke"},dataProvider="testData")
	public void retailHousingLoans(String Url) {
		System.out.println("Housing Loans");
		System.out.println(Url);
	}

	public void retailGoldLoans() {
		System.out.println("Gold Loans");
	}
	@DataProvider
	public Object testData() {
		Object[][] input=new Object[2][1];
		input[0][0] ="http://roots.com";
		input[1][0]="http://aml/com";
		return input;
	}
	
}
