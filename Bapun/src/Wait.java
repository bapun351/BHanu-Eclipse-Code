import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	public static void main(String[] args) {
		WebDriver d = (WebDriver) new chromeDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebDriverWait wt = new WebDriverWait(d, 10000);
		wt.until(ExpectedConditions.elementToBeClickable(By.id("a")));

		FluentWait wait = new FluentWait(d);
		wait.withTimeout(20, TimeUnit.SECONDS);
		wait.pollingEvery(10, TimeUnit.SECONDS);
		wait.ignoring(NoSuchElementException.class);
	}
}
