package SeleniumScannerPackage;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumScanner {

	public static void main(String[] args) {
		while (true) {
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("enter Browser name :");

				String browser = sc.next();
				if (browser.equals("chrome")) {

					WebDriver driver = new ChromeDriver();

					driver.manage().window().maximize();
					driver.get("https://www.paytm.com");
					driver.close();
				} else if (browser.equals("edge")) {
					WebDriver driver = new EdgeDriver();

					driver.manage().window().maximize();
					driver.get("https://www.paytm.com");
					driver.close();
				}

				else {
					System.out.println("invalid Input");
				}
			}

		}
	}
}
