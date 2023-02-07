package DemoTestCase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {

	public static String PropertyFile(String Key) {
		FileInputStream fis=null;
		Properties properties=null;
		try {
			fis=new FileInputStream(new File("./TestData/configuration.properties"));
			properties=new Properties();
			properties.load(fis);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return properties.getProperty(Key);
	
		

	}


public static String excel(String SheetName,int rowNo,int cellNo) {
	FileInputStream fis=null;
	Workbook workbook=null;
	try {
		fis=new FileInputStream(new File("./Testdata.excel.xlsx"));
		workbook=WorkbookFactory.create(fis);
	}catch(FileNotFoundException e) {
	e.printStackTrace();

	}catch(EncryptedDocumentException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
	return workbook.getSheet(SheetName).getRow(rowNo).getCell(cellNo).getStringCellValue();}
}
	
