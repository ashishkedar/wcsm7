package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActtimeLaunch1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		driver.get("http://127.0.0.1:8080/login.do;jsessionid=7l63imsm82onc");
		
		String actualloginpage=driver.getTitle();
		
		if(actualloginpage.equals("actiTIME - Login")) 
		{
		  System.out.println("Test Case is Passesd ! Login Page title is matched");
		

	}
		else
		{
			System.out.println("Test Case IS Not Passed ! Login Page Title Not Matched");
		}
		
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(4000);
		
	String	homepagetitle=driver.getTitle();
	if(homepagetitle.equals("actiTIME - Enter Time-Track")) 
	{
	  System.out.println("Test Case is Passesd ! Home Page title is matched");
	

}
	else
	{
		System.out.println("Test Case IS Not Passed ! Home Page Title Not Matched");
	}

	
	
		
		
		
		}
	     
	


}







	
