package Assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WorkingWithXpath {
	public static void main(String[] args) throws InterruptedException {
		// To launch browser
		WebDriver driver = new EdgeDriver();

		// to maximize the browser
		driver.manage().window().maximize();

		// to launch web application
		driver.get("https://demowebshop.tricentis.com/");

		// to register link
		WebElement register = driver.findElement(By.xpath("/html/body/div/div/div/div/div/ul/li[2]/a"));
		register.click();

		WebElement email = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div//div/input"));
		email.sendKeys("subodhgavhane23@gmail.com");

		WebElement pass = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div//div[3]//input[1]"));
		pass.sendKeys("Subodh@123");

		Thread.sleep(2000);

//		WebElement remeberMe = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div//div/input[2]"));
//		remeberMe.click();
		
		WebElement loginbutton = driver.findElement(By.xpath("/html/body/div/div/div/div//div//div//div//div[5]"));
		loginbutton.click();
		
		Thread.sleep(2000);
		
		WebElement logoutbutton = driver.findElement(By.xpath("/html/body/div/div/div/div/div/ul/li[2]/a"));
		logoutbutton.click();
	}
}
