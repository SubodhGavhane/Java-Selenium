package Assigments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingMyntra {
	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://www.myntra.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement s = driver.findElement(By.className("desktop-searchBar"));
		s.sendKeys("jeans");
		
		driver.findElement(By.className("desktop-submit")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[text()='Men']")).click();
		
		driver.findElement(By.xpath("//label[text()='Roadster']")).click();
		
		driver.findElement(By.xpath("//span[text()='29']")).click();
		
		driver.findElement(By.xpath("//span[text()='237']")).click();
		
	}
}
