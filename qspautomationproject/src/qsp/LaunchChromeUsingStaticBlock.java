package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeUsingStaticBlock {
	
	static {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	

	public static void main(String[] args) {
		new ChromeDriver();

	}

}
