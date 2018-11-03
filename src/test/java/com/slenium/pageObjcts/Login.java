package com.slenium.pageObjcts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Login extends TestBase {
	
	
	public Login(WebDriver driver) {
		super(driver);
	}

	
	public void doLogin() {
		 DesiredCapabilities desiredCapabilities = DesiredCapabilities.firefox();
		 final FirefoxOptions firefoxOptions = new FirefoxOptions(desiredCapabilities);
		 FirefoxProfile profile = new FirefoxProfile();
		 		System.setProperty("webdriver.gecko.driver","C:\\geckodriver\\geckodriver.exe");
		 		//System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
		 		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "conoleLogs_Firefox.txt");
		 		//firefoxOptions.addPreference("--log", "trace");
		 		//firefoxOptions.addPreference("browser.popups.showPopupBlocker", false);
		 		firefoxOptions.addPreference("security.sandbox.content.level", 5);
		 		firefoxOptions.setAcceptInsecureCerts(true);
		 		firefoxOptions.setProfile(profile);
		 		driver = new FirefoxDriver(firefoxOptions);
	}

}
