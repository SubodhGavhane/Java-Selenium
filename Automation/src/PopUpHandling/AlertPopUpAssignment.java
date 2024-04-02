package PopUpHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpAssignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.demoblaze.com/");

		driver.findElement(By.id("login2")).click();
		driver.findElement(By.id("loginusername")).sendKeys("subodhgavhane23@gmail.com", Keys.TAB, "Sidharth@123");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(2000);
		//Adding first product to cart
		driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']")).click();
		driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
		Thread.sleep(2000);
		Alert act = driver.switchTo().alert();
		act.accept();
		
		driver.findElement(By.xpath("//li[@class='nav-item active']")).click();
		
		//Adding 2nd product to cart
		driver.findElement(By.xpath("//a[text()='Nokia lumia 1520']")).click();
		
		driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
		Thread.sleep(2000);
		Alert act1 = driver.switchTo().alert();
		act1.accept();
		
		//click on cart link
		driver.findElement(By.id("cartur")).click();
		
		//finding the total price webelement
		WebElement Verify = driver.findElement(By.xpath("//div[@class='panel-heading']"));
		
		Thread.sleep(2000);
		String ActualPrice = Verify.getText();
		System.out.println(ActualPrice);
		
		String ExpectedPrice="1180";
		
		if(ActualPrice.equals(ExpectedPrice))
		{
			System.out.println("Correct Price");
		}
		else {
			System.out.println("Wrong Price");
		}

	}
}
