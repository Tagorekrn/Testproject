package Testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePOI {

	public static void main(String[] args) throws Exception {
		
		File src = new File("D:\\Seleniumworkspace\\Data\\Negative tests.xlsx");
		FileInputStream FIS = new FileInputStream(src);
		
		//XSSFWorkbook if used for XLSX excel format
		XSSFWorkbook wb = new XSSFWorkbook(FIS);
		//For XLS format we use HSSFWorkbook 
		//Create a object to read the active excel sheet
		//To read the active sheet we can either use the index of the sheet or sheet name. Index of the sheet starts from 0.
		XSSFSheet sheet = wb.getSheet("Sheet1");
		//Retrieving the data value from sheet
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		for(int i=0;i<rowCount;i++)
		{
			String data = sheet.getRow(i).getCell(2).getStringCellValue();
			System.out.println(data);
			sheet.getRow(i).createCell(6).setCellValue("Successfully read");
			FileOutputStream FOS = new FileOutputStream(src);
			wb.write(FOS);
		}
		//To find the total no of rows or finding rowcount.
		/*int RC = sheet.getLastRowNum();
		for(int I=0; I<RC;I++) {
			int CC = sheet.getRow(I).getLastCellNum();
			
		} */
		

	}

}
