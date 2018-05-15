package b123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriver {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		driver.get("https://www.gmail.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("srinibas.k.sahu");
		Thread.sleep(1000);
		driver.findElement(By.id("next")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Passwd")).sendKeys("7873888156");
		Thread.sleep(2000);
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(50000);
		String actpage = "Inbox";
		String exp = driver.getTitle();
		System.out.println(exp);
		if (exp.contains(actpage)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
		driver.findElement(By.xpath("//span[@class='gb_9a gbii']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gb_71")).click();
		Thread.sleep(2000);
		driver.close();

	}
}
