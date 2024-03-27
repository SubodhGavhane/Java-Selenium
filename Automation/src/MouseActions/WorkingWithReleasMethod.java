package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithReleasMethod {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
			
			Actions act = new Actions(driver);
			act.clickAndHold(driver.findElement(By.id("circle"))).perform(); //used to click and hold on perticular webelement
			Thread.sleep(3000);
			
			act.release().perform(); //used to release the perticult webelement
	}
		
}