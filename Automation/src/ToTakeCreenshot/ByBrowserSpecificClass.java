package ToTakeCreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ByBrowserSpecificClass {
	public static void main(String[] args) throws IOException, InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.apple.com/in/");
		
		Thread.sleep(3000);

		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/demo.png");
		
		Files.copy(src, dest);
		
		
	}
}
