package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendThisMuchOnly {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	driver.get("https://demowebshop.tricentis.com/");

	driver.findElement(By.className("ico-login")).click();

	driver.findElement(By.name("Email")).sendKeys("subodhgavhane23@gmail.com");
	driver.findElement(By.name("Password")).sendKeys("Subodh@123");

	
	driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();

	driver.findElement(By.xpath("//ul[@class='top-menu']/descendant::a[contains(text(),'Books')]")).click();
	driver.findElement(By.xpath(
			"//a[@href='/computing-and-internet']/ancestor::div[@class='item-box']/descendant::input[@value='Add to cart']"))
			.click();

	driver.findElement(By.xpath("//li[@id='topcartlink']/descendant::span[@class='cart-label']")).click();
	driver.findElement(By.name("removefromcart")).click();
	driver.findElement(By.xpath("//select[@class='country-input']")).click();

	driver.findElement(By.xpath("//option[@value='41']")).click();
	driver.findElement(By.xpath("//input[@name='termsofservice']")).click();
	driver.findElement(By.xpath("//button[@id='checkout']")).click();
}
}
