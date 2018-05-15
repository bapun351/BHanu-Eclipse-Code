import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mutiple_Tab {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Git\\Bapun\\driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.manage().window().maximize();
		for (int i = 1; i >= 3; i++) {
			if (i == 1) {
				d.get("https://www.google.co.in/");
				Actions act = new Actions(d);
				act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
			}
			if (i == 2) {
				d.close();
			}
		}

		// d.findElement(By.tagName("body")).sendKeys(Keys.CONTROL+"t");

	}
}
