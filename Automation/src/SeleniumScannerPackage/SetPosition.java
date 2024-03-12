package SeleniumScannerPackage;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		Point position = new Point(250, 250);

		driver.manage().window().setPosition(position);

		driver.get("https://www.google.com");

	}

}
