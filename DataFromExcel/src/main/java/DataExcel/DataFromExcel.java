package DataExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class DataFromExcel {

	public static void main(String[] args) throws IOException {
	File excel= new File("C:/Users/Sureshkannan/Desktop/datadriver.xlsx");
	FileInputStream f=new  FileInputStream(excel);
	Workbook w= new  XSSFWorkbook(f);
	Sheet s= w.getSheet("Data");
	Row r= s.getRow(0);
	Cell  c= r.getCell(0);
	System.out.println(c);
	
	}
	
}
	