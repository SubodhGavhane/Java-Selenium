package WorkingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FacebookLoginPage {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/login/");

		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("abc@gmail.com");

		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("abc@123");

		WebElement loginButton = driver.findElement(By.id("loginbutton"));
		loginButton.click();

		Thread.sleep(2000);

		String actual = driver.getCurrentUrl();

		String expected = "https://www.facebook.com/";

		if (actual.equals(expected)) {
			System.out.println("test case correct");
		} else {
			System.out.println("test case is failed");
		}

		driver.manage().window().minimize();

		//driver.close();

	}
}
