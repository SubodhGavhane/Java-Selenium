package Assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutomatingFacebookRegistrationPage {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		Thread.sleep(2000);

		WebElement CreateNewAccountLink = driver.findElement(By.linkText("Create new account"));
		CreateNewAccountLink.click();

		Thread.sleep(2000);

		WebElement FirstName = driver.findElement(By.name("firstname"));
		FirstName.sendKeys("Subodh");

		WebElement LastName = driver.findElement(By.name("lastname"));
		LastName.sendKeys("Gavhane");

		WebElement MobileOremail = driver.findElement(By.name("reg_email__"));
		MobileOremail.sendKeys("1234567890");

		WebElement NewPassword = driver.findElement(By.id("password_step_input"));
		NewPassword.sendKeys("abc@123");

		WebElement BD = driver.findElement(By.id("day"));
		BD.sendKeys("11");

		WebElement BM = driver.findElement(By.name("birthday_month"));
		BM.sendKeys("Jun");

		WebElement BY = driver.findElement(By.name("birthday_year"));
		BY.sendKeys("1998");

		Thread.sleep(2000);

		WebElement Gender = driver.findElement(By.cssSelector("value=2"));
		Gender.click();

		WebElement signUp = driver.findElement(By.name(""));
		signUp.click();

	}
}
