package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
FileInputStream	fis=new FileInputStream("./data/TestData.xlsx");
Workbook wb= WorkbookFactory.create(fis);
org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet("Sheet1");
 Row rw =sh.getRow(2);
  org.apache.poi.ss.usermodel.Cell cell  =  rw.getCell(1);
 String data= cell.getStringCellValue();
 System.out.println(data);
 
   
	}

}
