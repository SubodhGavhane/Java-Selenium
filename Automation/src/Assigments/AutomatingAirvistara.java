package Assigments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingAirvistara {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// Synchronization
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.airvistara.com/");

		driver.findElement(By.xpath("//button[@id='cookieModalCloseBtn']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Search origin']")).sendKeys("PAT");

		driver.findElement(By.xpath("//input[@name=\'flightSearchFrom\']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Search destination']")).sendKeys("BOM");

		driver.findElement(By.xpath("//input[@id='departCalendar']")).click();

		driver.findElement(By.xpath("//a[text()='14']")).click();

		driver.findElement(By.xpath("//a[text()='15']")).click();

		driver.findElement(By.xpath("//input[@id=\'passengers\']")).click();

		driver.findElement(By.xpath("//input[@placeholder=\'adult\']")).click();

		driver.findElement(By.xpath("(//button[text()='Done'])[2]")).click();

		driver.findElement(By.xpath("//button[@id='book-flight-widget']")).click();
	}
}
