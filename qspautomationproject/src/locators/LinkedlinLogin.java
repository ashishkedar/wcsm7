package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedlinLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		driver.findElement(By.name("session_key")).sendKeys("ashish");
		driver.findElement(By.name("session_password")).sendKeys("kedar@123");
		driver.findElement(By.className("btn__primary--large from__button--floating")).click();
		

	}

}
