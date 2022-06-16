package freame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleByWebelement {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
	WebElement freameelelemnt	=driver.findElement(By.xpath("//iframe[@role='presentation']"));
driver.switchTo().frame(freameelelemnt);

 WebElement  Nothanks = driver.findElement(By.xpath("//button[@aria-label='No thanks']"));
 Nothanks.click();

		

	}

}
