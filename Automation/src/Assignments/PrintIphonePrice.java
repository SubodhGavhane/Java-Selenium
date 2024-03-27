package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintIphonePrice {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// Synchronization
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://www.flipkart.com/");

		WebElement s = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		s.sendKeys("iphonne 14");

		driver.findElement(By.xpath("//button[@title=\"Search for Products, Brands and More\"]")).click();

		/*
		 * WebElement price = driver.findElement(By.xpath(
		 * "//div[text()='Apple iPhone 14 (Starlight, 128 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class=\"_30jeq3 _1_WHN1\"]"
		 * )); price.click();
		 * 
		 * String iphone = price.getText(); System.out.println(iphone);
		 */

		/*
		 * List<WebElement> iphonePage = driver.findElements(By.className("_2kHMtA"));
		 * 
		 * for (int i = 0; i < iphonePage.size(); i++) {
		 * System.out.println(iphonePage.get(i).getText());
		 * System.out.println("============================");
		 */

		List<WebElement> iphonePage = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));

		for (int i = 0; i < iphonePage.size(); i++) {
			System.out.println(iphonePage.get(i).getText() + "----" + price.get(i).getText());
			System.out.println("============================");

		}

	}

}