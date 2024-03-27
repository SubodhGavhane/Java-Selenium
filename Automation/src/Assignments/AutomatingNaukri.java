package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomatingNaukri {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.naukri.com/");

		// click on registration link
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		// enter name in name text field
		driver.findElement(By.id("name")).sendKeys("abcgdrdsc");
		// enter email in email text field
		driver.findElement(By.id("email")).sendKeys("abcdevmm@gmail.com");
		// enter password in password text field
		driver.findElement(By.id("password")).sendKeys("abc@123");
		// enter mobile number in mobile text field
		driver.findElement(By.id("mobile")).sendKeys("9876543210");
		// click on i am fresher link
		driver.findElement(By.xpath("(//h2[@class='main-3'])[2]")).click();
		// select current city
		driver.findElement(By.xpath("//span[text()='Pune']")).click();
		// click on Register Button
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type=\"submit\"]"))).click();
		
		//click on login button
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		//enter email in email text field
		driver.findElement(By.id("usernameField")).sendKeys("abcdevmm@gmail.com");
		//enter password
		driver.findElement(By.id("passwordField")).sendKeys("abc@123");
		//click on login button
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
//		String ActualUrl=driver.getCurrentUrl();
//		
//		String ExpectedUrl="https://www.naukri.com/mnjuser/homepage";
//		 
//		if (ActualUrl.equals(ExpectedUrl)) {
//			System.out.println("Successfully Logged In");
//		}
//		else {
//			System.out.println("Invalid Login");
//		}

	}
}