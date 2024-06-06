package TestScripts;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import GenericLib.BaseTest;
import GenericLib.Flib;
import POM.Homepage;
import POM.ValidLoginActitime;

public class ValidLoginTest extends BaseTest {

	@Test(description = "user should be able to login")
	public void login() throws IOException, InterruptedException {
		Flib lib = new Flib();
		Homepage HG = new Homepage(driver);

		String username = lib.FetchingDataFromExcelFile(SheetName, 1, 0);
		String password = lib.FetchingDataFromExcelFile(SheetName, 1, 1);
		ValidLoginActitime pg = new ValidLoginActitime(driver);
		pg.ValidLogin(username, password);
		Thread.sleep(2000);
		HG.clickOnLogout();
		
		System.out.println("logged out successfully");
	}

}
