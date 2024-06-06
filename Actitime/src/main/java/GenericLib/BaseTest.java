package GenericLib;

import org.testng.annotations.BeforeClass;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class BaseTest extends Flib {

	public static WebDriver driver;
	//public static WebDriver Sdriver;

	// @Parameters("browser")
	@BeforeClass()
	public void launchbrowser() throws IOException {
		Flib flib = new Flib();
		String browser = flib.getdatafrompropertfile("browser");
		String url = flib.getdatafrompropertfile("url");
		System.out.println("opning ====" + browser + "==== please wait");
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		}

		else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}

		else {
			Reporter.log("invalid Browser", true);
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get(url);

	}

//	@AfterMethod(description = "logged out Successfully")
//	public void logout() throws InterruptedException {
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//a[@class='logout']")).click();
//	}

	// close browser
//	@AfterClass(description = "browser closed successfully")
	public void close() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}

}
