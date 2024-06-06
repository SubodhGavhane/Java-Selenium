package ToTakeCreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class facebookLogoScreenshoot {
	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://www.facebook.com");

		WebElement FBLogo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));

		// TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src = FBLogo.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/fblogo.png");

		Files.copy(src, dest);
	}
}
