
package pac2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class modifyCustomer {
	WebDriver d;

	@Parameters("browser")
	@Test(groups = { "ST" }, priority = 1)
	public void mCTest1(String BrowserName) {
		if (BrowserName.equals("CHROME")) {
			System.setProperty("webdriver.chrome.driver", "G:\\BHANU ECLIPSE\\Bapun\\driver\\chromedriver.exe");
			d = new ChromeDriver();
		}
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("http://laptop-nu0oese7/login.do");

		d.findElement(By.name("username")).sendKeys("admin");
		d.findElement(By.name("pwd")).sendKeys("manager");
		d.findElement(By.xpath("//input[@valign='absmiddle']")).click();

		d.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		d.findElement(By.xpath("//input[@value='Add New Customer']")).click();

		d.findElement(By.name("name")).sendKeys("pac5237");
		d.findElement(By.name("createCustomerSubmit")).click();

		d.findElement(By.xpath("//a[text()='pac5237']")).click();
		d.findElement(By.name("name")).sendKeys("23");
		d.findElement(By.name("saveChanges")).click();

		d.findElement(By.xpath("//img[@class='logoutImg']")).click();
		d.close();
	}

	@Test(groups = { "RT" }, priority = 2)
	public void mCTest2() {
		System.out.println("executed");
	}

}
