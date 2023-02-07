package Basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class t3 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream("E:\\New folder\\Book1.xlsr");
				XSSFWorkbook workbook=new XSSFWorkbook(file);
				XSSFSheet sheet=new workbook.getSheet("Sheet1");   // provide by sheet name
		int rowcount=		sheet.getLastRowNum();   // to get the last row number of rows
		 int colcount =sheet.getRow(0).getLastCellNum(); // to get the column count 
		 for (int i=0;i<=rowcount;i++) {
		XSSFRow currentrow=	 sheet.getRow(i);	// get the current row through the loops
			 
			 for (int j=0;j<colcount;j++) {
	String value=currentrow.getCell(j).toString();	// to read the value from the cell		 
			 System.out.println("	"+value);	// by using this type we can print the values with space
			 }
		 }System.out.println();
		 
	}

}
