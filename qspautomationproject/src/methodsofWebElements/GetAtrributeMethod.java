package methodsofWebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAtrributeMethod {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement userTxt	= driver.findElement(By.id("txtUsername"));
		WebElement passTxt	= driver.findElement(By.id("txtPassword"));
             String value1 =userTxt.getAttribute("name");
             String value2 =passTxt.getAttribute("type");
             
             System.out.println(value1);
             System.out.println(value2);
               
  

	}

}
