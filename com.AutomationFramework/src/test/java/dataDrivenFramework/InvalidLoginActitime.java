package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginActitime {
	public static void main(String[] args) throws IOException, InterruptedException {

		BaseClass bs = new BaseClass();
		String url = bs.GetDataFromPropertyFile("./src/test/resources/CommanData.properties", "Url");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		int RowCount = bs.GetRowCount("./src/test/resources/ActitmeTestData.xlsx", "InvalidCred");
		
		driver.get(url);
		for (int i = 0; i <= RowCount; i++) {

			String username = bs.FetchingDataFromExcelFile("./src/test/resources/ActitmeTestData.xlsx", "InvalidCred",
					i, 0);
			String password = bs.FetchingDataFromExcelFile("./src/test/resources/ActitmeTestData.xlsx", "InvalidCred",
					i, 1);

			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
		}

	}
}
