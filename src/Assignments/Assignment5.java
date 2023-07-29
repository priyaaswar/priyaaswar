package Assignments;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream("C:\\Users\\gaura\\Downloads\\Assignment- Google Sheets.pdf");

		String data = WorkbookFactory.create(file).getSheet("Assignment5").getRow(0).getCell(1).getStringCellValue();

		System.out.println(data);

		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		Sheet sheet = null;
		int Rows = sheet.getLastRowNum();
		System.out.println(Rows);
		int Cols = sheet.getRow(1).getLastCellNum();
		System.out.println(Cols);

		for (int i = 0; i <= Rows; i++) {

			XSSFRow row = (XSSFRow) sheet.getRow(i);

			for (int j = 0; j < Cols; j++) {

				XSSFCell cell = row.getCell(j);

				switch (cell.getCellType()) {

				case STRING:
					System.out.println(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.println(cell.getNumericCellValue());
					break;

				}
			}

		}
	}
}
