package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class BaseClass {

	public String FetchingDataFromExcelFile(String path, String sheetName, int rowNo, int cellNo)
			throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(path);

		Workbook book = WorkbookFactory.create(fis);

		Sheet sheet = book.getSheet(sheetName);

		Row row = sheet.getRow(rowNo);

		Cell cell = row.getCell(cellNo);

		String Value = cell.getStringCellValue();

		return Value;

	}

	public String FetchingPassword(String path, String sheetName, int rowNo, int cellNo)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(path);

		Workbook book = WorkbookFactory.create(fis);

		Sheet sheet = book.getSheet(sheetName);

		Row row = sheet.getRow(rowNo);

		Cell cell = row.getCell(cellNo);

		String Value = cell.getStringCellValue();

		return Value;
	}

	public int GetRowCount(String path, String sheetName) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(path);

		Workbook book = WorkbookFactory.create(fis);

		Sheet sheet = book.getSheet(sheetName);

		int Count = sheet.getLastRowNum();
		return Count;
	}
	
	public String GetDataFromPropertyFile(String Path,String key) throws IOException
	{
		FileInputStream fis=new FileInputStream(Path);
		
		Properties ps=new Properties();
		ps.load(fis);
		String value = ps.getProperty(key);
		
		return value;
		
	}

}
