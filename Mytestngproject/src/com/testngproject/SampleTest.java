package com.testngproject;

import org.testng.annotations.*;

public class SampleTest {
	
	@BeforeSuite
	public void beforesuitmethod()
	{
		//Business logic 
		System.out.println("Executing before test suite");
		System.out.println("Executing before test suite1");
		System.out.println("Executing before test suite2");
		
	}
	
	@BeforeSuite
	public void beforesuitmethods()
	{
		//Business logic 
		System.out.println("Executing before test suite");
		System.out.println("Executing before test suite1");
		System.out.println("Executing before test suite2");
		
	}
	
	@AfterSuite
	public void aftersuitmethod()
	{
		System.out.println("Executing after test suite");
		System.out.println("Executing after test suite1");
		System.out.println("Executing after test suite2");
	}
}
