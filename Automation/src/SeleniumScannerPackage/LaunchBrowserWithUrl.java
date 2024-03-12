package SeleniumScannerPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserWithUrl {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.Flipkart.com/");

		String actual_title = driver.getTitle();

		String expected_title = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books &amp; More. Best Offers!";

		if (actual_title.equals(expected_title)) {
			System.out.println("test case is pass");
		} else {
		System.out.println("test case is fail");
		}
		driver.close();
	}
}
