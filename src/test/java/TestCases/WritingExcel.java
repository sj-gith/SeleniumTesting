package TestCases;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcel {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet0 =workbook.createSheet("FirstSheet");
		
		/*Row row0 = sheet0.createRow(0);
		Cell cellA= row0.createCell(0);
		Cell cellB = row0.createCell(1);
		
		cellA.setCellValue("FirstCell");
		cellB.setCellValue("SecondCell");*/
		
		for (int rows=0; rows<10; rows++) {
			Row row = sheet0.createRow(rows);
			for(int cols=0; cols<10; cols++) {
				Cell cell = row.createCell(cols);
				cell.setCellValue((int)(Math.random()*100));
				
			}
		}
		
		//Connecting Streams
		
		File f =new File("C:\\WritingFile\\myFirstExcel.xlsx");
		FileOutputStream fos = new FileOutputStream(f);
		
		workbook.write(fos);
		
		//Closing the Stream
		
		fos.close();
		
		System.out.println("Excel sheet is created!!");
		


		}
		
	}


