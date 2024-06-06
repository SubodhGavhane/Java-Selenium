package GenericLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib implements IAutoConstant {

	public String getdatafrompropertfile(String key) throws IOException {
		FileInputStream fis = new FileInputStream(path);

		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}

	public String FetchingDataFromExcelFile(String sheetName,int rowNo, int cellNo) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(ExcelSheetPath);

		Workbook book = WorkbookFactory.create(fis);

		Sheet sheet = book.getSheet(sheetName);

		Row row = sheet.getRow(rowNo);

		Cell cell = row.getCell(cellNo);

		String Value = cell.getStringCellValue();

		return Value;

	}

	public int GetRowCount(String SheetName) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(ExcelSheetPath);

		Workbook book = WorkbookFactory.create(fis);

		Sheet sheet = book.getSheet(SheetName);

		int Count = sheet.getLastRowNum();
		return Count;
	}

}
