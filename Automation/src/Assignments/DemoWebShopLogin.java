package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopLogin {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("subodhgavhane23@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Sidharth@123");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		
	}
}
