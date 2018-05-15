package b123;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gmailInbox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("litan440");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("Litan@520351");
		driver.findElement(By.id("signIn")).click();

		/*
		 * String x="//table[@class='F cf zt']/tbody/tr/td[2]/div[@role='checkbox']";
		 * List<WebElement> lst=driver.findElements(By.xpath(x)); for(int
		 * i=0;i<lst.size();i++) { lst.get(i).click(); } Thread.sleep(20000);
		 * WebDriverWait wait= new WebDriverWait(driver, 20);
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.
		 * xpath("//div[@class='ar9 T-I-J3 J-J5-Ji']")));
		 * driver.findElement(By.xpath("//div[@class='ar9 T-I-J3 J-J5-Ji']")).click();
		 */

		String y = "//table[@class='F cf zt']/tbody/tr[@class='zA zE']/td[2]/div[@role='checkbox']";
		List<WebElement> lst1 = driver.findElements(By.xpath(y));
		for (int i = 0; i < lst1.size(); i++) {
			lst1.get(i).click();
		}
	}

}