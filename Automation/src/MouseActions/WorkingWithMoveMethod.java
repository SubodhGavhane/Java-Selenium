package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithMoveMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/mouseHover/tab?sublist=3");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement s = driver.findElement(By.xpath("//li[@class='Men p-4 relative']"));

		Actions act = new Actions(driver);
		act.moveToElement(s).perform();
	}
}