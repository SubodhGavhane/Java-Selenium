package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenTasksPage extends BaseClass{

	public OpenTasksPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath ="//a[text()='Projects & Customers']")
	private WebElement projectAndCustomerLink;
	
	@FindBy(xpath = "//a[text()='Completed Tasks']")
	private WebElement CompleteTask;

	public WebElement getProjectAndCustomerLink() {
		return projectAndCustomerLink;
	}
	
	public WebElement ClickOnCompleteTaskLink()
	{
		return CompleteTask;
	}
	
	public void clickOnProjectAndCustomer()
	{
		projectAndCustomerLink.click();
	}
	
	public void ClickOnCompletetastLink()
	{
		CompleteTask.click();
	}
	
	
	
	
	

}