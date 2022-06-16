package pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class TestActiTimeValidLogin extends BestTest {

	

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//1
		BestTest bt = new BestTest();
		bt.setUp();
		Flib flib = new Flib();
String	username =flib.readPropertyFile(PROP_PATH, "username");
	String password = flib.readPropertyFile(PROP_PATH, "password");
	
	  
  LoginPage lp = new LoginPage(driver);
  lp.actiTimevalidLogin(username, password);
  Thread.sleep(7000);
  bt.tearDawn();
	
	
		

	}

}
