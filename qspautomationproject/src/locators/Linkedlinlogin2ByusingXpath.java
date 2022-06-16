package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkedlinlogin2ByusingXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
			Thread.sleep(10000);
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ashish");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	}

}
