
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iterator {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "G:\\Git\\Bapun\\driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("https://www.facebook.com");
		WebElement x = d.findElement(By.id("month"));
		Select sel = new Select(x);
		List<WebElement> wb = sel.getOptions();
		int n = wb.size();
		/*
		 * System.out.println(n); for(int i=0;i<wb.size();i++) {
		 * //System.out.println(wb.get(i).getText()); sel.selectByIndex(i);
		 * Thread.sleep(5000); d.findElement(By.name("websubmit")).click(); }
		 */
		int count = 0;
		while (count < n) {
			try {
				d.findElement(By.name("websubmit")).click();
			} catch (Exception e) {
				for (int i = 0; i < wb.size(); i++) {
					sel.selectByIndex(i);
					Thread.sleep(5000);
				}
				count++;
			}
		}
	}
}
