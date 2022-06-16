package methodsofWebDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("Samsung F12");
		Thread.sleep(4000);
		driver.findElement(By.className("L0Z3Pu")).click();
		driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy F12 (Sea Green, 64 GB)']")).click();
	String parenthandle=	driver.getWindowHandle();
	Set<String> allhandles= driver.getWindowHandles();
		for(String wh :allhandles){
			if(!parenthandle.equals(wh))
			{
				driver.switchTo().window(wh);
			}
			else {
				
			}
		}
		driver.findElement(By.xpath("//a[.='128 GB']")).click();
		driver.findElement(By.xpath("//li[@id='swatch-0-color']/a")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("pincodeInputId")).sendKeys("413307");
		driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();
		
		

	}

}

