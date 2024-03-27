package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.css.model.Value;
import org.openqa.selenium.edge.EdgeDriver;

public class AutomatingDemoshop {

	public static void main(String[] args) throws InterruptedException {
		// To launch browser
		WebDriver driver = new EdgeDriver();

		// to maximize the browser
		driver.manage().window().maximize();

		// to launch web application
		driver.get("https://demowebshop.tricentis.com/");

		// to register link
		WebElement register = driver.findElement(By.className("ico-register"));
		register.click();

		// click male radio button
		WebElement RadioLink = driver.findElement(By.className("forcheckbox"));
		RadioLink.click();

		// to enter the value in FirstName textfield
		WebElement FirstName = driver.findElement(By.id("FirstName"));
		FirstName.sendKeys("abc");

		// to enter the value in LaststName textfield
		WebElement LaststName = driver.findElement(By.id("LastName"));
		LaststName.sendKeys("abc");

		WebElement Email = driver.findElement(By.id("Email"));
		Email.sendKeys("xyz@gmail.com");

		WebElement password = driver.findElement(By.name("Password"));
		password.sendKeys("abc@123");

		WebElement ConfirmPassword = driver.findElement(By.name("ConfirmPassword"));
		ConfirmPassword.sendKeys("abc@123");

		WebElement RegisterButoon = driver.findElement(By.name("register-button"));
		RegisterButoon.click();

		Thread.sleep(5000);

		driver.manage().window().minimize();

		driver.close();
	}
}