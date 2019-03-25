package com.selenium.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.selenium.pageObjcts.*;


public class Test1 {	

	@Test
	public void login() {
		
		Login.doLogin();
		
	}
 
	
	@AfterMethod
	public void tearDown() {
		
		Login.logoff();
		
		
	}
}
