package ToTakeCreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class AssignmentOnTakesSccreenShot {
	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.apple.com/in/");
		Thread.sleep(3000);
		WebElement iphone = driver.findElement(By.xpath("//span[text()='iPhone']"));
		Actions act = new Actions(driver);
		act.click(iphone).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='iPhone 15']")).click();
		Thread.sleep(5000);
		TakesScreenshot s = (TakesScreenshot) driver;
		File src = s.getScreenshotAs(OutputType.FILE);

		File dest = new File("./screenshot/iphone.png");
		Files.copy(src, dest);
	}
}
