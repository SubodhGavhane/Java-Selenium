package WorkingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAttribute {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.co.in/");

		driver.switchTo().activeElement().sendKeys("Chandler Bing", Keys.ENTER);

		driver.findElement(By.xpath("//div[@data-which-friend=\"friends_chandler\"]")).click();

		Thread.sleep(3000);

		driver.close();

	}
}
