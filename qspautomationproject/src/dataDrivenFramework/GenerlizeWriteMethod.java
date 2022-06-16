package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenerlizeWriteMethod {
	
	public void writeData(String excelPath,String sheetName,int rowcount,int cellcount) throws EncryptedDocumentException, IOException, InterruptedException 
	{
			FileInputStream fis= new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
		     org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet(sheetName);
		     Row rw = sh.getRow(rowcount);
		       org.apache.poi.ss.usermodel.Cell cell  = rw.createCell(cellcount);
		        cell.setCellValue("status");
		        FileOutputStream fos= new FileOutputStream("./data/ActiTimeTestData.xlsx");
		        wb.write(fos);
		        	}
    

	
	
}

