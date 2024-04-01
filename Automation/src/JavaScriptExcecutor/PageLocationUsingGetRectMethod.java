package JavaScriptExcecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLocationUsingGetRectMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://www.zomato.com/india");
		
		WebElement p = driver.findElement(By.xpath("//p[text()='Privacy']"));
		
		Rectangle location = p.getRect();
		
		int x=location.getX();
		int y=location.getY();
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy("+x+","+y+");");
	}
}
