package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreatingExcelFile {

	public static void main(String[] args) throws IOException {
		//Create a workbook --> .xlxs
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet1 = workbook.createSheet("FirstSheet");
		XSSFRow row1 = sheet1.createRow(0);
		XSSFCell cell1 = row1.createCell(0);
		XSSFCell cell2 = row1.createCell(1);
		XSSFCell cell3 = row1.createCell(2);
		//insert values in cells
		
		cell1.setCellValue("Name");
		cell2.setCellValue("Email");
		cell3.setCellValue("MobileNumber");
		
		XSSFRow row2 = sheet1.createRow(1);
		XSSFCell cell4 = row2.createCell(0);
		XSSFCell cell5 = row2.createCell(1);
		XSSFCell cell6 = row2.createCell(2);
	
		cell4.setCellValue("Savitha");
		cell5.setCellValue("abc@yahoo.com");
		cell6.setCellValue("123-687-9876");
		
		XSSFRow row3 = sheet1.createRow(2);
		XSSFCell cell7 = row3.createCell(0);
		XSSFCell cell8 = row3.createCell(1);
		XSSFCell cell9 = row3.createCell(2);
	
		cell7.setCellValue("Ramana");
		cell8.setCellValue("xys@yahoo.com");
		cell9.setCellValue("123-876-9876");
		
		File f = new File("C:\\Users\\sajes\\eclipse-workspace\\SeleniumTesting\\myTestExcel.xlsx");
		FileOutputStream fos = new FileOutputStream(f);
		workbook.write(fos);
		fos.close();
		System.out.println("File has been created");
	}

}
