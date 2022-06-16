package methodsofWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://127.0.0.1:8080/login.do;jsessionid=zl3m7uxao378");
 WebElement userNametextBox= driver.findElement(By.name("username"));
 userNametextBox.sendKeys("admin");
 System.out.println(userNametextBox);
	}

}
