package methodsofWebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Getalocationmethod {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
	WebElement	news=driver.findElement(By.xpath("//h2[.='News']"));
	   Point loc = news.getLocation();
	   int xaxis = loc.getX();
	   int yaxis = loc.getY();
	   System.out.println(xaxis+"x axix distance");
System.out.println(yaxis+"y axix disatance");


	}

}
