package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartLogin {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/account/login?ret=%2Faccount%2Forders&fromMyOrdersPage=true");
			driver.switchTo().activeElement().sendKeys("9527502053",Keys.ENTER);
		driver.findElement(By.className("_2IX_2- VJZDxU"));
		driver.findElement(By.className("_2IX_2- _3mctLh VJZDxU"));
		driver.switchTo().activeElement().sendKeys("Ashu@9696",Keys.ENTER);
		
		
		


			
			


	}

}
