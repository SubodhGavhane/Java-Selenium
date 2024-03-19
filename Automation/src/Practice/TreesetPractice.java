package Practice;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TreesetPractice {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/subod/OneDrive/Desktop/Dropdown2.html");

		WebElement Options = driver.findElement(By.id("Dropdown"));

		Select d = new Select(Options);
		List<WebElement> dropdown = d.getOptions();

		for (WebElement List:dropdown) {
			System.out.println(List.getText());
		}

		TreeSet t = new TreeSet();
		
		
		for(WebElement List:dropdown)
		{
			t.add(List.getText());
		}
		
		System.out.println();
		System.out.println(t);
		

	}
}
