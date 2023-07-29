package Apache_POI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data3 {

	public static void main(String[] args, int c) throws EncryptedDocumentException, IOException {
		
	String file = "./ReadData/SheetInfo.xlsx";
	
	FileInputStream file1 = new FileInputStream(file);
		
		XSSFWorkbook book = new XSSFWorkbook(file);
		
		XSSFSheet sheet = book.getSheetAt(3);
		
		int Rows = sheet.getLastRowNum();
		System.out.println(Rows);
		int Cols = sheet.getRow(1).getLastCellNum();
		System.out.println(Cols);
		
		for (int i = 0; i<=Rows; i++) {
			
			XSSFRow row = sheet.getRow(i);
		
		for (int j = 0; j<Cols ;j++) {
		
		XSSFCell cell = row.getCell(c);
		
		switch (cell.getCellType()) {
		
		case STRING:
			System.out.println(cell.getStringCellValue());
		break;
		case NUMERIC:
			System.out.println(cell.getNumericCellValue());
		break;
		case BOOLEAN:
			System.out.println(cell.getBooleanCellValue());
		break;
		}
		System.out.println();
		}	
	}
	}
}