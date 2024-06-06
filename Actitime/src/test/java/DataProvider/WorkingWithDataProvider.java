package DataProvider;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithDataProvider {
	
	@DataProvider(name="testdata")
	public  Object[][] testdata() throws EncryptedDocumentException, IOException {

		return FetchingExceldata.MultipleExcelData();

	}
	
	@Test(dataProvider = "testdata")
	public  void login(String uname,String Pass) throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://subodhgavhane/login.do");
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("pwd")).sendKeys(Pass);
		
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(1000);
		
		driver.quit();
	}
}
