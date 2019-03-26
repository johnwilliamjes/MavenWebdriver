package com.selenium.pageObjcts;

import org.openqa.selenium.WebDriver;


public class TestBase {
	public static WebDriver driver;
	public TestBase(WebDriver driver) {
		
		this.driver=driver;
	}

	
}