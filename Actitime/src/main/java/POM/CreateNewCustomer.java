package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCustomer extends BaseClass {

	public CreateNewCustomer(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath ="//input[@name='name']")
	private WebElement customeNameTextField;
	
	@FindBy(name = "createCustomerSubmit")
	private WebElement createCustomerButton;

	public WebElement getCustomeNameTextField() {
		return customeNameTextField;
	}

	public WebElement getCreateCustomerButton() {
		return createCustomerButton;
	}
	
	public void createCustomer(String customerName)
	{
		customeNameTextField.sendKeys(customerName);
		createCustomerButton.click();
	}

}
