package TestNG2practise;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestNG_utilityclass {
	// utitility class is mainly used to perform common function of selenium
	// throughout project
	// like parameterization,popup handling,screenshot handling,iframe handling
	// we can access utility class value in testng classs by call static method in
	// testgn class

	// TestNG_utilityclass.getTD(rowindex,columnindex)
	
	public static String getTD(int rowindex, int cellindex) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream("C:\\Users\\lakha\\Desktop\\Software Testing\\Userstorys\\Upstoxddf.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");

		String value = sh.getRow(rowindex).getCell(cellindex).getStringCellValue();

		return value;

	}
}
