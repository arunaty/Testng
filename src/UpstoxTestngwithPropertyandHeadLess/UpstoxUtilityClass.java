package UpstoxTestngwithPropertyandHeadLess;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UpstoxUtilityClass {

	public static String getUserLogins(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(
				"C:\\Users\\lakha\\Desktop\\Software Testing\\Automation Testing Notes\\Selenium Practice Demo\\upstoxlogin.xlsx");
		Sheet datasheet = WorkbookFactory.create(file).getSheet("Sheet2");

		String value = datasheet.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return value;
	}

	// get the main auth from properties files
	public static String getdataFromProperty(String key) throws IOException {
		FileInputStream file = new FileInputStream(
				"C:\\Users\\lakha\\eclipse-workspace\\TestNG Selenium Project\\upstoxpropertyfile.properties");

		Properties property = new Properties();
		property.load(file);

		String value=property.getProperty(key);
		return value;
	}

}
