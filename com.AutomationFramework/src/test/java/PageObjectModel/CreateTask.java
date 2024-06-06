package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateTask {

	public CreateTask( WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[@class='content tasks']")
	private WebElement openTask;

	@FindBy(xpath="//a[text()='Projects & Customers']")
	private WebElement ProjectandCustomer;

	@FindBy(xpath = "//input[@onclick='addCustomer(this.form)']")
	private WebElement AddCustomer;
	
	@FindBy(name = "name")
	private WebElement CustomerName;

	@FindBy(name = "createCustomerSubmit")
	private WebElement CreateBtn;
	
	
	public WebElement GetOpentast()
	{
		return openTask;
	}
	
	public WebElement Project()
	{
		return ProjectandCustomer;
	}
	
	
	public WebElement AddCustomer()
	{
		return AddCustomer;
	}

	public WebElement CustomerName()
	{
		return CustomerName;
	}
	
	
	public WebElement CreateBtn()
	{
		return CreateBtn;
	}
	
	public void CreateUser(String Uname)
	{
		openTask.click();
		ProjectandCustomer.click();
		AddCustomer.click();
		CustomerName.sendKeys(Uname);
		CreateBtn.click();
		
	}

}
