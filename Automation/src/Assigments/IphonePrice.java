package Assigments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IphonePrice {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.get("http://www.flipkart.com/");

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement s = driver.findElement(By.xpath("//input[@type=\"text\"]"));
	s.sendKeys("iphonne 14");

	driver.findElement(By.xpath("//button[@title=\"Search for Products, Brands and More\"]")).click();

	driver.findElement(By.xpath("//div[text()='Apple iPhone 14 (Starlight, 128 GB)']")).click();
		
	WebElement  price=driver.findElement(By.xpath("(//div[@class='_25b18c'])[2]"));
	
	String iphone = price.getText();
	System.out.println(iphone);




//	WebElement price = driver.findElement(By.xpath(
//			"(//button[@class=\"zHp8j\"]/ancestor::section[@id=\"flightsList\"]/descendant::span[@class=\"_13vkO\"])[18]"));
//	  price.click();

//	String iphone = price.getText();
//	System.out.println(iphone);
}
}
