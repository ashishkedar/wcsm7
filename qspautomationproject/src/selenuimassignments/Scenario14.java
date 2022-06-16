package selenuimassignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario14 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
	WebElement target=	driver.findElement(By.xpath("//*[@id=\"goldCoins\"]/a"));
	Actions act =new Actions(driver);
	act.moveToElement(target).perform();
	driver.findElement(By.xpath("//*[@id=\"goldCoins\"]/div/ul/li[1]/div/ul/li[1]/span")).click();

	Thread.sleep(4000);
	driver.close();


	}

}
