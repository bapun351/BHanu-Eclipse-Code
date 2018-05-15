
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Weblist {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "G:\\BHANU ECLIPSE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		List<WebElement> lst = driver.findElements(By.id("day"));
		/*
		 * for(int i=0;i<lst.size();i++){ System.out.println(lst.get(i).getText()); }
		 */
		for (WebElement w : lst) {
			System.out.println(w);
		}
		Thread.sleep(5000);
		WebElement wb = driver.findElement(By.id("month"));
		Select sel = new Select(wb);
		sel.selectByValue("3");
		Thread.sleep(5000);
		sel.selectByVisibleText("Dec");

	}
}
