import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;
	
	
	@BeforeSuite
    public void Step() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
 		/*FirefoxOptions options = new FirefoxOptions();
 		options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");	
   	    driver= new FirefoxDriver();
   	    
   	    */
   	/* DesiredCapabilities capabilities = DesiredCapabilities.firefox();
   	capabilities.setCapability("marionette",true);
   	driver = new FirefoxDriver();*/
    

	 DesiredCapabilities desiredCapabilities = DesiredCapabilities.firefox();
	 final FirefoxOptions firefoxOptions = new FirefoxOptions(desiredCapabilities);
	 FirefoxProfile profile = new FirefoxProfile();
	 		System.setProperty("webdriver.gecko.driver","C:\\geckodriver\\geckodriver.exe");
	 		System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
	 		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "conoleLogs_Firefox.txt");
	 		firefoxOptions.addPreference("--log", "trace");
	 		firefoxOptions.addPreference("browser.popups.showPopupBlocker", false);
	 		firefoxOptions.addPreference("security.sandbox.content.level", 5);
	 		firefoxOptions.setAcceptInsecureCerts(true);
	 		firefoxOptions.setProfile(profile);
	 		driver = new FirefoxDriver(firefoxOptions);
	
	}
	
	@Test
	public void doLogin() {
		
		
		
		
		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("johnwilliamjes@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WebDriverWait wait= new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//input[@name='password']")))).sendKeys("dasad");;
		 driver.findElement(By.xpath("//span[text()='Next']")).click();
		// System.out.println(driver.findElement(By.xpath("//div[text()='Wrong password. Try again or click Forgot password to reset it.']")).getText());
		// Assert.assertEquals(driver.findElement(By.xpath("//div[text()='Wrong password. Try again or click Forgot password to reset it.']")).getText(), "Wrong password. Try again or click Forgot password to reset it.");
		
	
	
		 		
	}
    
	
	@AfterSuite
	
	public void tearDown() {
		driver.quit();
	}
	
}