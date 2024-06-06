package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLib.BaseTest;

public class ValidLoginActitime extends BaseClass {

	public WebDriver driver;

	public ValidLoginActitime(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// identify username

	@FindBy(name = "username")
	private WebElement username;

	// identify password text field

	@FindBy(name = "pwd")
	private WebElement password;

	// identify login button

	@FindBy(id = "loginButton")
	private WebElement loginbtn;

//	@FindBy(xpath = "//a[text()='Logout']")
//	private WebElement logout;

	public WebElement getusername() {
		return username;

	}

	public WebElement getpassword() {
		return password;
	}

	public WebElement clickloginButton() {
		return loginbtn;
	}

	public void ValidLogin(String uname, String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginbtn.click();

	}
	
	public void invalidLogIn(String uname,String pass)
	{
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginbtn.click();
	}
	
	public void clearUserNameTextField()
	{
		username.clear();
	}
	

}
