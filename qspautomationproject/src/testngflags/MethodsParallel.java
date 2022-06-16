package testngflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MethodsParallel {
  @Test
  public void Method1 () 
  {
	  long threadId = Thread.currentThread().getId();
	  Reporter.log(threadId+" thread id",true);
	  Reporter.log("mehtod1",true);
	  
	  
  }
  @Test
  public void Method2 () 
  {
	  long threadId = Thread.currentThread().getId();
	  Reporter.log(threadId+" thread id",true);
	  Reporter.log("mehtod2",true);
	  
	 
  }

}
