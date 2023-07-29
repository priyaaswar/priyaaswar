package Apache_POI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_Data {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String path = "E:\\velocity notes\\aa.xlsx";
		
		FileInputStream file = new FileInputStream(path);  // to open file
		
		String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(data);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
