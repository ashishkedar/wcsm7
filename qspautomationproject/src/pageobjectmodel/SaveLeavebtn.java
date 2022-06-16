package pageobjectmodel;

import java.io.IOException;

public class SaveLeavebtn extends BestTest{
public static void main(String[] args) throws IOException, InterruptedException {
		
		//1
		BestTest bt = new BestTest();
		bt.setUp();
		Flib flib = new Flib();
String	validUsername =flib.readPropertyFile(PROP_PATH, "username");
	String validPassword = flib.readPropertyFile(PROP_PATH, "password");
	
	  
  LoginPage lp = new LoginPage(driver);
  lp.actiTimevalidLogin(validUsername,validPassword);
  Thread.sleep(5000);
  
  
	HomePage hp = new HomePage(driver);
	hp.clicksaveLeavebtn();
	
	
		

	}

	

}
