package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidActitimeLogin {
	public static void main(String[] args) throws IOException {

		BaseClass bs = new BaseClass();
		String url = bs.GetDataFromPropertyFile("./src/test/resources/CommanData.properties", "Url");
		String username = bs.FetchingDataFromExcelFile("./src/test/resources/ActitmeTestData.xlsx", "Sheet1", 1, 0);
		String password = bs.FetchingDataFromExcelFile("./src/test/resources/ActitmeTestData.xlsx", "Sheet1", 1, 1);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get(url);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
	}
}
