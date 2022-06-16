package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubeSearchXpath {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("search_query")).sendKeys("pal pal");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//yt-formatted-string[@aria-label='Pal Pal Har Pal Lyrical Video Song | Lage Raho Munnabhai | Sanjay Dutt, Vidya Balan by Bollywood Classics 2 years ago 4 minutes, 31 seconds 9,463,044 views']")).click();
		
  
		

	}

}
