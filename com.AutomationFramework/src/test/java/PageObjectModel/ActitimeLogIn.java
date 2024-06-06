package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLogIn {

	WebDriver driver;

	ActitimeLogIn(WebDriver d) {
		driver = d;

		PageFactory.initElements(driver, this);
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

	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logout;

	public WebElement getusername() {
		return username;

	}

	public WebElement getpassword() {
		return password;
	}

	public WebElement clickloginButton() {
		return loginbtn;
	}
	
	public WebElement logout()
	{
		return logout;
	}

	public void ValidLogin(String uname, String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginbtn.click();
		
	}

	public void LaunchBrowser() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public void CreateUserLink() {
		driver.findElement(By.xpath("//a[@class=\"content users\"]")).click();
		driver.findElement(By.xpath("//input[@value='Create New User']")).click();
	}

	public void Logout() throws InterruptedException {
		Thread.sleep(2000);
		logout.click();
	}
	// Close Browser

	public void Close() {
		driver.quit();
	}

}
