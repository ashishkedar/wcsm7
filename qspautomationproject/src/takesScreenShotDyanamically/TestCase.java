package takesScreenShotDyanamically;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(CustomListener.class)

public class TestCase extends BaseTest
{
  @BeforeMethod
  public void setUp() 
  {
	  initialization();
  }
  @Test
  public void validLogin()  throws InterruptedException
  {
	  SoftAssert  softAssert = new SoftAssert();
	  String actualLoginPageTitle = driver.getTitle();
	  softAssert.assertEquals(actualLoginPageTitle,"OrangeHRM");
	  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.name("txtPassword")).sendKeys("ashish");
	  driver.findElement(By.id("btnLogin")).click();
	  
	  WebElement dashBoard = driver.findElement(By.xpath("//h1[.='Dashboard']"));
	  
	             boolean statusOfDashBoard = dashBoard.isDisplayed();
	             Assert.assertEquals(statusOfDashBoard,true);
	             Thread.sleep(4000);
	 
  }
  @Test 
  public void testCase2()
  {
	  Assert.fail();
  }
  public void testCase3()
  {
	  Assert.fail();
  }
  public void testCase4()
  {
	  Assert.fail();
  }
  public void testCase5()
  {
	  Assert.fail();
  }
  public void testCase6()
  {
	  Assert.fail();
  }
  public void testCase7()
  {
	  Assert.fail();
  }
  @AfterMethod
  public void tearDown()
  {
   driver.quit();
  }

}