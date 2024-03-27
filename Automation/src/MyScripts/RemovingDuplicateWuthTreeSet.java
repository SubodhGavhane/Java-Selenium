package MyScripts;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemovingDuplicateWuthTreeSet {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("file:///C:/Users/subod/OneDrive/Desktop/Dropdown2.html");

		//identify dropdown
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		//create object for Select class
		Select s = new Select(dropdown);
		//store all option in one reference variable
		List<WebElement> options = s.getOptions();
		//print dropdown using for loop
		for (int i = 0; i < options.size(); i++) {

			System.out.println(options.get(i).getText());

		}
		
		System.out.println();
			//create object for Treeset
		TreeSet<String> t = new TreeSet<String>();
		//use for loop to remove duplicate values
		for (WebElement List : options) {
			t.add(List.getText());
		}
		System.out.println();
		System.out.println(t);

	}
}
