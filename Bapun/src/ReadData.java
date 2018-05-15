import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {
	public static void main(String[] args) throws Throwable {
		String filepath = "C:\\Users\\Bapun\\Desktop\\test.xlsx";
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		for (int i = 0; i <= sh.getLastRowNum(); i++) {
			Row rw = sh.getRow(i);
			for (int j = 0; j < rw.getLastCellNum(); j++) {
				Cell cel = rw.getCell(j);
				System.out.println(cel.getNumericCellValue());
			}
		}
	}
}
