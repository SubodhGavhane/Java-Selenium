package WorkingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingFlipkartUsingXpath {
public static void main(String[] args) throws InterruptedException {
	
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com/");
	
//	WebElement EmailOrPhone = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
//	EmailOrPhone.sendKeys("9970216519");
//	
//	
//	
//	WebElement ReqOTP = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
//	ReqOTP.click();
//	
//	Thread.sleep(5000);
//	
//	WebElement VeriFy = driver.findElement(By.xpath("//button[@class='_2KpZ6l _14EHzR _3dESVI']"));
//	VeriFy.click();
//	
//	Thread.sleep(2000);
	
	WebElement  Search = driver.findElement(By.xpath("//input[@type=\"text\"]"));
	Search.sendKeys("watch for mens");
	
	WebElement SearchClick = driver.findElement(By.xpath("//button[@title=\"Search for Products, Brands and More\"]"));
	SearchClick.click();
	
	driver.navigate().back();
	
	Thread.sleep(2000);
	
	WebElement  Search2 = driver.findElement(By.xpath("//input[@type=\"text\"]"));
	Search2.sendKeys("iphone 11 pro max");
	
	WebElement CrossSign = driver.findElement(By.xpath("//span[@role=\"button\"]"));
	CrossSign.click();
	
	WebElement SearchClick2 = driver.findElement(By.xpath("//button[@title=\"Search for Products, Brands and More\"]"));
	SearchClick2.click();
	
	Thread.sleep(2000);
	
	driver.close();
	
   }
}
