package dataDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class AccessTheExcelData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		BaseClass bs = new BaseClass();
		String username = bs.FetchingDataFromExcelFile("./src/test/resources/UserData.xlsx", "Data", 1, 0);
		System.out.println(username);
		
		String password = bs.FetchingPassword("./src/test/resources/UserData.xlsx", "Data", 1, 1);
		System.out.println(password);
		
		int Count = bs.GetRowCount("./src/test/resources/UserData.xlsx", "Data");
		System.out.println(Count);
		
	}
}
