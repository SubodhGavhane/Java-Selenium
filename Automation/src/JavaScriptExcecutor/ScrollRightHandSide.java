package JavaScriptExcecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollRightHandSide {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		for(int i=0;i<=0;i++) {
		js.executeScript("window.scrollBy(1000,0);");
		Thread.sleep(2000);
		}
		
		for(int i=0;i<=0;i++) {
			js.executeScript("window.scrollBy(-1000,0);");
			Thread.sleep(2000);
			}

	}
}
