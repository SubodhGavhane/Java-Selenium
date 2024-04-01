package PopUpHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpAssignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.demoblaze.com/");
		
		driver.findElement(By.id("login2")).click();
		driver.findElement(By.id("loginusername")).sendKeys("subodhgavhane23@gmail.com",Keys.TAB,"Sidharth@123");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']")).click();
		
		
		
	}
}
