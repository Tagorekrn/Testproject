package Testing;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreatingExcel {

	public static void main(String[] args) {
		
		File src = new FIS();
		XSSFWorkbook wb = src.createNewFile("E:\\Selenium");
		
		
		

	}

}
