package TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import GenericLib.BaseTest;
import GenericLib.Flib;
import GenericLib.WorkingLib;
import POM.ActiveProjectAndcustomerPage;
import POM.CreateNewProjectPage;
import POM.Homepage;
import POM.OpenTasksPage;
import POM.ValidLoginActitime;

public class CreateNewcustomerAndProjectTset extends BaseTest {

	@Test
	public void Task() throws IOException, InterruptedException {
		Flib lib = new Flib();

		WorkingLib lb = new WorkingLib();
		// login
		String username = lib.getdatafrompropertfile("username");
		String pass = lib.getdatafrompropertfile("password");
		ValidLoginActitime vn = new ValidLoginActitime(driver);
		vn.ValidLogin(username, pass);
		Homepage hm = new Homepage(driver);
		hm.clickOnTasksLink();
		OpenTasksPage pg = new OpenTasksPage(driver);
		pg.clickOnProjectAndCustomer();

		// click on new customer btn
		ActiveProjectAndcustomerPage ACP = new ActiveProjectAndcustomerPage(driver);
		ACP.CreatenewCustomerBtn();

		String CustomerName1 = lib.FetchingDataFromExcelFile(SheetName, 1, 2) + lb.randomMethod();
		String projectName = lib.FetchingDataFromExcelFile(SheetName, 1, 3) + lb.randomMethod();

		CreateNewProjectPage pj = new CreateNewProjectPage(driver);
		pj.createCustomerAndProject(driver, CustomerName1, projectName);

//		hm.clickOnLogout();
//		BaseTest bt = new BaseTest();
//		bt.close();

	}
}
