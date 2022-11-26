package Mailextractotp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TLCmailUtilityClass {

	public static String getmaildata(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\SoftwareTesting\\excelSelenium.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("emaillogintractor");
		String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return value;

	}

}
