package testngAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class DataProviderCode 
{
	WebDriver driver;
  @BeforeMethod
  public void setUp() 
  {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("http://127.0.0.1:8080/login.do;jsessionid=1widsmj54aiai");
		
  }
  
  @DataProvider(name="testActiTimeData")
  public  Object[][] dataprovider()
  {
	  Object[][] data = new Object[5][2];
	  data[0][0]="admin1";
	  data[0][1]="manager123";
	  
	  data[1][0]="xyz";
	  data[1][1]="manager123";

	  data[2][0]="ashish";
	  data[2][1]="manager123";

	  data[3][0]="qwycgxhjs xcxx";
	  data[3][1]="manager123";

	  data[4][0]="admin";
	  data[4][1]="manager";

	return data;
	  
  }
  @Test(dataProvider="testActiTimeData")
  public void loginToActiTime(String username ,String password) throws InterruptedException
  {
	
	  Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
	
  }
  

  @AfterMethod
  public void tearDown() {
	  driver.quit();
  }

}
