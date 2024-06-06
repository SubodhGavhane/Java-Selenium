package MyScripts;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://www.facebook.com");

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://www.instagram.com");

//		String expected = "Instagram";
//
//		String actual = driver.getTitle();

		Set<String> id = driver.getWindowHandles();

		for (String ID : id) {

			driver.switchTo().window(ID);

		}

	}
}
