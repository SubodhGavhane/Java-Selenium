package AutomatingEndToEndScenarioScript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingShoppersStack {
	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.id("Email")).sendKeys("subodhgavhane27@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Sidharth@123");

		driver.findElement(By.className("MuiButton-label")).click();

		WebElement ref = driver.findElement(By.linkText("Home"));

		if (ref.isDisplayed()) {
			System.out.println("Login succesful");
		} else {
			System.out.println("login failed");
		}

		System.out.println("=======================================");
		
		driver.findElement(By.xpath("//span[text()='APPLE iPhone 14 Pro']")).click();

		Thread.sleep(2000);

		driver.findElement(By.name("Add To Cart")).click();

		driver.findElement(By.xpath("//a[@id='cart']")).click();

		if (ref.isDisplayed()) {
			System.out.println("product is added in cart");
		} else {
			System.out.println("product is not available in cart");
		}

		System.out.println("=======================================");

		List<WebElement> Pname = driver.findElements(By.xpath("//p[text()='APPLE iPhone 14 Pro']"));
		List<WebElement> PPrice = driver.findElements(By.xpath("//p[text()='APPLE iPhone 14 Pro']/ancestor::div[@class=\"MuiPaper-root MuiCard-root cart_cartProduct__6vbyW MuiPaper-elevation1 MuiPaper-rounded\"]/descendant::p[@class=\"CalculateOffer_wrapper__2XD4R\"]"));

		for (int i = 0; i < Pname.size(); i++) {
			System.out.println(Pname.get(i).getText()+"========"+PPrice.get(i).getText());
			System.out.println("=============================================");
		}

		driver.findElement(By.xpath("(//button[@type=\"button\"])[1]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//div[@class=\"MuiListItemIcon-root css-1f8bwsm\"])[6]")).click();

		String ExpectedLink = driver.getCurrentUrl();
		String ActualLink = "https://www.shoppersstack.com/";

		if (ExpectedLink.equals(ActualLink)) {
			System.out.println("successfully logged Out");
		} else {
			System.out.println("still Logged In");
		}
	}
}
