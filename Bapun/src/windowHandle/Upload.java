package windowHandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "G:\\Git\\Bapun\\driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("https://www.naukri.com/");
		d.findElement(By.id("login_Layer")).click();
		Thread.sleep(10000);
		d.findElement(By.id("eLoginNew")).sendKeys("patra.bhanu1992@gmail.com");
		d.findElement(By.id("pLogin")).sendKeys("Patra.bhanu@92");
		d.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//b[contains(text(),'View and Update Profile')]")).click();
		Thread.sleep(5000);
		d.findElement(By.id("uploadLink")).click();
		Thread.sleep(2000);
		WebElement wb = d.findElement(By.id("attachCV"));
		wb.sendKeys("C:\\Users\\Bapun\\bapun\\Bapun Resume.doc");
		d.findElement(By.xpath("//button[@type='button']/div/b")).click();

	}
}
