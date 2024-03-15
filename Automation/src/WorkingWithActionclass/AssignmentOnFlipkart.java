package WorkingWithActionclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentOnFlipkart {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/");
		
		WebElement fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(fashion).perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Men Footwear']")).click();
		
		driver.findElement(By.partialLinkText("Stylish Comfortable Lightweight")).click();
		
	     List<WebElement> ShoePage = driver.findElements(By.xpath("(//div[text()='BIRDE'])[1]"));
	     
	     Thread.sleep(2000);
	     
		 List<WebElement> ShoePrice = driver.findElements(By.xpath("(//div[@class='_30jeq3'])[1]"));
		
		for(int i=0;i<ShoePage.size();i++) {
			
			System.out.println(ShoePage.get(i).getText()+" price :- "+ShoePrice.get(i).getText());
		}
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Careers']")).click();
		
		WebElement JobDropdown = driver.findElement(By.xpath("(//a[text()='Jobs'])[1]"));
		
		Actions Drop=new Actions(driver);
		Drop.moveToElement(JobDropdown).perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[text()='Jobs @ India'])[1]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("candidate-login-before")).click();
		
		driver.findElement(By.name("username")).sendKeys("subodhgavhane@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("abc@123");
		
		Thread.sleep(2000);
		
		//driver.findElement(By.id("recaptcha-anchor")).click();
		
		//Thread.sleep(2000);
		
		driver.findElement(By.id("loginbtn")).click();
		
		
	}
}
