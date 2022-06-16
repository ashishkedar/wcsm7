package selenuimassignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question10 {

	public static void main(String[] args) throws InterruptedException   {
		// TODO Auto-generated method stub
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
 
  driver.findElement(By.xpath("//input[@id='6cj2670tifj_146917605549304831']")).sendKeys("9548225480");
  driver.findElement(By.xpath("//span[.='Start the chat']")).click();
  
  

	}

}
