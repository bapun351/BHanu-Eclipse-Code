package windowHandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class calenderPouUp {
	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("https://www.makemytrip.com/");
		d.findElement(By.id("hp-widget__depart")).click();
		int count = 0;

		while (count < 12) {
			try {
				d.findElement(By.xpath("//td[@data-year='2017' and @data-month='2']/a[text()='10']")).click();
				break;
			} catch (Exception e) {
				// d.findElement(By.xpath("//span[text()='Next']")).click();
				// d.findElement(By.xpath("//a[@title='Next'][1]")).click();
				d.findElement(By.xpath("//a[@title='Next']")).click();
				// d.findElement(By.xpath("//a[span[text()='Next'][1]]")).click();

				count++;

			}
		}
	}

}
