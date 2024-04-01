package JavaScriptExcecutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class MixedAssignment {
	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.bluestone.com/");

		// handling popup
		driver.findElement(By.id("denyBtn")).click();

		WebElement GoldCoin = driver.findElement(By.xpath("//a[text()='Gold Coins ']"));

		Actions act = new Actions(driver);

		act.moveToElement(GoldCoin).perform();

		driver.findElement(By.xpath("(//span[text()='2 gram'])[1]")).click();

		// identify the webelement to take screenshot

		WebElement coin = driver.findElement(By.xpath("//img[@alt='2 gram 24 KT Gold Coin']"));

		// screenshot of particular webelement
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = coin.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/2kg.png");
		Files.copy(src, dest);

		Thread.sleep(3000);

		// screenshot of full page

		File src1 = ts.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./screenshot/2kgFullPage.png");
		Files.copy(src1, dest1);

		// Scroll Down till Email TextField At Bottom

		WebElement email = driver.findElement(By.id("newsletter_subscriber"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true)", email);

		// insert email in email text field and click on subscribe button

		driver.findElement(By.id("newsletter_subscriber")).sendKeys("abc@gmail.com", Keys.ENTER);

	}
}
