package ToTakeCreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class ScreenshotOfPerticularWebElement {
	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://www.bluestone.com/");

		driver.findElement(By.id("denyBtn")).click();

		WebElement goldcoin = driver.findElement(By.xpath("//a[text()='Gold Coins ']"));

		Actions act = new Actions(driver);

		act.moveToElement(goldcoin).perform();

		goldcoin.click();

		WebElement coin = driver.findElement(By.xpath("//img[@alt='1 gram 24 KT Gold Coin']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// for scroll up
		js.executeScript("window.scrollBy(0,300);");

		File Source = coin.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/image4.png");
		Files.copy(Source, dest);

	}
}
