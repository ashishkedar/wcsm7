package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//decalration

	@FindBy(xpath="//a[text()='Logout']") private WebElement Logoutlink;
	@FindBy(xpath="//a[text()='Create new tasks']") private WebElement createNewTask ;
	@FindBy(linkText="Settings") private WebElement settings;
	@FindBy(id="SubmitTTButton") private WebElement saveLeavebtn;
	
	
	//initilization
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
	//utilization
	
	
public WebElement getLogoutlink() 
{
	return Logoutlink;
}

public WebElement getCreateNewTask() 
{
	return createNewTask;
}
public WebElement getSettings() 
{
	return settings;

	
	}
public WebElement getSaveLeavebtn() {
	return saveLeavebtn;
}

  public void clickLogout() {
	   
	   Logoutlink.click();
   }
public void clicksaveLeavebtn()
{
	saveLeavebtn.click();
	
}
public void createNewTask()
{
	createNewTask.click();

}
}










