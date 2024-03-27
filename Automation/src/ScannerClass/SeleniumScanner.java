package ScannerClass;

import java.time.Duration;
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
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
					driver.get("https://www.paytm.com");
					
				} else if (browser.equals("edge")) {
					WebDriver driver = new EdgeDriver();

					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
					driver.get("https://www.paytm.com");
				}

				else {
					System.out.println("invalid Input");
				}
			}

		}
	}
}