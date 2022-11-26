package UpstoxLoginRevision;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClassRevision {

	public static String getexceldata(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream(
				"C:\\Users\\lakha\\Desktop\\Software Testing\\Automation Testing Notes\\Selenium Practice Demo\\upstoxlogin.xlsx");
		Sheet datasheet = WorkbookFactory.create(file).getSheet("Sheet2");

		String value = datasheet.getRow(rowIndex).getCell(cellIndex).getStringCellValue();

		return value;
	}

	public static void takeSS(WebDriver driver, int TestCaseId) throws IOException {

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File dest = new File(
				"C:\\Users\\lakha\\eclipse-workspace\\TestNG Selenium Project\\ScreenshotUpstox\\Screenshot_"
						+ TestCaseId + ".jpg");

		FileHandler.copy(source, dest);

	}

}
