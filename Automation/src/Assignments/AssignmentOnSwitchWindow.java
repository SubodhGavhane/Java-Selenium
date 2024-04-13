package Assignments;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnSwitchWindow {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.zomato.com/india");

		// identify the webelement to scroll down
		WebElement SocialLinks = driver.findElement(By.xpath("//h6[text()='Social links']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", SocialLinks);

		// opening all social links

//		driver.findElement(By.xpath("(//a[@class='sc-elhb8j-17 iDzUMo'])[1]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//div[@class='sc-elhb8j-7 jBOGYb'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//div[@class='sc-elhb8j-7 jBOGYb'])[3]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//div[@class='sc-elhb8j-7 jBOGYb'])[4]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//div[@class='sc-elhb8j-7 jBOGYb'])[5]")).click();

		List<WebElement> Social = driver.findElements(By.xpath("//a[@class='sc-elhb8j-17 iDzUMo']"));

		for (WebElement links : Social) {
			links.click();
			Thread.sleep(1000);
		}

		Thread.sleep(2000);
		//String ParentId = driver.getWindowHandle();

		Set<String> AllId = driver.getWindowHandles();

		for (String ID : AllId) {
			    driver.switchTo().window(ID);

			if (driver.getCurrentUrl().contains("https://www.instagram.com/zomato/")
					|| driver.getCurrentUrl().contains("https://twitter.com/zomato")
					|| driver.getCurrentUrl().contains("https://www.youtube.com/zomato")
					|| driver.getCurrentUrl().contains("https://www.facebook.com/zomato")
					|| driver.getCurrentUrl().contains("https://www.zomato.com/india")) 
			{
				driver.close();
				Thread.sleep(1000);
			}

		}

		//driver.switchTo().window(ParentId);

	}
}
