package KeywordDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

public class BaseTest implements IconstantKeywords {

	static WebDriver driver; // static global variable driver

	public void launchbrowser() throws IOException {

		BaseClass bs = new BaseClass(Property);

		String url = bs.GetDataFromPropertyFile("Url");
		String browser = bs.GetDataFromPropertyFile("browser");

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}

		else {
			System.out.println("invalid browser");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMESECONDS));
		driver.get(url);
	}

	public void login() throws IOException {
		BaseClass bs = new BaseClass(Property);
		String username = bs.GetDataFromPropertyFile("username");
		String password = bs.GetDataFromPropertyFile("password");

		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
	}

	public void CreateUserLink() {
		driver.findElement(By.xpath("//a[@class=\"content users\"]")).click();
		driver.findElement(By.xpath("//input[@value='Create New User']")).click();
	}

	public void CreateUser() throws EncryptedDocumentException, IOException, InterruptedException {
		BaseClass bs1 = new BaseClass(Excel, SheetName);

		String username1 = bs1.FetchingDataFromExcelFile(1, 0);
		driver.findElement(By.name("username")).sendKeys(username1);
		String password1 = bs1.FetchingDataFromExcelFile(1, 2);
		driver.findElement(By.name("passwordText")).sendKeys(password1, Keys.TAB, password1);
		String fn = bs1.FetchingDataFromExcelFile(1, 0);
		driver.findElement(By.name("firstName")).sendKeys(fn);
		String lastname = bs1.FetchingDataFromExcelFile(1, 1);
		driver.findElement(By.name("lastName")).sendKeys(lastname);
//		String pn = bs.FetchingDataFromExcelFile(userpath, "CreateUser", 1, 3);
//		driver.findElement(By.name("phone")).sendKeys(pn);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();

	}

	public void ToDeleteUser() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='gavhane, subodh (subodh)']")).click();
		driver.findElement(By.xpath("//input[@value='Delete This User']")).click();
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}

	// to close

	public void close() {
		driver.quit();
	}

}
