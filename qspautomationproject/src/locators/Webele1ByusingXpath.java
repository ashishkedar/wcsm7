package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webele1ByusingXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.flipkart.com/");
			Thread.sleep(10000);
			driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("ashish");
			driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("952750");
			driver.findElement(By.xpath("//button[@type='submit' and @class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		

	}

}
