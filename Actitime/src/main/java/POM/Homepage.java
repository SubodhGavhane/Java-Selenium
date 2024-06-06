package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLib.BaseTest;

public class Homepage extends BaseClass{
	
	public Homepage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[@class='content tasks']")
	private WebElement openTask;

	@FindBy(xpath = "//a[@class='logout']")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}

	@FindBy(xpath = "//a[@class='content users']")
	private WebElement CreateUserLink;

	public WebElement getOpenTask() {
		return openTask;
	}

	public WebElement getCreateUserLink() {
		return CreateUserLink;
	}
	
	public void clickOnUsersLink()
	{
		CreateUserLink.click();
	}
	
	public void clickOnTasksLink()
	{
		openTask.click();
	}
	
	public void clickOnLogout()
	{
		logout.click();
	}

}