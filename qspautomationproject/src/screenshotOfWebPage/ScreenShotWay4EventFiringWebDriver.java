package screenshotOfWebPage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

@SuppressWarnings("deprecation")
public class ScreenShotWay4EventFiringWebDriver {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		EventFiringWebDriver efw= new EventFiringWebDriver(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.instagram.com");
		File src	=efw.getScreenshotAs(OutputType.FILE);
		File dest   = new File("./screenshots/way4.png");
		Files.copy(src, dest);
		

	}

}
