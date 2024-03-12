package SeleniumScannerPackage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeGetPosition {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		Dimension size = driver.manage().window().getSize();
		System.out.println(size);

		Point position = driver.manage().window().getPosition();
		System.out.println(position);

		driver.get("https://www.google.com");
	}

}
