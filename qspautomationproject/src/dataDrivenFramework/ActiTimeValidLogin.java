package dataDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeValidLogin {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	    driver.get("http://127.0.0.1:8080/login.do;jsessionid=1widsmj54aiai");
		Thread.sleep(3000);
		
		//accessing the generic reusable non static method by creating the object
		FileLabOrGenerlizeReuseableMethod flb = new FileLabOrGenerlizeReuseableMethod();
		
		//read the username 
		String username = flb.readData("./data/ActiTimeTestData.xlsx","validcreds",1,0);
		
		//read the 
		String password = flb.readData("./data/ActiTimeTestData.xlsx","validcreds",1,1);
		
		
		//login operation
		
		 driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
		
		
		
		 

	}

}
