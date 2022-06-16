package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwitterLoginByusingCss {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/i/flow/login");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[name='text']")).sendKeys("ashish");
driver.findElement(By.cssSelector("span[class='css-901oao css-16my406 r-poiln3 r-bcqeeo r-qvutc0']")).click();
	}

}
