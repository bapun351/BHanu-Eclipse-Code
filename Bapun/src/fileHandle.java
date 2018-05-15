import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fileHandle {
	public static void main(String[] args) throws Throwable {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");
		String filepath = "C:\\Users\\Bapun\\Desktop\\bapun.xlsx";
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row rw = sh.getRow(1);
		String userName = rw.getCell(2).getStringCellValue();
		String passWord = rw.getCell(3).getStringCellValue();
		String customerName = rw.getCell(4).getStringCellValue();

		WebDriver d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("http://laptop-nu0oese7/login.do");
		d.findElement(By.name("username")).sendKeys(userName);
		d.findElement(By.name("pwd")).sendKeys(passWord);
		d.findElement(By.xpath("//input[@type='submit']")).click();

		d.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		d.findElement(By.xpath("//input[@type='button' and @value='Add New Customer']")).click();

		d.findElement(By.name("name")).sendKeys(customerName);
		d.findElement(By.name("createCustomerSubmit")).click();

	}
}