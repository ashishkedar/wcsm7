package methodsofWebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.domsnapshot.model.Rectangle;

@SuppressWarnings("unused")
public class GetRect2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
		WebElement	news=driver.findElement(By.xpath("//h2[.='News']"));
org.openqa.selenium.Rectangle rect	= news.getRect();
int height = rect.getHeight();
int width = rect.getWidth();
 System.out.println(height+"height");
 System.out.println(width+"width");
 
		
		

	}

}
