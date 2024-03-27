package DropdownHandling;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateDrop {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/subod/OneDrive/Desktop/Duplicateprop.html");

		WebElement duplicateOptions = driver.findElement(By.id("Dropdown"));

		Select s = new Select(duplicateOptions);

		List<WebElement> duplicate = s.getOptions();

		for (WebElement List : duplicate) {
			System.out.println(List.getText());
		}

		System.out.println();

		HashSet h = new HashSet();

		for (WebElement List : duplicate) {
			h.add(List.getText());
		}
		System.out.println(h);

	}
}