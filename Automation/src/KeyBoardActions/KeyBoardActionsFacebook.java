package KeyBoardActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardActionsFacebook {
	public static void main(String[] args) throws  AWTException, InterruptedException {
			
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("xyz");
		
		Robot copy=new Robot();
		
		copy.keyPress(KeyEvent.VK_CONTROL);
		copy.keyPress(KeyEvent.VK_A);
		copy.keyPress(KeyEvent.VK_C);
		
		//to release
		copy.keyRelease(KeyEvent.VK_CONTROL);
		copy.keyRelease(KeyEvent.VK_A);
		copy.keyRelease(KeyEvent.VK_C);
		
		copy.keyPress(KeyEvent.VK_TAB);
		copy.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		
		copy.keyPress(KeyEvent.VK_CONTROL);
		copy.keyPress(KeyEvent.VK_V);
		
		//to release
		copy.keyRelease(KeyEvent.VK_CONTROL);
		copy.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}
}
