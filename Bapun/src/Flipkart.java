import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");

		WebElement wb = driver.findElement(By.xpath("//*[text()='Electronics']"));

		Actions act = new Actions(driver);
		act.moveToElement(wb).perform();

		driver.findElement(By.xpath("//span[text()='Mobile Cases']")).click();
		Thread.sleep(5000);

		WebElement wb1 = driver.findElement(By.xpath("//div[text()='Apple']/../../label/div[1]"));

		act.click(wb1).perform();
		Thread.sleep(5000);
		System.out.println(
				driver.findElement(By.xpath("//span[text()=' products)']/preceding-sibling::span[1]")).getText());
		Thread.sleep(10000);

		WebElement wb2 = driver.findElement(By.xpath("//div[text()='Apple']/../../label/div[1]"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", wb2);

		WebElement element = driver.findElement(By.xpath("//div[text()='HTC']/../../label/div[2]"));

		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click();", element);

		System.out.println(
				driver.findElement(By.xpath("//span[text()=' products)']/preceding-sibling::span[1]")).getText());

		// driver.findElement(By.xpath("//div[text()='HTC']/../../label/div[2]")).click();
		// driver.findElement(By.xpath("//span[text()='Filters']/../../../div[2]/span/span")).click();

		/*
		 * WebElement
		 * wb2=driver.findElement(By.xpath("//div[text()='HTC']/../../label/div[2]"));
		 * Thread.sleep(5000); act.click(wb2).perform();
		 */

	}

}
