package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PrintAllDataTest {

	public static void main(String[] args) {
		String path = "Data\\ExcelXLSX.xlsx";
		try {
			FileInputStream fis = new FileInputStream(path);
			Workbook bWorkbook = new XSSFWorkbook();
			Sheet sheet = bWorkbook.getSheetAt(0);
			int lastrow = sheet.getLastRowNum();
			System.out.println("The last row is : " + lastrow);

			for (int i = 0; i <= lastrow; i++) {
				Row row = sheet.getRow(i);
				int lastcell = row.getLastCellNum();
				for (int j = 0; j <= lastcell; j++) {
					Cell cell = row.getCell(j);
					String cellValue = cell.getStringCellValue();
					System.out.println("The cellvalue is : " + cellValue);

				}
				System.out.println();
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

}
