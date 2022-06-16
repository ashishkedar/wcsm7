package freame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BluestoneframeByWeblelement {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Not now']")).click();
WebElement 	frameelement =	driver.findElement(By.xpath("//iframe[@id='chat-widget']"));
		driver.switchTo().frame(frameelement);
		Thread.sleep(3000);
  WebElement chatwithourexperts= driver.findElement(By.xpath("//button[@aria-label='Open LiveChat chat widget']"));
  chatwithourexperts.click();
  Thread.sleep(4000);
  driver.findElement(By.id("name")).sendKeys("ashish");
  driver.findElement(By.id("email")).sendKeys("kedarashishb@gmail.com");
 // Thread.sleep(3000);
  //driver.findElement(By.xpath("//input[contains(@name,'js7hzhjs04_146917605549304831') and contains(@aria-required,'true')]")).sendKeys("954822548");
  driver.findElement(By.xpath("//span[.='Start the chat']")).click();
  
  
  
	}

}
