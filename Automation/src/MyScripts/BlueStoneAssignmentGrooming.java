package MyScripts;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BlueStoneAssignmentGrooming {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.bluestone.com/");

		Thread.sleep(2000);

		driver.findElement(By.id("denyBtn")).click();

		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("Gold Coin");

		driver.findElement(By.xpath("//input[@name='submit_search']")).click();

		driver.findElement(By.xpath("//a[@id='pid_5920']")).click();

		Set<String> AllId = driver.getWindowHandles();

		for (String id : AllId) {
			driver.switchTo().window(id);
		}

		driver.findElement(By.xpath("//input[@placeholder='Pincode']")).sendKeys("123456");

		driver.findElement(By.xpath("//div[@class='buynow-block col-xs-7']")).click();

		WebElement drp = driver.findElement(By.xpath("//select[@class='qty']"));

		Select dropdown = new Select(drp);

		dropdown.selectByVisibleText("3");
		
		driver.findElement(By.xpath("//a[text()='Place Order']")).click();

	}
}
