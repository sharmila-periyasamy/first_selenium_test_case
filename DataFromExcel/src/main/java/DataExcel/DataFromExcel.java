package DataExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.GenericArrayType;

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
		int i= s.getPhysicalNumberOfRows();	
	System.out.println("Total rows" +i);
	Row r=s.getRow(1);
	int j= r.getPhysicalNumberOfCells();
	System.out.println("Total column" +j);
	
		}
	
}
	