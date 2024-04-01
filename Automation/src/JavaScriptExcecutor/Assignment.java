package JavaScriptExcecutor;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;

public class Assignment {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.id("user-name")).sendKeys("standard_user", Keys.ENTER);
		driver.findElement(By.id("password")).sendKeys("secret_sauce", Keys.ENTER);
		driver.findElement(By.id("login-button")).click();

		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();

		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart")).click();

		driver.findElement(By.id("shopping_cart_container")).click();

		WebElement verify = driver.findElement(By.xpath("//div[@class='inventory_item_price']"));

		String actualprice = verify.getText();

		System.out.println(actualprice);

		String expectedprice = "$29.99";

		if (actualprice.equals(expectedprice)) {
			System.out.println("correct price");
		} else {
			System.out.println("wrong price");
		}

		driver.findElement(By.name("checkout")).click();

		driver.findElement(By.id("first-name")).sendKeys("abc", Keys.TAB);
		driver.findElement(By.id("last-name")).sendKeys("xyz", Keys.TAB);
		driver.findElement(By.id("postal-code")).sendKeys("123456");

		driver.findElement(By.id("continue")).click();

		driver.findElement(By.id("finish")).click();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/img.png"); 
		Files.copy(src, dest);

	}
}
