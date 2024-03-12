package WorkingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathAdvanceCase1 {
public static void main(String[] args) throws InterruptedException {
//	// To launch browser
//			WebDriver driver = new ChromeDriver();
//
//			// to maximize the browser
//			driver.manage().window().maximize();
//
//			// to launch web application
//			driver.get("https://demowebshop.tricentis.com/");
//
//			// to register link
//			WebElement login = driver.findElement(By.xpath("//a[@class=\"ico-login\"]"));
//			login.click();
	
	
	// To launch browser
//				WebDriver driver = new ChromeDriver();
//
//				// to maximize the browser
//				driver.manage().window().maximize();
//
//				// to launch web application
//				driver.get("https://demowebshop.tricentis.com/");
//
//				// to register link
//				WebElement ShoppingCart = driver.findElement(By.xpath("(//span[@class='cart-label'])[1]"));
//				ShoppingCart.click();
	
	
	WebDriver driver = new ChromeDriver();

	// to maximize the browser
	driver.manage().window().maximize();

	// to launch web application
	driver.get("https://www.netflix.com/in/login");

	// to register link
//	WebElement ShoppingCart = driver.findElement(By.xpath("(//span[@class='cart-label'])[1]"));
//	ShoppingCart.click();
	
	WebElement Email = driver.findElement(By.xpath("//input[@autocomplete='email']")); //by using text() function
	Email.sendKeys("subodhgavhane@gmail.com");
	
	WebElement pass = driver.findElement(By.xpath("//input[@type=\"password\"]")); //by using text() function
	pass.sendKeys("abc@123");
	
	WebElement login = driver.findElement(By.xpath("//button[@type=\"submit\"]")); //by using text() function
	login.click();
	
	Thread.sleep(2000);
	
	//driver.navigate().back();
 }
}
