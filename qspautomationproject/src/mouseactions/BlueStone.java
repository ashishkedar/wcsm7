package mouseactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStone {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/jewellery/gold-rings.html?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=CjwKCAjwve2TBhByEiwAaktM1Fp0V81c2rXjb70hNgkCAWYN-GCt6Ph6VubZFcqMohuxvA7C0l8jtxoCm0IQAvD_BwE");
		Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='lc-1x7wur2 e1dmt1bi0']")).click();

	}

}
