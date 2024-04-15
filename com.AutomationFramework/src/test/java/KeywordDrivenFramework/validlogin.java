package KeywordDrivenFramework;

import java.io.IOException;

public class validlogin extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {

		BaseTest test = new BaseTest();
		test.launchbrowser();

		// login
		test.login();
		Thread.sleep(2000);

		// click on create link
		test.CreateUserLink();

		// calling create user method
		test.CreateUser();

		// To Delete user
		test.ToDeleteUser();
		Thread.sleep(2000);

		// test.close();
		driver.quit();
	}
}
