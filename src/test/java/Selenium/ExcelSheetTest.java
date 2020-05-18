package Selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetTest {

	public static void main(String[] args) throws IOException {
		String path = "Data\\ExcelXLSX.xlsx";
		FileInputStream fis = new FileInputStream(path);
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheetAt(0);
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(1);
		String cellvalue = cell.getStringCellValue();
		System.out.println(cellvalue);

	}

}
