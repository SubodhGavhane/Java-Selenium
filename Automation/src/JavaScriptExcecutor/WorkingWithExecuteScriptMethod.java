package JavaScriptExcecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithExecuteScriptMethod {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.netflix.com/in/");
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		//for scroll up
		js.executeScript("window.scrollBy(0,500);");
		
		Thread.sleep(3000);
		//to scroll down
		js.executeScript("window.scrollBy(0,-500);");
	}
}
