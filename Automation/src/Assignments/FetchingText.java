package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingText {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://www.flipkart.com");

		driver.findElement(By.name("q")).sendKeys("iphone 14", Keys.ENTER);

		List<WebElement> name = driver.findElements(By.className("tUxRFH"));
		for (int i = 0; i < name.size(); i++) {
			System.out.println(name.get(i).getText());
			System.out.println("========================");
		}
	}
}
