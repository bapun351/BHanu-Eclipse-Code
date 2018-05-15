package b123;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readData {
	public static void main(String[] args) throws Throwable {
		String filepath = "C:\\Users\\Bapun\\Desktop\\bapun.xlsx";
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet2");
		// get used of row count
		int row_count = sh.getLastRowNum();

		for (int i = 1; i <= row_count; i++) {
			Row rw = sh.getRow(i);
			String dataOf0thColmn = rw.getCell(0).getStringCellValue();
			String dataOf1thColmn = rw.getCell(1).getStringCellValue();
			System.out.println(dataOf0thColmn + "\t" + dataOf1thColmn);
		}
	}
}