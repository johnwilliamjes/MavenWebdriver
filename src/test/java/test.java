import org.openqa.selenium.WebDriver;

import com.slenium.pageObjcts.Home;
import com.slenium.pageObjcts.Login;

public class test {

	static WebDriver driver;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Home home =new Home(driver);
		Login lp = home.GotoLogin();
		
		

	}

}
