import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmail {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("litan440");
		Thread.sleep(1000);
		driver.findElement(By.id("next")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Passwd")).sendKeys("Litan@520351");
		Thread.sleep(2000);
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(80000);
		System.out.println(
				driver.findElement(By.xpath("//span[contains(text(),'15 GB')]/preceding-sibling::span")).getText());
		String s = driver.findElement(By.xpath("//a[contains(text(),'Inbox')]")).getText();
		System.out.println(s.substring(7, s.length() - 1));

		/*
		 * String wb=driver.findElement(By.id("next")).getCssValue("background-color");
		 * System.out.println(wb);
		 */

	}

}
