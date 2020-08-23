package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingExcel {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		File f = new File("C:\\Users\\sajes\\eclipse-workspace\\SeleniumTesting\\myTestExcel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("FirstSheet");
		

		for (int k = 0; k < sheet.getLastRowNum()+1; k++) {

			Row row = sheet.getRow(k);
			for (int i = 0; i < row.getLastCellNum(); i++) {

				Cell cell = row.getCell(i);

				switch (cell.getCellType()) {
				case Cell.CELL_TYPE_STRING:
					System.out.println(cell.getStringCellValue());
					break;
				case Cell.CELL_TYPE_NUMERIC:
					System.out.println(cell.getCellType());
					break;
				case Cell.CELL_TYPE_BLANK:
					System.out.println("---BLANK---");
					break;
				}
			}
		}

	}

}
