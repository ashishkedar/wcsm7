package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeWrite {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	    driver.get("http://127.0.0.1:8080/login.do;jsessionid=1widsmj54aiai");
		Thread.sleep(3000);
		
		//accessing the generic reusable non static method by creating the object
		GenerlizeWriteMethod flb3 = new GenerlizeWriteMethod();
		
		//write the username 
	flb3.writeData("./data/ActiTimeTestData.xlsx","validcreds",0,2);
	
	
		
		
		
		//login operation
		
		 driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
		
		
		
		 


	}

}
