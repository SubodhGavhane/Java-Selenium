package Assigments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithisEnabledMethod {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Synchronization
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demoapps.qspiders.com/");

		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();

		
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		
		WebElement NameTextField = driver.findElement(By.id("name"));
		
		

		if (NameTextField.isEnabled()) 
		{
			System.out.println("Name TextField is Enabled");
		} 
		else 
		{
			//NameTextField.click();
			System.out.println("Name TextField Is Disabled");
		}
	}
}
