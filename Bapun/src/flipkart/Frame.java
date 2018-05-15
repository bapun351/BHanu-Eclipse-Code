package flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "G:\\BHANU ECLIPSE\\Bapun\\driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		d.switchTo().frame("classFrame");
		d.findElement(By.xpath("//a[text()='com.thoughtworks.selenium']")).click();
		Thread.sleep(5000);
		d.switchTo().defaultContent();
		Thread.sleep(5000);
		d.switchTo().frame("packageListFrame");
		Thread.sleep(5000);
		/*
		 * WebElement wb=d.findElement(By.xpath(
		 * "//a[text()='org.openqa.selenium.support.pagefactory.internal']"));
		 * JavascriptExecutor executor = (JavascriptExecutor) d; Point
		 * p=wb.getLocation(); int xaxis=p.x; int yaxis=p.y;
		 * System.out.println(xaxis+","+yaxis);
		 * executor.executeScript("arguments[0].scrollIntoView();",wb);
		 * executor.executeScript("window.scrollBy(0,-0)");
		 */
		Actions act = new Actions(d);
		d.findElement(By.xpath("//h2[text()='Packages']")).click();
		;
		act.sendKeys(Keys.SPACE).sendKeys(Keys.SPACE).sendKeys(Keys.SPACE).sendKeys(Keys.SPACE).sendKeys(Keys.SPACE)
				.build().perform();
		Thread.sleep(5000);
		WebElement wb = d.findElement(By.xpath("//a[text()='org.openqa.selenium.support.pagefactory.internal']"));
		wb.click();
	}
}
