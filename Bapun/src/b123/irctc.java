package b123;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class irctc {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in");

		WebElement wb = driver.findElement(By.xpath("//a[contains(text(),'Tourism')]"));
		Thread.sleep(8000);
		Actions act = new Actions(driver);
		act.moveToElement(wb).perform();
		Thread.sleep(8000);
		WebElement wb1 = driver.findElement(By.xpath("//a[contains(text(),'IRCTC Tourism')]"));
		act.moveToElement(wb1).perform();
		driver.findElement(By.xpath("//a[contains(text(),'Maharajas')]")).click();

		Set<String> set = driver.getWindowHandles();
		System.out.println(set.size());

		Iterator<String> it = set.iterator();
		String ParentWndw = it.next();
		String ChildWndw = it.next();

		driver.switchTo().window(ChildWndw);
		Thread.sleep(10000);
		WebElement bk = driver
				.findElement(By.xpath("//a[@id='wsnavtoggle']/../../../../../div[6]/a[text()='book now']"));
		/*
		 * WebDriverWait wait=new WebDriverWait(driver,30);
		 * wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("bk")))
		 * ;
		 */
		bk.click();

		List<WebElement> lst = driver
				.findElements(By.xpath("//div[contains(text(),'Categories of Cabin')]/../div[2]/table/tbody/tr/td"));

		for (int i = 0; i < lst.size(); i++) {
			System.out.println(lst.get(i).getText());
		}

	}
}
