package operationsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectOption {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Ashish/Desktop/WCSM7/mulltisd.html");
		WebElement dropdawnelement = driver.findElement(By.id("menu"));
		Select sel =new Select(dropdawnelement);
		for(int i=0;i<=7;i++)
		{
           sel.selectByIndex(i);
		}
	      WebElement firstopt=sel.getFirstSelectedOption();
	    String firsttext=firstopt.getText();
	    System.out.println( firsttext);

	}

}
