package methodsofWebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethd {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
WebElement userTxt	= driver.findElement(By.id("txtUsername"));
WebElement passTxt	= driver.findElement(By.id("txtPassword"));
  userTxt.sendKeys("Admin");
  passTxt.sendKeys("admin123");
 // driver.findElement(By.id("btnLogin")).click();
  Thread.sleep(4000);
  userTxt.clear();
  passTxt.clear();
  
	
	
		
		

	}

}
