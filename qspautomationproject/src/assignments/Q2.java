package assignments;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		
		//How to close all the browser without quit method
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.linkText("Open a popup window")).click();
		
		Set<String> allhandles= driver.getWindowHandles();
		for(String wh:allhandles) {
			driver.switchTo().window(wh).close();
		}
		

	}

}
