package WindowBasedPopUpHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowBased {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");

		Thread.sleep(2000);

		driver.findElement(By.name("file"))
				.sendKeys("C:\\Users\\Subodh Gavhane\\Desktop\\All Text Files - Shortcut.lnk");

	}
}
