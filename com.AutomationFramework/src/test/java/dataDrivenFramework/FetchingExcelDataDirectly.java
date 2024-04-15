package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingExcelDataDirectly {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/UserData.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);
		
		Sheet sheet = book.getSheet("Data");
		Row row = sheet.getRow(1);
		
		// Username
		Cell username = row.getCell(0);

		// password
		Cell password = row.getCell(1);
		
		System.out.println(username);
		System.out.println(password);
		
		String id = username.getStringCellValue();
		String pass = password.getStringCellValue();

		System.out.println(id);
		System.out.println(pass);
		
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		
	}

}
