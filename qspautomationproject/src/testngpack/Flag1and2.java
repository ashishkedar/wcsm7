package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1and2 {
  @Test(description="This Method is used ")
  public void f() 
  {
	  Reporter.log("method exe",true);
  }
  @Test(enabled=true)
  public void f5() 
  {
	  Reporter.log("method exe",true);
  }
  @Test(enabled=false)
  public void f2() 
  {
	  Reporter.log("method exe",true);
  }
}
