import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseOver {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");

		WebElement wb = driver.findElement(By.xpath("//a[@id='nav-link-shopall']"));
		WebElement wb1 = driver.findElement(By.xpath("//*[text()='Mobiles & Tablets']"));

		Actions act = new Actions(driver);
		act.moveToElement(wb).perform();
		act.moveToElement(wb1).perform();

		driver.findElement(By.xpath("//span[text()='Cases & Covers']")).click();

	}

}
