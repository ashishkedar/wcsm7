package webbasedpopups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopups {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		co.addArguments("-start-maximized");
        
		WebDriver driver = new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

		driver.get("https://optinmonster.com/what-is-a-popup-notification/");

	}

}
