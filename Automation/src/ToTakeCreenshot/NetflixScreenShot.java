package ToTakeCreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class NetflixScreenShot {
	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.netflix.com/in/");

		WebElement net = driver.findElement(By.xpath("//span[@class='default-ltr-cache-0 ev1dnif0']889+"));

		File source = net.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/netflix.png");
		Files.copy(source, dest);

	}
}
