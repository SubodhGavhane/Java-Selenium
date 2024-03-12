package Assigments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingPaytmFligthBooking {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// Synchronization
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://paytm.com/");

		driver.findElement(By.xpath(
				"//img[@src=\'https://assetscdn1.paytm.com/images/catalog/view_item/733296/1626259884425.png\']"))
				.click();

		driver.findElement(By.xpath("//span[@class=\"_1Oyg-\"]")).click();

		// to clear the from text field
		driver.findElement(By.xpath("//input[@class='_1X2Sn _1DJkH']")).clear();

		// to insert new value
		driver.findElement(By.xpath("//div[contains(text(),'Chhatrapati')]")).click();

		// to select the TO field
		driver.findElement(By.xpath("//span[@id=\'destCity\']")).click();
		// to clear the To field
		driver.findElement(By.xpath("//input[@class='_1X2Sn _1DJkH']")).clear();

		// to select to city
		driver.findElement(By.xpath("//div[contains(text(),'Hamad International')]")).click();
		// to select date
		driver.findElement(By.xpath("//span[@id=\'departureDate\']")).click();

		driver.findElement(By.xpath("(//div[text()='8'])[1]")).click();
		// click on search button
		driver.findElement(By.xpath("//button[@id='flightSearch']")).click();

		/*
		 * WebElement price =
		 * driver.findElement(By.xpath("//section[@class=\"_2OdgL\"]")); String Air =
		 * price.getText(); System.out.println(Air);
		 */

		List<WebElement> flight = driver.findElements(By.className("_1gMv6"));

		for (int i = 0; i < flight.size(); i++) {
			System.out.println(flight.get(i).getText());
			System.out.println("============================");
		}

		// Thread.sleep(10000);
		// driver.quit();
	}
}
