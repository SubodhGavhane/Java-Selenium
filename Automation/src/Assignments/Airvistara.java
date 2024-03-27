package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Airvistara {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.airvistara.com/in/en");
		
		driver.findElement(By.id("cookieModalCloseBtn")).click();
		driver.findElement(By.name("flightSearchFrom")).sendKeys("PNQ");
		driver.findElement(By.name("flightSearchTo")).sendKeys("BOM");
		driver.findElement(By.name("depart")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=' May ']")).click();
		driver.findElement(By.xpath("//a[text()='11']")).click();
		driver.findElement(By.xpath("//a[text()='14']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='book-flight-widget']")).click();
		
		
		
		
		
		
		
		
	}
}
