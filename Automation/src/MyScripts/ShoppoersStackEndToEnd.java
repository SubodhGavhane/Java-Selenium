package MyScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppoersStackEndToEnd {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		driver.findElement(By.name("Email")).sendKeys("subodhgavhane27@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Sidharth@123");
		driver.findElement(By.className("MuiButton-label")).click();

		WebElement login = driver.findElement(By.className("active"));

		if (login.isDisplayed()) {
			System.out.println("successfully loged in");
		} else {
			System.out.println("login failed");
		}

		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='APPLE iPhone 14 Pro']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='Add To Cart']")).click();
		driver.findElement(By.xpath("//a[@id='cart']")).click();

		List<WebElement> pname = driver.findElements(By.xpath("//p[text()='APPLE iPhone 14 Pro']"));
		List<WebElement> pprice = driver.findElements(By.xpath("//p[@class='CalculateOffer_wrapper__2XD4R']"));

		for (int i = 0; i < pname.size(); i++) {
			System.out.println(pname.get(i).getText() + "=============" + pprice.get(i).getText());
		}

		WebElement CartVerify = driver.findElement(By.xpath("//p[text()='APPLE iPhone 14 Pro']"));

		if (CartVerify.isDisplayed()) {
			System.out.println("product is added to cart");
		} else {
			System.out.println("product is removed from cart");
		}
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@aria-label='Account settings']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[@role='menuitem'])[7]")).click();

		WebElement logout = driver
				.findElement(By.xpath("//h3[text()='Welcome to ShoppersStack. Enjoy shopping with us.']"));

		if (logout.isDisplayed()) {
			System.out.println("successfuly logged out");
		}
	}
}
