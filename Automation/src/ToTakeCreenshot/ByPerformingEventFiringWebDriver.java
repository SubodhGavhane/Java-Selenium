package ToTakeCreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ByPerformingEventFiringWebDriver {
	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.flipkart.com");

		Thread.sleep(3000);

		EventFiringWebDriver e = new EventFiringWebDriver(driver);
		File src = e.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/demo1.png");
		Files.copy(src, dest);

	}
}
