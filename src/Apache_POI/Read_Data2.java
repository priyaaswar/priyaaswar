package Apache_POI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_Data2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	//1.	
	FileInputStream file = new FileInputStream("C:\\Users\\gaura\\Downloads\\Untitled spreadsheet (1).xlsx");
		
	String data = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();	
		
	System.out.println(data);	
		
	//2.	
	FileInputStream file1 = new FileInputStream("C:\\Users\\gaura\\Downloads\\Untitled spreadsheet (1).xlsx");	
		
		String data1 = WorkbookFactory.create(file1).getSheet("sheet1").getRow(0).getCell(2).getStringCellValue();
		
	System.out.println(data1);
	
	//3.
	FileInputStream file2 = new FileInputStream("C:\\Users\\gaura\\Downloads\\Untitled spreadsheet (1).xlsx");	
	
	String data2 = WorkbookFactory.create(file2).getSheet("sheet1").getRow(2).getCell(0).getStringCellValue();
	
	System.out.println(data2);	
}	
}
