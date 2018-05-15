package windowHandle;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;

public class fileDownload {
	public static void main(String[] args) throws Throwable {
		FirefoxProfile p = new FirefoxProfile();
		p.setPreference("browser.download.folderList", 2);
		p.setPreference("browser.download.lastDir", "A:\\");
		p.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");

		WebDriver d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("http://www.seleniumhq.org/");
		d.findElement(By.xpath("//a[text()='Download']")).click();
		// d.findElement(By.xpath("//td[text()='Java']/following-sibling::td[3]")).click();
		d.findElement(By.xpath("//a[contains(@href,'selenium-java-3.3.1.zip')]")).click();

		// Runtime.getRuntime().exec("C:\\Users\\Bapun\\Desktop\\autoIt\\idm.exe");

	}

}
