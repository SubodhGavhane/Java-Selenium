package WorkingWithSearchcontextMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFindElementsMethod {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com");
		// search ipad in flipkart
		driver.findElement(By.name("q")).sendKeys("ipad", Keys.ENTER);
		// identify all the ipad name and print it
		List<WebElement> ipadName = driver.findElements(By.xpath("(//a[@class='s1Q9rs'])[3]"));
		//identify all ipad price
		List<WebElement> ipadPrice = driver.findElements(By.xpath("(//div[@class='_3I9_wc'])[3]"));

		
		// for each loop
		for(WebElement name:ipadName)
		{
			System.out.println(name.getText());
		}

//		// for loop
//		for (int i = 0; i < ipadName.size(); i++) {
//			System.out.println(ipadName.get(i).getText()+"___________"+ipadPrice.get(i).getText());
//		}
	}

}