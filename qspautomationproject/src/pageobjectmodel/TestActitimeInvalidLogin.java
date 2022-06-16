package pageobjectmodel;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import keywordDrivenFrameWork.BaseTest;
import keywordDrivenFrameWork.Flib;

public class TestActitimeInvalidLogin extends BestTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	
		BestTest bt = new BestTest();
		bt.setUp();
		Thread.sleep(3000);
		
		Flib flib = new Flib();
		LoginPage lp= new LoginPage(driver);
		
		int rc = flib.getRowCount(EXCEL_PATH, "invalidcreds");
		for (int i=1;i<=rc;i++)
		{
		String invalidUsername	= flib.readExcelData(EXCEL_PATH, "invalidcreds",i,0);
		String invalidPassword	= flib.readExcelData(EXCEL_PATH, "invalidcreds",i,1);
		
		//perfrom invalid login
		
		lp.actiTimeInvalidLogin(invalidUsername,invalidPassword);
		

	}
		bt.tearDawn();

}
}
