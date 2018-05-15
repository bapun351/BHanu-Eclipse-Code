import java.awt.RenderingHints.Key;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.name("field-keywords")).sendKeys("iphone mobile", Keys.ENTER);
		// driver.findElement(By.xpath("//input[@value='Go']")).click();
		System.out.println(driver.findElement(By.xpath("//h2[@id='s-result-count']")).getText());
		System.out.println(driver
				.findElement(By.xpath(
						"//h2[text()='Apple iPhone 6 (Space Grey, 32GB)']/../../../../div[2]/div[1]/div[1]/a/span[2]"))
				.getText());

	}

}
