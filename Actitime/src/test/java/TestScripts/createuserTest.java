package TestScripts;

import POM.Homepage;
import POM.ValidLoginActitime;
import POM.UserListPage;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericLib.BaseTest;
import GenericLib.Flib;
import GenericLib.WorkingLib;
import POM.CreateNewUserPage;

public class createuserTest extends BaseTest {

	@Test(description = "Verify Admin Should Be Able To Create user")
	public void main() throws EncryptedDocumentException, IOException, InterruptedException {
		Flib lib = new Flib();

		// login
		String username = lib.getdatafrompropertfile("username");
		String pass = lib.getdatafrompropertfile("password");
		ValidLoginActitime vn = new ValidLoginActitime(driver);
		vn.ValidLogin(username, pass);

		WorkingLib lb = new WorkingLib();

		String username1 = lib.FetchingDataFromExcelFile(SheetName, 2, 0) + lb.randomMethod();
		String password1 = lib.FetchingDataFromExcelFile(SheetName, 2, 1) + lb.randomMethod();
		String Lastname = lib.FetchingDataFromExcelFile(SheetName, 2, 2) + lb.randomMethod();
		// to Create User

		Homepage hm = new Homepage(driver);
		hm.clickOnUsersLink();
		UserListPage pg = new UserListPage(driver);
		pg.clickOnCreateNewUserButton();
		CreateNewUserPage user = new CreateNewUserPage(driver);
		user.CreateUser1(username1, password1, Lastname);

		hm.getLogout();


	}

}
