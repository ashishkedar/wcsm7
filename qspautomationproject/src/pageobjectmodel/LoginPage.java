package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//declaration
	
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginbtn;
	@FindBy(id="keepLoggedInCheckBox") private WebElement keepmelogedin;
	@FindBy(xpath="//img[contains(@src,'timer')]") private WebElement logo;
	@FindBy(id="licenseLink") private WebElement Licencelink ;
	
	
    //initilization
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	public WebElement getUsn() {
		return usn;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	public WebElement getKeepmelogedin() {
		return keepmelogedin;
	}
	public WebElement getLogo() {
		return logo;
	}
	public WebElement getLicencelink() {
		return Licencelink;
}
	

	


//generic reusable method


public void actiTimevalidLogin(String validusername,String validpassword)
{
	usn.sendKeys(validusername);
	pass.sendKeys(validpassword);
	loginbtn.click();
}
public void actiTimeInvalidLogin(String invalidUsername,String invalidPassword) throws InterruptedException
{
	usn.sendKeys(invalidUsername);
	pass.sendKeys(invalidPassword);
	loginbtn.click();
	Thread.sleep(3000);
	usn.clear();
}
}

