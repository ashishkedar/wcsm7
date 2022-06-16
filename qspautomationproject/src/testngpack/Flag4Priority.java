package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4Priority {
  @Test
  public void z() 
  {
	  Reporter.log("z",true);
  }
  @Test(priority=1)
  public void b() 
  {
	  Reporter.log("b",true);
  }
  @Test(priority=4)
  public void c() 
  {
	  Reporter.log("c",true);
  }
  @Test(priority=3)
  public void e() 
  {
	  Reporter.log("e",true);
  }
  @Test(priority=3)
  public void f() 
  {
	  Reporter.log("f",true);
  }
  @Test(priority=0)
  public void g() 
  {
	  Reporter.log("g",true);
	  
  }
}
