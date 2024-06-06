package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLib.WorkingLib;

public class CreateNewProjectPage extends BaseClass {

	public CreateNewProjectPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(name = "customerId")
	private WebElement customerDropdown;

	@FindBy(name = "createProjectSubmit")
	private WebElement createProjectBtn;

	public WebElement getProjectnameTextfeild() {
		return ProjectnameTextfeild;
	}

	@FindBy(name = "name")
	private WebElement ProjectnameTextfeild;

	public WebElement getCustomerNametextField() {
		return customerDropdown;
	}

	public WebElement getCreateCustomerBtn() {
		return createProjectBtn;
	}

	public void createCustomerAndProject(WebDriver driver, String CustomerName, String ProjectName)
			throws InterruptedException {
		CreateNewCustomer NC = new CreateNewCustomer(driver);
		NC.createCustomer(CustomerName);
		ActiveProjectAndcustomerPage pg = new ActiveProjectAndcustomerPage(driver);
		pg.getCreateNewProjectBtn();

		WorkingLib lb = new WorkingLib();

		lb.selectByVisibleText(customerDropdown, CustomerName);
		ProjectnameTextfeild.sendKeys(ProjectName);
		createProjectBtn.click();
	}

}
