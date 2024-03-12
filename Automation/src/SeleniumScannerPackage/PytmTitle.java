package SeleniumScannerPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PytmTitle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		String actualtitle = driver.getTitle();

		String expectedtitle = "Paytm: Secure & Fast UPI Payments, Recharge Mobile & Pay Bills";

		if (actualtitle.equals(expectedtitle)) {
			System.out.println("Test Case is correct");
		} else {
			System.out.println("Test Case is wrong");
		}
		driver.close();
	}
}
