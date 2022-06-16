package operationsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetwrappedMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Ashish/Desktop/WCSM7/mulltisd.html");
		WebElement dropdawnelement = driver.findElement(By.id("menu"));
		Select sel =new Select(dropdawnelement);
	WebElement	wrappedelement =sel.getWrappedElement();
  String text =wrappedelement.getText();
  System.out.println(text);

	}

}
