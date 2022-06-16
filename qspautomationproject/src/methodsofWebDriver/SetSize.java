package methodsofWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Dimension targetSize = new Dimension(450,250);
		driver.get("https://www.qspiders.com");
		
		driver.manage().window().setSize(targetSize);

	}

}
