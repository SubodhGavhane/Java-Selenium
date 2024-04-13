package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataDrivenFramework {
	public static void main(String[] args) throws IOException {

		// creating object for fileinputsream class
		FileInputStream file = new FileInputStream("./TestData/CommonData.properties");

		// creating object for properties class
		Properties pr = new Properties();

		// loading the data
		pr.load(file);

		// fetching data from file
		String data = pr.getProperty("username");
		System.out.println(data);
		

	}
}
