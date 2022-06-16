package testngAnnotations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestValidLogin extends BestTest 
{
	@Test
	public void search1() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys("java");
		
	}
	@Test
	public void search2() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys("SQL");
	

	
	
  
}
}
