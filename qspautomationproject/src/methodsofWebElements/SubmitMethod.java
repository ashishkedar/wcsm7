package methodsofWebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("ashish");
		driver.findElement(By.name("password")).sendKeys("ashish123");
    WebElement  loginbutton	=	driver.findElement(By.cssSelector("button[class*='L3NKy'"));
   loginbutton.submit();
		 


	}

}
