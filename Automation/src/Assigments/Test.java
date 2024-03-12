package Assigments;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("file:///C:/Users/subod/OneDrive/Desktop/textfield.html");

	WebElement multiselect=driver.findElement(By.id("Dropdown"));
	 
	Select s=new Select(multiselect);
	
	Thread.sleep(2000);
	
	for(int i=0;i<5;i++) {
		s.selectByIndex(i);
		Thread.sleep(2000);
	}	
	//deselect
	
	for(int i=0;i<=5;i++) {
		s.deselectByIndex(i);
		Thread.sleep(2000);
	}


		
	}
}
