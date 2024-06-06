package POM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewUserPage extends BaseClass {

	public CreateNewUserPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(name = "username")
	private WebElement username;

	@FindBy(name = "passwordText")
	private WebElement passwordTextField;

	@FindBy(name = "passwordTextRetype")
	private WebElement RetypePass;

	@FindBy(name = "firstName")
	private WebElement firstname;

	@FindBy(name = "lastName")
	private WebElement lastname;

	@FindBy(xpath = "//input[@value='   Create User   ']")
	private WebElement Createbtn;

	// Delete User webElements
	@FindBy(xpath = "//a[text()='Gavhane, subodh (subodh)']")
	private WebElement DeleteUsername;

	@FindBy(xpath = "//input[@onclick='return deleteUser();']")
	private WebElement DeleteBtn;
	
	
	public void DeletreCreatedUser() throws InterruptedException {
		DeleteUsername.click();
		Thread.sleep(1000);
		DeleteBtn.click();

		WebDriver driver = null;
		Alert act = driver.switchTo().alert();
		Thread.sleep(1000);
		act.accept();
	}


	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return passwordTextField;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getCreatebtn() {
		return Createbtn;
	}

	public void CreateUser1(String Username, String password, String Lastname) throws InterruptedException {

//		CreateUserButton.click();
//		Thread.sleep(1000);
		username.sendKeys(Username);
		Thread.sleep(1000);
		passwordTextField.sendKeys(password);
		RetypePass.sendKeys(password);

		firstname.sendKeys(Username);
		lastname.sendKeys(Lastname);
		Createbtn.click();
		Thread.sleep(1000);
	}



}
