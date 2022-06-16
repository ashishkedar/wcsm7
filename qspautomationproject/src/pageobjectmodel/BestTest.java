package pageobjectmodel;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BestTest implements IAutoConstant {
	static WebDriver driver;
	//method to open the browsers
	
	public void setUp() throws IOException
	{
		Flib flib = new Flib();
		//read the data from property file (browser)12334
		String url = flib.readPropertyFile(PROP_PATH,"url");
		//read the data from property file (url)
		String browserValue = flib.readPropertyFile(PROP_PATH, "browser");
		//use the value of browser
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY,CHROME_VALUE);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
		}

		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY,GECKO_VALUE);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		}

		else
		{
			System.out.println("enter the correct choice");
		}


	}

	//method to close the browsers
	public void tearDawn()
	{
		driver.quit();
	}

}
			
			
				
				
			
		
		
			
			
			
		
	
	
		
		



