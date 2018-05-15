import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class faceBook {
	public static void main(String[] args) throws InterruptedException {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "G:\\BHANU ECLIPSE\\Bapun\\driver\\chromedriver.exe");
		 * 
		 * WebDriver d= new ChromeDriver();
		 */

		WebDriver d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("https://www.facebook.com");
		d.findElement(By.id("email")).sendKeys("litan440@gmail.com");
		d.findElement(By.id("pass")).sendKeys("");
		d.findElement(By.xpath("//input[@value='Log In']")).click();

		d.findElement(By.name("mercurymessages")).click();
		Thread.sleep(20000);
		d.findElement(By.xpath("//span[text()='Chinmayee Behera']")).click();
		d.findElement(By.xpath("//div[@data-block='true']/div")).sendKeys("hiii", Keys.ENTER);

	}

}
