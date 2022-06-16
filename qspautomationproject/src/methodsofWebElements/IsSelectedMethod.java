package methodsofWebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("http://127.0.0.1:8080/login.do;jsessionid=1c2q7ij7mtsjd");
WebElement	isselected=	driver.findElement(By.id("keepLoggedInCheckBox"));
    Boolean status=isselected.isSelected();//false 
    System.out.println(status);
    Thread.sleep(4000);
    isselected.click();
    Boolean status2=isselected.isSelected(); //true
    System.out.println(status2);
    	
    
	

	}

}
