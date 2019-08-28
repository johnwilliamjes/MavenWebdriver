//Test done

import org.openqa.selenium.WebDriver;

import com.slenium.pageObjcts.Home;
import com.slenium.pageObjcts.Login;


public class test {

	static WebDriver driver;
	
	
	public static void main(String[] args) {
		//MyChange

		Home home =new Home(driver);
		Login lp = home.GotoLogin();
		
		

	}

}
