package DropdownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomatingDemoWebShop {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.className("ico-login")).click();

		driver.findElement(By.name("Email")).sendKeys("subodhgavhane23@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Subodh@123");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();

		driver.findElement(By.xpath("//ul[@class='top-menu']/descendant::a[contains(text(),'Books')]")).click();
		driver.findElement(By.xpath(
				"//a[@href='/computing-and-internet']/ancestor::div[@class='item-box']/descendant::input[@value='Add to cart']"))
				.click();

		driver.findElement(By.xpath("//li[@id='topcartlink']/descendant::span[@class='cart-label']")).click();
		driver.findElement(By.name("removefromcart")).click();
		driver.findElement(By.xpath("//select[@class='country-input']")).click();

		driver.findElement(By.xpath("//option[@value='41']")).click();
		driver.findElement(By.xpath("//input[@name='termsofservice']")).click();
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		Thread.sleep(2000);
		WebElement drop = driver.findElement(By.name("billing_address_id"));
		Select s = new Select(drop);
		s.selectByValue("3526408");

		driver.findElement(By.xpath("//input[@onclick='Billing.save()']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();

		driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']")).click();

		driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']")).click();

		driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();

		driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']")).click();

		List<WebElement> text = driver
				.findElements(By.xpath("//strong[text()='Your order has been successfully processed!']"));

		for (int i = 0; i < text.size(); i++) {
			System.out.println(text.get(i).getText());
		}

		/*
		 * List<WebElement> Orderdetails =
		 * driver.findElements(By.xpath("//a[text()='Click here for order details.']"));
		 * 
		 * for(int a=0;a<Orderdetails.size();a++) {
		 * System.out.println("your order details Are :-"+Orderdetails.get(a).getText())
		 * ; } /*
		 * 
		 * // WebElement con=driver.findElement(By.xpath(
		 * "//input[@value='Continue']/ancestor::div[@id='checkout-step-billing']")); //
		 * con.click();
		 * 
		 * /*
		 * 
		 * driver.findElement(By.xpath("//button[@id='checkout']")).click();
		 * driver.findElement(By.xpath("//button[@id='checkout']")).click();
		 * driver.findElement(By.xpath("//button[@id='checkout']")).click();
		 * 
		 * //clickbutton
		 * //input[@value='Continue']/ancestor::div[@class='buttons']/descendant::span[@
		 * class='please-wait']
		 */

	}
}