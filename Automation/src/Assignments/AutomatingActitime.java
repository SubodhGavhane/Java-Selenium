package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingActitime {
	public static void main(String[] args) throws InterruptedException {

		// Random r=new Random();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=2medf7o5oa9po");

		driver.switchTo().activeElement().sendKeys("admin");

		WebElement password = driver.findElement(By.xpath("//input[@type=\'password\']"));
		password.sendKeys("manager");

		driver.findElement(By.xpath("//a[@id='loginButton']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@class=\"content users\"]")).click();

		driver.findElement(By.xpath("//input[@value='Create New User']")).click();

		driver.findElement(By.xpath("//input[@name=\'username\']")).sendKeys("PQR123");

		driver.findElement(By.xpath("//input[@name=\'passwordText\']")).sendKeys("asd@123");

		driver.findElement(By.xpath("//input[@name=\'passwordTextRetype\']")).sendKeys("asd@123");

		driver.findElement(By.xpath("//input[@name=\'firstName\']")).sendKeys("Sidharth");

		driver.findElement(By.xpath("//input[@name=\'lastName\']")).sendKeys("Gavhane");

		driver.findElement(By.xpath("//input[@value=\"   Create User   \"]")).click();

//			Thread.sleep(2000);
//			
//			driver.close();
	}
}