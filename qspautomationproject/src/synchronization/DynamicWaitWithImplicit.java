package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWaitWithImplicit {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/?s_kwcid=AL!739!3!527345822107!e!!g!!www.flipkart.com%2F&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_eta_mobile_goog&gclid=Cj0KCQjwpcOTBhCZARIsAEAYLuUCQw_w2PyYd_4m5cFRHVInFMROXu5xuIJ3Id-iyaIjlDW5VArZDLoaAjT2EALw_wcB");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//span[.='Cart']")).click();
		
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _1sbqEe _3AWRsL']")).click();
		

	}

}
