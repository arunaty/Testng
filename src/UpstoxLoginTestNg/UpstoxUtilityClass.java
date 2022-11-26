package UpstoxLoginTestNg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UpstoxUtilityClass {

	//Author name: Lakhan A.
	// this a utility file use to definne a different funtionality which will be
	// commanly use in a automations
	
	
	
	// read a excell file and get the data which requrested
	public static String getUserLogins(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(
				"C:\\Users\\lakha\\Desktop\\Software Testing\\Automation Testing Notes\\Selenium Practice Demo\\upstoxlogin.xlsx");
		Sheet datasheet = WorkbookFactory.create(file).getSheet("Sheet2");

		String value = datasheet.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return value;
	}
	
	
	//this method will fetch the data from a properties file as key requested
	
	public static String getPropertyFileData(String key) {
		
		
		
		
		return key;
		
	}
	
	
	

}
