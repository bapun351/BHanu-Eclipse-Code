package flipkart;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Login {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "G:\\BHANU ECLIPSE\\Bapun\\driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*
		 * d.get("https://www.flipkart.com");
		 * 
		 * //Login d.findElement(By.xpath("//A[text()='Log In']")).click();
		 * d.findElement(By.xpath("//input[@class='_2zrpKA' and@type='text']")).sendKeys
		 * ("litan440@gmail.com");
		 * d.findElement(By.xpath("//input[@type='password']")).sendKeys("9853520351");
		 * d.findElement(By.xpath("//input[@type='password']/../../div[3]/button")).
		 * click();
		 * 
		 * //Verify Login String expMsg="Hi Flipkart!"; String
		 * actMsg=d.findElement(By.xpath("//a[text()='Hi Flipkart!']")).getText(); if
		 * (expMsg.equals(actMsg)) { System.out.println("Successfully Loggedin"); }
		 * else{ System.out.println("Failed to Login"); }
		 * 
		 * //Search and select a product
		 * d.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 6s");
		 * d.findElement(By.xpath("//button[@type='submit']")).click(); WebElement
		 * wb=d.findElement(By.
		 * xpath("//div[text()='Apple iPhone 6s Plus (Rose Gold, 32 GB)']")); String
		 * cart=wb.getText();
		 * 
		 * JavascriptExecutor executor = (JavascriptExecutor) d;
		 * //executor.executeScript("arguments[0].click();", wb); Point
		 * p=wb.getLocation(); int xaxis=p.x; int yaxis=p.y;
		 * //executor.executeScript("javascript:window.scrollBy("+xaxis+","+yaxis+")");
		 * executor.executeScript("arguments[0].scrollIntoView();",wb);
		 * executor.executeScript("window.scrollBy(0,-100)");
		 * 
		 * Thread.sleep(5000); wb.click();
		 * 
		 * while(!wb.isSelected()){ Actions act= new Actions(d);
		 * act.sendKeys(Keys.SPACE).perform();
		 * 
		 * //Add to cart WebElement
		 * wb1=d.findElement(By.xpath("//button[@type='button']/../../../li[1]/button"))
		 * ; JavascriptExecutor executor1 = (JavascriptExecutor) d;
		 * executor1.executeScript("arguments[0].scrollIntoView();",wb1);
		 * Thread.sleep(20000); wb1.click(); Thread.sleep(10000);
		 * 
		 * //logout WebElement
		 * log=d.findElement(By.xpath("//a[text()='Hi Flipkart!']")); Actions act1=new
		 * Actions(d); act1.moveToElement(log).perform(); Thread.sleep(5000);
		 * d.findElement(By.xpath("//a[text()='Log Out']")).click(); Thread.sleep(5000);
		 * 
		 * //Login Again d.findElement(By.xpath("//A[text()='Log In']")).click();
		 * d.findElement(By.xpath("//input[@class='_2zrpKA' and@type='text']")).sendKeys
		 * ("litan440@gmail.com");
		 * d.findElement(By.xpath("//input[@type='password']")).sendKeys("9853520351");
		 * d.findElement(By.xpath("//input[@type='password']/../../div[3]/button")).
		 * click(); Thread.sleep(20000);
		 * 
		 * //verify cart d.findElement(By.xpath("//a[text()='CART']")).click();
		 * Thread.sleep(10000); WebElement wb2=d.findElement(By.
		 * xpath("//a[text()='Apple iPhone 6s Plus (Rose Gold, 32 GB)']")); String
		 * cart1=wb2.getText(); if (cart.equals(cart1)) {
		 * System.out.println("Item available in Cart"); } else{
		 * System.out.println("Not available"); }
		 * d.findElement(By.xpath("//span[text()='Remove']")).click();
		 * Thread.sleep(5000); //go to home page and open power bank in new window
		 * d.findElement(By.xpath("//img[@title='Flipkart']")).click();
		 * Thread.sleep(5000); WebElement
		 * elec=d.findElement(By.xpath("//span[text()='Electronics']"));
		 * Thread.sleep(5000); //WebElement
		 * pow=d.findElement(By.xpath("//span[text()='Power Banks']")); Actions act2=
		 * new Actions(d); act2.moveToElement(elec).perform(); Thread.sleep(5000);
		 * //act2.contextClick(pow).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build
		 * ().perform();; //act2.contextClick(pow).build().perform();
		 * //Thread.sleep(10000);
		 * //act2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		 * 
		 * d.findElement(By.xpath("//span[text()='Power Banks']")).click();
		 * Thread.sleep(3000); Actions builderq = new Actions(d);
		 * builderq.contextClick(elementq); Thread.sleep(3000);
		 * builderq.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER);
		 * builderq.build().perform(); Thread.sleep(3000);
		 * 
		 */
		// open IRCTC
		d.get("https://www.irctc.co.in");
		Actions irctc = new Actions(d);
		irctc.moveToElement(d.findElement(By.xpath("//div[@id='bluemenu' and @class='bluetabsnew']/ul/li[2]/a")));
		Thread.sleep(3000);
		irctc.build().perform();
		Thread.sleep(3000);
		d.findElement(By.xpath("//div[@id='bluemenu' and @class='bluetabsnew']/ul/li[2]/ul/li[1]/a")).click();
		Thread.sleep(5000);
		// Handle window
		Set<String> set = d.getWindowHandles();
		System.out.println(set.size());

		Iterator<String> it = set.iterator();
		String ParentWndw = it.next();
		String ChildWndw = it.next();
		Thread.sleep(3000);
		d.switchTo().window(ChildWndw);
		Thread.sleep(8000);

		// enter pnr
		d.findElement(By.xpath("//input[@name='pnrNumber']")).sendKeys("123456789");
		d.findElement(By.id("submit_button")).click();
		Thread.sleep(3000);
		Alert alert = d.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		d.close();
		Thread.sleep(3000);
		d.switchTo().window(ParentWndw);
		Thread.sleep(3000);

		// login to irctc by external data
		/*
		 * System.setProperty("org.apache.commons.logging.Log",
		 * "org.apache.commons.logging.impl.Jdk14Logger");
		 */
		String filepath = "C:\\Users\\Bapun\\Documents\\flipkART.xlsx";
		FileInputStream fis = new FileInputStream(filepath);
		Workbook irct = WorkbookFactory.create(fis);
		Sheet sh = irct.getSheet("Sheet1");
		Row rw = sh.getRow(1);
		String userName = rw.getCell(1).getStringCellValue();
		String passWord = rw.getCell(2).getStringCellValue();
		System.out.println(userName);
		System.out.println(passWord);
		Thread.sleep(5000);
		d.findElement(By.id("usernameId")).sendKeys(userName);
		d.findElement(By.name("j_password")).sendKeys(passWord);
		d.findElement(By.id("loginbutton")).click();

		File scrFile = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Users\\Bapun\\Documents\\screenshot.jpg"));

		EventFiringWebDriver eDriver = new EventFiringWebDriver(d);
		File srcFile = eDriver.getScreenshotAs(OutputType.FILE);
		File dstFile = new File("G:\\ScreenShot\\");
		FileUtils.copyFileToDirectory(srcFile, dstFile);

	}
}