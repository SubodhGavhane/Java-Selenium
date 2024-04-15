package dataDrivenFramework;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningMultipleTabs {
	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://www.facebook.com");

//
//		driver.switchTo().newWindow(WindowType.TAB);
//
//		driver.get("http://www.amazone.com");
//
//		driver.switchTo().newWindow(WindowType.TAB);
//
//		driver.get("http://www.zomato.com");
//
//		driver.switchTo().newWindow(WindowType.TAB);
//
//		driver.get("http://www.myntra.com");
//
//		driver.switchTo().newWindow(WindowType.TAB);
//
//		driver.get("http://www.swiggy.com");

		// FileInputStream fis=new
		// FileInputStream("./src/test/resources/URL.properties");

		// int rowCount = bs.GetRowCount("./src/test/resources/urldata.xlsx", "data");

		for (int i = 1; i <= 5; i++) {
			BaseClass bs = new BaseClass();
			String url = bs.FetchingDataFromExcelFile("./src/test/resources/urldata.xlsx", "data", i, 0);
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get(url);
		}

	}
}
