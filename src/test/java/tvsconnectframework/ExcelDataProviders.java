package tvsconnectframework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelDataProviders {

	public static void main(String[] args) throws IOException  {
	
		File excelfile = new File("./src/test/java/tvsconnectframework/testdata/FAQSheets.xls");
		System.out.println(excelfile.exists());
		FileInputStream fis = new FileInputStream(excelfile);
        
		//if extension of excel file is xls
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		HSSFSheet sheet = workbook.getSheet("Sheet1");
		int noofRows = sheet.getPhysicalNumberOfRows();
		int noofcolumns = sheet.getRow(0).getLastCellNum();
		
		for(int i=1; i<noofRows; i++) {
			  
		for(int j=0; j<noofcolumns ;j++){	
	    System.out.println( sheet.getRow(i).getCell(j).getStringCellValue());
		}
		
		System.out.println();
		}
		
		workbook.close();
		fis.close();
		
	} 

}
