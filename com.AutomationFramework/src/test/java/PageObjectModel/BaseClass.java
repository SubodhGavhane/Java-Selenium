package PageObjectModel;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class BaseClass implements IconstantKeywords {

	String path;
	String SheetName;

	BaseClass(String PropertyPath) {
		this.path = PropertyPath;
	}

	BaseClass(String ExcelPath, String SheetName) {
		this.path = ExcelPath;
		this.SheetName = SheetName;
	}

	public String FetchingDataFromExcelFile(int rowNo, int cellNo) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(path);

		Workbook book = WorkbookFactory.create(fis);

		Sheet sheet = book.getSheet(SheetName);

		Row row = sheet.getRow(rowNo);

		Cell cell = row.getCell(cellNo);

		String Value = cell.getStringCellValue();

		return Value;

	}

	public String FetchingPassword(int rowNo, int cellNo) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(path);

		Workbook book = WorkbookFactory.create(fis);

		Sheet sheet = book.getSheet(SheetName);

		Row row = sheet.getRow(rowNo);

		Cell cell = row.getCell(cellNo);

		String Value = cell.getStringCellValue();

		return Value;
	}

	public int GetRowCount() throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(path);

		Workbook book = WorkbookFactory.create(fis);

		Sheet sheet = book.getSheet(SheetName);

		int Count = sheet.getLastRowNum();
		return Count;
	}

	public String GetDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream(path);

		Properties ps = new Properties();
		ps.load(fis);
		String value = ps.getProperty(key);

		return value;

	}

}
