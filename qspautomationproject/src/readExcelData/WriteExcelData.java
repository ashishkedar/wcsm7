package readExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 

	{
		FileInputStream fis = new FileInputStream("./data/ActiTimeTestData.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
        org.apache.poi.ss.usermodel.Sheet sh=wb.getSheet("validcreds");
        Row row= sh.getRow(0);
        
        //.....................................................................
        
      org.apache.poi.ss.usermodel.Cell cell = row.createCell(2);
                                         cell.setCellValue("admin");
        
       //......................................................................
                                         
    FileOutputStream fos= new FileOutputStream("./data/ActiTimeTestData.xlsx");
    wb.write(fos);
    
    
    
    
   Thread.sleep(3000);
        
                                         
                                         
                                         
       
		
		

	}
	

}
