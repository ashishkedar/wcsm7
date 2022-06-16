package mouseactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickOrContextClick {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
     WebElement target = driver.findElement(By.xpath("//span[text()='right click me']"));
     Actions act = new Actions(driver);
     act.contextClick(target).perform();
     Thread.sleep(5000);
     // one time perfrom two opertions
   //  WebElement target2 = driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
  //   act.doubleClick(target2).perform();

     

	}

}
