package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class ActiveProjectAndcustomerPage extends BaseClass {

	public ActiveProjectAndcustomerPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@value='Create New Customer']")
	private WebElement createNewCustomerBtn;

	@FindBy(xpath = "//input[@value='Create New Project']")
	private WebElement createNewProjectBtn;

	public WebElement getCreateNewCustomerBtn() {
		return createNewCustomerBtn;
	}

	public WebElement getCreateNewProjectBtn() {
		return createNewProjectBtn;
	}

	public void CreatenewCustomerBtn() {
		createNewCustomerBtn.click();
	}

	public void CreateNewProjectBtn1() {
		createNewProjectBtn.click();
	}
	
	

}
