package handlingTheDropdawn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByValue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Ashish/Desktop/WCSM7/mulltisd.html");
		Thread.sleep(3000);
		WebElement dropdawnelement = driver.findElement(By.id("menu"));
		Select sel =new Select(dropdawnelement);
		sel.selectByVisibleText("Upma");
		Thread.sleep(2000);
		sel.deselectByValue("v1");
	}

}
