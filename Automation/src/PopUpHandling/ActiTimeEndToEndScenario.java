package PopUpHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActiTimeEndToEndScenario {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://127.0.0.1/login.do;jsessionid=2medf7o5oa9po");

		driver.switchTo().activeElement().sendKeys("admin");

		WebElement password = driver.findElement(By.xpath("//input[@type=\'password\']"));
		password.sendKeys("manager");

		driver.findElement(By.xpath("//a[@id='loginButton']")).click();

		Thread.sleep(3000);
			//to click on task link
		driver.findElement(By.xpath("(//td[@class='navItem relative'])[2]")).click();
		
		//project nad customer link
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();

		driver.findElement(By.xpath("//input[@onclick='addCustomer(this.form)']")).click();

		driver.findElement(By.name("name")).sendKeys("SBI1");

		driver.findElement(By.name("createCustomerSubmit")).click();

		driver.findElement(By.xpath("//input[@onclick='addProject(this.form)']")).click();

		WebElement CustomerDropdown = driver.findElement(By.xpath("//select[@name='customerId']"));

		Thread.sleep(2000);
		Select drop = new Select(CustomerDropdown);
	
		drop.selectByVisibleText("SBI1");
		
		driver.findElement(By.name("name")).sendKeys("Web Appliation");
		
		driver.findElement(By.name("createProjectSubmit")).click();
		
		driver.findElement(By.xpath("//a[text()='All']")).click();
		
		driver.findElement(By.xpath("//input[@onclick='deleteCustomersProjects(this.form)']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("deleteButton")).click();
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		Thread.sleep(2000);
		driver.close();
	}
}
