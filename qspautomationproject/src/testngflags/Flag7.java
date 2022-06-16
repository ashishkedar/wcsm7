package testngflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7 {
  @Test(groups="FUNCTIONAL")
  public void f1() 
  {
	Reporter.log("method f1",true);  
  }

@Test(groups="SMOKE")
public void s1() 
{
	Reporter.log("method s1",true);  
}
@Test(groups="INTEGRATION")
public void i1() 
{
	Reporter.log("method i1",true);  
}
@Test(groups="FUNCTIONAL")
public void f2() 
{
	Reporter.log("method f2",true);  
}
@Test(groups="SMOKE")
public void s2() 
{
	Reporter.log("method s2",true);  
}
@Test(groups="INTEGRATION")
public void i2() 
{
	Reporter.log("method i2",true);  
}
@Test(groups="FUNCTIONAL")
public void f3() 
{
	Reporter.log("method f3",true);  
}
@Test(groups="SMOKE")
public void s3() 
{
	Reporter.log("method s3",true);  
}
@Test(groups="INTEGRATION")
public void i3() 
{
	Reporter.log("method i3",true);  
}
@Test(groups="FUNCTIONAL")
public void f4() 
{
	
	Reporter.log("method f4",true);  
}
@Test(groups="SMOKE")
public void s4() 
{
	
	Reporter.log("method s4",true);  
}
@Test(groups="INTEGRATION")
public void i4() 
{
	
	Reporter.log("method i4",true);  
}

@Test(groups="FUNCTIONAL")
public void f5() 
{
	
	Reporter.log("method f5",true);  
}

@Test(groups="SMOKE")

public void s5() 
{
	
	Reporter.log("method s5",true);  
}
@Test(groups="INTERGRATION")

public void i5() 
{
	
	Reporter.log("method i5",true);  
}




}