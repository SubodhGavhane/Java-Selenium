package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/login/");

		// identift webelement

		driver.findElement(By.id("email")).sendKeys("subodhgavhane@gmail.com");

		driver.findElement(By.name("pass")).sendKeys("Sidharth");

		driver.findElement(By.id("loginbutton")).click();
	}
}
