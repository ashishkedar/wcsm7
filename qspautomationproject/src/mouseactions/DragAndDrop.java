package mouseactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/drag_drop.html");
	WebElement src	   = driver.findElement(By.xpath("//a[.=' BANK ']"));
	 WebElement tar =  driver.findElement(By.xpath("//ol[@id='bank']"));
	Actions act = new Actions(driver);
	act.dragAndDrop(src, tar).perform();
	
	
	}

}
