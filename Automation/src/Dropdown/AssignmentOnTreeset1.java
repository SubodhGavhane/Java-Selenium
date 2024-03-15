package Dropdown;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentOnTreeset1 {

		public static void main(String[] args) {
	     
			// Launch the browser
			WebDriver driver=new ChromeDriver();
			
			//maximize the browser
			driver.manage().window().maximize();
			
			//use implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			//Launch the web application
			driver.get("file:///C:/Users/subod/OneDrive/Desktop/SDropdown.html");
			
			// identify the particular drop-down
			WebElement dropdown = driver.findElement(By.id("Dropdown"));
			
			// create an object of the select class
			Select d=new Select(dropdown);
			
			//store in object ref. variable
			List<WebElement> options = d.getOptions();
			
			System.out.println("Here is a List of Duplicate values : ");
			
			System.out.println();
			
			// using for each loop
			for (WebElement List:options)
			{
				System.out.println(List.getText());
			}
			
			// find the size
			System.out.println("Total :- "+options.size());
			
			//Treeset does not acc. the duplicate value
			TreeSet t=new TreeSet();
			
			//using for each loop
			for (WebElement List:options)
			{
				t.add(List.getText());
			}
			
			System.out.println();
			System.out.println(t);
			
			// find the size
			System.out.println("Total :-"+t.size());
			
			
			
		}

	}
