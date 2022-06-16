package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLoginWithExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		driver.get("http://127.0.0.1:8080/login.do;jsessionid=1widsmj54aiai");
		
		FileInputStream	fis=new FileInputStream("./data/ActiTimeTestData.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet("validcreds");
		 Row rw =sh.getRow(1);
		  org.apache.poi.ss.usermodel.Cell cell  =  rw.getCell(0);
		 String username= cell.getStringCellValue();
		 
		 
		 FileInputStream	fis1 =new FileInputStream("./data/ActiTimeTestData.xlsx");
			Workbook wb2 = WorkbookFactory.create(fis1);
			org.apache.poi.ss.usermodel.Sheet sh2 = wb2.getSheet("validcreds");
			 Row rw2 =sh2.getRow(1);
			  org.apache.poi.ss.usermodel.Cell cell2  =  rw2.getCell(1);
			 String password= cell2.getStringCellValue();
			 
			 
			 driver.findElement(By.name("username")).sendKeys(username);
				driver.findElement(By.name("pwd")).sendKeys(password);
				driver.findElement(By.id("loginButton")).click();
				



	}

}
