package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	
		// TODO Auto-generated method stub
		public String readExcelData(String excelPath,String sheetName,int rowcount,int cellcount) throws EncryptedDocumentException, IOException 
		{
				FileInputStream fis= new FileInputStream(excelPath);
				Workbook wb = WorkbookFactory.create(fis);
			     org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet(sheetName);
			     Row rw = sh.getRow(rowcount);
			       org.apache.poi.ss.usermodel.Cell cell  = rw.getCell(cellcount);
			       String    data   =   cell.getStringCellValue();
			       return data;
		}
		public int getRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis= new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
		     org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet(sheetName);
		     int rc =sh.getLastRowNum();
		     return rc;
		    
			
		}
	    

	

}
