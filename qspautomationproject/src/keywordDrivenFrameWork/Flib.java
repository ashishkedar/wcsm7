package keywordDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
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
	public void writeData(String excelPath,String sheetName,int rowcount,int cellcount,String data) throws EncryptedDocumentException, IOException, InterruptedException 
	{
			FileInputStream fis= new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
		     org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet(sheetName);
		     Row rw = sh.getRow(rowcount);
		       org.apache.poi.ss.usermodel.Cell cell  = rw.createCell(cellcount);
		        cell.setCellValue(data);
		        FileOutputStream fos= new FileOutputStream("./data/ActiTimeTestData.xlsx");
		        wb.write(fos);
    }
	
	public String readPropertyFile(String propPath,String key) throws IOException 
	{
		FileInputStream fis = new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;
		
		
		
    
		
    


	

   }
}