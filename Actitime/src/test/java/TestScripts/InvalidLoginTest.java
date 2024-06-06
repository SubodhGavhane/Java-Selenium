package TestScripts;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import GenericLib.BaseTest;
import GenericLib.Flib;
import GenericLib.IAutoConstant;
import POM.ValidLoginActitime;

public class InvalidLoginTest extends BaseTest {
	@Test
	public void InvalidLogin() throws EncryptedDocumentException, IOException, InterruptedException {

		Flib lib = new Flib();

		int count = lib.GetRowCount(InvalidSheetName);
		System.out.println(count);
		for (int i = 1; i <= count; i++) {
			String username = lib.FetchingDataFromExcelFile(InvalidSheetName, i, 0);
			String password = lib.FetchingDataFromExcelFile(InvalidSheetName, i, 1);
			ValidLoginActitime pg = new ValidLoginActitime(driver);
			pg.ValidLogin(username, password);
			Thread.sleep(1000);
			pg.clearUserNameTextField();
		}

		driver.close();

	}
}
