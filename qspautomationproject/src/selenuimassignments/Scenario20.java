package selenuimassignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario20 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
		driver.findElement(By.xpath("//a[.='Coins ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='10 gram 24 KT Lakshmi Gold Coin']")).click();
		Thread.sleep(3000);
	    driver.close();

		
	
		

	}

}
