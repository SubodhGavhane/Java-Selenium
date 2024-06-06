package DataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingExceldata {
	public static Object[][] MultipleExcelData() throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("src/test/resources/logindata.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("invalid");

		int rows = sheet.getPhysicalNumberOfRows();
		int cell = sheet.getRow(0).getPhysicalNumberOfCells();

		Object[][] data = new Object[rows - 1][cell];

		for (int i = 1; i < rows; i++) {
			for (int j = 0; j < cell; j++) {
				data[i - 1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}

		return data;

	}
}
