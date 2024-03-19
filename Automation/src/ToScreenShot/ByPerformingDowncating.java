package ToScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ByPerformingDowncating {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");

		RemoteWebDriver ts= (RemoteWebDriver) driver;
		
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/image3.png");
		Files.copy(Source, dest);
		
	}
}
