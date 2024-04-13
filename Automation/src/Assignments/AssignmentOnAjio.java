package Assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentOnAjio {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.ajio.com/");

		Thread.sleep(1000);

		driver.findElement(By.name("searchVal")).sendKeys("watch", Keys.ENTER);

		driver.findElement(By.xpath("//strong[text()='FOSSIL']")).click();

		String parentId = driver.getWindowHandle();

		Set<String> AllID = driver.getWindowHandles();

		for (String ID : AllID) {
			driver.switchTo().window(ID);

			if (driver.getTitle().contains("Buy Brown Watches for Men by FOSSIL")) {
				break;
			}
		}

		driver.findElement(By.xpath("//div[@class='pdp-addtocart-button']")).click();

		driver.switchTo().window(parentId);
		Thread.sleep(1000);
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[@class='ic-cart ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='delete-btn']")).click();

		Actions act = new Actions(driver);
		Thread.sleep(1000);

		act.click(driver.findElement(By.xpath("(//div[@class='delete-btn'])[2]"))).perform();

		Thread.sleep(1000);
		driver.quit();
	}
}
