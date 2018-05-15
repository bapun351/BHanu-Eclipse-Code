package b123;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fileHand {
	public static void main(String[] args) throws Throwable {
		String filepath = "C:\\Users\\Bapun\\Desktop\\bapun.xlsx";
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row rw = sh.getRow(1);
		Cell cl = rw.createCell(6);
		cl.setCellValue("Pass");
		// write data back to excel.
		FileOutputStream fos = new FileOutputStream(filepath);
		wb.write(fos);
		wb.close();

	}

}
