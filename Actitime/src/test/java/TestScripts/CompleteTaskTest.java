package TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericLib.BaseTest;
import GenericLib.Flib;
import POM.Homepage;
import POM.OpenTasksPage;
import POM.ValidLoginActitime;

public class CompleteTaskTest extends BaseTest {

	@Test
	public void Completetask() throws EncryptedDocumentException, IOException {

		Flib lib = new Flib();
		String username = lib.FetchingDataFromExcelFile(SheetName, 1, 0);
		String password = lib.FetchingDataFromExcelFile(SheetName, 1, 1);

		ValidLoginActitime vl = new ValidLoginActitime(driver);
		vl.ValidLogin(username, password);

		Homepage pg = new Homepage(driver);
		pg.clickOnTasksLink();

		OpenTasksPage opentask = new OpenTasksPage(driver);

		opentask.ClickOnCompletetastLink();
		
		pg.clickOnLogout();
	
	}
}
