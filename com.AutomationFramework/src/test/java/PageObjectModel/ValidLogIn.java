package PageObjectModel;

import java.io.IOException;

public class ValidLogIn extends BaseTest {
	public static void main(String[] args) throws InterruptedException, IOException {

		BaseTest test = new BaseTest();
		test.launchbrowser();
		Thread.sleep(2000);

		ActitimeLogIn act = new ActitimeLogIn(driver);
		BaseClass bs = new BaseClass(Property);
		act.ValidLogin(bs.GetDataFromPropertyFile("username"), bs.GetDataFromPropertyFile("password"));

		Thread.sleep(2000);
		// click on create user link
		act.CreateUserLink();

		Thread.sleep(2000);
		// creating the user
		test.CreateUser();

		Thread.sleep(2000);
		// delete the created user
		test.ToDeleteUser();

		Thread.sleep(2000);
		CreateTask tk = new CreateTask(driver);
		tk.CreateUser(CN);

		Thread.sleep(2000);
		// logout
		act.Logout();

		Thread.sleep(3000);
		act.Close();

	}
}
