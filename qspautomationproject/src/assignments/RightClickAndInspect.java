package assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAndInspect {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(4000);
	WebElement	target=driver.findElement(By.xpath("//h1[.='Downloads']"));
	 Actions act = new Actions(driver);
     act.contextClick(target).perform();
    Thread.sleep(5000);
    Robot robot = new Robot();
    for(int i=0;i<10;i++) {
    	robot.keyPress(KeyEvent.VK_DOWN);
    	
    	robot.keyRelease(KeyEvent.VK_ENTER);
    	 
   }
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    
  
    
	
   
    
   
  
    
    

	

	}
	 


}
