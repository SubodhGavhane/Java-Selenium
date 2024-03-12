package SeleniumScannerPackage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		Dimension dimention = new Dimension(200,300);

		driver.manage().window().setSize(dimention);

		driver.get("https://www.google.com");

		//driver.close();
	}

}
