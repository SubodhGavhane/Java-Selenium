package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomatingDemoDropdown {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demoapps.qspiders.com/");

		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();

		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();

		driver.findElement(By.name("ph")).sendKeys("9876543210");
//		driver.findElement(By.id("select2")).click();
//		driver.findElement(By.id("option11")).click();
//
//		driver.findElement(By.id("select3")).click();
//		driver.findElement(By.id("countryOpt6")).click();
//
//		driver.findElement(By.id("select5")).click();
//		driver.findElement(By.id("StateOpt22")).click();

		WebElement Gender = driver.findElement(By.id("select2"));
		Select s = new Select(Gender);
		s.selectByIndex(1);

		WebElement country = driver.findElement(By.id("select3"));
		Select s2 = new Select(country);
		s2.selectByValue("India");

		WebElement state = driver.findElement(By.id("select5"));
		Select s3 = new Select(state);
		s3.selectByValue("Maharashtra");

		WebElement city = driver.findElement(
				By.xpath("//div[@class='w-full lg:w-4/12'][3]/descendant::select[contains(@class,'duration')]"));
		city.click();

		Select s4 = new Select(city);
		s4.selectByValue("Nandurbar");

		WebElement quantity = driver.findElement(By.id("select7"));
		Select s5 = new Select(quantity);
		s5.selectByValue("3");

		driver.findElement(By.xpath("//button[text()='Continue']")).click();

		Thread.sleep(2000);
		List<WebElement> price = driver.findElements(By.xpath("(//p[@class='font-bold'])[2]"));

		for (int i = 0; i < price.size(); i++) {
			System.out.println("The Total Price Is :- " + price.get(i).getText());
		}

	}
}
