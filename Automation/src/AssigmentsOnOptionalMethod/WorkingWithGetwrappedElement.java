package AssigmentsOnOptionalMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithGetwrappedElement {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	driver.get("https://demoapps.qspiders.com/");

	driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();

	driver.findElement(By.xpath("//section[text()='Dropdown']")).click();

	driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
	
	WebElement country = driver.findElement(By.id("select-multiple-native"));
	Select s2 = new Select(country);
	
	WebElement option = s2.getWrappedElement();
	
	System.out.println(option.getText());
}
}
