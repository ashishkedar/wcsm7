package selenuimassignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario13 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
	WebElement target=	driver.findElement(By.xpath("//span[@data-p='offers,m']"));
	Actions act =new Actions(driver);
	act.moveToElement(target).perform();
	driver.findElement(By.xpath("/html/body/header/div/div[2]/div/nav/ul/li[10]/div/ul/li[4]/span")).click();

	Thread.sleep(4000);
	driver.close();


	}

}
