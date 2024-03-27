package Assignments;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PyatmAssignment {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://paytm.com/");
		String actualurl = driver.getCurrentUrl();

		String expectedurl = "https://paytm.com/";

		if (actualurl.equals(expectedurl)) {

			System.out.println("url is correct");
		} else {

			System.out.println("url is wrong");
		}

		//driver.manage().window().minimize();
		// driver.close();
	}
}