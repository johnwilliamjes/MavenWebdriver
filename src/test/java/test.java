//Test done

import org.openqa.selenium.WebDriver;

import com.selenium.pageObjcts.Home;
import com.selenium.pageObjcts.Login;



public class test {

	static WebDriver driver;
	
	
	public static void main(String[] args) {
		//MyChange

		Home home1 =new Home(driver);
		Login lp = home1.GotoLogin();
		
		

	}

}
