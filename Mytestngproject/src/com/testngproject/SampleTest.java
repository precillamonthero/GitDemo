package com.testngproject;

import org.testng.annotations.*;

public class SampleTest {
	
	@BeforeSuite
	public void beforesuitmethod()
	{
		//Business logic 
		System.out.println("Executing before test suite");
	}
	
	@AfterSuite
	public void aftersuitmethod()
	{
		System.out.println("Executing after test suite");
	}
}
