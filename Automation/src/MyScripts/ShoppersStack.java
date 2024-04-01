package MyScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppersStack {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.shoppersstack.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		driver.findElement(By.name("Email")).sendKeys("subodhgavhane27@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Sidharth@123");
		driver.findElement(By.className("MuiButton-label")).click();

		driver.findElement(By.id("addToCart")).click();

		driver.findElement(By.id("cartIcon")).click();

		// driver.findElement(By.xpath("(//button[text()='Remove from
		// cart'])[1]")).click();
		// driver.findElement(By.xpath("//button[text()='Yes']")).click();

		List<WebElement> str = driver.findElements(By.className("cart_cartBlock__dVkJH"));

		for (int i = 0; i <= str.size(); i++) {
			System.out.println(str.get(i).getText());
			System.out.println("=====================");
		}

//		if (str.isSelected()) {
//			System.out.println("product is still in cart");
//		} else {
//			System.out.println("product is removed from car");
//		}

//		driver.findElement(By.id("search")).sendKeys("watch");
//		driver.findElement(By.id("searchBtn")).click();

	}
}