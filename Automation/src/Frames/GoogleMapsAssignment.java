package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMapsAssignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.google.com/");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='https://www.google.co.in/intl/en/about/products']")).click();

		driver.switchTo().frame("app");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("qsp wakad", Keys.ENTER);

		WebElement Address = driver.findElement(By.xpath("(//div[@class='Io6YTe fontBodyMedium kR99db '])[1]"));

		System.out.println(Address.getText());

	}

}