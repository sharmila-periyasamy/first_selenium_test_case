import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class CreateExcel {
	
	public static void main(String[] args) throws IOException {
		
		File loc= new File ("C:/Users/Sureshkannan/Desktop/git/first_selenium_test_case/DataFromExcel/src/main/java/DataExcel/Excel/email.xlsx");
		
		Workbook w= new XSSFWorkbook ();
		Sheet s= w.createSheet("Data");
		Row r= s.createRow(1);
		Cell c= r.createCell(0);
		c.setCellValue("Icandoit");
		FileOutputStream out= new FileOutputStream(loc);
		w.write(out);
		
		
	}

}
