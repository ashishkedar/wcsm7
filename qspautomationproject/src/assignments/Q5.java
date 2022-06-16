package assignments;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5 {

	public static void main(String[] args) {
		
		//perfrom the action(maximize)on any of the chikd window
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.linkText("Open a popup window")).click();
      String parenttitle = driver.getTitle();
	String parenthandle=driver.getWindowHandle();
		Set<String> allhandles= driver.getWindowHandles();
		for(String wh:allhandles) {
			if(!parenttitle.equals(wh))
			{
				driver.switchTo().window(wh).manage().window().maximize();
				
			}
			else{
				driver.switchTo().window(wh).close();
			
		}
		
	}

}


	}


