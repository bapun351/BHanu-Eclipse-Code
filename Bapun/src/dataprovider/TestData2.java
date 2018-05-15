package dataprovider;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestData2 {
	WebDriver driver;
	Workbook wb;
	Sheet sh1;
	int numrow;
	String username;
	String password;

	@BeforeTest
	public void Setup()

	{
		System.setProperty("webdriver.chrome.driver", "G:\\Git\\Bapun\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
	}

	@Test(dataProvider = "testdata")
	public void TestFireFox(String uname, String password1)

	{

		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(password1);
	}

	@DataProvider(name = "testdata")
	public Object[][] TestDataFeed() {

		try {

			// load workbook
			FileInputStream fis = new FileInputStream("C:\\Users\\Bapun\\Desktop\\selenium\\test.xlsx");
			wb = WorkbookFactory.create(fis);
			sh1 = wb.getSheetAt(1);
			numrow = sh1.getLastRowNum();
		} catch (Exception e)

		{
			e.printStackTrace();
		}

		// Create 2 D array and pass row and columns
		Object[][] facebookdata = new Object[numrow][2];

		// This will run a loop and each iteration it will fetch new row
		for (int i = 0; i < numrow; i++) {

			// Fetch first row username
			facebookdata[i][0] = sh1.getRow(i).getCell(0).getStringCellValue();
			// Fetch first row password
			facebookdata[i][1] = sh1.getRow(i).getCell(1).getNumericCellValue();

		}

		return facebookdata;
	}

	@AfterTest
	public void QuitTC() {

		// close browser after execution
		driver.quit();
	}
}
