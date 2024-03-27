package DropdownHandling;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicatesOptionsFromDropdown {
	
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/subod/OneDrive/Desktop/Dropdown2.html");
		
		//create the object of select class
		Select s = new Select(driver.findElement(By.id("dropdown")));
		
		List<WebElement> duplicateOptions = s.getOptions();
		System.out.println();
		
		
		
		for(int i=0;i<duplicateOptions.size();i++)
		{
			System.out.println(duplicateOptions.get(i).getText());
		}
		
		System.out.println();
		
		TreeSet<String> set = new TreeSet<String>();
		
		for(WebElement options:duplicateOptions)
		{
			set.add(options.getText());	}
		
		System.out.println(set);
		
		
	}

}