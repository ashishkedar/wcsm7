package methodsofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://placements.qspiders.com/sites/default/files/fav_icon_2.png");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		

	}

}

