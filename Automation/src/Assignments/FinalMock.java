package Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import com.google.common.io.Files;

public class FinalMock {
	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.bluestone.com/");

		driver.findElement(By.id("denyBtn")).click();

		WebElement gift = driver.findElement(By.xpath("//span[@class='prcs-d nolink']"));

		Actions at = new Actions(driver);

		at.moveToElement(gift).perform();

		driver.findElement(By.xpath("//span[@data-p='gifts-him,m']")).click();

		driver.findElement(By.xpath("//div[@class='p-image']")).click();

		Set<String> AllID = driver.getWindowHandles();

		for (String ID : AllID) {
			driver.switchTo().window(ID);

		}

		 WebElement bluestone = driver.findElement(By.xpath("//img[@class='main-logo']"));

		//driver.findElement(By.id("buy-now")).click();

		File src = bluestone.getScreenshotAs(OutputType.FILE);

		File dest = new File("./screenshot/new12.png");
		Files.copy(src, dest);

	}
}
